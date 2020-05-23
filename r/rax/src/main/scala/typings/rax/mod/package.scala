package typings.rax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.AnimationEvent[T]]
  type AppearEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.AppearEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = typings.rax.mod.MediaHTMLAttributes[T]
  type CElement[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */] = typings.rax.mod.ComponentElement[P, T]
  type CFactory[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */] = typings.rax.mod.ComponentFactory[P, T]
  type ChangeEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.ChangeEvent[T]]
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typings.rax.mod.Component[P, typings.rax.mod.ComponentState, _] */, C /* <: typings.rax.mod.ComponentClass[P, typings.rax.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, js.UndefOr[/* context */ js.Any], T])
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
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = typings.rax.mod.SyntheticEvent[T, typings.std.Event]
  type FormEventHandler[T] = typings.rax.mod.EventHandler[typings.rax.mod.FormEvent[T]]
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
  // tslint:disable-next-line:no-empty-interface
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
  type PropsWithRef[P] = P | (typings.rax.mod.PropsWithoutRef[P] with typings.rax.anon.RefExclude)
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
}
