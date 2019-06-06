package typings
package atStorybookApiLib.distModulesAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait types extends js.Object

@JSImport("@storybook/api/dist/modules/addons", "types")
@js.native
object types extends js.Object {
  @js.native
  sealed trait NOTES_ELEMENT
    extends atStorybookApiLib.distModulesAddonsMod.types
  
  @js.native
  sealed trait PANEL
    extends atStorybookApiLib.distModulesAddonsMod.types
  
  @js.native
  sealed trait PREVIEW
    extends atStorybookApiLib.distModulesAddonsMod.types
  
  @js.native
  sealed trait TAB
    extends atStorybookApiLib.distModulesAddonsMod.types
  
  @js.native
  sealed trait TOOL
    extends atStorybookApiLib.distModulesAddonsMod.types
  
  /* "notes-element" */ val NOTES_ELEMENT: NOTES_ELEMENT with java.lang.String = js.native
  /* "panel" */ val PANEL: PANEL with java.lang.String = js.native
  /* "preview" */ val PREVIEW: PREVIEW with java.lang.String = js.native
  /* "tab" */ val TAB: TAB with java.lang.String = js.native
  /* "tool" */ val TOOL: TOOL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atStorybookApiLib.distModulesAddonsMod.types with java.lang.String] = js.native
}

