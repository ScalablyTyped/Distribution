package typings.rxjs

import typings.rxjs.distTypesInternalOperatorsShareMod.ShareConfig
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsShareMod {
  
  @JSImport("rxjs/internal/operators/share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def share[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def share[T](options: ShareConfig[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(options.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
