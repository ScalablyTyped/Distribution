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
  
  val addFieldCheckDisplayName: addFieldCheckDisplayName with java.lang.String = js.native
  val addFieldInternalNameHint: addFieldInternalNameHint with java.lang.String = js.native
  val addFieldToDefaultView: addFieldToDefaultView with java.lang.String = js.native
  val addToAllContentTypes: addToAllContentTypes with java.lang.String = js.native
  val addToDefaultContentType: addToDefaultContentType with java.lang.String = js.native
  val addToNoContentType: addToNoContentType with java.lang.String = js.native
  val defaultValue: defaultValue with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AddFieldOptions with java.lang.String] = js.native
}

