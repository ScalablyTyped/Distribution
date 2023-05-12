package typings.stringMath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(eq: String): Double | Null = ^.asInstanceOf[js.Dynamic].apply(eq.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def apply(
    eq: String,
    callback: js.Function2[/* errorObj */ js.Error | Null, /* result */ Double | Null, Unit]
  ): Double | Null = (^.asInstanceOf[js.Dynamic].apply(eq.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @JSImport("string-math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
