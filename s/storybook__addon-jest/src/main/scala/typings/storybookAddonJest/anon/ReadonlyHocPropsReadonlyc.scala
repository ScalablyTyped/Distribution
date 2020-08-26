package typings.storybookAddonJest.anon

import typings.react.mod.ReactNode
import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlyHocPropsReadonlyc extends js.Object {
  val active: js.UndefOr[Boolean] = js.native
  val api: API = js.native
  val children: js.UndefOr[ReactNode] = js.native
}

object ReadonlyHocPropsReadonlyc {
  @scala.inline
  def apply(api: API): ReadonlyHocPropsReadonlyc = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHocPropsReadonlyc]
  }
  @scala.inline
  implicit class ReadonlyHocPropsReadonlycOps[Self <: ReadonlyHocPropsReadonlyc] (val x: Self) extends AnyVal {
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
    def setApi(value: API): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

