package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identicalMod {
  
  /**
    * Strict equality check according to EcmaScript Harmony's `egal`.
    *
    * **From the Harmony wiki:**
    * > An `egal` function simply makes available the internal `SameValue` function
    * > from section 9.12 of the ES5 spec. If two values are egal, then they are not
    * > observably distinguishable.
    *
    * `identical` returns `true` when `===` is `true`, except for `-0` and
    * `+0`, where it returns `false`. Additionally, it returns `true` when
    * `NaN` is compared to itself.
    *
    * @alias module:samsam.identical
    * @param {*} obj1 The first value to compare
    * @param {*} obj2 The second value to compare
    * @returns {boolean} Returns `true` when the objects are *egal*, `false` otherwise
    */
  inline def apply(obj1: Any, obj2: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/identical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
