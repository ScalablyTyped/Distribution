package typings.sharepoint.SPNs

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
  
  /* 6 */ val addFieldCheckDisplayName: typings.sharepoint.SPNs.AddFieldOptions.addFieldCheckDisplayName with Double = js.native
  /* 4 */ val addFieldInternalNameHint: typings.sharepoint.SPNs.AddFieldOptions.addFieldInternalNameHint with Double = js.native
  /* 5 */ val addFieldToDefaultView: typings.sharepoint.SPNs.AddFieldOptions.addFieldToDefaultView with Double = js.native
  /* 3 */ val addToAllContentTypes: typings.sharepoint.SPNs.AddFieldOptions.addToAllContentTypes with Double = js.native
  /* 1 */ val addToDefaultContentType: typings.sharepoint.SPNs.AddFieldOptions.addToDefaultContentType with Double = js.native
  /* 2 */ val addToNoContentType: typings.sharepoint.SPNs.AddFieldOptions.addToNoContentType with Double = js.native
  /* 0 */ val defaultValue: typings.sharepoint.SPNs.AddFieldOptions.defaultValue with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFieldOptions with Double] = js.native
}

