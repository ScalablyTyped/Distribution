package typings.reactPopper

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.VirtualElement
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactPopper.anon.Attributes
import typings.reactPopper.anon.CreatePopper
import typings.reactPopper.anon.OmitPartialOptionsmodifie
import typings.reactPopper.anon.PartialState
import typings.reactPopper.reactPopperStrings.applyStyles
import typings.reactPopper.reactPopperStrings.arrow
import typings.reactPopper.reactPopperStrings.computeStyles
import typings.reactPopper.reactPopperStrings.eventListeners
import typings.reactPopper.reactPopperStrings.flip
import typings.reactPopper.reactPopperStrings.hide
import typings.reactPopper.reactPopperStrings.name
import typings.reactPopper.reactPopperStrings.offset
import typings.reactPopper.reactPopperStrings.popperOffsets
import typings.reactPopper.reactPopperStrings.preventOverflow
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popper", "Manager")
  @js.native
  class Manager protected ()
    extends Component[ManagerProps, js.Object, js.Any] {
    def this(props: ManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ManagerProps, context: js.Any) = this()
  }
  
  @JSImport("react-popper", "Popper")
  @js.native
  class Popper[Modifiers] protected ()
    extends Component[PopperProps[Modifiers], js.Object, js.Any] {
    def this(props: PopperProps[Modifiers]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopperProps[Modifiers], context: js.Any) = this()
  }
  
  @JSImport("react-popper", "Reference")
  @js.native
  class Reference protected ()
    extends Component[ReferenceProps, js.Object, js.Any] {
    def this(props: ReferenceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReferenceProps, context: js.Any) = this()
  }
  
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: js.UndefOr[scala.Nothing],
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: Null,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: js.UndefOr[scala.Nothing], popperElement: HTMLElement): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: js.UndefOr[scala.Nothing],
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: js.UndefOr[scala.Nothing],
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: Null,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: Null, popperElement: HTMLElement): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: VirtualElement): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: js.UndefOr[scala.Nothing],
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: Null,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: VirtualElement, popperElement: HTMLElement): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: Element): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: js.UndefOr[scala.Nothing],
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: Null,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](referenceElement: Element, popperElement: HTMLElement): Attributes = js.native
  @JSImport("react-popper", "usePopper")
  @js.native
  def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie with CreatePopper[Modifiers]
  ): Attributes = js.native
  
  @js.native
  trait ManagerProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object ManagerProps {
    
    @scala.inline
    def apply(): ManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagerProps]
    }
    
    @scala.inline
    implicit class ManagerPropsMutableBuilder[Self <: ManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type Modifier[Name, Options /* <: js.Object */] = (Partial[typings.popperjsCore.typesMod.Modifier[Name, Options]]) | StrictModifier[Name]
  
  @js.native
  trait PopperArrowProps extends StObject {
    
    var ref: Ref[_] = js.native
    
    var style: CSSProperties = js.native
  }
  object PopperArrowProps {
    
    @scala.inline
    def apply(style: CSSProperties): PopperArrowProps = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperArrowProps]
    }
    
    @scala.inline
    implicit class PopperArrowPropsMutableBuilder[Self <: PopperArrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopperChildrenProps extends StObject {
    
    var arrowProps: PopperArrowProps = js.native
    
    def forceUpdate(): PartialState = js.native
    
    var hasPopperEscaped: js.UndefOr[Boolean] = js.native
    
    var isReferenceHidden: js.UndefOr[Boolean] = js.native
    
    var placement: Placement = js.native
    
    var ref: Ref[_] = js.native
    
    var style: CSSProperties = js.native
    
    def update(): js.Promise[Null | PartialState] = js.native
  }
  object PopperChildrenProps {
    
    @scala.inline
    def apply(
      arrowProps: PopperArrowProps,
      forceUpdate: () => PartialState,
      placement: Placement,
      style: CSSProperties,
      update: () => js.Promise[Null | PartialState]
    ): PopperChildrenProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PopperChildrenProps]
    }
    
    @scala.inline
    implicit class PopperChildrenPropsMutableBuilder[Self <: PopperChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdate(value: () => PartialState): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasPopperEscaped(value: Boolean): Self = StObject.set(x, "hasPopperEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPopperEscapedUndefined: Self = StObject.set(x, "hasPopperEscaped", js.undefined)
      
      @scala.inline
      def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReferenceHiddenUndefined: Self = StObject.set(x, "isReferenceHidden", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Null | PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PopperProps[Modifiers] extends StObject {
    
    def children(props: PopperChildrenProps): ReactNode = js.native
    
    var innerRef: js.UndefOr[Ref[_]] = js.native
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.native
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* state */ PartialState, Unit]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var referenceElement: js.UndefOr[HTMLElement | VirtualElement] = js.native
    
    var strategy: js.UndefOr[PositioningStrategy] = js.native
  }
  object PopperProps {
    
    @scala.inline
    def apply[Modifiers](children: PopperChildrenProps => ReactNode): PopperProps[Modifiers] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PopperProps[Modifiers]]
    }
    
    @scala.inline
    implicit class PopperPropsMutableBuilder[Self <: PopperProps[_], Modifiers] (val x: Self with PopperProps[Modifiers]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: PopperChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setOnFirstUpdate(value: /* state */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setReferenceElement(value: HTMLElement | VirtualElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      @scala.inline
      def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type RefHandler = js.Function1[/* ref */ HTMLElement | Null, Unit]
  
  @js.native
  trait ReferenceChildrenProps extends StObject {
    
    // React refs are supposed to be contravariant (allows a more general type to be passed rather than a more specific one)
    // However, Typescript currently can't infer that fact for refs
    // See https://github.com/microsoft/TypeScript/issues/30748 for more information
    var ref: Ref[_] = js.native
  }
  object ReferenceChildrenProps {
    
    @scala.inline
    def apply(): ReferenceChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceChildrenProps]
    }
    
    @scala.inline
    implicit class ReferenceChildrenPropsMutableBuilder[Self <: ReferenceChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  @js.native
  trait ReferenceProps extends StObject {
    
    def children(props: ReferenceChildrenProps): ReactNode = js.native
    
    var innerRef: js.UndefOr[Ref[_]] = js.native
  }
  object ReferenceProps {
    
    @scala.inline
    def apply(children: ReferenceChildrenProps => ReactNode): ReferenceProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReferenceProps]
    }
    
    @scala.inline
    implicit class ReferencePropsMutableBuilder[Self <: ReferenceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReferenceChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRef(value: Ref[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  /* Inlined react-popper.react-popper.UnionWhere<@popperjs/core.@popperjs/core.StrictModifiers, {  name :Name | undefined}> */
  type StrictModifier[Name /* <: StrictModifierNames */] = name
  
  type StrictModifierNames = NonNullable[
    js.UndefOr[
      offset | applyStyles | arrow | hide | computeStyles | eventListeners | flip | preventOverflow | popperOffsets
    ]
  ]
  
  // Utility type
  type UnionWhere[U, M] = U
}
