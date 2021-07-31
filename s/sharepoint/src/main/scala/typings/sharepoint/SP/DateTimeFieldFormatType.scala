package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFieldFormatType extends StObject
@JSGlobal("SP.DateTimeFieldFormatType")
@js.native
object DateTimeFieldFormatType extends StObject {
  
  @js.native
  sealed trait dateOnly
    extends StObject
       with DateTimeFieldFormatType
  
  @js.native
  sealed trait dateTime
    extends StObject
       with DateTimeFieldFormatType
}
