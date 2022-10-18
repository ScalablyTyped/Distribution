package typings.rxjs.anon

import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToBe[T] extends StObject {
  
  def toBe(marbles: String): Unit = js.native
  def toBe(marbles: String, values: Any): Unit = js.native
  def toBe(marbles: String, values: Any, errorValue: Any): Unit = js.native
  def toBe(marbles: String, values: Unit, errorValue: Any): Unit = js.native
  
  def toEqual(other: Observable[T]): Unit = js.native
}
