package typings
package atStorybookAddonDashInfoLib.atStorybookAddonDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-info", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def setDefaults(newDefaults: Options): Options = js.native
  def withInfo(): js.Function1[
    /* storyFn */ atStorybookReactLib.atStorybookReactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactElement[WrapStoryProps]
    ]
  ] = js.native
  def withInfo(
    story: atStorybookReactLib.atStorybookReactMod.RenderFunction,
    context: atStorybookAddonDashInfoLib.Anon_Kind
  ): stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator] = js.native
  def withInfo(textOrOptions: Options): js.Function1[
    /* storyFn */ atStorybookReactLib.atStorybookReactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactElement[WrapStoryProps]
    ]
  ] = js.native
  def withInfo(textOrOptions: java.lang.String): js.Function1[
    /* storyFn */ atStorybookReactLib.atStorybookReactMod.RenderFunction, 
    js.Function1[
      /* context */ js.UndefOr[js.Object], 
      reactLib.reactMod.ReactElement[WrapStoryProps]
    ]
  ] = js.native
}

