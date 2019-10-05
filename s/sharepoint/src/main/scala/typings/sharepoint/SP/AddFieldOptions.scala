package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFieldOptions extends js.Object

@JSGlobal("SP.AddFieldOptions")
@js.native
object AddFieldOptions extends js.Object {
  @js.native
  sealed trait addFieldCheckDisplayName extends AddFieldOptions
  
  @js.native
  sealed trait addFieldInternalNameHint extends AddFieldOptions
  
  @js.native
  sealed trait addFieldToDefaultView extends AddFieldOptions
  
  @js.native
  sealed trait addToAllContentTypes extends AddFieldOptions
  
  @js.native
  sealed trait addToDefaultContentType extends AddFieldOptions
  
  @js.native
  sealed trait addToNoContentType extends AddFieldOptions
  
  @js.native
  sealed trait defaultValue extends AddFieldOptions
  
  /* 6 */ val addFieldCheckDisplayName: typings.sharepoint.SP.AddFieldOptions.addFieldCheckDisplayName with Double = js.native
  /* 4 */ val addFieldInternalNameHint: typings.sharepoint.SP.AddFieldOptions.addFieldInternalNameHint with Double = js.native
  /* 5 */ val addFieldToDefaultView: typings.sharepoint.SP.AddFieldOptions.addFieldToDefaultView with Double = js.native
  /* 3 */ val addToAllContentTypes: typings.sharepoint.SP.AddFieldOptions.addToAllContentTypes with Double = js.native
  /* 1 */ val addToDefaultContentType: typings.sharepoint.SP.AddFieldOptions.addToDefaultContentType with Double = js.native
  /* 2 */ val addToNoContentType: typings.sharepoint.SP.AddFieldOptions.addToNoContentType with Double = js.native
  /* 0 */ val defaultValue: typings.sharepoint.SP.AddFieldOptions.defaultValue with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFieldOptions with Double] = js.native
}

