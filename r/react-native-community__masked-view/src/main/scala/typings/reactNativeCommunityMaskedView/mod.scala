package typings.reactNativeCommunityMaskedView

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/masked-view", JSImport.Default)
  @js.native
  open class default () extends MaskedView
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  trait MaskedView
    extends Component[MaskedViewProps, js.Object, Any]
  
  /**
    * @see https://github.com/react-native-community/react-native-masked-view
    */
  type MaskedViewComponent = Component[MaskedViewProps, js.Object, Any]
  
  trait MaskedViewProps
    extends StObject
       with ViewProps {
    
    var maskElement: ReactElement
  }
  object MaskedViewProps {
    
    inline def apply(maskElement: ReactElement): MaskedViewProps = {
      val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskedViewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskedViewProps] (val x: Self) extends AnyVal {
      
      inline def setMaskElement(value: ReactElement): Self = StObject.set(x, "maskElement", value.asInstanceOf[js.Any])
    }
  }
}
