package typings.reactLazyLoadImageComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyComponentProps extends js.Object {
  var scrollPosition: ScrollPosition
}

object LazyComponentProps {
  @scala.inline
  def apply(scrollPosition: ScrollPosition): LazyComponentProps = {
    val __obj = js.Dynamic.literal(scrollPosition = scrollPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyComponentProps]
  }
}

