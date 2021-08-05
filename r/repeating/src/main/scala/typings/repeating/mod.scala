package typings.repeating

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Repeat a string - fast
    *
    * @param count Times the 'string' should be repeated.
    * @param str String to repeat. Default: ' '
    */
  inline def apply(count: Double): String = ^.asInstanceOf[js.Dynamic].apply(count.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(count: Double, str: String): String = (^.asInstanceOf[js.Dynamic].apply(count.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("repeating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
