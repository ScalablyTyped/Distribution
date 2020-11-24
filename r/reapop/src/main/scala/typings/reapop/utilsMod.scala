package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def clone[T /* <: js.Any */](origObject: T): T = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  @js.native
  class Timer protected () extends js.Object {
    def this(delay: Double, callback: js.Function1[/* repeated */ js.Any, _]) = this()
    
    var callback: js.Any = js.native
    
    def pause(): Unit = js.native
    
    var remainingTime: Double = js.native
    
    def resume(): Unit = js.native
    
    var start: js.Any = js.native
    
    var timerId: js.Any = js.native
  }
}
