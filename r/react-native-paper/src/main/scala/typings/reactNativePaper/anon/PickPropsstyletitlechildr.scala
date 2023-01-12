package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/List/ListAccordion.Props, 'style' | 'title' | 'children' | 'onPress' | 'onLongPress' | 'testID' | 'accessibilityLabel' | 'left' | 'right' | 'description' | 'titleStyle' | 'descriptionStyle' | 'titleNumberOfLines' | 'descriptionNumberOfLines' | 'id' | 'expanded'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropsstyletitlechildr extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: ReactNode
  
  var description: js.UndefOr[ReactNode] = js.undefined
  
  var descriptionNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var descriptionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var left: js.UndefOr[js.Function1[/* props */ ColorString, ReactNode]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var right: js.UndefOr[js.Function1[/* props */ IsExpanded, ReactNode]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var title: ReactNode
  
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object PickPropsstyletitlechildr {
  
  inline def apply(): PickPropsstyletitlechildr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPropsstyletitlechildr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPropsstyletitlechildr] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNumberOfLines(value: Double): Self = StObject.set(x, "descriptionNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNumberOfLinesUndefined: Self = StObject.set(x, "descriptionNumberOfLines", js.undefined)
    
    inline def setDescriptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "descriptionStyle", value.asInstanceOf[js.Any])
    
    inline def setDescriptionStyleNull: Self = StObject.set(x, "descriptionStyle", null)
    
    inline def setDescriptionStyleUndefined: Self = StObject.set(x, "descriptionStyle", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeft(value: /* props */ ColorString => ReactNode): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOnLongPress(value: /* e */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRight(value: /* props */ IsExpanded => ReactNode): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
