package typings.reapop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("reapop/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reapop/dist/utils", "Timer")
  @js.native
  open class Timer protected () extends StObject {
    def this(delay: Double, callback: js.Function1[/* repeated */ Any, Any]) = this()
    
    /* private */ var callback: Any = js.native
    
    def pause(): Unit = js.native
    
    var remainingTime: Double = js.native
    
    def resume(): Unit = js.native
    
    /* private */ var start: Any = js.native
    
    /* private */ var timerId: Any = js.native
  }
  
  inline def clone_[T](origObject: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(origObject.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
