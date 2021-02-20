package typings.reactPopper

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.anon.Arrow
import typings.popperjsCore.anon.Dictkey
import typings.popperjsCore.anon.PartialCSSStyleDeclaratio
import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.Popper
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.Instance
import typings.popperjsCore.typesMod.OptionsGeneric
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.StateRects
import typings.popperjsCore.typesMod.VirtualElement
import typings.react.mod.CSSProperties
import typings.reactPopper.mod.Modifier
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: StringDictionary[js.UndefOr[StringDictionary[String]]] = js.native
    
    var forceUpdate: js.Function0[Unit] | Null = js.native
    
    var state: State | Null = js.native
    
    var styles: StringDictionary[CSSProperties] = js.native
    
    var update: js.Function0[js.Promise[typings.popperjsCore.anon.PartialState]] | Null = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(
      attributes: StringDictionary[js.UndefOr[StringDictionary[String]]],
      styles: StringDictionary[CSSProperties]
    ): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.UndefOr[StringDictionary[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForceUpdateNull: Self = StObject.set(x, "forceUpdate", null)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateNull: Self = StObject.set(x, "state", null)
      
      @scala.inline
      def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => js.Promise[typings.popperjsCore.anon.PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateNull: Self = StObject.set(x, "update", null)
    }
  }
  
  @js.native
  trait CreatePopper[Modifiers] extends StObject {
    
    var createPopper: js.UndefOr[FnCall] = js.native
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.native
  }
  object CreatePopper {
    
    @scala.inline
    def apply[Modifiers](): CreatePopper[Modifiers] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePopper[Modifiers]]
    }
    
    @scala.inline
    implicit class CreatePopperMutableBuilder[Self <: CreatePopper[_], Modifiers] (val x: Self with CreatePopper[Modifiers]) extends AnyVal {
      
      @scala.inline
      def setCreatePopper(value: FnCall): Self = StObject.set(x, "createPopper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatePopperUndefined: Self = StObject.set(x, "createPopper", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
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
  @js.native
  trait OmitPartialOptionsmodifie extends StObject {
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ typings.popperjsCore.anon.PartialState, Unit]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var strategy: js.UndefOr[PositioningStrategy] = js.native
  }
  object OmitPartialOptionsmodifie {
    
    @scala.inline
    def apply(): OmitPartialOptionsmodifie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitPartialOptionsmodifie]
    }
    
    @scala.inline
    implicit class OmitPartialOptionsmodifieMutableBuilder[Self <: OmitPartialOptionsmodifie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFirstUpdate(value: /* arg0 */ typings.popperjsCore.anon.PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@popperjs/core.@popperjs/core.State> */
  @js.native
  trait PartialState extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[StringDictionary[String | Boolean]]] = js.native
    
    var elements: js.UndefOr[Arrow] = js.native
    
    var modifiersData: js.UndefOr[Dictkey] = js.native
    
    var options: js.UndefOr[OptionsGeneric[_]] = js.native
    
    var orderedModifiers: js.UndefOr[js.Array[typings.popperjsCore.typesMod.Modifier[_, _]]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var rects: js.UndefOr[StateRects] = js.native
    
    var reset: js.UndefOr[Boolean] = js.native
    
    var scrollParents: js.UndefOr[Popper] = js.native
    
    var strategy: js.UndefOr[PositioningStrategy] = js.native
    
    var styles: js.UndefOr[StringDictionary[PartialCSSStyleDeclaratio]] = js.native
  }
  object PartialState {
    
    @scala.inline
    def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    @scala.inline
    implicit class PartialStateMutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersDataUndefined: Self = StObject.set(x, "modifiersData", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsGeneric[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOrderedModifiers(value: js.Array[typings.popperjsCore.typesMod.Modifier[_, _]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedModifiersUndefined: Self = StObject.set(x, "orderedModifiers", js.undefined)
      
      @scala.inline
      def setOrderedModifiersVarargs(value: (typings.popperjsCore.typesMod.Modifier[js.Any, js.Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
      
      @scala.inline
      def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollParentsUndefined: Self = StObject.set(x, "scrollParents", js.undefined)
      
      @scala.inline
      def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
