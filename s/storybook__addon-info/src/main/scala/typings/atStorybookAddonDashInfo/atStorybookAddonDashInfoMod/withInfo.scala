package typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoMod

import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import typings.react.reactMod.ReactElement
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-info", "withInfo")
@js.native
object withInfo extends js.Object {
  def apply(): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(textOrOptions: String): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(textOrOptions: Options): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply[A](story: StoryFn[A], context: StoryContext): ReturnType[DecoratorFunction[A]] = js.native
}

