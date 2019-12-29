package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFieldOptions with Double] = js.native
  /* 6 */ @js.native
  object addFieldCheckDisplayName extends TopLevel[addFieldCheckDisplayName with Double]
  
  /* 4 */ @js.native
  object addFieldInternalNameHint extends TopLevel[addFieldInternalNameHint with Double]
  
  /* 5 */ @js.native
  object addFieldToDefaultView extends TopLevel[addFieldToDefaultView with Double]
  
  /* 3 */ @js.native
  object addToAllContentTypes extends TopLevel[addToAllContentTypes with Double]
  
  /* 1 */ @js.native
  object addToDefaultContentType extends TopLevel[addToDefaultContentType with Double]
  
  /* 2 */ @js.native
  object addToNoContentType extends TopLevel[addToNoContentType with Double]
  
  /* 0 */ @js.native
  object defaultValue extends TopLevel[defaultValue with Double]
  
}

