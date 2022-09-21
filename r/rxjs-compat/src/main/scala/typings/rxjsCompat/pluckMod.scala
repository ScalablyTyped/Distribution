package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluckMod {
  
  @JSImport("rxjs-compat/operators/pluck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pluck[T, R](properties: String*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
}
