package typings.snowboy

import typings.node.Buffer
import typings.node.streamMod.internal
import typings.snowboy.snowboyMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snowboy", JSImport.Namespace)
@js.native
object snowboyMod extends js.Object {
  @js.native
  class Detector protected () extends internal {
    def this(params: js.Any) = this()
    def on(
      event: js.Symbol,
      callback: js.Function3[
          /* index */ js.Any, 
          /* hotword */ js.UndefOr[js.Any], 
          /* buffer */ js.UndefOr[Buffer], 
          Unit
        ]
    ): this.type = js.native
    def on(
      event: State,
      callback: js.Function3[
          /* index */ js.Any, 
          /* hotword */ js.UndefOr[js.Any], 
          /* buffer */ js.UndefOr[Buffer], 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  class Models () extends js.Object {
    def add(params: js.Any): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.snowboy.snowboyStrings.sound
    - typings.snowboy.snowboyStrings.silence
    - typings.snowboy.snowboyStrings.hotword
    - typings.snowboy.snowboyStrings.error
  */
  trait State extends js.Object
  
}

