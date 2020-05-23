package typings.storybookAddonStoryshots.anon

import typings.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typings.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework extends js.Object {
  var framework: SupportedFramework
  var renderShallowTree: js.Any
  var renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
  var storybook: ClientApi
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
}

