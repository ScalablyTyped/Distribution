package typings.reactBootstrapTableNext.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterElement extends js.Object {
  var filterElement: Element
  var sortElement: Element
}

object FilterElement {
  @scala.inline
  def apply(filterElement: Element, sortElement: Element): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
}

