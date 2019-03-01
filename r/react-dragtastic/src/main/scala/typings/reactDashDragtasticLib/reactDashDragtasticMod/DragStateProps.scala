package typings
package reactDashDragtasticLib.reactDashDragtasticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStateProps extends js.Object {
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  def children(arg: State): reactLib.reactMod.ReactNs.ReactNode
}

object DragStateProps {
  @scala.inline
  def apply(
    children: js.Function1[State, reactLib.reactMod.ReactNs.ReactNode],
    subscribeTo: js.Array[java.lang.String] = null
  ): DragStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo)
    __obj.asInstanceOf[DragStateProps]
  }
}

