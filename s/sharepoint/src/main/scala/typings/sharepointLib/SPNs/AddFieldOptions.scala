package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFieldOptions extends js.Object

@JSGlobal("SP.AddFieldOptions")
@js.native
object AddFieldOptions extends js.Object {
  @js.native
  sealed trait addFieldCheckDisplayName
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait addFieldInternalNameHint
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait addFieldToDefaultView
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait addToAllContentTypes
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait addToDefaultContentType
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait addToNoContentType
    extends sharepointLib.SPNs.AddFieldOptions
  
  @js.native
  sealed trait defaultValue
    extends sharepointLib.SPNs.AddFieldOptions
  
  /* 6 */ val addFieldCheckDisplayName: addFieldCheckDisplayName with scala.Double = js.native
  /* 4 */ val addFieldInternalNameHint: addFieldInternalNameHint with scala.Double = js.native
  /* 5 */ val addFieldToDefaultView: addFieldToDefaultView with scala.Double = js.native
  /* 3 */ val addToAllContentTypes: addToAllContentTypes with scala.Double = js.native
  /* 1 */ val addToDefaultContentType: addToDefaultContentType with scala.Double = js.native
  /* 2 */ val addToNoContentType: addToNoContentType with scala.Double = js.native
  /* 0 */ val defaultValue: defaultValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AddFieldOptions with scala.Double] = js.native
}

