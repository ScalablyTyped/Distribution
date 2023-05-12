package typings.reactClock

import typings.reactClock.reactClockInts.`0`
import typings.reactClock.reactClockInts.`100`
import typings.reactClock.reactClockInts.`999`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Acc['length'] extends N ? Acc[number] : react-clock.react-clock/dist/cjs/shared/types.Enumerate<N, [...Acc, Acc['length']]>
    }}}
    */
  @js.native
  trait Enumerate[N /* <: Double */, Acc /* <: js.Array[Double] */] extends StObject
  
  type GreaterThanOrEqualTo[F /* <: Double */] = Range[F, `999`]
  
  type HandLength = Range[`0`, `100`]
  
  type HandWidth = GreaterThanOrEqualTo[`0`]
  
  type MarkLength = HandLength
  
  type MarkWidth = HandWidth
  
  type OppositeHandLength = Double
  
  type Range[F /* <: Double */, T /* <: Double */] = (Exclude[Enumerate[T, js.Array[Any]], Enumerate[F, js.Array[Any]]]) | T
}
