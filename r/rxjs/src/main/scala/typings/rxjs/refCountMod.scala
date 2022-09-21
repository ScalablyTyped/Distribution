package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refCountMod {
  
  @JSImport("rxjs/dist/types/internal/operators/refCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refCount[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refCount")().asInstanceOf[MonoTypeOperatorFunction[T]]
}
