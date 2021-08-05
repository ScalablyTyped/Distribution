package typings.safeCompare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Do a constant time string comparison. Always compare the complete strings
    * against each other to get a constant time. This method does not short-cut
    * if the two string's length differs.
    */
  inline def apply(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("safe-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
