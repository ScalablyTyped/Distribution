package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultIfEmptyMod {
  
  @JSImport("rxjs/internal/operators/defaultIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
}
