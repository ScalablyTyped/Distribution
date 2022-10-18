package typings.rxjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rxjs.distTypesInternalTestingColdObservableMod.ColdObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallMarblesValuesError extends StObject {
  
  def apply[T](marbles: String): ColdObservable[T] = js.native
  def apply[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
  def apply[T](marbles: String, values: StringDictionary[T], error: Any): ColdObservable[T] = js.native
  def apply[T](marbles: String, values: Unit, error: Any): ColdObservable[T] = js.native
}
