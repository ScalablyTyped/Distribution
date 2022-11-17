package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.anon.AcceptNode
import typings.std.anon.LookupNamespaceURI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlgorithmIdentifier = Algorithm | java.lang.String

type AlignSetting = "center" | "end" | "left" | "right" | "start"

type AnimationPlayState = "finished" | "idle" | "paused" | "running"

type AnimationReplaceState = "active" | "persisted" | "removed"

type AppendMode = "segments" | "sequence"

type ArrayBufferLike = js.typedarray.ArrayBuffer | SharedArrayBuffer

type AttestationConveyancePreference = "direct" | "enterprise" | "indirect" | "none"

type AudioContextLatencyCategory = "balanced" | "interactive" | "playback"

type AudioContextState = "closed" | "running" | "suspended"

/** Available only in secure contexts. */
type AudioWorklet = Worklet

type AuthenticatorAttachment = "cross-platform" | "platform"

type AuthenticatorTransport = "ble" | "hybrid" | "internal" | "nfc" | "usb"

type AutoKeyword = "auto"

type AutomationRate = "a-rate" | "k-rate"

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

type BinaryType = "arraybuffer" | "blob"

type BiquadFilterType = "allpass" | "bandpass" | "highpass" | "highshelf" | "lowpass" | "lowshelf" | "notch" | "peaking"

type BlobCallback = js.Function1[/* blob */ Blob | Null, Unit]

type BlobPart = BufferSource | Blob | java.lang.String

type BodyInit = ReadableStream[Any] | XMLHttpRequestBodyInit

type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

/** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
type CDATASection = Text

type COSEAlgorithmIdentifier = Double

type CSSContainerRule = CSSConditionRule

type CSSNumberish = Double

/** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
type CSSSupportsRule = CSSConditionRule

type CanPlayTypeResult = "" | "maybe" | "probably"

type CanvasDirection = "inherit" | "ltr" | "rtl"

type CanvasFillRule = "evenodd" | "nonzero"

type CanvasFontKerning = "auto" | "none" | "normal"

type CanvasFontStretch = "condensed" | "expanded" | "extra-condensed" | "extra-expanded" | "normal" | "semi-condensed" | "semi-expanded" | "ultra-condensed" | "ultra-expanded"

type CanvasFontVariantCaps = "all-petite-caps" | "all-small-caps" | "normal" | "petite-caps" | "small-caps" | "titling-caps" | "unicase"

type CanvasImageSource = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap | OffscreenCanvas

type CanvasLineCap = "butt" | "round" | "square"

type CanvasLineJoin = "bevel" | "miter" | "round"

type CanvasTextAlign = "center" | "end" | "left" | "right" | "start"

type CanvasTextBaseline = "alphabetic" | "bottom" | "hanging" | "ideographic" | "middle" | "top"

type CanvasTextRendering = "auto" | "geometricPrecision" | "optimizeLegibility" | "optimizeSpeed"

/**
  * Convert first character of string literal type to uppercase
  */
type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type ChannelCountMode = "clamped-max" | "explicit" | "max"

type ChannelInterpretation = "discrete" | "speakers"

/** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
type ChannelMergerNode = AudioNode

/** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
type ChannelSplitterNode = AudioNode

type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]

/** @deprecated */
type ClientRect = DOMRect

type ClientTypes = "all" | "sharedworker" | "window" | "worker"

type ClipboardItemData = js.Promise[java.lang.String | Blob]

type ClipboardItems = js.Array[ClipboardItem]

type ColorGamut = "p3" | "rec2020" | "srgb"

type ColorSpaceConversion = "default" | "none"

/** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
type Comment = CharacterData

type CompositeOperation = "accumulate" | "add" | "replace"

type CompositeOperationOrAuto = "accumulate" | "add" | "auto" | "replace"

type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters

type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters

type ConstrainDouble = Double | ConstrainDoubleRange

type ConstrainULong = Double | ConstrainULongRange

type CredentialMediationRequirement = "optional" | "required" | "silent"

type DOMHighResTimeStamp = Double

type DOMParserSupportedType = "application/xhtml+xml" | "application/xml" | "image/svg+xml" | "text/html" | "text/xml"

/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[java.lang.String]]

type DecodeErrorCallback = js.Function1[/* error */ DOMException, Unit]

