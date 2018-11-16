package typings
package reduxDashRecycleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-recycle", JSImport.Namespace)
@js.native
object reduxDashRecycleMod extends js.Object {
  def default[A](
    reducer: reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction],
    actions: js.Array[java.lang.String]
  ): reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction] = js.native
  def default[A](
    reducer: reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction],
    actions: js.Array[java.lang.String],
    initialState: A
  ): reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction] = js.native
  def default[A](
    reducer: reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction],
    actions: js.Array[java.lang.String],
    initialState: reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction]
  ): reduxLib.reduxMod.Reducer[reduxLib.reduxMod.AnyAction, reduxLib.reduxMod.AnyAction] = js.native
}

