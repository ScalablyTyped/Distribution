package typings.sharepoint.SPNs

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
  
  /* 13 */ val chineseLunar: typings.sharepoint.SPNs.CalendarType.chineseLunar with Double = js.native
  /* 1 */ val gregorian: typings.sharepoint.SPNs.CalendarType.gregorian with Double = js.native
  /* 9 */ val gregorianArabic: typings.sharepoint.SPNs.CalendarType.gregorianArabic with Double = js.native
  /* 8 */ val gregorianMEFrench: typings.sharepoint.SPNs.CalendarType.gregorianMEFrench with Double = js.native
  /* 10 */ val gregorianXLITEnglish: typings.sharepoint.SPNs.CalendarType.gregorianXLITEnglish with Double = js.native
  /* 11 */ val gregorianXLITFrench: typings.sharepoint.SPNs.CalendarType.gregorianXLITFrench with Double = js.native
  /* 7 */ val hebrew: typings.sharepoint.SPNs.CalendarType.hebrew with Double = js.native
  /* 5 */ val hijri: typings.sharepoint.SPNs.CalendarType.hijri with Double = js.native
  /* 2 */ val japan: typings.sharepoint.SPNs.CalendarType.japan with Double = js.native
  /* 4 */ val korea: typings.sharepoint.SPNs.CalendarType.korea with Double = js.native
  /* 12 */ val koreaJapanLunar: typings.sharepoint.SPNs.CalendarType.koreaJapanLunar with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.CalendarType.none with Double = js.native
  /* 14 */ val sakaEra: typings.sharepoint.SPNs.CalendarType.sakaEra with Double = js.native
  /* 3 */ val taiwan: typings.sharepoint.SPNs.CalendarType.taiwan with Double = js.native
  /* 6 */ val thai: typings.sharepoint.SPNs.CalendarType.thai with Double = js.native
  /* 15 */ val umAlQura: typings.sharepoint.SPNs.CalendarType.umAlQura with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarType with Double] = js.native
}

