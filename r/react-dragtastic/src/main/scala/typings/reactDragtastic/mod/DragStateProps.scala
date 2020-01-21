package typings.reactDragtastic.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStateProps extends js.Object {
  /**
    * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
    * For example, you may pass ['type', 'data'] to only rerender if these keys change.
    */
  var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.undefined
  def children(arg: State): ReactNode
}

object DragStateProps {
  @scala.inline
  def apply(children: State => ReactNode, subscribeTo: js.Array[String] = null): DragStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStateProps]
  }
}

