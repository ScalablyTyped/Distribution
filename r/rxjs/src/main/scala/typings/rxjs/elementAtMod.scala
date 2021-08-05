package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementAtMod {
  
  @JSImport("rxjs/internal/operators/elementAt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementAt[T](index: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def elementAt[T](index: Double, defaultValue: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
