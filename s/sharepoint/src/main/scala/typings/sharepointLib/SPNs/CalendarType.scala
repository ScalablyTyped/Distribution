package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarType extends js.Object

@JSGlobal("SP.CalendarType")
@js.native
object CalendarType extends js.Object {
  @js.native
  sealed trait chineseLunar
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait gregorian
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait gregorianArabic
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait gregorianMEFrench
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait gregorianXLITEnglish
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait gregorianXLITFrench
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait hebrew
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait hijri
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait japan
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait korea
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait koreaJapanLunar
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait sakaEra
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait taiwan
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait thai
    extends sharepointLib.SPNs.CalendarType
  
  @js.native
  sealed trait umAlQura
    extends sharepointLib.SPNs.CalendarType
  
  /* 13 */ val chineseLunar: chineseLunar with scala.Double = js.native
  /* 1 */ val gregorian: gregorian with scala.Double = js.native
  /* 9 */ val gregorianArabic: gregorianArabic with scala.Double = js.native
  /* 8 */ val gregorianMEFrench: gregorianMEFrench with scala.Double = js.native
  /* 10 */ val gregorianXLITEnglish: gregorianXLITEnglish with scala.Double = js.native
  /* 11 */ val gregorianXLITFrench: gregorianXLITFrench with scala.Double = js.native
  /* 7 */ val hebrew: hebrew with scala.Double = js.native
  /* 5 */ val hijri: hijri with scala.Double = js.native
  /* 2 */ val japan: japan with scala.Double = js.native
  /* 4 */ val korea: korea with scala.Double = js.native
  /* 12 */ val koreaJapanLunar: koreaJapanLunar with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 14 */ val sakaEra: sakaEra with scala.Double = js.native
  /* 3 */ val taiwan: taiwan with scala.Double = js.native
  /* 6 */ val thai: thai with scala.Double = js.native
  /* 15 */ val umAlQura: umAlQura with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.CalendarType with scala.Double] = js.native
}

