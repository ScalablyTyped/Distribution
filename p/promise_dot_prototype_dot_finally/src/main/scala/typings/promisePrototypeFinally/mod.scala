package typings.promisePrototypeFinally

import typings.promisePrototypeFinally.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise.prototype.finally", JSImport.Namespace)
  @js.native
  def apply[T, U](promise: Promise[T]): Promise[T] = js.native
  @JSImport("promise.prototype.finally", JSImport.Namespace)
  @js.native
  def apply[T, U](promise: Promise[T], onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
  
  @JSImport("promise.prototype.finally", "shim")
  @js.native
  def shim(): Unit = js.native
  
  object global {
    
    @js.native
    trait Promise[T] extends StObject {
      
      def `finally`[U](): Promise[T] = js.native
      def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
    }
  }
}
