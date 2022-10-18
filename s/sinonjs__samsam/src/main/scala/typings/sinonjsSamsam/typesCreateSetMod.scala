package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateSetMod {
  
  /**
    * This helper makes it convenient to create Set instances from a
    * collection, an overcomes the shortcoming that IE11 doesn't support
    * collection arguments
    *
    * @private
    * @param  {Array} array An array to create a set from
    * @returns {Set} A set (unique) containing the members from array
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set
    */
  inline def apply(array: js.Array[Any], args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(array.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
