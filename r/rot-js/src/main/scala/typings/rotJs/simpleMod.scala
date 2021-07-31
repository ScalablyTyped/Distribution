package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleMod {
  
  @JSImport("rot-js/lib/scheduler/simple", JSImport.Default)
  @js.native
  class default[T] () extends Simple[T]
  
  @js.native
  trait Simple[T]
    extends typings.rotJs.schedulerSchedulerMod.default[T] {
    
    def add(item: js.Any, repeat: Boolean): this.type = js.native
  }
}