type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, Unit]

type DirectionSetting = "" | "lr" | "rl"

type DisplayCaptureSurfaceType = "browser" | "monitor" | "window"

type DistanceModelType = "exponential" | "inverse" | "linear"

type DocumentReadyState = "complete" | "interactive" | "loading"

type DocumentTimeline = AnimationTimeline

type DocumentVisibilityState = "hidden" | "visible"

/** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
type ElementTagNameMap = HTMLElementTagNameMap & (Pick[
SVGElementTagNameMap, 
Exclude[
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with "a", "animate", "animateMotion" */ java.lang.String, 
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with "a", "abbr", "address" */ java.lang.String
]])

type EndOfStreamError = "decode" | "network"

type EndingType = "native" | "transparent"

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

type FileSystemHandleKind = "directory" | "file"

type FillMode = "auto" | "backwards" | "both" | "forwards" | "none"

type FlatArray[Arr, Depth /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: std.anon.Done<Arr, Depth>[Depth extends -1 ? 'done' : 'recur'] */ js.Any

type Float32List = js.typedarray.Float32Array | js.Array[GLfloat]

type FontFaceLoadStatus = "error" | "loaded" | "loading" | "unloaded"

type FontFaceSetLoadStatus = "loaded" | "loading"

type FormDataEntryValue = File | java.lang.String

type FrameRequestCallback = js.Function1[/* time */ DOMHighResTimeStamp, Unit]

type FullscreenNavigationUI = "auto" | "hide" | "show"

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

type GamepadHapticActuatorType = "vibration"

type GamepadMappingType = "" | "standard" | "xr-standard"

type GlobalCompositeOperation = "color" | "color-burn" | "color-dodge" | "copy" | "darken" | "destination-atop" | "destination-in" | "destination-out" | "destination-over" | "difference" | "exclusion" | "hard-light" | "hue" | "lighten" | "lighter" | "luminosity" | "multiply" | "overlay" | "saturation" | "screen" | "soft-light" | "source-atop" | "source-in" | "source-out" | "source-over" | "xor"

type HTMLOrSVGImageElement = HTMLImageElement | SVGImageElement

type HTMLOrSVGScriptElement = HTMLScriptElement | SVGScriptElement

type HashAlgorithmIdentifier = AlgorithmIdentifier

type HdrMetadataType = "smpteSt2086" | "smpteSt2094-10" | "smpteSt2094-40"

type HeadersInit = (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | (Record[java.lang.String, java.lang.String]) | Headers

type IDBCursorDirection = "next" | "nextunique" | "prev" | "prevunique"

type IDBRequestReadyState = "done" | "pending"

type IDBTransactionDurability = "default" | "relaxed" | "strict"

type IDBTransactionMode = "readonly" | "readwrite" | "versionchange"

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

type ImageBitmapSource = CanvasImageSource | Blob | ImageData

type ImageOrientation = "flipY" | "none"

type ImageSmoothingQuality = "high" | "low" | "medium"

/**
  * The type for the `assert` property of the optional second argument to `import()`.
  */
type ImportAssertions = /* standard es5 */
StringDictionary[java.lang.String]

/** Available only in secure contexts. */
type InputDeviceInfo = MediaDeviceInfo

type InsertPosition = "beforebegin" | "afterbegin" | "beforeend" | "afterend"

type Int32List = js.typedarray.Int32Array | js.Array[GLint]

type IntersectionObserverCallback = js.Function2[
/* entries */ js.Array[IntersectionObserverEntry], 
/* observer */ IntersectionObserver, 
Unit]

type IterationCompositeOperation = "accumulate" | "replace"

type IteratorResult[T, TReturn] = IteratorYieldResult[T] | IteratorReturnResult[TReturn]

type KeyFormat = "jwk" | "pkcs8" | "raw" | "spki"

type KeyType = "private" | "public" | "secret"

type KeyUsage = "decrypt" | "deriveBits" | "deriveKey" | "encrypt" | "sign" | "unwrapKey" | "verify" | "wrapKey"

type LineAlignSetting = "center" | "end" | "start"

type LineAndPositionSetting = Double | AutoKeyword

type LockGrantedCallback = js.Function1[/* lock */ Lock | Null, Any]

type LockMode = "exclusive" | "shared"

/**
  * Convert string literal type to lowercase
  */
type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type MediaDecodingType = "file" | "media-source" | "webrtc"

type MediaDeviceKind = "audioinput" | "audiooutput" | "videoinput"

type MediaEncodingType = "record" | "webrtc"

type MediaKeyMessageType = "individualization-request" | "license-release" | "license-renewal" | "license-request"

type MediaKeySessionClosedReason = "closed-by-application" | "hardware-context-reset" | "internal-error" | "release-acknowledged" | "resource-evicted"

type MediaKeySessionType = "persistent-license" | "temporary"

type MediaKeyStatus = "expired" | "internal-error" | "output-downscaled" | "output-restricted" | "released" | "status-pending" | "usable" | "usable-in-future"

type MediaKeysRequirement = "not-allowed" | "optional" | "required"

type MediaProvider = MediaStream | MediaSource | Blob

type MediaSessionAction = "nexttrack" | "pause" | "play" | "previoustrack" | "seekbackward" | "seekforward" | "seekto" | "skipad" | "stop"

type MediaSessionActionHandler = js.Function1[/* details */ MediaSessionActionDetails, Unit]

type MediaSessionPlaybackState = "none" | "paused" | "playing"

type MediaStreamTrackState = "ended" | "live"

type MessageEventSource = WindowProxy | MessagePort | ServiceWorker

type MethodDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type MutationCallback = js.Function2[/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver, Unit]

type MutationRecordType = "attributes" | "characterData" | "childList"

type NamedCurve = java.lang.String

type NavigationTimingType = "back_forward" | "navigate" | "prerender" | "reload"

type NodeFilter = (js.Function1[/* node */ Node, Double]) | AcceptNode

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T & js.Object

type NotificationDirection = "auto" | "ltr" | "rtl"

type NotificationPermission = "default" | "denied" | "granted"

type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]

type OffscreenRenderingContext = OffscreenCanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext | WebGL2RenderingContext

type OffscreenRenderingContextId = "2d" | "bitmaprenderer" | "webgl" | "webgl2" | "webgpu"

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

type OrientationLockType = "any" | "landscape" | "landscape-primary" | "landscape-secondary" | "natural" | "portrait" | "portrait-primary" | "portrait-secondary"

type OrientationType = "landscape-primary" | "landscape-secondary" | "portrait-primary" | "portrait-secondary"

type OscillatorType = "custom" | "sawtooth" | "sine" | "square" | "triangle"

type OverSampleType = "2x" | "4x" | "none"

type PanningModelType = "HRTF" | "equalpower"

type ParameterDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
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

type PaymentComplete = "fail" | "success" | "unknown"

type PaymentRequestUpdateEventInit = EventInit

type PerformanceEntryList = js.Array[PerformanceEntry]

type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]

