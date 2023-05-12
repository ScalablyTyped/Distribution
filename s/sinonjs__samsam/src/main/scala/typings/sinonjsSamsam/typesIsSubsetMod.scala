package typings.sinonjsSamsam

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIsSubsetMod {
  
  /**
    * Returns `true` when `s1` is a subset of `s2`, `false` otherwise
    *
    * @private
    * @param  {Array|Set}  s1      The target value
    * @param  {Array|Set}  s2      The containing value
    * @param  {Function}  compare A comparison function, should return `true` when
    *                             values are considered equal
    * @returns {boolean} Returns `true` when `s1` is a subset of `s2`, `false`` otherwise
    */
  inline def apply(s1: js.Array[Any], s2: js.Array[Any], compare: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(s1: js.Array[Any], s2: Set[Any], compare: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(s1: Set[Any], s2: js.Array[Any], compare: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(s1: Set[Any], s2: Set[Any], compare: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].apply(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/is-subset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
