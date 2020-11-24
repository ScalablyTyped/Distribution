package typings.storybookApi.addonsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait types extends js.Object
@JSImport("@storybook/api/dist/modules/addons", "types")
@js.native
object types extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[types with String] = js.native
  
  @js.native
  sealed trait NOTES_ELEMENT extends types
  /* "notes-element" */ @js.native
  object NOTES_ELEMENT extends TopLevel[NOTES_ELEMENT with String]
  
  @js.native
  sealed trait PANEL extends types
  /* "panel" */ @js.native
  object PANEL extends TopLevel[PANEL with String]
  
  @js.native
  sealed trait PREVIEW extends types
  /* "preview" */ @js.native
  object PREVIEW extends TopLevel[PREVIEW with String]
  
  @js.native
  sealed trait TAB extends types
  /* "tab" */ @js.native
  object TAB extends TopLevel[TAB with String]
  
  @js.native
  sealed trait TOOL extends types
  /* "tool" */ @js.native
  object TOOL extends TopLevel[TOOL with String]
}
