package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcInterfacesProcessorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.libDistSrcInterfacesProcessorsMod.OptionsProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcProcessorsOptionProcessorsStoreMod {
  
  @JSImport("react-native-navigation/lib/dist/src/processors/OptionProcessorsStore", "OptionProcessorsStore")
  @js.native
  open class OptionProcessorsStore () extends StObject {
    
    def addProcessor[T](optionPath: String, processor: OptionsProcessor[T, Any]): ProcessorSubscription = js.native
    
    def getProcessors(optionPath: String): js.Array[OptionsProcessor[Any, Any]] = js.native
    
    /* private */ var optionsProcessorsByObjectPath: Any = js.native
    
    /* private */ var removeProcessor: Any = js.native
  }
}
