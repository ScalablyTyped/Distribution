package typings
package reduxDashPersistLib.esCreateTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform[S, R] extends js.Object {
  var config: js.UndefOr[reduxDashPersistLib.esTypesMod.PersistConfig] = js.native
  @JSName("in")
  var in_Original: TransformIn[S, R] = js.native
  @JSName("out")
  var out_Original: TransformOut[R, S] = js.native
  def in(state: S, key: java.lang.String): R = js.native
  def out(raw: R, key: java.lang.String): S = js.native
}

