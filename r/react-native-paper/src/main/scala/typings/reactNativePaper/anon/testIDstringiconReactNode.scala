package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNativePaper.reactNativePaperStrings.left
import typings.reactNativePaper.reactNativePaperStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  testID :string,   icon :react.react.ReactNode,   topPosition :number,   side :'left' | 'right'} & std.Omit<react-native-paper.react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon.StyleContextType, 'style'> */
trait testIDstringiconReactNode extends StObject {
  
  var forceFocus: js.Function0[Unit]
  
  var icon: ReactNode
  
  var isTextInputFocused: Boolean
  
  var side: left | right
  
  var testID: String
  
  var topPosition: Double
}
object testIDstringiconReactNode {
  
  inline def apply(
    forceFocus: () => Unit,
    isTextInputFocused: Boolean,
    side: left | right,
    testID: String,
    topPosition: Double
  ): testIDstringiconReactNode = {
    val __obj = js.Dynamic.literal(forceFocus = js.Any.fromFunction0(forceFocus), isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], testID = testID.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[testIDstringiconReactNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: testIDstringiconReactNode] (val x: Self) extends AnyVal {
    
    inline def setForceFocus(value: () => Unit): Self = StObject.set(x, "forceFocus", js.Any.fromFunction0(value))
    
    inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsTextInputFocused(value: Boolean): Self = StObject.set(x, "isTextInputFocused", value.asInstanceOf[js.Any])
    
    inline def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
  }
}
