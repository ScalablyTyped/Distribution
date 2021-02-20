package typings.rax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.AnimationEvent[T]]
  
  type AppearEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.AppearEvent[T]]
  
  type AudioHTMLAttributes[T] = typings.rax.mod.MediaHTMLAttributes[T]
  
  type CElement[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */] = typings.rax.mod.ComponentElement[P, T]
  
  type CFactory[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */] = typings.rax.mod.ComponentFactory[P, T]
  
  type ChangeEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.ChangeEvent[T]]
  
  @scala.inline
  def Children: typings.rax.mod.RaxChildren = typings.rax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[typings.rax.mod.RaxChildren]
  
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */, C /* <: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[js.Any], T])
  
  type ClassicElement[P] = typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]
  
  type ClassicFactory[P] = typings.rax.mod.CFactory[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]
  
  type ClipboardEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.ClipboardEvent[T]]
  
  type ComponentFactory[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[typings.rax.mod.ClassAttributes[T] with P], 
    /* repeated */ typings.rax.mod.RaxNode, 
    typings.rax.mod.CElement[P, T]
  ]
  
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 209 */ js.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: rax.rax.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  type ComponentPropsWithRef[T /* <: typings.rax.mod.ElementType[_] */] = typings.rax.mod.PropsWithRef[typings.rax.mod.ComponentProps[T]] | (typings.rax.mod.PropsWithoutRef[_] with typings.rax.mod.RefAttributes[typings.std.InstanceType[T]])
  
  type ComponentPropsWithoutRef[T /* <: typings.rax.mod.ElementType[_] */] = typings.rax.mod.PropsWithoutRef[typings.rax.mod.ComponentProps[T]]
  
  type ComponentState = js.Any
  
  type ComponentType[P] = (typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState]) | typings.rax.mod.FunctionComponent[P]
  
  type CompositionEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.CompositionEvent[T]]
  
  type Consumer[T] = typings.rax.mod.ExoticComponent[typings.rax.mod.ConsumerProps[T]]
  
  type ContextType[C /* <: typings.rax.mod.Context[_] */] = js.Any
  
  type DOMFactory[P /* <: typings.rax.mod.DOMAttributes[T] */, T /* <: typings.rax.mod.Element */] = js.Function2[
    /* props */ js.UndefOr[(typings.rax.mod.ClassAttributes[T] with P) | scala.Null], 
    /* repeated */ typings.rax.mod.RaxNode, 
    typings.rax.mod.DOMElement[P, T]
  ]
  
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      P, 
      typings.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      D, 
      typings.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  
  type DetailedHTMLProps[E /* <: typings.rax.mod.HTMLAttributes[T] */, T] = typings.rax.mod.ClassAttributes[T] with E
  
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  
  type DragEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.DragEvent[T]]
  
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  // The destructor is itself only allowed to return void.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]
  
  /**
    * ======================================================================
    * Rax Elements
    * ======================================================================
    */
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'list' | 'cell' | 'loading' | 'refresh' | 'recycle-list' | 'scroller' | 'slider' | 'indicator' | 'waterfall' | 'web' | 'richtext' | 'slot' | 'swiper' | 'swiper-item' | 'scroll-view' | 'cover-view' | 'cover-image' | 'movable-view' | 'movable-area' | 'icon' | 'rich-text' | 'picker-view' | 'picker' | 'navigator' | 'web-view' | 'lifestyle' | 'contact-button' | 'aria-component' | 'functional-page-navigator' | 'live-player' | 'ive-pusher' | 'ad' | 'open-data' | 'page-meta' | 'navigation-bar' ]: P extends rax.rax.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'list' | 'cell' | 'loading' | 'refresh' | 'recycle-list' | 'scroller' | 'slider' | 'indicator' | 'waterfall' | 'web' | 'richtext' | 'slot' | 'swiper' | 'swiper-item' | 'scroll-view' | 'cover-view' | 'cover-image' | 'movable-view' | 'movable-area' | 'icon' | 'rich-text' | 'picker-view' | 'picker' | 'navigator' | 'web-view' | 'lifestyle' | 'contact-button' | 'aria-component' | 'functional-page-navigator' | 'live-player' | 'ive-pusher' | 'ad' | 'open-data' | 'page-meta' | 'navigation-bar'] */ js.Any) | typings.rax.mod.ComponentType[P]
  
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: typings.rax.mod.SyntheticEvent[_, typings.std.Event] */] = js.Function1[/* event */ E, scala.Unit]
  
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rax.rax.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  
  type FC[P] = typings.rax.mod.FunctionComponent[P]
  
  /**
    * ======================================================================
    * Rax Factories
    * ======================================================================
    */
  type Factory[P] = js.Function2[
    /* props */ js.UndefOr[typings.rax.mod.Attributes with P], 
    /* repeated */ typings.rax.mod.RaxNode, 
    typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[js.Any]]
  ]
  
  type FocusEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.FocusEvent[T]]
  
  type FormEvent[T] = typings.rax.mod.SyntheticEvent[T, typings.std.Event]
  
  type FormEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.FormEvent[T]]
  
  @scala.inline
  def Fragment: typings.rax.mod.ExoticComponent[typings.rax.anon.Children] = typings.rax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typings.rax.mod.ExoticComponent[typings.rax.anon.Children]]
  
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[typings.rax.mod.Attributes with P], 
    /* repeated */ typings.rax.mod.RaxNode, 
    typings.rax.mod.FunctionComponentElement[P]
  ]
  
  type GetDerivedStateFromError[P, S] = /**
    * This lifecycle is invoked after an error has been thrown by a descendant component.
    * It receives the error that was thrown as a parameter and should return a value to update state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function1[/* error */ js.Any, typings.std.Partial[S] | scala.Null]
  
  type GetDerivedStateFromProps[P, S] = /**
    * Returns an update to a component's state based on its new props and old state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function2[/* nextProps */ P, /* prevState */ S, typings.std.Partial[S] | scala.Null]
  
  type HTMLAnchorElement = typings.std.HTMLElement
  
  type HTMLAreaElement = typings.std.HTMLElement
  
  type HTMLAudioElement = typings.std.HTMLElement
  
  type HTMLBRElement = typings.std.HTMLElement
  
  type HTMLBaseElement = typings.std.HTMLElement
  
  type HTMLBodyElement = typings.std.HTMLElement
  
  type HTMLButtonElement = typings.std.HTMLElement
  
  type HTMLCanvasElement = typings.std.HTMLElement
  
  type HTMLDListElement = typings.std.HTMLElement
  
  type HTMLDataListElement = typings.std.HTMLElement
  
  type HTMLDialogElement = typings.std.HTMLElement
  
  type HTMLDivElement = typings.std.HTMLElement
  
  type HTMLElement = typings.std.Element
  
  type HTMLEmbedElement = typings.std.HTMLElement
  
  type HTMLFactory[T /* <: typings.rax.mod.HTMLElement */] = typings.rax.mod.DetailedHTMLFactory[typings.rax.mod.AllHTMLAttributes[T], T]
  
  type HTMLFieldSetElement = typings.std.HTMLElement
  
  type HTMLFormElement = typings.std.HTMLElement
  
  type HTMLHRElement = typings.std.HTMLElement
  
  type HTMLHeadElement = typings.std.HTMLElement
  
  type HTMLHeadingElement = typings.std.HTMLElement
  
  type HTMLHtmlElement = typings.std.HTMLElement
  
  type HTMLIFrameElement = typings.std.HTMLElement
  
  type HTMLImageElement = typings.std.HTMLElement
  
  type HTMLInputElement = typings.std.HTMLElement
  
  type HTMLLIElement = typings.std.HTMLElement
  
  type HTMLLabelElement = typings.std.HTMLElement
  
  type HTMLLegendElement = typings.std.HTMLElement
  
  type HTMLLinkElement = typings.std.HTMLElement
  
  type HTMLMapElement = typings.std.HTMLElement
  
  type HTMLMetaElement = typings.std.HTMLElement
  
  type HTMLModElement = typings.std.HTMLElement
  
  type HTMLOListElement = typings.std.HTMLElement
  
  type HTMLObjectElement = typings.std.HTMLElement
  
  type HTMLOptGroupElement = typings.std.HTMLElement
  
  type HTMLOptionElement = typings.std.HTMLElement
  
  type HTMLParagraphElement = typings.std.HTMLElement
  
  type HTMLParamElement = typings.std.HTMLElement
  
  type HTMLPreElement = typings.std.HTMLElement
  
  type HTMLProgressElement = typings.std.HTMLElement
  
  type HTMLQuoteElement = typings.std.HTMLElement
  
  type HTMLScriptElement = typings.std.HTMLElement
  
  type HTMLSelectElement = typings.std.HTMLElement
  
  type HTMLSourceElement = typings.std.HTMLElement
  
  type HTMLSpanElement = typings.std.HTMLElement
  
  type HTMLStyleElement = typings.std.HTMLElement
  
  type HTMLTableColElement = typings.std.HTMLElement
  
  type HTMLTableDataCellElement = typings.std.HTMLElement
  
  type HTMLTableElement = typings.std.HTMLElement
  
  type HTMLTableHeaderCellElement = typings.std.HTMLElement
  
  type HTMLTableRowElement = typings.std.HTMLElement
  
  type HTMLTableSectionElement = typings.std.HTMLElement
  
  type HTMLTextAreaElement = typings.std.HTMLElement
  
  type HTMLTitleElement = typings.std.HTMLElement
  
  type HTMLTrackElement = typings.std.HTMLElement
  
  type HTMLUListElement = typings.std.HTMLElement
  
  type HTMLVideoElement = typings.std.HTMLElement
  
  type HTMLWebViewElement = typings.std.HTMLElement
  
  type JSXElementConstructor[P] = (js.Function1[
    /* props */ P, 
    (typings.rax.mod.RaxElement[
      js.Any, 
      java.lang.String | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias rax.rax.JSXElementConstructor<any> */ js.Object)
    ]) | scala.Null
  ]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, typings.rax.mod.Component[P, js.Any, js.Any]])
  
  type Key = java.lang.String | scala.Double
  
  type KeyboardEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.KeyboardEvent[T]]
  
  type LegacyRef[T] = java.lang.String | typings.rax.mod.Ref[T]
  
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  type MergePropTypes[P, T] = ((typings.std.Pick[P, typings.rax.mod.NotExactlyAnyPropertyKeys[P]]) with (// For props which are exactly any, use the type inferred from propTypes if present
  typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, typings.rax.mod.NotExactlyAnyPropertyKeys[P]]
  ]) with (// Keep leftover props not specified in propTypes
  typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]
  ])) | P | T
  
  type MouseEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.MouseEvent[T, typings.rax.mod.NativeMouseEvent]]
  
  type NativeAnimationEvent = typings.std.AnimationEvent
  
  type NativeClipboardEvent = typings.std.ClipboardEvent
  
  type NativeCompositionEvent = typings.std.CompositionEvent
  
  type NativeDragEvent = typings.std.DragEvent
  
  type NativeFocusEvent = typings.std.FocusEvent
  
  type NativeKeyboardEvent = typings.std.KeyboardEvent
  
  type NativeMouseEvent = typings.std.MouseEvent
  
  type NativePointerEvent = typings.std.PointerEvent
  
  type NativeTouchEvent = typings.std.TouchEvent
  
  type NativeTransitionEvent = typings.std.TransitionEvent
  
  type NativeUIEvent = typings.std.UIEvent
  
  type NativeWheelEvent = typings.std.WheelEvent
  
  type NotExactlyAnyPropertyKeys[T] = typings.std.Exclude[/* keyof T */ java.lang.String, typings.rax.mod.ExactlyAnyPropertyKeys[T]]
  
  type PointerEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.PointerEvent[T]]
  
  type PropsWithChildren[P] = P with typings.rax.anon.Children
  
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (typings.rax.mod.PropsWithoutRef[P] with typings.rax.anon.`1`)
  
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (typings.std.Pick[P, typings.std.Exclude[/* keyof P */ java.lang.String, typings.rax.raxStrings.ref]])
  
  type Provider[T] = typings.rax.mod.ProviderExoticComponent[typings.rax.mod.ProviderProps[T]]
  
  type RaxChild = (typings.rax.mod.RaxElement[js.Any, java.lang.String | typings.rax.mod.JSXElementConstructor[js.Any]]) | typings.rax.mod.RaxText
  
  type RaxComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 209 */ js.Any */, P] = typings.rax.mod.RaxElement[P, T]
  
  type RaxEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.SyntheticEvent[T, typings.std.Event]]
  
  type RaxFragment = js.Object | typings.rax.mod.RaxNodeArray
  
  // RaxHTML for RaxHTMLElement
  type RaxHTMLElement[T /* <: typings.rax.mod.HTMLElement */] = typings.rax.mod.DetailedRaxHTMLElement[typings.rax.mod.AllHTMLAttributes[T], T]
  
  /**
    * ======================================================================
    * Rax Component API
    * ======================================================================
    */
  type RaxInstance = (typings.rax.mod.Component[js.Any, js.Object, js.Any]) | typings.rax.mod.Element
  
  type RaxManagedAttributes[C, P] = P | (typings.rax.mod.Defaultize[
    (typings.rax.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]]) | P, 
    js.Any
  ]) | (typings.rax.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]])
  
  type RaxNode = js.UndefOr[
    typings.rax.mod.RaxChild | typings.rax.mod.RaxFragment | typings.rax.mod.RaxPortal | scala.Boolean | scala.Null
  ]
  
  /**
    * ======================================================================
    * Rax Nodes
    * ======================================================================
    */
  type RaxText = java.lang.String | scala.Double
  
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  
  type ReducerAction[R /* <: typings.rax.mod.Reducer[_, _] */] = js.Any
  
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: typings.rax.mod.Reducer[_, _] */] = js.Any
  
  type Ref[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | typings.rax.mod.RefObject[T] | scala.Null
  
  type Requireable[T] = typings.propTypes.mod.Requireable[T]
  
  type SVGCircleElement = typings.std.SVGElement
  
  type SVGClipPathElement = typings.std.SVGElement
  
  type SVGDefsElement = typings.std.SVGElement
  
  type SVGDescElement = typings.std.SVGElement
  
  type SVGElement = typings.std.Element
  
  type SVGEllipseElement = typings.std.SVGElement
  
  type SVGFEBlendElement = typings.std.SVGElement
  
  type SVGFEColorMatrixElement = typings.std.SVGElement
  
  type SVGFEComponentTransferElement = typings.std.SVGElement
  
  type SVGFECompositeElement = typings.std.SVGElement
  
  type SVGFEConvolveMatrixElement = typings.std.SVGElement
  
  type SVGFEDiffuseLightingElement = typings.std.SVGElement
  
  type SVGFEDisplacementMapElement = typings.std.SVGElement
  
  type SVGFEDistantLightElement = typings.std.SVGElement
  
  type SVGFEDropShadowElement = typings.std.SVGElement
  
  type SVGFEFloodElement = typings.std.SVGElement
  
  type SVGFEFuncAElement = typings.std.SVGElement
  
  type SVGFEFuncBElement = typings.std.SVGElement
  
  type SVGFEFuncGElement = typings.std.SVGElement
  
  type SVGFEFuncRElement = typings.std.SVGElement
  
  type SVGFEGaussianBlurElement = typings.std.SVGElement
  
  type SVGFEImageElement = typings.std.SVGElement
  
  type SVGFEMergeElement = typings.std.SVGElement
  
  type SVGFEMergeNodeElement = typings.std.SVGElement
  
  type SVGFEMorphologyElement = typings.std.SVGElement
  
  type SVGFEOffsetElement = typings.std.SVGElement
  
  type SVGFEPointLightElement = typings.std.SVGElement
  
  type SVGFESpecularLightingElement = typings.std.SVGElement
  
  type SVGFESpotLightElement = typings.std.SVGElement
  
  type SVGFETileElement = typings.std.SVGElement
  
  type SVGFETurbulenceElement = typings.std.SVGElement
  
  type SVGFilterElement = typings.std.SVGElement
  
  type SVGForeignObjectElement = typings.std.SVGElement
  
  type SVGGElement = typings.std.SVGElement
  
  type SVGImageElement = typings.std.SVGElement
  
  type SVGLineElement = typings.std.SVGElement
  
  type SVGLinearGradientElement = typings.std.SVGElement
  
  type SVGMarkerElement = typings.std.SVGElement
  
  type SVGMaskElement = typings.std.SVGElement
  
  type SVGMetadataElement = typings.std.SVGElement
  
  type SVGPathElement = typings.std.SVGElement
  
  type SVGPatternElement = typings.std.SVGElement
  
  type SVGPolygonElement = typings.std.SVGElement
  
  type SVGPolylineElement = typings.std.SVGElement
  
  type SVGRadialGradientElement = typings.std.SVGElement
  
  type SVGRectElement = typings.std.SVGElement
  
  type SVGSVGElement = typings.std.SVGElement
  
  type SVGStopElement = typings.std.SVGElement
  
  type SVGSwitchElement = typings.std.SVGElement
  
  type SVGSymbolElement = typings.std.SVGElement
  
  type SVGTSpanElement = typings.std.SVGElement
  
  type SVGTextElement = typings.std.SVGElement
  
  type SVGTextPathElement = typings.std.SVGElement
  
  type SVGUseElement = typings.std.SVGElement
  
  type SVGViewElement = typings.std.SVGElement
  
  /**
    * ======================================================================
    * Rax Hooks
    * ======================================================================
    */
  // Unlike the class component setState, the updates are not allowed to be partial
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
  
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = typings.rax.mod.BaseSyntheticEvent[E, typings.rax.mod.EventTarget with T, typings.rax.mod.EventTarget]
  
  type TouchEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.TouchEvent[T]]
  
  type TransitionEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.TransitionEvent[T]]
  
  type UIEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.UIEvent[T]]
  
  type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]
  
  //
  // Rax.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = typings.propTypes.mod.Validator[T]
  
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? rax.rax.Validator<T[K] | null | undefined> : undefined extends T[K]? rax.rax.Validator<T[K] | null | undefined> : rax.rax.Validator<T[K]>}
    */ typings.rax.raxStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type WheelEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.WheelEvent[T]]
  
  @scala.inline
  def createContext[T](defaultValue: T): typings.rax.mod.Context[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.Context[T]]
  @scala.inline
  def createContext[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, scala.Double]): typings.rax.mod.Context[T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.Context[T]]
  
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: typings.rax.mod.Attributes with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: java.lang.String, props: js.UndefOr[scala.Nothing], children: typings.rax.mod.RaxNode*): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: java.lang.String, props: scala.Null, children: typings.rax.mod.RaxNode*): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ClassType[
      P, 
      typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState], 
      typings.rax.mod.ClassicComponentClass[P]
    ],
    props: (typings.rax.mod.ClassAttributes[typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]) with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ClassType[
      P, 
      typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState], 
      typings.rax.mod.ClassicComponentClass[P]
    ],
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ClassType[
      P, 
      typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState], 
      typings.rax.mod.ClassicComponentClass[P]
    ],
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, typings.rax.mod.ClassicComponent[P, typings.rax.mod.ComponentState]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState],
    props: typings.rax.mod.Attributes with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState],
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState],
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: typings.rax.mod.Attributes with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxElement[P, java.lang.String | typings.rax.mod.JSXElementConstructor[_]]]
  @scala.inline
  def createElement[P /* <: typings.rax.mod.DOMAttributes[T] */, T /* <: typings.rax.mod.Element */](
    `type`: java.lang.String,
    props: typings.rax.mod.ClassAttributes[T] with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DOMElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DOMElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.rax.mod.HTMLAttributes[T] */, T /* <: typings.rax.mod.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ js.Any,
    props: typings.rax.mod.ClassAttributes[T] with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DetailedRaxHTMLElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.rax.mod.HTMLAttributes[T] */, T /* <: typings.rax.mod.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DetailedRaxHTMLElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.rax.mod.HTMLAttributes[T] */, T /* <: typings.rax.mod.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114 */ js.Any,
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DetailedRaxHTMLElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */, C /* <: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState] */](
    `type`: typings.rax.mod.ClassType[P, T, C],
    props: typings.rax.mod.ClassAttributes[T] with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.CElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */, C /* <: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState] */](
    `type`: typings.rax.mod.ClassType[P, T, C],
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.CElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */, C /* <: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState] */](`type`: typings.rax.mod.ClassType[P, T, C], props: scala.Null, children: typings.rax.mod.RaxNode*): typings.rax.mod.CElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.CElement[P, T]]
  
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.rax.mod.DOMAttributes[T] */, T /* <: typings.rax.mod.Element */](`type`: java.lang.String, props: js.UndefOr[scala.Nothing], children: typings.rax.mod.RaxNode*): typings.rax.mod.DOMElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DOMElement[P, T]]
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.rax.mod.DOMAttributes[T] */, T /* <: typings.rax.mod.Element */](`type`: java.lang.String, props: scala.Null, children: typings.rax.mod.RaxNode*): typings.rax.mod.DOMElement[P, T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DOMElement[P, T]]
  
  // Custom components
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: typings.rax.mod.Attributes with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.FunctionComponentElement[P] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.FunctionComponentElement[P] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typings.rax.mod.FunctionComponent[P],
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.FunctionComponentElement[P] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.FunctionComponentElement[P]]
  
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: typings.rax.mod.SVGAttributes[T] */, T /* <: typings.rax.mod.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: typings.rax.mod.ClassAttributes[T] with P,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxSVGElement = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: typings.rax.mod.SVGAttributes[T] */, T /* <: typings.rax.mod.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxSVGElement = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_RaxSVGElement[P /* <: typings.rax.mod.SVGAttributes[T] */, T /* <: typings.rax.mod.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: scala.Null,
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.RaxSVGElement = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.RaxSVGElement]
  
  /**
    * ======================================================================
    * Rax Top Level API
    * ======================================================================
    */
  // DOM Elements
  // TODO: generalize this to everything in `keyof RaxHTML`, not just "input"
  @scala.inline
  def createElement_input(
    `type`: typings.rax.raxStrings.input,
    props: typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement] with typings.rax.mod.ClassAttributes[typings.rax.mod.HTMLInputElement],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: typings.rax.raxStrings.input,
    props: js.UndefOr[scala.Nothing],
    children: typings.rax.mod.RaxNode*
  ): typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(`type`: typings.rax.raxStrings.input, props: scala.Null, children: typings.rax.mod.RaxNode*): typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.DetailedRaxHTMLElement[
    typings.rax.mod.InputHTMLAttributes[typings.rax.mod.HTMLInputElement], 
    typings.rax.mod.HTMLInputElement
  ]]
  
  @scala.inline
  def createRef[T](): typings.rax.mod.RefObject[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.rax.mod.RefObject[T]]
  
  @scala.inline
  def forwardRef[T, P](Component: typings.rax.mod.RefForwardingComponent[T, P]): typings.rax.mod.ForwardRefExoticComponent[typings.rax.mod.PropsWithoutRef[P] with typings.rax.mod.RefAttributes[T]] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.ForwardRefExoticComponent[typings.rax.mod.PropsWithoutRef[P] with typings.rax.mod.RefAttributes[T]]]
  
  @scala.inline
  def memo[T /* <: typings.rax.mod.ComponentType[_] */](Component: T): typings.rax.mod.MemoExoticComponent[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[T /* <: typings.rax.mod.ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[
      /* prevProps */ typings.rax.mod.ComponentProps[T], 
      /* nextProps */ typings.rax.mod.ComponentProps[T], 
      scala.Boolean
    ]
  ): typings.rax.mod.MemoExoticComponent[T] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[P /* <: js.Object */](Component: typings.rax.mod.FC[P]): typings.rax.mod.NamedExoticComponent[P] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.NamedExoticComponent[P]]
  @scala.inline
  def memo[P /* <: js.Object */](
    Component: typings.rax.mod.FC[P],
    propsAreEqual: js.Function2[
      /* prevProps */ typings.rax.mod.PropsWithChildren[P], 
      /* nextProps */ typings.rax.mod.PropsWithChildren[P], 
      scala.Boolean
    ]
  ): typings.rax.mod.NamedExoticComponent[P] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.rax.mod.NamedExoticComponent[P]]
  
  @scala.inline
  def render[T](element: typings.rax.mod.Element, parent: typings.rax.mod.Document): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Document,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Document,
    options: typings.rax.mod.RenderOption
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Document,
    options: typings.rax.mod.RenderOption,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](element: typings.rax.mod.Element, parent: typings.rax.mod.Element): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Element,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Element,
    options: typings.rax.mod.RenderOption
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def render[T](
    element: typings.rax.mod.Element,
    parent: typings.rax.mod.Element,
    options: typings.rax.mod.RenderOption,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    */
  // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
  @scala.inline
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: typings.rax.mod.DependencyList): T = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `Rax.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    */
  @scala.inline
  def useContext[T](context: typings.rax.mod.Context[T]): T = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    */
  @scala.inline
  def useEffect(effect: typings.rax.mod.EffectCallback): scala.Unit = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useEffect(effect: typings.rax.mod.EffectCallback, deps: typings.rax.mod.DependencyList): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `Rax.forwardRef`.
    */
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[typings.rax.mod.Ref[T]], init: js.Function0[R]): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](
    ref: js.UndefOr[typings.rax.mod.Ref[T]],
    init: js.Function0[R],
    deps: typings.rax.mod.DependencyList
  ): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    */
  @scala.inline
  def useLayoutEffect(effect: typings.rax.mod.EffectCallback): scala.Unit = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useLayoutEffect(effect: typings.rax.mod.EffectCallback, deps: typings.rax.mod.DependencyList): scala.Unit = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
    * the second argument.
    *
    * ```ts
    * function expensive () { ... }
    *
    * function Component () {
    *   const expensiveResult = useMemo(expensive, [expensive])
    *   return ...
    * }
    * ```
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  @scala.inline
  def useMemo[T](factory: js.Function0[T]): T = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](factory: js.Function0[T], deps: typings.rax.mod.DependencyList): T = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    */
  // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
  // The Flow types do have an overload for 3-ary invocation with undefined initializer.
  // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
  // supertype between the reducer's return type and the initialState (or the initializer's return type),
  // which would prevent autocompletion from ever working.
  // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
  // in older versions, or a regression in newer versions of the typescript completion service.
  @scala.inline
  def useReducer[R /* <: typings.rax.mod.Reducer[_, _] */](reducer: R, initialState: typings.rax.mod.ReducerState[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[
    typings.rax.mod.ReducerState[R], 
    typings.rax.mod.Dispatch[typings.rax.mod.ReducerAction[R]]
  ] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.rax.mod.ReducerState[R], 
    typings.rax.mod.Dispatch[typings.rax.mod.ReducerAction[R]]
  ]]
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    */
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  @scala.inline
  def useReducer[R /* <: typings.rax.mod.Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with typings.rax.mod.ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I with typings.rax.mod.ReducerState[R]) | (/* arg */ I), 
      typings.rax.mod.ReducerState[R]
    ]
  ): js.Tuple2[
    typings.rax.mod.ReducerState[R], 
    typings.rax.mod.Dispatch[typings.rax.mod.ReducerAction[R]]
  ] = (typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.rax.mod.ReducerState[R], 
    typings.rax.mod.Dispatch[typings.rax.mod.ReducerAction[R]]
  ]]
  
  // convenience overload for potentially undefined initialValue / call with 0 arguments
  // has a default to stop it from defaulting to {} instead
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @scala.inline
  def useRef[T](): typings.rax.mod.MutableRefObject[js.UndefOr[T]] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.rax.mod.MutableRefObject[js.UndefOr[T]]]
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @scala.inline
  def useRef[T](initialValue: T): typings.rax.mod.MutableRefObject[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.MutableRefObject[T]]
  
  // convenience overload for refs given as a ref prop as they typically start with a null value
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
    * of the generic argument.
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @scala.inline
  def useRef_T_RefObject[T](): typings.rax.mod.RefObject[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.rax.mod.RefObject[T]]
  @scala.inline
  def useRef_T_RefObject[T](initialValue: T): typings.rax.mod.RefObject[T] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.rax.mod.RefObject[T]]
  
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    */
  @scala.inline
  def useState[S](): js.Tuple2[
    js.UndefOr[S], 
    typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[js.UndefOr[S]]]
  ] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[
    js.UndefOr[S], 
    typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[js.UndefOr[S]]]
  ]]
  /**
    * Returns a stateful value, and a function to update it.
    */
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[S, typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[S]]] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[S]]]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[S]]] = typings.rax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, typings.rax.mod.Dispatch[typings.rax.mod.SetStateAction[S]]]]
  
  @scala.inline
  def version: java.lang.String = typings.rax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
