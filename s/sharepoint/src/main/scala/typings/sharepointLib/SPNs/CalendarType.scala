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
  
  val chineseLunar: chineseLunar with java.lang.String = js.native
  val gregorian: gregorian with java.lang.String = js.native
  val gregorianArabic: gregorianArabic with java.lang.String = js.native
  val gregorianMEFrench: gregorianMEFrench with java.lang.String = js.native
  val gregorianXLITEnglish: gregorianXLITEnglish with java.lang.String = js.native
  val gregorianXLITFrench: gregorianXLITFrench with java.lang.String = js.native
  val hebrew: hebrew with java.lang.String = js.native
  val hijri: hijri with java.lang.String = js.native
  val japan: japan with java.lang.String = js.native
  val korea: korea with java.lang.String = js.native
  val koreaJapanLunar: koreaJapanLunar with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val sakaEra: sakaEra with java.lang.String = js.native
  val taiwan: taiwan with java.lang.String = js.native
  val thai: thai with java.lang.String = js.native
  val umAlQura: umAlQura with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.CalendarType with java.lang.String] = js.native
}

