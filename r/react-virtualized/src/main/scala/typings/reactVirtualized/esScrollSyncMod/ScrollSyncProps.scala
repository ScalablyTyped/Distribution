package typings.reactVirtualized.esScrollSyncMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSyncProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Function responsible for rendering 2 or more virtualized components.
    * This function should implement the following signature:
    * ({ onScroll, scrollLeft, scrollTop }) => PropTypes.element
    */
  def children(props: ScrollSyncChildProps): ReactNode = js.native
}

object ScrollSyncProps {
  @scala.inline
  def apply(children: ScrollSyncChildProps => ReactNode): ScrollSyncProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ScrollSyncProps]
  }
  @scala.inline
  implicit class ScrollSyncPropsOps[Self <: ScrollSyncProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ScrollSyncChildProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

