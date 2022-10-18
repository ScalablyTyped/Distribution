package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeepEqualMod {
  
  /**
    * Deep equal comparison. Two values are "deep equal" when:
    *
    *   - They are equal, according to samsam.identical
    *   - They are both date objects representing the same time
    *   - They are both arrays containing elements that are all deepEqual
    *   - They are objects with the same set of properties, and each property
    *     in ``actual`` is deepEqual to the corresponding property in ``expectation``
    *
    * Supports cyclic objects.
    *
    * @alias module:samsam.deepEqual
    * @param {*} actual The object to examine
    * @param {*} expectation The object actual is expected to be equal to
    * @param {object} match A value to match on
    * @returns {boolean} Returns true when actual and expectation are considered equal
    */
  inline def apply(actual: Any, expectation: Any, `match`: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expectation.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/deep-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def use(`match`: Any): js.Function2[/* a */ Any, /* b */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(`match`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Boolean]]
}
