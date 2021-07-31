package typings.reactNavigationStack

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchableItemMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/TouchableItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasBorderlessPressColorStyleChildrenRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasBorderlessPressColorStyleChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with ViewProps {
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pressColor: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressColorUndefined: Self = StObject.set(x, "pressColor", js.undefined)
    }
  }
}
