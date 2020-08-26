package typings.reactThemeableTs.themeableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStaticFnOptionalReturn extends js.Object {
  var className: js.UndefOr[String] = js.native
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object IStaticFnOptionalReturn {
  @scala.inline
  def apply(): IStaticFnOptionalReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStaticFnOptionalReturn]
  }
  @scala.inline
  implicit class IStaticFnOptionalReturnOps[Self <: IStaticFnOptionalReturn] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

