package typings.sentryUtils

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisebufferMod {
  
  @JSImport("@sentry/utils/types/promisebuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePromiseBuffer[T](): PromiseBuffer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePromiseBuffer")().asInstanceOf[PromiseBuffer[T]]
  inline def makePromiseBuffer[T](limit: Double): PromiseBuffer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePromiseBuffer")(limit.asInstanceOf[js.Any]).asInstanceOf[PromiseBuffer[T]]
  
  @js.native
  trait PromiseBuffer[T] extends StObject {
    
    @JSName("$")
    var $: js.Array[PromiseLike[T]] = js.native
    
    def add(taskProducer: js.Function0[PromiseLike[T]]): PromiseLike[T] = js.native
    
    def drain(): PromiseLike[Boolean] = js.native
    def drain(timeout: Double): PromiseLike[Boolean] = js.native
  }
}