type PerformancePaintTiming = PerformanceEntry

type PermissionName = "geolocation" | "notifications" | "persistent-storage" | "push" | "screen-wake-lock" | "xr-spatial-tracking"

type PermissionState = "denied" | "granted" | "prompt"

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

type PlaybackDirection = "alternate" | "alternate-reverse" | "normal" | "reverse"

type PositionAlignSetting = "auto" | "center" | "line-left" | "line-right"

type PositionCallback = js.Function1[/* position */ GeolocationPosition, Unit]

type PositionErrorCallback = js.Function1[/* positionError */ GeolocationPositionError, Unit]

type PredefinedColorSpace = "display-p3" | "srgb"

type PremultiplyAlpha = "default" | "none" | "premultiply"

type PresentationStyle = "attachment" | "inline" | "unspecified"

type PromiseConstructorLike = Instantiable1[
/* executor */ js.Function2[
  /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
  /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
  Unit
], 
PromiseLike[js.Object]]

type PromiseSettledResult[T] = PromiseFulfilledResult[T] | PromiseRejectedResult

type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]

type PropertyDescriptorMap = /* standard es5 */
StringDictionary[js.PropertyDescriptor]

type PropertyKey = java.lang.String | Double | js.Symbol

type PublicKeyCredentialType = "public-key"

