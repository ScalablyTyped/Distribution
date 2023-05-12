package typings.reactAriaFocus

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableDOMProps
import typings.reactTypesShared.srcDomMod.FocusableElement
import typings.reactTypesShared.srcEventsMod.FocusableProps
import typings.std.TreeWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-aria/focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FocusRing(props: FocusRingProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusRing")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def FocusScope(props: FocusScopeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusScope")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-aria/focus", "FocusableProvider")
  @js.native
  def FocusableProvider: ForwardRefExoticComponent[FocusableProviderProps & RefAttributes[FocusableElement]] = js.native
  inline def FocusableProvider_=(x: ForwardRefExoticComponent[FocusableProviderProps & RefAttributes[FocusableElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FocusableProvider")(x.asInstanceOf[js.Any])
  
  inline def createFocusManager(ref: RefObject[typings.std.Element]): FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusManager")(ref.asInstanceOf[js.Any]).asInstanceOf[FocusManager]
  inline def createFocusManager(ref: RefObject[typings.std.Element], defaultOptions: FocusManagerOptions): FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusManager")(ref.asInstanceOf[js.Any], defaultOptions.asInstanceOf[js.Any])).asInstanceOf[FocusManager]
  
  inline def focusSafely(element: FocusableElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusSafely")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFocusableTreeWalker(root: typings.std.Element): TreeWalker = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableTreeWalker")(root.asInstanceOf[js.Any]).asInstanceOf[TreeWalker]
  inline def getFocusableTreeWalker(root: typings.std.Element, opts: Unit, scope: js.Array[typings.std.Element]): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableTreeWalker")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  inline def getFocusableTreeWalker(root: typings.std.Element, opts: FocusManagerOptions): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableTreeWalker")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  inline def getFocusableTreeWalker(root: typings.std.Element, opts: FocusManagerOptions, scope: js.Array[typings.std.Element]): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableTreeWalker")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  
  inline def isElementInChildOfActiveScope(element: typings.std.Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementInChildOfActiveScope")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useFocusManager(): FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")().asInstanceOf[FocusManager]
  
  inline def useFocusRing(): FocusRingAria = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRing")().asInstanceOf[FocusRingAria]
  inline def useFocusRing(props: AriaFocusRingProps): FocusRingAria = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRing")(props.asInstanceOf[js.Any]).asInstanceOf[FocusRingAria]
  
  inline def useFocusable(props: FocusableOptions, domRef: RefObject[FocusableElement]): FocusableAria = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusable")(props.asInstanceOf[js.Any], domRef.asInstanceOf[js.Any])).asInstanceOf[FocusableAria]
  
  inline def useHasTabbableChild(ref: RefObject[typings.std.Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useHasTabbableChild")(ref.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useHasTabbableChild(ref: RefObject[typings.std.Element], options: AriaHasTabbableChildOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasTabbableChild")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AriaFocusRingProps extends StObject {
    
    /** Whether the element will be auto focused. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the element is a text input. */
    var isTextInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the focus ring when something
      * inside the container element has focus (true), or
      * only if the container itself has focus (false).
      * @default 'false'
      */
    var within: js.UndefOr[Boolean] = js.undefined
  }
  object AriaFocusRingProps {
    
    inline def apply(): AriaFocusRingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaFocusRingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaFocusRingProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setIsTextInput(value: Boolean): Self = StObject.set(x, "isTextInput", value.asInstanceOf[js.Any])
      
      inline def setIsTextInputUndefined: Self = StObject.set(x, "isTextInput", js.undefined)
      
      inline def setWithin(value: Boolean): Self = StObject.set(x, "within", value.asInstanceOf[js.Any])
      
      inline def setWithinUndefined: Self = StObject.set(x, "within", js.undefined)
    }
  }
  
  trait AriaHasTabbableChildOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object AriaHasTabbableChildOptions {
    
    inline def apply(): AriaHasTabbableChildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaHasTabbableChildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaHasTabbableChildOptions] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
  
  @js.native
  trait FocusManager extends StObject {
    
    /** Moves focus to the first focusable or tabbable element in the focus scope. */
    def focusFirst(): FocusableElement = js.native
    def focusFirst(opts: FocusManagerOptions): FocusableElement = js.native
    
    /** Moves focus to the last focusable or tabbable element in the focus scope. */
    def focusLast(): FocusableElement = js.native
    def focusLast(opts: FocusManagerOptions): FocusableElement = js.native
    
    /** Moves focus to the next focusable or tabbable element in the focus scope. */
    def focusNext(): FocusableElement = js.native
    def focusNext(opts: FocusManagerOptions): FocusableElement = js.native
    
    /** Moves focus to the previous focusable or tabbable element in the focus scope. */
    def focusPrevious(): FocusableElement = js.native
    def focusPrevious(opts: FocusManagerOptions): FocusableElement = js.native
  }
  
  trait FocusManagerOptions extends StObject {
    
    /** A callback that determines whether the given element is focused. */
    var accept: js.UndefOr[js.Function1[/* node */ typings.std.Element, Boolean]] = js.undefined
    
    /** The element to start searching from. The currently focused element by default. */
    var from: js.UndefOr[typings.std.Element] = js.undefined
    
    /** Whether to only include tabbable elements, or all focusable elements. */
    var tabbable: js.UndefOr[Boolean] = js.undefined
    
    /** Whether focus should wrap around when it reaches the end of the scope. */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object FocusManagerOptions {
    
    inline def apply(): FocusManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: /* node */ typings.std.Element => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setFrom(value: typings.std.Element): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTabbable(value: Boolean): Self = StObject.set(x, "tabbable", value.asInstanceOf[js.Any])
      
      inline def setTabbableUndefined: Self = StObject.set(x, "tabbable", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait FocusRingAria extends StObject {
    
    /** Props to apply to the container element with the focus ring. */
    var focusProps: DOMAttributes[FocusableElement]
    
    /** Whether keyboard focus should be visible. */
    var isFocusVisible: Boolean
    
    /** Whether the element is currently focused. */
    var isFocused: Boolean
  }
  object FocusRingAria {
    
    inline def apply(focusProps: DOMAttributes[FocusableElement], isFocusVisible: Boolean, isFocused: Boolean): FocusRingAria = {
      val __obj = js.Dynamic.literal(focusProps = focusProps.asInstanceOf[js.Any], isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusRingAria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusRingAria] (val x: Self) extends AnyVal {
      
      inline def setFocusProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "focusProps", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusRingProps extends StObject {
    
    /** Whether the element will be auto focused. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Child element to apply CSS classes to. */
    var children: ReactElement
    
    /** CSS class to apply when the element is focused. */
    var focusClass: js.UndefOr[String] = js.undefined
    
    /** CSS class to apply when the element has keyboard focus. */
    var focusRingClass: js.UndefOr[String] = js.undefined
    
    /** Whether the element is a text input. */
    var isTextInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the focus ring when something
      * inside the container element has focus (true), or
      * only if the container itself has focus (false).
      * @default false
      */
    var within: js.UndefOr[Boolean] = js.undefined
  }
  object FocusRingProps {
    
    inline def apply(children: ReactElement): FocusRingProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusRingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusRingProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setFocusClass(value: String): Self = StObject.set(x, "focusClass", value.asInstanceOf[js.Any])
      
      inline def setFocusClassUndefined: Self = StObject.set(x, "focusClass", js.undefined)
      
      inline def setFocusRingClass(value: String): Self = StObject.set(x, "focusRingClass", value.asInstanceOf[js.Any])
      
      inline def setFocusRingClassUndefined: Self = StObject.set(x, "focusRingClass", js.undefined)
      
      inline def setIsTextInput(value: Boolean): Self = StObject.set(x, "isTextInput", value.asInstanceOf[js.Any])
      
      inline def setIsTextInputUndefined: Self = StObject.set(x, "isTextInput", js.undefined)
      
      inline def setWithin(value: Boolean): Self = StObject.set(x, "within", value.asInstanceOf[js.Any])
      
      inline def setWithinUndefined: Self = StObject.set(x, "within", js.undefined)
    }
  }
  
  trait FocusScopeProps extends StObject {
    
    /** Whether to auto focus the first focusable element in the focus scope on mount. */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** The contents of the focus scope. */
    var children: ReactNode
    
    /**
      * Whether to contain focus inside the scope, so users cannot
      * move focus outside, for example in a modal dialog.
      */
    var contain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to restore focus back to the element that was focused
      * when the focus scope mounted, after the focus scope unmounts.
      */
    var restoreFocus: js.UndefOr[Boolean] = js.undefined
  }
  object FocusScopeProps {
    
    inline def apply(): FocusScopeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusScopeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusScopeProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setRestoreFocus(value: Boolean): Self = StObject.set(x, "restoreFocus", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
    }
  }
  
  trait FocusableAria extends StObject {
    
    /** Props for the focusable element. */
    var focusableProps: DOMAttributes[FocusableElement]
  }
  object FocusableAria {
    
    inline def apply(focusableProps: DOMAttributes[FocusableElement]): FocusableAria = {
      val __obj = js.Dynamic.literal(focusableProps = focusableProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableAria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusableAria] (val x: Self) extends AnyVal {
      
      inline def setFocusableProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "focusableProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusableOptions
    extends StObject
       with FocusableProps[typings.std.Element]
       with FocusableDOMProps {
    
    /** Whether focus should be disabled. */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object FocusableOptions {
    
    inline def apply(): FocusableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusableOptions] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
  
  trait FocusableProviderProps
    extends StObject
       with DOMAttributes[FocusableElement]
  object FocusableProviderProps {
    
    inline def apply(): FocusableProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableProviderProps]
    }
  }
}
