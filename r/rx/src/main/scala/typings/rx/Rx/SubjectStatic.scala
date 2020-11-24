package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectStatic
  extends /**
  * Creates a subject.
  */
Instantiable0[Subject[js.Object]] {
  
  /**
    * Creates a subject from the specified observer and observable.
    * @param {Observer} observer The observer used to send messages to the subject.
    * @param {Observable} observable The observable used to subscribe to messages sent from the subject.
    * @returns {Subject} Subject implemented using the given observer and observable.
    */
  def create[T](): Subject[T] = js.native
  def create[T](observer: js.UndefOr[scala.Nothing], observable: IObservable[T]): Subject[T] = js.native
  def create[T](observer: IObserver[T]): Subject[T] = js.native
  def create[T](observer: IObserver[T], observable: IObservable[T]): Subject[T] = js.native
}
