package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.streamMod.Transform because Inheritance from two classes. Inlined _flush, _transform */ @JSImport("readable-stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(options: TransformOptions) = this()
  var _transformState: readableDashStreamLib.Anon_AfterTransform = js.native
  def _flush(
    callback: (js.Function2[/* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]) | nodeLib.streamMod.TransformCallback
  ): scala.Unit = js.native
  def _transform(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: (js.Function2[/* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]) | nodeLib.streamMod.TransformCallback
  ): scala.Unit = js.native
}

