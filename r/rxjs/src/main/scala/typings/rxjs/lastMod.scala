package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastMod {
  
  @JSImport("rxjs/internal/operators/last", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def last[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  @scala.inline
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  @scala.inline
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
}
