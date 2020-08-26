package typings.sharepoint.SP

import typings.sharepoint.anon.High
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextPermissions extends js.Object {
  def fromJson(json: High): Unit = js.native
  def has(perm: Double): Boolean = js.native
  def hasPermissions(high: Double, low: Double): Boolean = js.native
}

object ContextPermissions {
  @scala.inline
  def apply(fromJson: High => Unit, has: Double => Boolean, hasPermissions: (Double, Double) => Boolean): ContextPermissions = {
    val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions))
    __obj.asInstanceOf[ContextPermissions]
  }
  @scala.inline
  implicit class ContextPermissionsOps[Self <: ContextPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromJson(value: High => Unit): Self = this.set("fromJson", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: Double => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setHasPermissions(value: (Double, Double) => Boolean): Self = this.set("hasPermissions", js.Any.fromFunction2(value))
  }
  
}

