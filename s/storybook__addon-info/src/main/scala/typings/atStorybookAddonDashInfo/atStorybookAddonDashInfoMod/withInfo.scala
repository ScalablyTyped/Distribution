package typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoMod

import typings.atStorybookAddonDashInfo.Anon_Kind
import typings.atStorybookReact.atStorybookReactMod.RenderFunction
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.react.reactMod.ReactElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-info", "withInfo")
@js.native
object withInfo extends js.Object {
  def apply(): js.Function1[
    /* storyFn */ RenderFunction, 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(story: RenderFunction, context: Anon_Kind): ReturnType[StoryDecorator] = js.native
  def apply(textOrOptions: String): js.Function1[
    /* storyFn */ RenderFunction, 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(textOrOptions: Options): js.Function1[
    /* storyFn */ RenderFunction, 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
}

