package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateMatcherMatchObjectMod {
  
  /**
    * Matches `actual` with `expectation`
    *
    * @private
    * @param {*} actual A value to examine
    * @param {object} expectation An object with properties to match on
    * @param {object} matcher A matcher to use for comparison
    * @returns {boolean} Returns true when `actual` matches all properties in `expectation`
    */
  inline def apply(actual: Any, expectation: js.Object, matcher: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expectation.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/create-matcher/match-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
