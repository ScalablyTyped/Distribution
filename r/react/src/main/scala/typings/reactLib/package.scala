package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactLib {
  type AnimationEvent = Event
  type ClipboardEvent = Event
  type CompositionEvent = Event
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Partial[stdLib.Pick[P, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Partial[stdLib.Pick[D, stdLib.Exclude[java.lang.String, java.lang.String]]])) | P
  type DragEvent = Event
  type FocusEvent = Event
  type HTMLAnchorElement = HTMLElement
  type HTMLAreaElement = HTMLElement
  type HTMLAudioElement = HTMLElement
  type HTMLBRElement = HTMLElement
  type HTMLBaseElement = HTMLElement
  type HTMLBodyElement = HTMLElement
  type HTMLButtonElement = HTMLElement
  type HTMLCanvasElement = HTMLElement
  type HTMLDListElement = HTMLElement
  type HTMLDataListElement = HTMLElement
  type HTMLDialogElement = HTMLElement
  type HTMLDivElement = HTMLElement
  type HTMLElement = Element
  type HTMLEmbedElement = HTMLElement
  type HTMLFieldSetElement = HTMLElement
  type HTMLFormElement = HTMLElement
  type HTMLHRElement = HTMLElement
  type HTMLHeadElement = HTMLElement
  type HTMLHeadingElement = HTMLElement
  type HTMLHtmlElement = HTMLElement
  type HTMLIFrameElement = HTMLElement
  type HTMLImageElement = HTMLElement
  type HTMLInputElement = HTMLElement
  type HTMLLIElement = HTMLElement
  type HTMLLabelElement = HTMLElement
  type HTMLLegendElement = HTMLElement
  type HTMLLinkElement = HTMLElement
  type HTMLMapElement = HTMLElement
  type HTMLMetaElement = HTMLElement
  type HTMLModElement = HTMLElement
  type HTMLOListElement = HTMLElement
  type HTMLObjectElement = HTMLElement
  type HTMLOptGroupElement = HTMLElement
  type HTMLOptionElement = HTMLElement
  type HTMLParagraphElement = HTMLElement
  type HTMLParamElement = HTMLElement
  type HTMLPreElement = HTMLElement
  type HTMLProgressElement = HTMLElement
  type HTMLQuoteElement = HTMLElement
  type HTMLScriptElement = HTMLElement
  type HTMLSelectElement = HTMLElement
  type HTMLSourceElement = HTMLElement
  type HTMLSpanElement = HTMLElement
  type HTMLStyleElement = HTMLElement
  type HTMLTableColElement = HTMLElement
  type HTMLTableDataCellElement = HTMLElement
  type HTMLTableElement = HTMLElement
  type HTMLTableHeaderCellElement = HTMLElement
  type HTMLTableRowElement = HTMLElement
  type HTMLTableSectionElement = HTMLElement
  type HTMLTextAreaElement = HTMLElement
  type HTMLTitleElement = HTMLElement
  type HTMLTrackElement = HTMLElement
  type HTMLUListElement = HTMLElement
  type HTMLVideoElement = HTMLElement
  type HTMLWebViewElement = HTMLElement
  type KeyboardEvent = Event
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  // If props is type any, use propTypes definitions, otherwise for each `any` property of props, use the propTypes type
  // If declared props have indexed properties, ignore inferred props entirely as keyof gets widened
  type MergePropTypes[P, T] = (reactLib.reactLibStrings.MergePropTypes with js.Any with (stdLib.Pick[T, stdLib.Exclude[java.lang.String, java.lang.String]])) | T
  type MouseEvent = Event
  type NativeAnimationEvent = AnimationEvent
  type NativeClipboardEvent = ClipboardEvent
  type NativeCompositionEvent = CompositionEvent
  type NativeDragEvent = DragEvent
  type NativeFocusEvent = FocusEvent
  type NativeKeyboardEvent = KeyboardEvent
  type NativeMouseEvent = MouseEvent
  type NativePointerEvent = PointerEvent
  type NativeTouchEvent = TouchEvent
  type NativeTransitionEvent = TransitionEvent
  type NativeUIEvent = UIEvent
  type NativeWheelEvent = WheelEvent
  type PointerEvent = Event
  type ReactManagedAttributes[C, P] = P | (Defaultize[P, js.Any]) | (MergePropTypes[
    P, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PropTypes.InferProps<T> */ js.Any
  ]) | (Defaultize[
    MergePropTypes[
      P, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PropTypes.InferProps<T> */ js.Any
    ], 
    js.Any
  ])
  type SVGCircleElement = SVGElement
  type SVGClipPathElement = SVGElement
  type SVGDefsElement = SVGElement
  type SVGDescElement = SVGElement
  type SVGElement = Element
  type SVGEllipseElement = SVGElement
  type SVGFEBlendElement = SVGElement
  type SVGFEColorMatrixElement = SVGElement
  type SVGFEComponentTransferElement = SVGElement
  type SVGFECompositeElement = SVGElement
  type SVGFEConvolveMatrixElement = SVGElement
  type SVGFEDiffuseLightingElement = SVGElement
  type SVGFEDisplacementMapElement = SVGElement
  type SVGFEDistantLightElement = SVGElement
  type SVGFEDropShadowElement = SVGElement
  type SVGFEFloodElement = SVGElement
  type SVGFEFuncAElement = SVGElement
  type SVGFEFuncBElement = SVGElement
  type SVGFEFuncGElement = SVGElement
  type SVGFEFuncRElement = SVGElement
  type SVGFEGaussianBlurElement = SVGElement
  type SVGFEImageElement = SVGElement
  type SVGFEMergeElement = SVGElement
  type SVGFEMergeNodeElement = SVGElement
  type SVGFEMorphologyElement = SVGElement
  type SVGFEOffsetElement = SVGElement
  type SVGFEPointLightElement = SVGElement
  type SVGFESpecularLightingElement = SVGElement
  type SVGFESpotLightElement = SVGElement
  type SVGFETileElement = SVGElement
  type SVGFETurbulenceElement = SVGElement
  type SVGFilterElement = SVGElement
  type SVGForeignObjectElement = SVGElement
  type SVGGElement = SVGElement
  type SVGImageElement = SVGElement
  type SVGLineElement = SVGElement
  type SVGLinearGradientElement = SVGElement
  type SVGMarkerElement = SVGElement
  type SVGMaskElement = SVGElement
  type SVGMetadataElement = SVGElement
  type SVGPathElement = SVGElement
  type SVGPatternElement = SVGElement
  type SVGPolygonElement = SVGElement
  type SVGPolylineElement = SVGElement
  type SVGRadialGradientElement = SVGElement
  type SVGRectElement = SVGElement
  type SVGSVGElement = SVGElement
  type SVGStopElement = SVGElement
  type SVGSwitchElement = SVGElement
  type SVGSymbolElement = SVGElement
  type SVGTSpanElement = SVGElement
  type SVGTextElement = SVGElement
  type SVGTextPathElement = SVGElement
  type SVGUseElement = SVGElement
  type SVGViewElement = SVGElement
  type TouchEvent = Event
  type TransitionEvent = Event
  type UIEvent = Event
  type WheelEvent = Event
}
