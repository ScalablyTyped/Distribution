package typings.storybookAddonJsx

import typings.react.mod.ReactNode
import typings.storybookAddonJsx.mod.AddWithJSXFunc
import typings.storybookAddonJsx.mod.AddonParameters
import typings.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
}

object AnonAddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): AnonAddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
    __obj.asInstanceOf[AnonAddWithJSX[StoryFnReturnType]]
  }
}

