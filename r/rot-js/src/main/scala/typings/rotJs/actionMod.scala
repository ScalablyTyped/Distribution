package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("rot-js/lib/scheduler/action", JSImport.Default)
  @js.native
  class default[T] () extends Action[T]
  
  @js.native
  trait Action[T]
    extends typings.rotJs.schedulerSchedulerMod.default[T] {
    
    var _defaultDuration: Double = js.native
    
    var _duration: Double = js.native
    
    def add(item: T, repeat: Boolean, time: Double): this.type = js.native
    
    def remove(item: T): Boolean = js.native
    
    /**
      * Set duration for the active item
      */
    def setDuration(time: Double): this.type = js.native
  }
}
