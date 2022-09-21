package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.typescriptTypesMod.EllipsizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /**
    * Description text for the list item or callback which returns a React element to display the description.
    */
  var description: js.UndefOr[typings.reactNativePaper.listItemMod.Description] = js.undefined
  
  /**
    * Ellipsize Mode for the Description.  One of `'head'`, `'middle'`, `'tail'`, `'clip'`.
    *
    * See [`ellipsizeMode`](https://reactnative.dev/docs/text#ellipsizemode)
    */
  var descriptionEllipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
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
    * Callback which returns a React element to display on the left side.
    */
  var left: js.UndefOr[js.Function1[/* props */ ColorStyle, ReactNode]] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback which returns a React element to display on the right side.
    */
  var right: js.UndefOr[js.Function1[/* props */ ColorStringStyle, ReactNode]] = js.undefined
  
  /**
    * Style that is passed to the wrapping TouchableRipple element.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Title text for the list item.
    */
  var title: typings.reactNativePaper.listItemMod.Title
  
  /**
    * Ellipsize Mode for the Title.  One of `'head'`, `'middle'`, `'tail'`, `'clip'`.
    *
    * See [`ellipsizeMode`](https://reactnative.dev/docs/text#ellipsizemode)
    */
  var titleEllipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
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
object Description {
  
  inline def apply(theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Description = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: typings.reactNativePaper.listItemMod.Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "descriptionEllipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setDescriptionEllipsizeModeUndefined: Self = StObject.set(x, "descriptionEllipsizeMode", js.undefined)
    
    inline def setDescriptionFunction1(value: /* props */ EllipsizeMode => ReactNode): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    inline def setDescriptionNumberOfLines(value: Double): Self = StObject.set(x, "descriptionNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNumberOfLinesUndefined: Self = StObject.set(x, "descriptionNumberOfLines", js.undefined)
    
    inline def setDescriptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "descriptionStyle", value.asInstanceOf[js.Any])
    
    inline def setDescriptionStyleNull: Self = StObject.set(x, "descriptionStyle", null)
    
    inline def setDescriptionStyleUndefined: Self = StObject.set(x, "descriptionStyle", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLeft(value: /* props */ ColorStyle => ReactNode): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRight(value: /* props */ ColorStringStyle => ReactNode): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: typings.reactNativePaper.listItemMod.Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "titleEllipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setTitleEllipsizeModeUndefined: Self = StObject.set(x, "titleEllipsizeMode", js.undefined)
    
    inline def setTitleFunction1(value: /* props */ EllipsizeMode => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
