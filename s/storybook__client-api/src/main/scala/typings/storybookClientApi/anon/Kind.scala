package typings.storybookClientApi.anon

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kind extends js.Object {
  var kind: String
  var name: String
  var parameters: typings.storybookAddons.typesMod.Parameters
  var storyFn: StoryFn[_]
}

object Kind {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    parameters: typings.storybookAddons.typesMod.Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => _
  ): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[Kind]
  }
}

