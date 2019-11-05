package typings.storybookDashAddonDashJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashAddonDashJsxMod {
  import typings.atStorybookAddons.distTypesMod.StoryApi
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.ReactNode

  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ String, 
    /* fn */ js.Function0[ReactNode], 
    /* options */ js.UndefOr[AddonParameters], 
    StoryApi[StoryFnReturnType]
  ]
  type displayNameFunc = js.Function1[/* element */ ReactElement, String]
}
