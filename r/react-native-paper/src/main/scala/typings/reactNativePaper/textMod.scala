package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNativePaper.anon.PickTextPropsstyleStylePr
import typings.reactNativePaper.anon.TextPropsstyleStylePropTe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/Text", JSImport.Default)
  @js.native
  val default: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = js.native
  
  type _To = ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: ComponentType[PickTextPropsstyleStylePr] & (NonReactStatics[
    ComponentType[TextPropsstyleStylePropTe] & ForwardRefExoticComponent[TextPropsstyleStylePropTe], 
    js.Object
  ]) = default
}
