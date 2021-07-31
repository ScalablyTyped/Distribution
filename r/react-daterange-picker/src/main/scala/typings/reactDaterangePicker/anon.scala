package typings.reactDaterangePicker

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.mod.DateRange
import typings.momentRange.mod.MomentRangeStaticMethods
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined moment-range.moment-range.MomentRange & {None (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment, None (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment, None (inp : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment} */
  @js.native
  trait MomentRangeNoneinpundefin extends StObject {
    
    def apply(): Moment = js.native
    def apply(args: js.Any*): MomentRangeStaticMethods & Moment = js.native
    def apply(inp: Unit, format: Unit, language: String): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, strict: Boolean): Moment = js.native
    
    // @deprecated 4.0.0
    def parseZoneRange(isoTimeInterval: String): DateRange = js.native
    
    def range(): DateRange = js.native
    def range(range: String): DateRange = js.native
    def range(range: js.Tuple2[Date | Moment, Date | Moment]): DateRange = js.native
    def range(start: Moment, end: Moment): DateRange = js.native
    def range(start: Moment, end: Date): DateRange = js.native
    def range(start: Date, end: Moment): DateRange = js.native
    def range(start: Date, end: Date): DateRange = js.native
    
    def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
    
    def rangeFromInterval(interval: Diff): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Unit, date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Unit, date: Date): DateRange = js.native
  }
}
