package typings.statuses

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("statuses", JSImport.Namespace)
  @js.native
  val ^ : status = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends / * template literal string: ${NonNumericAscii<S>}${infer_} * / string ? any : never
    }}}
    */
  @js.native
  trait IsNonNumericString[S /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends / * template literal string: ${number} * / string ? any : never
    }}}
    */
  @js.native
  trait IsNumericString[S /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends / * template literal string: ${NumericAscii} * / string ? never : any
    }}}
    */
  @js.native
  trait NonNumericAscii[S] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.statuses.statusesStrings.`1`
    - typings.statuses.statusesStrings.`2`
    - typings.statuses.statusesStrings.`3`
    - typings.statuses.statusesStrings.`4`
    - typings.statuses.statusesStrings.`5`
    - typings.statuses.statusesStrings.`6`
    - typings.statuses.statusesStrings.`7`
    - typings.statuses.statusesStrings.`8`
    - typings.statuses.statusesStrings.`9`
    - typings.statuses.statusesStrings.`0`
  */
  trait NumericAscii extends StObject
  object NumericAscii {
    
    inline def `0`: typings.statuses.statusesStrings.`0` = "0".asInstanceOf[typings.statuses.statusesStrings.`0`]
    
    inline def `1`: typings.statuses.statusesStrings.`1` = "1".asInstanceOf[typings.statuses.statusesStrings.`1`]
    
    inline def `2`: typings.statuses.statusesStrings.`2` = "2".asInstanceOf[typings.statuses.statusesStrings.`2`]
    
    inline def `3`: typings.statuses.statusesStrings.`3` = "3".asInstanceOf[typings.statuses.statusesStrings.`3`]
    
    inline def `4`: typings.statuses.statusesStrings.`4` = "4".asInstanceOf[typings.statuses.statusesStrings.`4`]
    
    inline def `5`: typings.statuses.statusesStrings.`5` = "5".asInstanceOf[typings.statuses.statusesStrings.`5`]
    
    inline def `6`: typings.statuses.statusesStrings.`6` = "6".asInstanceOf[typings.statuses.statusesStrings.`6`]
    
    inline def `7`: typings.statuses.statusesStrings.`7` = "7".asInstanceOf[typings.statuses.statusesStrings.`7`]
    
    inline def `8`: typings.statuses.statusesStrings.`8` = "8".asInstanceOf[typings.statuses.statusesStrings.`8`]
    
    inline def `9`: typings.statuses.statusesStrings.`9` = "9".asInstanceOf[typings.statuses.statusesStrings.`9`]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends statuses.statuses.IsNumericString<S> ? string : S extends statuses.statuses.IsNonNumericString<S> ? number : string | number
    }}}
    */
  type Result[S /* <: String */] = String
  
  type _To = status
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: status = ^
  
  @js.native
  trait status extends StObject {
    
    def apply(code: Double): String = js.native
    def apply[S /* <: String */](code: S): Result[S] = js.native
    
    var code: StringDictionary[js.UndefOr[Double]] = js.native
    
    var codes: js.Array[Double] = js.native
    
    var empty: NumberDictionary[js.UndefOr[Boolean]] = js.native
    
    var message: NumberDictionary[js.UndefOr[String]] = js.native
    
    var redirect: NumberDictionary[js.UndefOr[Boolean]] = js.native
    
    var retry: NumberDictionary[js.UndefOr[Boolean]] = js.native
  }
}
