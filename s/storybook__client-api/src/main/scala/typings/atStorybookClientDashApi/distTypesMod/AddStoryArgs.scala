package typings.atStorybookClientDashApi.distTypesMod

import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddStoryArgs extends js.Object {
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[_]
}

object AddStoryArgs {
  @scala.inline
  def apply(
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => _
  ): AddStoryArgs = {
    val __obj = js.Dynamic.literal(id = id, kind = kind, name = name, parameters = parameters, storyFn = js.Any.fromFunction1(storyFn))
  
    __obj.asInstanceOf[AddStoryArgs]
  }
}

