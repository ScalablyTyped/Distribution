package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.anon.AcceptNode
import typings.std.anon.LookupNamespaceURI
import typings.std.stdStrings.`dual-rumble`
import typings.std.stdStrings.`public-key`
import typings.std.stdStrings.auto
import typings.std.stdStrings.byob
import typings.std.stdStrings.bytes
import typings.std.stdStrings.require
import typings.std.stdStrings.screen
import typings.std.stdStrings.vibration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlgorithmIdentifier = Algorithm | java.lang.String

type ArrayBufferLike = js.typedarray.ArrayBuffer | SharedArrayBuffer

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorklet)
  */
type AudioWorklet = Worklet

type AutoKeyword = auto

/**
  * Recursively unwraps the "awaited type" of a type. Non-promise "thenables" should resolve to `never`. This emulates the behavior of `await`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends null | undefined ? T : // special case for `null | undefined` when not in `--strictNullChecks` mode
T extends object & {then (onfulfilled : infer F, args : infer _): any} ? // `await` only unwraps object types with a callable `then`. Non-object types are not unwrapped
F extends (value : infer V, args : infer _): any ? // if the argument to `then` is callable, extracts the first argument
std.Awaited<V> : // recursively unwrap the value
never : // the argument to `then` was not callable
T
  }}}
  */
type Awaited[T] = T

type BigInteger = js.typedarray.Uint8Array

type BinaryData = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type BlobCallback = js.Function1[/* blob */ Blob | Null, Unit]

type BlobPart = BufferSource | Blob | java.lang.String

type BodyInit = ReadableStream[Any] | XMLHttpRequestBodyInit

type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

/**
  * A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CDATASection)
  */
type CDATASection = Text

type COSEAlgorithmIdentifier = Double

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImageValue) */
type CSSImageValue = CSSStyleValue

type CSSKeywordish = java.lang.String | CSSKeywordValue

type CSSNumberish = Double | CSSNumericValue

type CSSPerspectiveValue = CSSNumericValue | CSSKeywordish

/**
  * An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSupportsRule)
  */
type CSSSupportsRule = CSSConditionRule

type CSSUnparsedSegment = java.lang.String | CSSVariableReferenceValue

/**
  * Convert first character of string literal type to uppercase
  */
type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

/**
  * The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelMergerNode)
  */
type ChannelMergerNode = AudioNode

/**
  * The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelSplitterNode)
  */
type ChannelSplitterNode = AudioNode

type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]

/**
  * The decorator context types provided to class element decorators.
  */
type ClassMemberDecoratorContext = (ClassMethodDecoratorContext[Any, js.ThisFunction1[/* this */ Any, /* args */ Any, Any]]) | (ClassGetterDecoratorContext[Any, Any]) | (ClassSetterDecoratorContext[Any, Any]) | (ClassFieldDecoratorContext[Any, Any]) | (ClassAccessorDecoratorContext[Any, Any])

/** @deprecated */
type ClientRect = DOMRect

type ClipboardItemData = js.Promise[java.lang.String | Blob]

type ClipboardItems = js.Array[ClipboardItem]

/**
  * Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Comment)
  */
type Comment = CharacterData

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream) */
type CompressionStream = GenericTransformStream

type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters

type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters

type ConstrainDouble = Double | ConstrainDoubleRange

type ConstrainULong = Double | ConstrainULongRange

type DOMHighResTimeStamp = Double

/**
  * Used by the dataset HTML attribute to represent data for custom attributes added to elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringMap)
  */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[java.lang.String]]

type DecodeErrorCallback = js.Function1[/* error */ DOMException, Unit]

type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, Unit]

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DecompressionStream) */
type DecompressionStream = GenericTransformStream

/**
  * The decorator context types provided to any decorator.
  */
type DecoratorContext = (ClassDecoratorContext[Instantiable1[/* args */ Any, Any]]) | ClassMemberDecoratorContext

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentTimeline) */
type DocumentTimeline = AnimationTimeline

/** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
type ElementTagNameMap = HTMLElementTagNameMap & (Pick[
SVGElementTagNameMap, 
Exclude[
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typings.std.stdStrings.a, typings.std.stdStrings.animate, typings.std.stdStrings.animateMotion */ Any, 
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.std.stdStrings.a, typings.std.stdStrings.abbr, typings.std.stdStrings.address */ Any
]])

type EncodedVideoChunkOutputCallback = js.Function2[
/* chunk */ EncodedVideoChunk, 
/* metadata */ js.UndefOr[EncodedVideoChunkMetadata], 
Unit]

