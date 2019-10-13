package typings.atStorybookAddons.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookAddons.distHooksMod.HooksContext
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    hooks: HooksContext = null
  ): StoryContext = {
    val __obj = js.Dynamic.literal(id = id, kind = kind, name = name, parameters = parameters)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    __obj.asInstanceOf[StoryContext]
  }
}

