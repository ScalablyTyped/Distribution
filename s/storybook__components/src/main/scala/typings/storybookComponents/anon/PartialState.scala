package typings.storybookComponents.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.CSSStyleDeclaration
import typings.std.Partial
import typings.storybookComponents.popperjsCoreLibTypesMod.Modifier
import typings.storybookComponents.popperjsCoreLibTypesMod.OptionsGeneric
import typings.storybookComponents.popperjsCoreLibTypesMod.PositioningStrategy
import typings.storybookComponents.popperjsCoreLibTypesMod.StateRects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/components.@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-types.State> */
trait PartialState extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[StringDictionary[String | Boolean]]] = js.undefined
  
  var elements: js.UndefOr[Arrow] = js.undefined
  
  var modifiersData: js.UndefOr[Dictkey] = js.undefined
  
  var options: js.UndefOr[OptionsGeneric[Any]] = js.undefined
  
  var orderedModifiers: js.UndefOr[js.Array[Modifier[Any, Any]]] = js.undefined
  
  var placement: js.UndefOr[typings.storybookComponents.popperjsCoreLibEnumsMod.Placement] = js.undefined
  
  var rects: js.UndefOr[StateRects] = js.undefined
  
  var reset: js.UndefOr[Boolean] = js.undefined
  
  var scrollParents: js.UndefOr[Popper] = js.undefined
  
  var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  
  var styles: js.UndefOr[StringDictionary[Partial[CSSStyleDeclaration]]] = js.undefined
}
object PartialState {
  
  inline def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  extension [Self <: PartialState](x: Self) {
    
    inline def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
    
    inline def setModifiersDataUndefined: Self = StObject.set(x, "modifiersData", js.undefined)
    
    inline def setOptions(value: OptionsGeneric[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOrderedModifiers(value: js.Array[Modifier[Any, Any]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
    
    inline def setOrderedModifiersUndefined: Self = StObject.set(x, "orderedModifiers", js.undefined)
    
    inline def setOrderedModifiersVarargs(value: (Modifier[Any, Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value*))
    
    inline def setPlacement(value: typings.storybookComponents.popperjsCoreLibEnumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
    
    inline def setScrollParentsUndefined: Self = StObject.set(x, "scrollParents", js.undefined)
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setStyles(value: StringDictionary[Partial[CSSStyleDeclaration]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
