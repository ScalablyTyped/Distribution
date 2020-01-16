package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod.ClientApi
import typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod.RenderTree
import typings.atStorybookAddonDashStoryshots.distFrameworksSupportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Framework extends js.Object {
  var framework: SupportedFramework
  var renderShallowTree: js.Any
  var renderTree: RenderTree
  var storybook: ClientApi
}

object Anon_Framework {
  @scala.inline
  def apply(
    framework: SupportedFramework,
    renderShallowTree: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    storybook: ClientApi
  ): Anon_Framework = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], renderShallowTree = renderShallowTree.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), storybook = storybook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Framework]
  }
}

