package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMatchMod {
  
  /**
    * Matches an object with a matcher (or value)
    *
    * @alias module:samsam.match
    * @param {object} object The object candidate to match
    * @param {object} matcherOrValue A matcher or value to match against
    * @returns {boolean} true when `object` matches `matcherOrValue`
    */
  inline def apply(`object`: js.Object, matcherOrValue: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
