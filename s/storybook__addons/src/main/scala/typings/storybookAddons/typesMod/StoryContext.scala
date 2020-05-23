package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryContext
  extends /* key */ StringDictionary[js.Any] {
  var hooks: js.UndefOr[HooksContext] = js.undefined
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters
}

object StoryContext {
  @scala.inline
  def apply(
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    hooks: HooksContext = null
  ): StoryContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryContext]
  }
}

