package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.CalendarType.chineseLunar
import typings.sharepoint.SP.CalendarType.gregorian
import typings.sharepoint.SP.CalendarType.gregorianArabic
import typings.sharepoint.SP.CalendarType.gregorianMEFrench
import typings.sharepoint.SP.CalendarType.gregorianXLITEnglish
import typings.sharepoint.SP.CalendarType.gregorianXLITFrench
import typings.sharepoint.SP.CalendarType.hebrew
import typings.sharepoint.SP.CalendarType.hijri
import typings.sharepoint.SP.CalendarType.japan
import typings.sharepoint.SP.CalendarType.korea
import typings.sharepoint.SP.CalendarType.koreaJapanLunar
import typings.sharepoint.SP.CalendarType.none
import typings.sharepoint.SP.CalendarType.sakaEra
import typings.sharepoint.SP.CalendarType.taiwan
import typings.sharepoint.SP.CalendarType.thai
import typings.sharepoint.SP.CalendarType.umAlQura
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarType with Double] = js.native
  /* 13 */ @js.native
  object chineseLunar extends TopLevel[chineseLunar with Double]
  
  /* 1 */ @js.native
  object gregorian extends TopLevel[gregorian with Double]
  
  /* 9 */ @js.native
  object gregorianArabic extends TopLevel[gregorianArabic with Double]
  
  /* 8 */ @js.native
  object gregorianMEFrench extends TopLevel[gregorianMEFrench with Double]
  
  /* 10 */ @js.native
  object gregorianXLITEnglish extends TopLevel[gregorianXLITEnglish with Double]
  
  /* 11 */ @js.native
  object gregorianXLITFrench extends TopLevel[gregorianXLITFrench with Double]
  
  /* 7 */ @js.native
  object hebrew extends TopLevel[hebrew with Double]
  
  /* 5 */ @js.native
  object hijri extends TopLevel[hijri with Double]
  
  /* 2 */ @js.native
  object japan extends TopLevel[japan with Double]
  
  /* 4 */ @js.native
  object korea extends TopLevel[korea with Double]
  
  /* 12 */ @js.native
  object koreaJapanLunar extends TopLevel[koreaJapanLunar with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 14 */ @js.native
  object sakaEra extends TopLevel[sakaEra with Double]
  
  /* 3 */ @js.native
  object taiwan extends TopLevel[taiwan with Double]
  
  /* 6 */ @js.native
  object thai extends TopLevel[thai with Double]
  
  /* 15 */ @js.native
  object umAlQura extends TopLevel[umAlQura with Double]
  
}

