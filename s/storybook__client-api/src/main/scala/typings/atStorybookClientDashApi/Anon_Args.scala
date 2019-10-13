package typings.atStorybookClientDashApi

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var kind: String
  var name: String
  var parameters: Parameters[js.Function1[/* args */ _, _]]
  var storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
}

object Anon_Args {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    parameters: Parameters[js.Function1[/* args */ _, _]],
    storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn */ js.Any
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, parameters = parameters, storyFn = storyFn)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

