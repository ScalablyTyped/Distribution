package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideLocale extends js.Object {
  def getDecimalSeparator(): String
  def getGroupingSeparator(): String
}

object GlideLocale {
  @scala.inline
  def apply(getDecimalSeparator: () => String, getGroupingSeparator: () => String): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = js.Any.fromFunction0(getDecimalSeparator), getGroupingSeparator = js.Any.fromFunction0(getGroupingSeparator))
    __obj.asInstanceOf[GlideLocale]
  }
}

