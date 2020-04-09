package typings.reactBootstrapTableNext

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterElement extends js.Object {
  var filterElement: Element
  var sortElement: Element
}

object AnonFilterElement {
  @scala.inline
  def apply(filterElement: Element, sortElement: Element): AnonFilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilterElement]
  }
}

