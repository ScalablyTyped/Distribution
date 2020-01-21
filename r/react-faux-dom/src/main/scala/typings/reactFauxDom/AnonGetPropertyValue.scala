package typings.reactFauxDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String
}

object AnonGetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => String): AnonGetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
  
    __obj.asInstanceOf[AnonGetPropertyValue]
  }
}

