package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.TextProps
import typings.reactNativeElements.anon.PickTextPropsrightboolean
import typings.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityElementsHidden
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemSubtitleMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemSubtitle", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityElementsHidden] = js.native
  
  trait SubtitleProps
    extends StObject
       with TextProps {
    
    var right: js.UndefOr[Boolean] = js.undefined
  }
  object SubtitleProps {
    
    inline def apply(): SubtitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubtitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubtitleProps] (val x: Self) extends AnyVal {
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityElementsHidden]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemSubtitleMod.foo` */
  override def _to: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityElementsHidden] = default
}