type EpochTimeStamp = Double

type ErrorCallback = js.Function1[/* err */ DOMException, Unit]

type EvalError = js.Error

type EventListener = js.Function1[/* evt */ Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? never : T
  }}}
  */
type Exclude[T, U] = T

/**
  * Extract from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? T : never
  }}}
  */
type Extract[T, U] = T

type FileCallback = js.Function1[/* file */ File, Unit]

type FileSystemEntriesCallback = js.Function1[/* entries */ js.Array[FileSystemEntry], Unit]

type FileSystemEntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.std.BufferSource
  - typings.std.Blob
  - java.lang.String
  - typings.std.WriteParams
*/
type FileSystemWriteChunkType = _FileSystemWriteChunkType | BufferSource | java.lang.String

type FlatArray[Arr, Depth /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: std.anon.Done<Arr, Depth>[Depth extends -1 ? 'done' : 'recur'] */ js.Any

type Float32List = js.typedarray.Float32Array | js.Array[GLfloat]

type FormDataEntryValue = File | java.lang.String

type FrameRequestCallback = js.Function1[/* time */ DOMHighResTimeStamp, Unit]

type FunctionStringCallback = js.Function1[/* data */ java.lang.String, Unit]

type GLbitfield = Double

type GLboolean = scala.Boolean

type GLclampf = Double

type GLenum = Double

type GLfloat = Double

type GLint = Double

type GLint64 = Double

type GLintptr = Double

type GLsizei = Double

type GLsizeiptr = Double

type GLuint = Double

type GLuint64 = Double

type GamepadHapticActuatorType = vibration

type GamepadHapticEffectType = `dual-rumble`

type HashAlgorithmIdentifier = AlgorithmIdentifier

type HeadersInit = (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | (Record[java.lang.String, java.lang.String]) | Headers

/** 
NOTE: Rewritten from type alias:
{{{
type IDBValidKey = number | string | std.Date | std.BufferSource | std.Array<std.IDBValidKey>
}}}
to avoid circular code involving: 
- std.IDBValidKey
*/
type IDBValidKey = Double | java.lang.String | js.Date | BufferSource | js.Array[Any]

type IdleRequestCallback = js.Function1[/* deadline */ IdleDeadline, Unit]

/**
  * The type for the `assert` property of the optional second argument to `import()`.
  */
type ImportAssertions = /* standard es5 */
StringDictionary[java.lang.String]

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo)
  */
type InputDeviceInfo = MediaDeviceInfo

type Int32List = js.typedarray.Int32Array | js.Array[GLint]

type IntersectionObserverCallback = js.Function2[
/* entries */ js.Array[IntersectionObserverEntry], 
/* observer */ IntersectionObserver, 
Unit]

type LineAndPositionSetting = Double | AutoKeyword

type LockGrantedCallback = js.Function1[/* lock */ Lock | Null, Any]

/**
  * Convert string literal type to lowercase
  */
type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type MediaSessionActionHandler = js.Function1[/* details */ MediaSessionActionDetails, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.std.WindowProxy
  - typings.std.MessagePort
  - typings.std.ServiceWorker
*/
type MessageEventSource = _MessageEventSource | WindowProxy

type MethodDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type MutationCallback = js.Function2[/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver, Unit]

type NamedCurve = java.lang.String

type NodeFilter = (js.Function1[/* node */ Node, Double]) | AcceptNode

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T

type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

/**
  * Removes the 'this' parameter from a function type.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  unknown extends std.ThisParameterType<T> ? T : T extends (args : infer A): infer R ? (args : A): R : T
  }}}
  */
type OmitThisParameter[T] = T

type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | Null

type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | Null]

type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null

type OnErrorEventHandlerNonNull = js.Function5[
/* event */ Event | java.lang.String, 
/* source */ js.UndefOr[java.lang.String], 
/* lineno */ js.UndefOr[Double], 
/* colno */ js.UndefOr[Double], 
/* error */ js.UndefOr[js.Error], 
Any]

type ParameterDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ js.UndefOr[java.lang.String | js.Symbol], 
/* parameterIndex */ Double, 
Unit]

/**
  * Make all properties in T optional
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Partial[T] = T

type PaymentRequestUpdateEventInit = EventInit

type PerformanceEntryList = js.Array[PerformanceEntry]

type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformancePaintTiming) */
type PerformancePaintTiming = PerformanceEntry

/**
  * From T, pick a set of properties whose keys are in the union K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = T

type PositionCallback = js.Function1[/* position */ GeolocationPosition, Unit]

