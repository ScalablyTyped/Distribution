package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait types extends StObject
@JSImport("@storybook/addons/dist/ts3.9/types", "types")
@js.native
object types extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types & String] = js.native
  
  @js.native
  sealed trait NOTES_ELEMENT
    extends StObject
       with types
  /* "notes-element" */ val NOTES_ELEMENT: typings.storybookAddons.typesMod.types.NOTES_ELEMENT & String = js.native
  
  @js.native
  sealed trait PANEL
    extends StObject
       with types
  /* "panel" */ val PANEL: typings.storybookAddons.typesMod.types.PANEL & String = js.native
  
  @js.native
  sealed trait PREVIEW
    extends StObject
       with types
  /* "preview" */ val PREVIEW: typings.storybookAddons.typesMod.types.PREVIEW & String = js.native
  
  @js.native
  sealed trait TAB
    extends StObject
       with types
  /* "tab" */ val TAB: typings.storybookAddons.typesMod.types.TAB & String = js.native
  
  @js.native
  sealed trait TOOL
    extends StObject
       with types
  /* "tool" */ val TOOL: typings.storybookAddons.typesMod.types.TOOL & String = js.native
  
  @js.native
  sealed trait TOOLEXTRA
    extends StObject
       with types
  /* "toolextra" */ val TOOLEXTRA: typings.storybookAddons.typesMod.types.TOOLEXTRA & String = js.native
}
