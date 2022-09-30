package typings.reactNativeScreens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBackPressSubscriptionMod {
  
  @JSImport("react-native-screens/lib/typescript/native-stack/utils/useBackPressSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBackPressSubscription(hasOnBackPressIsDisabled: Args): UseBackPressSubscription_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackPressSubscription")(hasOnBackPressIsDisabled.asInstanceOf[js.Any]).asInstanceOf[UseBackPressSubscription_]
  
  trait Args extends StObject {
    
    var isDisabled: Boolean
    
    def onBackPress(): Boolean
  }
  object Args {
    
    inline def apply(isDisabled: Boolean, onBackPress: () => Boolean): Args = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], onBackPress = js.Any.fromFunction0(onBackPress))
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setOnBackPress(value: () => Boolean): Self = StObject.set(x, "onBackPress", js.Any.fromFunction0(value))
    }
  }
  
  trait UseBackPressSubscription_ extends StObject {
    
    def clearSubscription(): Unit
    
    def createSubscription(): Unit
    
    def handleAttached(): Unit
    
    def handleDetached(): Unit
  }
  object UseBackPressSubscription_ {
    
    inline def apply(
      clearSubscription: () => Unit,
      createSubscription: () => Unit,
      handleAttached: () => Unit,
      handleDetached: () => Unit
    ): UseBackPressSubscription_ = {
      val __obj = js.Dynamic.literal(clearSubscription = js.Any.fromFunction0(clearSubscription), createSubscription = js.Any.fromFunction0(createSubscription), handleAttached = js.Any.fromFunction0(handleAttached), handleDetached = js.Any.fromFunction0(handleDetached))
      __obj.asInstanceOf[UseBackPressSubscription_]
    }
    
    extension [Self <: UseBackPressSubscription_](x: Self) {
      
      inline def setClearSubscription(value: () => Unit): Self = StObject.set(x, "clearSubscription", js.Any.fromFunction0(value))
      
      inline def setCreateSubscription(value: () => Unit): Self = StObject.set(x, "createSubscription", js.Any.fromFunction0(value))
      
      inline def setHandleAttached(value: () => Unit): Self = StObject.set(x, "handleAttached", js.Any.fromFunction0(value))
      
      inline def setHandleDetached(value: () => Unit): Self = StObject.set(x, "handleDetached", js.Any.fromFunction0(value))
    }
  }
}
