package typings.reactPopper

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.anon.Arrow
import typings.popperjsCore.anon.Dictkey
import typings.popperjsCore.anon.PartialCSSStyleDeclaratio
import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.Popper
import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libTypesMod.Instance
import typings.popperjsCore.libTypesMod.OptionsGeneric
import typings.popperjsCore.libTypesMod.PositioningStrategy
import typings.popperjsCore.libTypesMod.State
import typings.popperjsCore.libTypesMod.StateRects
import typings.popperjsCore.libTypesMod.VirtualElement
import typings.react.mod.CSSProperties
import typings.reactPopper.mod.Modifier
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: StringDictionary[js.UndefOr[StringDictionary[String]]]
    
    var forceUpdate: js.Function0[Unit] | Null
    
    var state: State | Null
    
    var styles: StringDictionary[CSSProperties]
    
    var update: js.Function0[js.Promise[typings.popperjsCore.anon.PartialState]] | Null
  }
  object Attributes {
    
    inline def apply(
      attributes: StringDictionary[js.UndefOr[StringDictionary[String]]],
      styles: StringDictionary[CSSProperties]
    ): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], forceUpdate = null, state = null, update = null)
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: StringDictionary[js.UndefOr[StringDictionary[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      inline def setForceUpdateNull: Self = StObject.set(x, "forceUpdate", null)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => js.Promise[typings.popperjsCore.anon.PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setUpdateNull: Self = StObject.set(x, "update", null)
    }
  }
  
  trait CreatePopper[Modifiers] extends StObject {
    
    var createPopper: js.UndefOr[FnCall] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.undefined
  }
  object CreatePopper {
    
    inline def apply[Modifiers](): CreatePopper[Modifiers] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePopper[Modifiers]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreatePopper[?], Modifiers] (val x: Self & CreatePopper[Modifiers]) extends AnyVal {
      
      inline def setCreatePopper(value: FnCall): Self = StObject.set(x, "createPopper", value.asInstanceOf[js.Any])
      
      inline def setCreatePopperUndefined: Self = StObject.set(x, "createPopper", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
    def apply[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
    def apply[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
    def apply[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  }
  
  /* Inlined std.Omit<std.Partial<@popperjs/core.@popperjs/core.Options>, 'modifiers'> */
  trait OmitPartialOptionsmodifie extends StObject {
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ typings.popperjsCore.anon.PartialState, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object OmitPartialOptionsmodifie {
    
    inline def apply(): OmitPartialOptionsmodifie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitPartialOptionsmodifie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitPartialOptionsmodifie] (val x: Self) extends AnyVal {
      
      inline def setOnFirstUpdate(value: /* arg0 */ typings.popperjsCore.anon.PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@popperjs/core.@popperjs/core.State> */
  trait PartialState extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[StringDictionary[String | Boolean]]] = js.undefined
    
    var elements: js.UndefOr[Arrow] = js.undefined
    
    var modifiersData: js.UndefOr[Dictkey] = js.undefined
    
    var options: js.UndefOr[OptionsGeneric[Any]] = js.undefined
    
    var orderedModifiers: js.UndefOr[js.Array[typings.popperjsCore.libTypesMod.Modifier[Any, Any]]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var rects: js.UndefOr[StateRects] = js.undefined
    
    var reset: js.UndefOr[Boolean] = js.undefined
    
    var scrollParents: js.UndefOr[Popper] = js.undefined
    
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
    
    var styles: js.UndefOr[StringDictionary[PartialCSSStyleDeclaratio]] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
      
      inline def setModifiersDataUndefined: Self = StObject.set(x, "modifiersData", js.undefined)
      
      inline def setOptions(value: OptionsGeneric[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOrderedModifiers(value: js.Array[typings.popperjsCore.libTypesMod.Modifier[Any, Any]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
      
      inline def setOrderedModifiersUndefined: Self = StObject.set(x, "orderedModifiers", js.undefined)
      
      inline def setOrderedModifiersVarargs(value: (typings.popperjsCore.libTypesMod.Modifier[Any, Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value*))
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
      
      inline def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
      
      inline def setScrollParentsUndefined: Self = StObject.set(x, "scrollParents", js.undefined)
      
      inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
