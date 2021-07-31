package typings.reactNativeNavigation

import typings.reactNativeNavigation.processorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.processorsMod.LayoutProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutProcessorsStoreMod {
  
  @JSImport("react-native-navigation/lib/dist/processors/LayoutProcessorsStore", "LayoutProcessorsStore")
  @js.native
  class LayoutProcessorsStore () extends StObject {
    
    def addProcessor(processor: LayoutProcessor): ProcessorSubscription = js.native
    
    def getProcessors(): js.Array[LayoutProcessor] = js.native
    
    var layoutProcessors: js.Any = js.native
    
    var removeProcessor: js.Any = js.native
  }
}
