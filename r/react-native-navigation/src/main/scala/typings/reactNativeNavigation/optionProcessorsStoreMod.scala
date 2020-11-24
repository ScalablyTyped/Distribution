package typings.reactNativeNavigation

import typings.reactNativeNavigation.processorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.processorsMod.OptionsProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/processors/OptionProcessorsStore", JSImport.Namespace)
@js.native
object optionProcessorsStoreMod extends js.Object {
  
  @js.native
  class OptionProcessorsStore () extends js.Object {
    
    def addProcessor[T](optionPath: String, processor: OptionsProcessor[T]): ProcessorSubscription = js.native
    
    def getProcessors(optionPath: String): js.Array[OptionsProcessor[_]] = js.native
    
    var optionsProcessorsByObjectPath: js.Any = js.native
    
    var removeProcessor: js.Any = js.native
  }
}
