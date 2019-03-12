package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.streamMod.Transform because Inheritance from two classes. Inlined  */ @js.native
trait Transform extends Duplex {
  var _transformState: readableDashStreamLib.Anon_AfterTransform = js.native
  def _flush(
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def _transform(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

