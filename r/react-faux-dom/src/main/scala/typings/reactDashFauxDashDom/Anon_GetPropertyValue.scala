package typings.reactDashFauxDashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String
}

object Anon_GetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => String): Anon_GetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
  
    __obj.asInstanceOf[Anon_GetPropertyValue]
  }
}

