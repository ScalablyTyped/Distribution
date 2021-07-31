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
  class Timer protected () extends StObject {
    def this(delay: Double, callback: js.Function1[/* repeated */ js.Any, js.Any]) = this()
    
    var callback: js.Any = js.native
    
    def pause(): Unit = js.native
    
    var remainingTime: Double = js.native
    
    def resume(): Unit = js.native
    
    var start: js.Any = js.native
    
    var timerId: js.Any = js.native
  }
  
  @scala.inline
  def clone_[T /* <: js.Any */](origObject: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(origObject.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
