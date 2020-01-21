package typings.storybookAddonJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ java.lang.String, 
    /* fn */ js.Function0[typings.react.mod.ReactNode], 
    /* options */ js.UndefOr[typings.storybookAddonJsx.mod.AddonParameters], 
    typings.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type displayNameFunc = js.Function1[/* element */ typings.react.mod.ReactElement, java.lang.String]
}
