package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlledObservable[T] extends Observable[T] {
  
  def request(): IDisposable = js.native
  def request(numberOfItems: Double): IDisposable = js.native
  
  /**
    * Attaches a stop and wait observable to the current observable.
    * @returns {Observable} A stop and wait observable.
    */
  def stopAndWait(): Observable[T] = js.native
  
  /**
    * Creates a sliding windowed observable based upon the window size.
    * @param {Number} windowSize The number of items in the window
    * @returns {Observable} A windowed observable based upon the window size.
    */
  def windowed(windowSize: Double): Observable[T] = js.native
}
