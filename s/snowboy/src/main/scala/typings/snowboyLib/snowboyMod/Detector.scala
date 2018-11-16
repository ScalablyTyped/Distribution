package typings
package snowboyLib.snowboyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snowboy", "Detector")
@js.native
class Detector protected ()
  extends nodeLib.streamMod.Stream {
  def this(params: js.Any) = this()
  def on(
    event: js.Symbol,
    callback: js.Function3[
      /* index */ js.Any, 
      /* hotword */ js.UndefOr[js.Any], 
      /* buffer */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): this.type = js.native
  def on(
    event: State,
    callback: js.Function3[
      /* index */ js.Any, 
      /* hotword */ js.UndefOr[js.Any], 
      /* buffer */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): this.type = js.native
}

