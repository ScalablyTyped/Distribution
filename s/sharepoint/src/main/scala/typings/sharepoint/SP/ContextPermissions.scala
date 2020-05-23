package typings.sharepoint.SP

import typings.sharepoint.anon.High
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextPermissions extends js.Object {
  def fromJson(json: High): Unit
  def has(perm: Double): Boolean
  def hasPermissions(high: Double, low: Double): Boolean
}

object ContextPermissions {
  @scala.inline
  def apply(fromJson: High => Unit, has: Double => Boolean, hasPermissions: (Double, Double) => Boolean): ContextPermissions = {
    val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions))
    __obj.asInstanceOf[ContextPermissions]
  }
}

