package typings.atStorybookApi.distModulesAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait types extends js.Object

@JSImport("@storybook/api/dist/modules/addons", "types")
@js.native
object types extends js.Object {
  @js.native
  sealed trait NOTES_ELEMENT extends types
  
  @js.native
  sealed trait PANEL extends types
  
  @js.native
  sealed trait PREVIEW extends types
  
  @js.native
  sealed trait TAB extends types
  
  @js.native
  sealed trait TOOL extends types
  
  /* "notes-element" */ val NOTES_ELEMENT: typings.atStorybookApi.distModulesAddonsMod.types.NOTES_ELEMENT with String = js.native
  /* "panel" */ val PANEL: typings.atStorybookApi.distModulesAddonsMod.types.PANEL with String = js.native
  /* "preview" */ val PREVIEW: typings.atStorybookApi.distModulesAddonsMod.types.PREVIEW with String = js.native
  /* "tab" */ val TAB: typings.atStorybookApi.distModulesAddonsMod.types.TAB with String = js.native
  /* "tool" */ val TOOL: typings.atStorybookApi.distModulesAddonsMod.types.TOOL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types with String] = js.native
}

