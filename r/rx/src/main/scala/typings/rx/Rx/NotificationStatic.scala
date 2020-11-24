package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationStatic
  extends Instantiable6[
      /* kind */ js.Any, 
      /* value */ js.Any, 
      /* exception */ js.Any, 
      /* accept */ js.Any, 
      /* acceptObservable */ js.Any, 
      /* toString */ js.Any, 
      Notification[js.Object]
    ] {
  
  /**
    * Creates an object that represents an OnCompleted notification to an observer.
    * @returns {Notification} The OnCompleted notification.
    */
  def createOnCompleted[T](): Notification[T] = js.native
  
  /**
    * Creates an object that represents an OnError notification to an observer.
    * @param {Any} error The exception contained in the notification.
    * @returns {Notification} The OnError notification containing the exception.
    */
  def createOnError[T](exception: js.Any): Notification[T] = js.native
  
  /**
    * Creates an object that represents an OnNext notification to an observer.
    * @param {Any} value The value contained in the notification.
    * @returns {Notification} The OnNext notification containing the value.
    */
  def createOnNext[T](value: T): Notification[T] = js.native
}
