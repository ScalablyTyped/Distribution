package typings.promisePrototypeFinally

import typings.promisePrototypeFinally.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T, U](promise: Promise[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  @scala.inline
  def apply[T, U](promise: Promise[T], onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], onFinally.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  @JSImport("promise.prototype.finally", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[Unit]
  
  object global {
    
    @js.native
    trait Promise[T] extends StObject {
      
      def `finally`[U](): Promise[T] = js.native
      def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
    }
  }
}