type PushEncryptionKeyName = "auth" | "p256dh"

type QueuingStrategySize[T] = js.Function1[/* chunk */ T, Double]

type RTCAnswerOptions = RTCOfferAnswerOptions

type RTCBundlePolicy = "balanced" | "max-bundle" | "max-compat"

type RTCDataChannelState = "closed" | "closing" | "connecting" | "open"

type RTCDegradationPreference = "balanced" | "maintain-framerate" | "maintain-resolution"

type RTCDtlsTransportState = "closed" | "connected" | "connecting" | "failed" | "new"

type RTCEncodedVideoFrameType = "delta" | "empty" | "key"

type RTCErrorDetailType = "data-channel-failure" | "dtls-failure" | "fingerprint-failure" | "hardware-encoder-error" | "hardware-encoder-not-available" | "sctp-failure" | "sdp-syntax-error"

type RTCIceCandidateType = "host" | "prflx" | "relay" | "srflx"

type RTCIceComponent = "rtcp" | "rtp"

type RTCIceConnectionState = "checking" | "closed" | "completed" | "connected" | "disconnected" | "failed" | "new"

type RTCIceGathererState = "complete" | "gathering" | "new"

type RTCIceGatheringState = "complete" | "gathering" | "new"

type RTCIceProtocol = "tcp" | "udp"

type RTCIceTcpCandidateType = "active" | "passive" | "so"

type RTCIceTransportPolicy = "all" | "relay"

type RTCIceTransportState = "checking" | "closed" | "completed" | "connected" | "disconnected" | "failed" | "new"

type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, Unit]

type RTCPeerConnectionState = "closed" | "connected" | "connecting" | "disconnected" | "failed" | "new"

type RTCPriorityType = "high" | "low" | "medium" | "very-low"

type RTCRtcpMuxPolicy = "require"

type RTCRtpReceiveParameters = RTCRtpParameters

type RTCRtpSynchronizationSource = RTCRtpContributingSource

type RTCRtpTransceiverDirection = "inactive" | "recvonly" | "sendonly" | "sendrecv" | "stopped"

type RTCSctpTransportState = "closed" | "connected" | "connecting"

type RTCSdpType = "answer" | "offer" | "pranswer" | "rollback"

type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, Unit]

type RTCSignalingState = "closed" | "have-local-offer" | "have-local-pranswer" | "have-remote-offer" | "have-remote-pranswer" | "stable"

type RTCStatsIceCandidatePairState = "failed" | "frozen" | "in-progress" | "inprogress" | "succeeded" | "waiting"

type RTCStatsType = "candidate-pair" | "certificate" | "codec" | "data-channel" | "inbound-rtp" | "local-candidate" | "media-source" | "outbound-rtp" | "peer-connection" | "remote-candidate" | "remote-inbound-rtp" | "remote-outbound-rtp" | "track" | "transport"

type RangeError = js.Error

type ReadableStreamController[T] = ReadableStreamDefaultController[T] | ReadableByteStreamController

type ReadableStreamReadResult[T] = ReadableStreamReadValueResult[T] | ReadableStreamReadDoneResult[T]

type ReadableStreamReader[T] = ReadableStreamDefaultReader[T] | ReadableStreamBYOBReader

type ReadableStreamReaderMode = "byob"

type ReadableStreamType = "bytes"

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

type ReadyState = "closed" | "ended" | "open"

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

type RecordingState = "inactive" | "paused" | "recording"

type ReferenceError = js.Error

type ReferrerPolicy = "" | "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url"

type RemotePlaybackAvailabilityCallback = js.Function1[/* available */ scala.Boolean, Unit]

type RemotePlaybackState = "connected" | "connecting" | "disconnected"

type RenderingContext = CanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext | WebGL2RenderingContext

