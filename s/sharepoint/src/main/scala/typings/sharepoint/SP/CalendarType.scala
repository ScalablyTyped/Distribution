package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarType extends js.Object

@JSGlobal("SP.CalendarType")
@js.native
object CalendarType extends js.Object {
  @js.native
  sealed trait chineseLunar extends CalendarType
  
  @js.native
  sealed trait gregorian extends CalendarType
  
  @js.native
  sealed trait gregorianArabic extends CalendarType
  
  @js.native
  sealed trait gregorianMEFrench extends CalendarType
  
  @js.native
  sealed trait gregorianXLITEnglish extends CalendarType
  
  @js.native
  sealed trait gregorianXLITFrench extends CalendarType
  
  @js.native
  sealed trait hebrew extends CalendarType
  
  @js.native
  sealed trait hijri extends CalendarType
  
  @js.native
  sealed trait japan extends CalendarType
  
  @js.native
  sealed trait korea extends CalendarType
  
  @js.native
  sealed trait koreaJapanLunar extends CalendarType
  
  @js.native
  sealed trait none extends CalendarType
  
  @js.native
  sealed trait sakaEra extends CalendarType
  
  @js.native
  sealed trait taiwan extends CalendarType
  
  @js.native
  sealed trait thai extends CalendarType
  
  @js.native
  sealed trait umAlQura extends CalendarType
  
}

