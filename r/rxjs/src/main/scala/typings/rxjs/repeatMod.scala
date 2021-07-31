package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("rxjs/internal/operators/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def repeat[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
