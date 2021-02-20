package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BehaviorSubject[T] extends Subject[T] {
  
  /**
    * Gets the current value or throws an exception.
    * Value is frozen after onCompleted is called.
    * After onError is called always throws the specified exception.
    * An exception is always thrown after dispose is called.
    * @returns {Mixed} The initial value passed to the constructor until onNext is called; after which, the last value passed to onNext.
    */
  def getValue(): T = js.native
}
