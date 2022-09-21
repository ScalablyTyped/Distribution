package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLastMod {
  
  @JSImport("rxjs/dist/types/internal/operators/skipLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipLast[T](skipCount: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLast")(skipCount.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
