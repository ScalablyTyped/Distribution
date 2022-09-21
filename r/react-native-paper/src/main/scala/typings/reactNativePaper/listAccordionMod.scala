package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel
import typings.reactNativePaper.anon.ColorString
import typings.reactNativePaper.anon.IsExpanded
import typings.reactNativePaper.anon.PickPropsstyletitlechildr
import typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAccordionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListAccordion", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the TouchableRipple. This is read by the screen reader when the user taps the touchable.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Content of the section.
      */
    var children: ReactNode
    
    /**
      * Description text for the list accordion.
      */
    var description: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Truncate Description text such that the total number of lines does not
      * exceed this number.
      */
    var descriptionNumberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Style that is passed to Description element.
      */
    var descriptionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Whether the accordion is expanded
      * If this prop is provided, the accordion will behave as a "controlled component".
      * You'll need to update this prop when you want to toggle the component or on `onPress`.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Id is used for distinguishing specific accordion when using List.AccordionGroup. Property is required when using List.AccordionGroup and has no impact on behavior when using standalone List.Accordion.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Callback which returns a React element to display on the left side.
      */
    var left: js.UndefOr[js.Function1[/* props */ ColorString, ReactNode]] = js.undefined
    
    /**
      * Function to execute on long press.
      */
    var onLongPress: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback which returns a React element to display on the right side.
      */
    var right: js.UndefOr[js.Function1[/* props */ IsExpanded, ReactNode]] = js.undefined
    
    /**
      * Style that is passed to the wrapping TouchableRipple element.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * TestID used for testing purposes
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Title text for the list accordion.
      */
    var title: ReactNode
    
    /**
      * Truncate Title text such that the total number of lines does not
      * exceed this number.
      */
    var titleNumberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Style that is passed to Title element.
      */
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(theme: Theme): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
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
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `listAccordionMod.foo` */
  override def _to: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ]) = default
}
