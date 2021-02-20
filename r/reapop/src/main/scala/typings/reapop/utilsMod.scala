package typings.reapop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("reapop/dist/utils", "Timer")
  @js.native
  class Timer protected () extends StObject {
    def this(delay: Double, callback: js.Function1[/* repeated */ js.Any, _]) = this()
    
    var callback: js.Any = js.native
    
    def pause(): Unit = js.native
    
    var remainingTime: Double = js.native
    
    def resume(): Unit = js.native
    
    var start: js.Any = js.native
    
    var timerId: js.Any = js.native
  }
  
  @JSImport("reapop/dist/utils", "clone")
  @js.native
  def clone_[T /* <: js.Any */](origObject: T): T = js.native
  
  @JSImport("reapop/dist/utils", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
}
