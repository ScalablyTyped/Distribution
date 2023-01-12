package typings.reactPopper

import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libTypesMod.PositioningStrategy
import typings.popperjsCore.libTypesMod.VirtualElement
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-popper", "Manager")
  @js.native
  open class Manager protected ()
    extends Component[ManagerProps, js.Object, Any] {
    def this(props: ManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ManagerProps, context: Any) = this()
  }
  
  @JSImport("react-popper", "Popper")
  @js.native
  open class Popper[Modifiers] protected ()
    extends Component[PopperProps[Modifiers], js.Object, Any] {
    def this(props: PopperProps[Modifiers]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopperProps[Modifiers], context: Any) = this()
  }
  
  @JSImport("react-popper", "Reference")
  @js.native
  open class Reference protected ()
    extends Component[ReferenceProps, js.Object, Any] {
    def this(props: ReferenceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReferenceProps, context: Any) = this()
  }
  
  inline def usePopper[Modifiers](): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")().asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: Null,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: Unit,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Null, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Null,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Unit,
    popperElement: Null,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Unit,
    popperElement: Unit,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Unit, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Unit,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: VirtualElement): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: Null,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: Unit,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: VirtualElement, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: VirtualElement,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Element): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: Null,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: Unit,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](referenceElement: Element, popperElement: HTMLElement): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  inline def usePopper[Modifiers](
    referenceElement: Element,
    popperElement: HTMLElement,
    options: OmitPartialOptionsmodifie & CreatePopper[Modifiers]
  ): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopper")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  trait ManagerProps extends StObject {
    
    var children: ReactNode
  }
  object ManagerProps {
    
    inline def apply(): ManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManagerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Name extends react-popper.react-popper.StrictModifierNames ? react-popper.react-popper.StrictModifier<Name> : std.Partial<@popperjs/core.@popperjs/core/lib/types.Modifier<Name, Options>>
    }}}
    */
  type Modifier[Name, Options /* <: js.Object */] = StrictModifier[Name]
  
  trait PopperArrowProps extends StObject {
    
    var ref: Ref[Any]
    
    var style: CSSProperties
  }
  object PopperArrowProps {
    
    inline def apply(style: CSSProperties): PopperArrowProps = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[PopperArrowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperArrowProps] (val x: Self) extends AnyVal {
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopperChildrenProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    def forceUpdate(): PartialState
    
    var hasPopperEscaped: js.UndefOr[Boolean] = js.undefined
    
    var isReferenceHidden: js.UndefOr[Boolean] = js.undefined
    
    var placement: Placement
    
    var ref: Ref[Any]
    
    var style: CSSProperties
    
    def update(): js.Promise[Null | PartialState]
  }
  object PopperChildrenProps {
    
    inline def apply(
      arrowProps: PopperArrowProps,
      forceUpdate: () => PartialState,
      placement: Placement,
      style: CSSProperties,
      update: () => js.Promise[Null | PartialState]
    ): PopperChildrenProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction0(forceUpdate), placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), ref = null)
      __obj.asInstanceOf[PopperChildrenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperChildrenProps] (val x: Self) extends AnyVal {
      
      inline def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(value: () => PartialState): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
      
      inline def setHasPopperEscaped(value: Boolean): Self = StObject.set(x, "hasPopperEscaped", value.asInstanceOf[js.Any])
      
      inline def setHasPopperEscapedUndefined: Self = StObject.set(x, "hasPopperEscaped", js.undefined)
      
      inline def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
      
      inline def setIsReferenceHiddenUndefined: Self = StObject.set(x, "isReferenceHidden", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => js.Promise[Null | PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait PopperProps[Modifiers] extends StObject {
    
    def children(props: PopperChildrenProps): ReactNode
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.undefined
    
    var onFirstUpdate: js.UndefOr[js.Function1[/* state */ PartialState, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var referenceElement: js.UndefOr[HTMLElement | VirtualElement] = js.undefined
    
    var strategy: js.UndefOr[PositioningStrategy] = js.undefined
  }
  object PopperProps {
    
    inline def apply[Modifiers](children: PopperChildrenProps => ReactNode): PopperProps[Modifiers] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PopperProps[Modifiers]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperProps[?], Modifiers] (val x: Self & PopperProps[Modifiers]) extends AnyVal {
      
      inline def setChildren(value: PopperChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setOnFirstUpdate(value: /* state */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
      
      inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setReferenceElement(value: HTMLElement | VirtualElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type RefHandler = js.Function1[/* ref */ HTMLElement | Null, Unit]
  
  trait ReferenceChildrenProps extends StObject {
    
    // React refs are supposed to be contravariant (allows a more general type to be passed rather than a more specific one)
    // However, Typescript currently can't infer that fact for refs
    // See https://github.com/microsoft/TypeScript/issues/30748 for more information
    var ref: Ref[Any]
  }
  object ReferenceChildrenProps {
    
    inline def apply(): ReferenceChildrenProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[ReferenceChildrenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceChildrenProps] (val x: Self) extends AnyVal {
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait ReferenceProps extends StObject {
    
    def children(props: ReferenceChildrenProps): ReactNode
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ReferenceProps {
    
    inline def apply(children: ReferenceChildrenProps => ReactNode): ReferenceProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReferenceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReferenceChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
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
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    U extends M ? U : never
    }}}
    */
  type UnionWhere[U, M] = U
}
