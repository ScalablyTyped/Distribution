package typings.reactCalendar

import typings.reactCalendar.anon.`0`
import typings.reactCalendar.distCjsSharedTypesMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedUtilsMod {
  
  @JSImport("react-calendar/dist/cjs/shared/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def between[T /* <: js.Date */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Null, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Unit, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def doRangesOverlap(range1: Range[js.Date], range2: Range[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doRangesOverlap")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getTileClasses(
    args: `0` & (ValueRangeOrValueWithValueType[js.Date, js.Date | Range[js.Date]]) & (DateRangeOrDateWithDateType[js.Date, js.Date | Range[js.Date]])
  ): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTileClasses")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isRangeWithinRange(greaterRange: Range[js.Date], smallerRange: Range[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRangeWithinRange")(greaterRange.asInstanceOf[js.Any], smallerRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValueWithinRange(value: js.Date, range: Range[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValueWithinRange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends react-calendar.react-calendar/dist/cjs/shared/types.Range<T> ? {  date :U,   dateType :undefined} : {  date :U,   dateType :react-calendar.react-calendar/dist/cjs/shared/types.RangeType}
    }}}
    */
  @js.native
  trait DateRangeOrDateWithDateType[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends react-calendar.react-calendar/dist/cjs/shared/types.Range<T> ? {  value :U,   valueType :undefined} : {  value :U,   valueType :react-calendar.react-calendar/dist/cjs/shared/types.RangeType}
    }}}
    */
  @js.native
  trait ValueRangeOrValueWithValueType[T, U] extends StObject
}
