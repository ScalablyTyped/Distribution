package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilIdentityMod {
  
  @JSImport("rxjs/internal/util/identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identity[T](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}
