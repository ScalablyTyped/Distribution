package typings.reactNativeNavigation

import typings.reactNativeNavigation.processorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.processorsMod.LayoutProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/processors/LayoutProcessorsStore", JSImport.Namespace)
@js.native
object layoutProcessorsStoreMod extends js.Object {
  
  @js.native
  class LayoutProcessorsStore () extends js.Object {
    
    def addProcessor(processor: LayoutProcessor): ProcessorSubscription = js.native
    
    def getProcessors(): js.Array[LayoutProcessor] = js.native
    
    var layoutProcessors: js.Any = js.native
    
    var removeProcessor: js.Any = js.native
  }
}
