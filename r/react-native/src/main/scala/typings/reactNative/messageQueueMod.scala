package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageQueueMod {
  
  @JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MessageQueue {
    
    /* CompleteClass */
    override def getCallableModule(name: String): js.Object = js.native
    
    /* CompleteClass */
    override def registerCallableModule(name: String, module: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
  }
  object default {
    
    @JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* static member */
    inline def spy(spyOrToggle: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spyOrToggle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
