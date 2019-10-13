package typings.atStorybookClientDashApi.distTypesMod

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddStoryArgs extends js.Object {
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters[js.Function1[/* args */ _, _]]
  var storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
}

object AddStoryArgs {
  @scala.inline
  def apply(
    id: String,
    kind: String,
    name: String,
    parameters: Parameters[js.Function1[/* args */ _, _]],
    storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
  ): AddStoryArgs = {
    val __obj = js.Dynamic.literal(id = id, kind = kind, name = name, parameters = parameters, storyFn = storyFn)
  
    __obj.asInstanceOf[AddStoryArgs]
  }
}

