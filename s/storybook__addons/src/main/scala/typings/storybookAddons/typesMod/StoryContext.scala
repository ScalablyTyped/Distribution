package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryContext
  extends /* key */ StringDictionary[js.Any] {
  var hooks: js.UndefOr[HooksContext] = js.native
  var id: String = js.native
  var kind: String = js.native
  var name: String = js.native
  var parameters: Parameters = js.native
}

object StoryContext {
  @scala.inline
  def apply(id: String, kind: String, name: String, parameters: Parameters): StoryContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryContext]
  }
  @scala.inline
  implicit class StoryContextOps[Self <: StoryContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooks(value: HooksContext): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
  
}

