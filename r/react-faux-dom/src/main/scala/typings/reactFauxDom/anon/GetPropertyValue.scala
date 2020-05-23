package typings.reactFauxDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String
}

object GetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => String): GetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
    __obj.asInstanceOf[GetPropertyValue]
  }
}

