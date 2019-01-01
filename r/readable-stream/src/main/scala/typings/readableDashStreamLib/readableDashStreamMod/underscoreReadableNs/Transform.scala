package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(nodeLib.streamMod.Transform because Inheritance from two classes)*/
@js.native
trait Transform extends Duplex {
  var _transformState: readableDashStreamLib.Anon_Transforming = js.native
  def _flush(
    callback: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def _transform(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

