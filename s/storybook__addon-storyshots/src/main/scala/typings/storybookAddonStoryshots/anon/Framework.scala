package typings.storybookAddonStoryshots.anon

import typings.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typings.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framework extends js.Object {
  var framework: SupportedFramework = js.native
  var renderShallowTree: js.Any = js.native
  var renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree = js.native
  var storybook: ClientApi = js.native
}

object Framework {
  @scala.inline
  def apply(
    framework: SupportedFramework,
    renderShallowTree: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    storybook: ClientApi
  ): Framework = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], renderShallowTree = renderShallowTree.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), storybook = storybook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  @scala.inline
  implicit class FrameworkOps[Self <: Framework] (val x: Self) extends AnyVal {
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
    def setFramework(value: SupportedFramework): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderShallowTree(value: js.Any): Self = this.set("renderShallowTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderTree(
      value: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("renderTree", js.Any.fromFunction3(value))
    @scala.inline
    def setStorybook(value: ClientApi): Self = this.set("storybook", value.asInstanceOf[js.Any])
  }
  
}

