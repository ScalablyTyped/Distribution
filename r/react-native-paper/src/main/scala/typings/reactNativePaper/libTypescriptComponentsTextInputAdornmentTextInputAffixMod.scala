package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.anon.PickPropstextonLayouttext
import typings.reactNativePaper.anon.`29`
import typings.reactNativePaper.anon.affixReactNodetestIDstrin
import typings.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentSide
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputAdornmentTextInputAffixMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropstextonLayouttext] & (NonReactStatics[ComponentType[Props] & `29`, js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix", "AffixAdornment")
  @js.native
  val AffixAdornment: FunctionComponent[affixReactNodetestIDstrin] = js.native
  
  /**
    * A component to render a leading / trailing text in the TextInput
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/textinput-outline.affix.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { TextInput } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [text, setText] = React.useState('');
    *
    *   return (
    *     <TextInput
    *       mode="outlined"
    *       label="Outlined input"
    *       placeholder="Type something"
    *       right={<TextInput.Affix text="/100" />}
    *     />
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  object TextInputAffix {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix", "TextInputAffix")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputAffix", "TextInputAffix.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ContextState extends StObject {
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
    
    var side: AdornmentSide
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var topPosition: Double | Null
    
    var visible: js.UndefOr[Value] = js.undefined
  }
  object ContextState {
    
    inline def apply(side: AdornmentSide): ContextState = {
      val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], topPosition = null)
      __obj.asInstanceOf[ContextState]
    }
    
    extension [Self <: ContextState](x: Self) {
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
      
      inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
      
      inline def setSide(value: AdornmentSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
      
      inline def setTopPositionNull: Self = StObject.set(x, "topPosition", null)
      
      inline def setVisible(value: Value): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    /**
      * Text to show.
      */
    var text: String
    
    /**
      * Style that is passed to the Text element.
      */
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(text: String, theme: Theme): Props = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropstextonLayouttext] & (NonReactStatics[ComponentType[Props] & `29`, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsTextInputAdornmentTextInputAffixMod.foo` */
  override def _to: ComponentType[PickPropstextonLayouttext] & (NonReactStatics[ComponentType[Props] & `29`, js.Object]) = default
}
