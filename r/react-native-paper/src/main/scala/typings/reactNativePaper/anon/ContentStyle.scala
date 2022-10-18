package typings.reactNativePaper.anon

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.Animated.EndCallback
import typings.reactNative.mod.Animated.EndResult
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typings.reactNativePaper.reactNativePaperStrings.children
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStyle extends StObject {
  
  /**
    * Action items to shown in the banner.
    * An action item should contain the following properties:
    *
    * - `label`: label of the action button (required)
    * - `onPress`: callback that is called when button is pressed (required)
    *
    * To customize button you can pass other props that button component takes.
    */
  var actions: js.Array[
    LabelString & (Omit[
      PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel | (PropsWithChildren[
        PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
      ]), 
      children
    ])
  ]
  
  /**
    * Content that will be displayed inside banner.
    */
  var children: String
  
  /**
    * Style of banner's inner content.
    * Use this prop to apply custom width for wide layouts.
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Icon to display for the `Banner`. Can be an image.
    */
  var icon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * @optional
    * Optional callback that will be called after the closing animation finished running normally
    */
  var onHideAnimationFinished: js.UndefOr[EndCallback] = js.undefined
  
  /**
    * @optional
    * Optional callback that will be called after the opening animation finished running normally
    */
  var onShowAnimationFinished: js.UndefOr[EndCallback] = js.undefined
  
  var ref: js.UndefOr[RefObject[View]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether banner is currently visible.
    */
  var visible: Boolean
}
object ContentStyle {
  
  inline def apply(
    actions: js.Array[
      LabelString & (Omit[
        PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel | (PropsWithChildren[
          PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
        ]), 
        children
      ])
    ],
    children: String,
    theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme,
    visible: Boolean
  ): ContentStyle = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStyle]
  }
  
  extension [Self <: ContentStyle](x: Self) {
    
    inline def setActions(
      value: js.Array[
          LabelString & (Omit[
            PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel | (PropsWithChildren[
              PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
            ]), 
            children
          ])
        ]
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(
      value: (LabelString & (Omit[
          PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel | (PropsWithChildren[
            PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
          ]), 
          children
        ]))*
    ): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setOnHideAnimationFinished(value: /* result */ EndResult => Unit): Self = StObject.set(x, "onHideAnimationFinished", js.Any.fromFunction1(value))
    
    inline def setOnHideAnimationFinishedUndefined: Self = StObject.set(x, "onHideAnimationFinished", js.undefined)
    
    inline def setOnShowAnimationFinished(value: /* result */ EndResult => Unit): Self = StObject.set(x, "onShowAnimationFinished", js.Any.fromFunction1(value))
    
    inline def setOnShowAnimationFinishedUndefined: Self = StObject.set(x, "onShowAnimationFinished", js.undefined)
    
    inline def setRef(value: RefObject[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
