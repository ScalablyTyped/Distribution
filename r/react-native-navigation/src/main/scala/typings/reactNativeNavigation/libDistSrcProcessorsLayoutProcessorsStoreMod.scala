package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcInterfacesProcessorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.libDistSrcInterfacesProcessorsMod.LayoutProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcProcessorsLayoutProcessorsStoreMod {
  
  @JSImport("react-native-navigation/lib/dist/src/processors/LayoutProcessorsStore", "LayoutProcessorsStore")
  @js.native
  open class LayoutProcessorsStore () extends StObject {
    
    def addProcessor(processor: LayoutProcessor): ProcessorSubscription = js.native
    
    def getProcessors(): js.Array[LayoutProcessor] = js.native
    
    /* private */ var layoutProcessors: Any = js.native
    
    /* private */ var removeProcessor: Any = js.native
  }
}
