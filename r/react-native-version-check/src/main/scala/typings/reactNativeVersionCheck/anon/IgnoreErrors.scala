package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreErrors extends js.Object {
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  /**
    * Package Name
    */
  var packageName: js.UndefOr[String] = js.native
}

object IgnoreErrors {
  @scala.inline
  def apply(): IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreErrors]
  }
  @scala.inline
  implicit class IgnoreErrorsOps[Self <: IgnoreErrors] (val x: Self) extends AnyVal {
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
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

