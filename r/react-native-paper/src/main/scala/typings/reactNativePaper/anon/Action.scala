package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.reactNativePaper.typescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var Action: CallHasSizeIconColorIconDisabledOnPressAccessibilityLabelRest
  
  var BackAction: CallHasAccessibilityLabelRest
  
  var Content: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[
    (ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallHasTitleColorSubtitleSubtitleStyleOnPressStyleTitleRefTitleStyleThemeTitleRest, 
    js.Object
  ])
  
  var Header: (ComponentType[
    PickthemeDeepPartialThemeAccessibilityHint | PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors
  ]) & (NonReactStatics[
    (ComponentType[PickPartialViewPropsRefAtAccessibilityActions | themeDeepPartialThemeunde]) & DisplayNameString, 
    js.Object
  ])
}
object Action {
  
  inline def apply(
    Action: CallHasSizeIconColorIconDisabledOnPressAccessibilityLabelRest,
    BackAction: CallHasAccessibilityLabelRest,
    Content: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[
      (ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallHasTitleColorSubtitleSubtitleStyleOnPressStyleTitleRefTitleStyleThemeTitleRest, 
      js.Object
    ]),
    Header: (ComponentType[
      PickthemeDeepPartialThemeAccessibilityHint | PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors
    ]) & (NonReactStatics[
      (ComponentType[PickPartialViewPropsRefAtAccessibilityActions | themeDeepPartialThemeunde]) & DisplayNameString, 
      js.Object
    ])
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BackAction = BackAction.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: CallHasSizeIconColorIconDisabledOnPressAccessibilityLabelRest): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBackAction(value: CallHasAccessibilityLabelRest): Self = StObject.set(x, "BackAction", value.asInstanceOf[js.Any])
    
    inline def setContent(
      value: ComponentType[PickRemoveChildrenforceToAccessibilityActions] & (NonReactStatics[
          (ComponentType[RemoveChildren[TypeofView] & OnPress]) & CallHasTitleColorSubtitleSubtitleStyleOnPressStyleTitleRefTitleStyleThemeTitleRest, 
          js.Object
        ])
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setHeader(
      value: (ComponentType[
          PickthemeDeepPartialThemeAccessibilityHint | PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors
        ]) & (NonReactStatics[
          (ComponentType[PickPartialViewPropsRefAtAccessibilityActions | themeDeepPartialThemeunde]) & DisplayNameString, 
          js.Object
        ])
    ): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
  }
}
