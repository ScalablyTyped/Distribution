package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throwIfEmptyMod {
  
  @JSImport("rxjs/internal/operators/throwIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def throwIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def throwIfEmpty[T](errorFactory: js.Function0[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
