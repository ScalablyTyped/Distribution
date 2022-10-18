package typings.sinonjsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValueToStringMod {
  
  /**
    * Returns a string representation of the value
    *
    * @param  {*} value
    * @returns {string}
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sinonjs/commons/types/value-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
