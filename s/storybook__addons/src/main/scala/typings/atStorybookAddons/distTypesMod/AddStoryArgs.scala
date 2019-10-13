package typings.atStorybookAddons.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddStoryArgs[StoryFnReturnType] extends js.Object {
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[StoryFnReturnType]
}

object AddStoryArgs {
  @scala.inline
  def apply[StoryFnReturnType](
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id, kind = kind, name = name, parameters = parameters, storyFn = js.Any.fromFunction1(storyFn))
  
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
}

