package typings.storybookDashAddonDashJsx

import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.react.reactMod.ReactNode
import typings.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.AddWithJSXFunc
import typings.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.AddonParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
}

object Anon_AddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): Anon_AddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
  
    __obj.asInstanceOf[Anon_AddWithJSX[StoryFnReturnType]]
  }
}