type PositionErrorCallback = js.Function1[/* positionError */ GeolocationPositionError, Unit]

type PromiseConstructorLike = Instantiable1[
/* executor */ js.Function2[
  /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
  /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
  Unit
], 
PromiseLike[js.Object]]

type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]

type PropertyDescriptorMap = /* standard es5 */
StringDictionary[js.PropertyDescriptor]

type PropertyKey = java.lang.String | Double | js.Symbol

type PublicKeyCredentialType = `public-key`

type QueuingStrategySize[T] = js.Function1[/* chunk */ T, Double]

type RTCAnswerOptions = RTCOfferAnswerOptions

type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, Unit]

type RTCRtcpMuxPolicy = require

type RTCRtpCodecCapability = RTCRtpCodec

type RTCRtpReceiveParameters = RTCRtpParameters

type RTCRtpSynchronizationSource = RTCRtpContributingSource

type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, Unit]

type RangeError = js.Error

type ReadableStreamReaderMode = byob

type ReadableStreamType = bytes

/**
  * Make all properties in T readonly
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {readonly [ P in keyof T ]: T[P]}
  }}}
  */
type Readonly[T] = T

/**
  * Construct a type with a set of properties K of type T
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation throws away the known field names. 
  * TS definition: {{{
  {[ P in K ]: T}
  }}}
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = StringDictionary[T]

type ReferenceError = js.Error

type RemotePlaybackAvailabilityCallback = js.Function1[/* available */ scala.Boolean, Unit]

type ReportList = js.Array[Report]

type ReportingObserverCallback = js.Function2[/* reports */ js.Array[Report], /* observer */ ReportingObserver, Unit]

type RequestInfo = Request | java.lang.String

/**
  * Make all properties in T required
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]: -? T[P]}
  }}}
  */
type Required[T] = T

type ResizeObserverCallback = js.Function2[/* entries */ js.Array[ResizeObserverEntry], /* observer */ ResizeObserver, Unit]

type SVGMatrix = DOMMatrix

type SVGPoint = DOMPoint

type SVGRect = DOMRect

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StaticRange) */
type StaticRange = AbstractRange

type SyntaxError = js.Error

type TimerHandler = java.lang.String | js.Function

/* Rewritten from type alias, can be one of: 
  - typings.std.OffscreenCanvas
  - typings.std.ImageBitmap
  - typings.std.MessagePort
  - typings.std.ReadableStream[scala.Any]
  - typings.std.WritableStream[scala.Any]
  - typings.std.TransformStream[scala.Any, scala.Any]
  - typings.std.VideoFrame
  - js.typedarray.ArrayBuffer
*/
type Transferable = _Transferable | ReadableStream[Any] | WritableStream[Any] | (TransformStream[Any, Any]) | js.typedarray.ArrayBuffer

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | PromiseLike[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Any]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | PromiseLike[Unit]]

type TypeError = js.Error

type URIError = js.Error

type Uint32List = js.typedarray.Uint32Array | js.Array[GLuint]

/**
  * Convert first character of string literal type to lowercase
  */
type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSinkCloseCallback = js.Function0[Unit | PromiseLike[Unit]]

type UnderlyingSinkStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Any]

type UnderlyingSinkWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | PromiseLike[Unit]]

type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSourcePullCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Unit | PromiseLike[Unit]]

type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Any]

/**
  * Convert string literal type to uppercase
  */
type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type VibratePattern = Double | js.Array[Double]

type VideoFrameOutputCallback = js.Function1[/* output */ VideoFrame, Unit]

type VideoFrameRequestCallback = js.Function2[/* now */ DOMHighResTimeStamp, /* metadata */ VideoFrameCallbackMetadata, Unit]

type VoidFunction = js.Function0[Unit]

type WakeLockType = screen

type WebCodecsErrorCallback = js.Function1[/* error */ DOMException, Unit]

type WebKitCSSMatrix = DOMMatrix

type WindowProxy = Window

/* Rewritten from type alias, can be one of: 
  - typings.std.Blob
  - typings.std.BufferSource
  - typings.std.FormData
  - typings.std.URLSearchParams
  - java.lang.String
*/
type XMLHttpRequestBodyInit = _XMLHttpRequestBodyInit | BufferSource | java.lang.String

/**
  * The XPathEvaluator interface allows to compile and evaluate XPath expressions.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator)
  */
type XPathEvaluator = XPathEvaluatorBase

type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | LookupNamespaceURI

type webkitURL = URL
