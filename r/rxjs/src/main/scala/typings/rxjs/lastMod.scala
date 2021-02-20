package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastMod {
  
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last[T, D](): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last[T, D](predicate: js.UndefOr[scala.Nothing], defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = js.native
  @JSImport("rxjs/internal/operators/last", "last")
  @js.native
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = js.native
}
