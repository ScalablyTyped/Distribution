package typings
package atStorybookAddonDashInfoLib.addonDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-info", JSImport.Namespace)
@js.native
object addonDashInfoModMembers extends js.Object {
  def setDefaults(newDefaults: Options): Options = js.native
  def withInfo(): js.Function1[
    /* storyFn */ atStorybookReactLib.reactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactNs.ReactElement[WrapStoryProps]
    ]
  ] = js.native
  def withInfo(textOrOptions: Options): js.Function1[
    /* storyFn */ atStorybookReactLib.reactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactNs.ReactElement[WrapStoryProps]
    ]
  ] = js.native
  def withInfo(textOrOptions: java.lang.String): js.Function1[
    /* storyFn */ atStorybookReactLib.reactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactNs.ReactElement[WrapStoryProps]
    ]
  ] = js.native
}