type RequestCache = "default" | "force-cache" | "no-cache" | "no-store" | "only-if-cached" | "reload"

type RequestCredentials = "include" | "omit" | "same-origin"

type RequestDestination = "" | "audio" | "audioworklet" | "document" | "embed" | "font" | "frame" | "iframe" | "image" | "manifest" | "object" | "paintworklet" | "report" | "script" | "sharedworker" | "style" | "track" | "video" | "worker" | "xslt"

type RequestInfo = Request | java.lang.String

type RequestMode = "cors" | "navigate" | "no-cors" | "same-origin"

type RequestRedirect = "error" | "follow" | "manual"

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

type ResidentKeyRequirement = "discouraged" | "preferred" | "required"

type ResizeObserverBoxOptions = "border-box" | "content-box" | "device-pixel-content-box"

type ResizeObserverCallback = js.Function2[/* entries */ js.Array[ResizeObserverEntry], /* observer */ ResizeObserver, Unit]

type ResizeQuality = "high" | "low" | "medium" | "pixelated"

type ResponseType = "basic" | "cors" | "default" | "error" | "opaque" | "opaqueredirect"

type SVGMatrix = DOMMatrix

type SVGPoint = DOMPoint

type SVGRect = DOMRect

type ScrollBehavior = "auto" | "smooth"

type ScrollLogicalPosition = "center" | "end" | "nearest" | "start"

type ScrollRestoration = "auto" | "manual"

type ScrollSetting = "" | "up"

type SecurityPolicyViolationEventDisposition = "enforce" | "report"

type SelectionMode = "end" | "preserve" | "select" | "start"

type ServiceWorkerState = "activated" | "activating" | "installed" | "installing" | "parsed" | "redundant"

type ServiceWorkerUpdateViaCache = "all" | "imports" | "none"

type ShadowRootMode = "closed" | "open"

type SlotAssignmentMode = "manual" | "named"

type SpeechSynthesisErrorCode = "audio-busy" | "audio-hardware" | "canceled" | "interrupted" | "invalid-argument" | "language-unavailable" | "network" | "not-allowed" | "synthesis-failed" | "synthesis-unavailable" | "text-too-long" | "voice-unavailable"

type StaticRange = AbstractRange

type SyntaxError = js.Error

type TexImageSource = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas

type TextTrackKind = "captions" | "chapters" | "descriptions" | "metadata" | "subtitles"

type TextTrackMode = "disabled" | "hidden" | "showing"

type TimerHandler = java.lang.String | js.Function

type TouchType = "direct" | "stylus"

type TransferFunction = "hlg" | "pq" | "srgb"

type Transferable = OffscreenCanvas | ImageBitmap | MessagePort | ReadableStream[Any] | WritableStream[Any] | (TransformStream[Any, Any]) | js.typedarray.ArrayBuffer

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

type UserVerificationRequirement = "discouraged" | "preferred" | "required"

type VibratePattern = Double | js.Array[Double]

type VideoColorPrimaries = "bt470bg" | "bt709" | "smpte170m"

type VideoFacingModeEnum = "environment" | "left" | "right" | "user"

type VideoFrameRequestCallback = js.Function2[/* now */ DOMHighResTimeStamp, /* metadata */ VideoFrameCallbackMetadata, Unit]

type VideoMatrixCoefficients = "bt470bg" | "bt709" | "rgb" | "smpte170m"

type VideoTransferCharacteristics = "bt709" | "iec61966-2-1" | "smpte170m"

type VoidFunction = js.Function0[Unit]

type WebGLPowerPreference = "default" | "high-performance" | "low-power"

type WebKitCSSMatrix = DOMMatrix

type WindowProxy = Window

type WorkerType = "classic" | "module"

type XMLHttpRequestBodyInit = Blob | BufferSource | FormData | URLSearchParams | java.lang.String

type XMLHttpRequestResponseType = "" | "arraybuffer" | "blob" | "document" | "json" | "text"

/** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
type XPathEvaluator = XPathEvaluatorBase

type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | LookupNamespaceURI

type webkitURL = URL
