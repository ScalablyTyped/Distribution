package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait types extends StObject
@JSImport("@storybook/addons/dist/types", "types")
@js.native
object types extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types with String] = js.native
  
  @js.native
  sealed trait NOTES_ELEMENT extends types
  /* "notes-element" */ val NOTES_ELEMENT: typings.storybookAddons.typesMod.types.NOTES_ELEMENT with String = js.native
  
  @js.native
  sealed trait PANEL extends types
  /* "panel" */ val PANEL: typings.storybookAddons.typesMod.types.PANEL with String = js.native
  
  @js.native
  sealed trait PREVIEW extends types
  /* "preview" */ val PREVIEW: typings.storybookAddons.typesMod.types.PREVIEW with String = js.native
  
  @js.native
  sealed trait TAB extends types
  /* "tab" */ val TAB: typings.storybookAddons.typesMod.types.TAB with String = js.native
  
  @js.native
  sealed trait TOOL extends types
  /* "tool" */ val TOOL: typings.storybookAddons.typesMod.types.TOOL with String = js.native
  
  @js.native
  sealed trait TOOLEXTRA extends types
  /* "toolextra" */ val TOOLEXTRA: typings.storybookAddons.typesMod.types.TOOLEXTRA with String = js.native
}
