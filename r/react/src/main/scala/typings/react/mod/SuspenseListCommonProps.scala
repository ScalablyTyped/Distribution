package typings.react.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseListCommonProps extends js.Object {
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: ReactElement | Iterable[ReactElement]
}

object SuspenseListCommonProps {
  @scala.inline
  def apply(children: ReactElement | Iterable[ReactElement]): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
}

