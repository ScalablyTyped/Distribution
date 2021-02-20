package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageQueueMod {
  
  @JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Default)
  @js.native
  class default () extends MessageQueue
  object default {
    
    @JSImport("react-native/Libraries/BatchedBridge/MessageQueue", "default.spy")
    @js.native
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    /* static member */
    @JSImport("react-native/Libraries/BatchedBridge/MessageQueue", "default.spy")
    @js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
}
