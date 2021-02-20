package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowCountMod {
  
  @JSImport("rxjs/internal/operators/windowCount", "windowCount")
  @js.native
  def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators/windowCount", "windowCount")
  @js.native
  def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = js.native
}
