package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distinctUntilChangedMod {
  
  @JSImport("rxjs/internal/operators/distinctUntilChanged", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/distinctUntilChanged", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/distinctUntilChanged", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = js.native
}
