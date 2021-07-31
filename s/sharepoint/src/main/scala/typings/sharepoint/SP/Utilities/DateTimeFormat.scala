package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFormat extends StObject
@JSGlobal("SP.Utilities.DateTimeFormat")
@js.native
object DateTimeFormat extends StObject {
  
  @js.native
  sealed trait dateOnly
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait dateTime
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait iSO8601
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait longDate
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait monthDayOnly
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait monthYearOnly
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait timeOnly
    extends StObject
       with DateTimeFormat
  
  @js.native
  sealed trait unknownFormat
    extends StObject
       with DateTimeFormat
}
