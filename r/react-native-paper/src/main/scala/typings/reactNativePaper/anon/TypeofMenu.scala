package typings.reactNativePaper.anon

import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.reactNativePaper.menuMod.Props
import typings.reactNativePaper.menuMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMenu extends StObject {
  
  /* static member */
  var Item: ComponentType[PicktitleReactNodeiconIco] & (NonReactStatics[
    ComponentType[AccessibilityLabelContentStyle] & CallHasIconTitleDisabledOnPressStyleContentStyleTestIDTitleStyleAccessibilityLabelTheme, 
    js.Object
  ])
  
  /* static member */
  var defaultProps: OverlayAccessibilityLabel
  
  /* static member */
  def getDerivedStateFromProps(nextProps: Props, prevState: State): Rendered | Null
}
object TypeofMenu {
  
  inline def apply(
    Item: ComponentType[PicktitleReactNodeiconIco] & (NonReactStatics[
      ComponentType[AccessibilityLabelContentStyle] & CallHasIconTitleDisabledOnPressStyleContentStyleTestIDTitleStyleAccessibilityLabelTheme, 
      js.Object
    ]),
    defaultProps: OverlayAccessibilityLabel,
    getDerivedStateFromProps: (Props, State) => Rendered | Null
  ): TypeofMenu = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps))
    __obj.asInstanceOf[TypeofMenu]
  }
  
  extension [Self <: TypeofMenu](x: Self) {
    
    inline def setDefaultProps(value: OverlayAccessibilityLabel): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setGetDerivedStateFromProps(value: (Props, State) => Rendered | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    inline def setItem(
      value: ComponentType[PicktitleReactNodeiconIco] & (NonReactStatics[
          ComponentType[AccessibilityLabelContentStyle] & CallHasIconTitleDisabledOnPressStyleContentStyleTestIDTitleStyleAccessibilityLabelTheme, 
          js.Object
        ])
    ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
