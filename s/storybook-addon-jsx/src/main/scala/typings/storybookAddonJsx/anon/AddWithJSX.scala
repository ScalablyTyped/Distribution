package typings.storybookAddonJsx.anon

import typings.react.mod.ReactNode
import typings.storybookAddonJsx.mod.AddWithJSXFunc
import typings.storybookAddonJsx.mod.AddonParameters
import typings.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType] = js.native
}

object AddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): AddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
    __obj.asInstanceOf[AddWithJSX[StoryFnReturnType]]
  }
  @scala.inline
  implicit class AddWithJSXOps[Self <: AddWithJSX[_], StoryFnReturnType] (val x: Self with AddWithJSX[StoryFnReturnType]) extends AnyVal {
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
    def setAddWithJSX(
      value: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
    ): Self = this.set("addWithJSX", js.Any.fromFunction3(value))
  }
  
}

