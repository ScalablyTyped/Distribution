package typings.storybookClientApi

import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[_]
}

object AnonKind {
  @scala.inline
  def apply(kind: String, name: String, parameters: Parameters, storyFn: /* p */ js.UndefOr[StoryContext] => _): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[AnonKind]
  }
}

