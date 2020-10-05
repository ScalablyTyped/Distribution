package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait types extends js.Object

@JSImport("@storybook/addons/dist/types", "types")
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types with String] = js.native
  /* "notes-element" */ @js.native
  object NOTES_ELEMENT extends TopLevel[NOTES_ELEMENT with String]
  
  /* "panel" */ @js.native
  object PANEL extends TopLevel[PANEL with String]
  
  /* "preview" */ @js.native
  object PREVIEW extends TopLevel[PREVIEW with String]
  
  /* "tab" */ @js.native
  object TAB extends TopLevel[TAB with String]
  
  /* "tool" */ @js.native
  object TOOL extends TopLevel[TOOL with String]
  
}

