package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactElement
import typings.reactNativeElements.helpersMod.RneFunctionComponent
import typings.reactNativeElements.iconMod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBoxIconMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/checkbox/CheckBoxIcon", JSImport.Default)
  @js.native
  val default: RneFunctionComponent[CheckBoxIconProps] = js.native
  
  trait CheckBoxIconProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedColor: js.UndefOr[String] = js.undefined
    
    var checkedIcon: js.UndefOr[String | ReactElement] = js.undefined
    
    var iconType: js.UndefOr[IconType] = js.undefined
    
    var onIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var uncheckedColor: js.UndefOr[String] = js.undefined
    
    var uncheckedIcon: js.UndefOr[String | ReactElement] = js.undefined
  }
  object CheckBoxIconProps {
    
    inline def apply(): CheckBoxIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckBoxIconProps]
    }
    
    extension [Self <: CheckBoxIconProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
      
      inline def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
      
      inline def setCheckedIcon(value: String | ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
      
      inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
      
      inline def setOnIconPress(value: () => Unit): Self = StObject.set(x, "onIconPress", js.Any.fromFunction0(value))
      
      inline def setOnIconPressUndefined: Self = StObject.set(x, "onIconPress", js.undefined)
      
      inline def setOnLongIconPress(value: () => Unit): Self = StObject.set(x, "onLongIconPress", js.Any.fromFunction0(value))
      
      inline def setOnLongIconPressUndefined: Self = StObject.set(x, "onLongIconPress", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
      
      inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
      
      inline def setUncheckedIcon(value: String | ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    }
  }
  
  type _To = RneFunctionComponent[CheckBoxIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkBoxIconMod.foo` */
  override def _to: RneFunctionComponent[CheckBoxIconProps] = default
}
