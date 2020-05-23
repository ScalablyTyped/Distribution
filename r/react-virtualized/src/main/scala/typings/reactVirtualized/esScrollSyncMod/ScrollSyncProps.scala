package typings.reactVirtualized.esScrollSyncMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def children(props: ScrollSyncChildProps): ReactNode
}

object ScrollSyncProps {
  @scala.inline
  def apply(
    children: ScrollSyncChildProps => ReactNode,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ScrollSyncProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ScrollSyncProps]
  }
}

