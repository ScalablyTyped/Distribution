package typings.atStorybookClientDashApi

import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[_]
}

object Anon_Kind {
  @scala.inline
  def apply(kind: String, name: String, parameters: Parameters, storyFn: /* p */ js.UndefOr[StoryContext] => _): Anon_Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
  
    __obj.asInstanceOf[Anon_Kind]
  }
}

