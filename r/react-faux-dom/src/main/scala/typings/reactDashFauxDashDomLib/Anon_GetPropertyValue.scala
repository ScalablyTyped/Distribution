package typings
package reactDashFauxDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPropertyValue extends js.Object {
  def getPropertyValue(name: java.lang.String): java.lang.String
}

object Anon_GetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: java.lang.String => java.lang.String): Anon_GetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
  
    __obj.asInstanceOf[Anon_GetPropertyValue]
  }
}

