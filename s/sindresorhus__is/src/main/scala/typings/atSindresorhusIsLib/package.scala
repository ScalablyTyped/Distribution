package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atSindresorhusIsLib {
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AlignSetting = atSindresorhusIsLib.atSindresorhusIsLibStrings.start | atSindresorhusIsLib.atSindresorhusIsLibStrings.center | atSindresorhusIsLib.atSindresorhusIsLibStrings.end | atSindresorhusIsLib.atSindresorhusIsLibStrings.left | atSindresorhusIsLib.atSindresorhusIsLibStrings.right
  type AnimationPlayState = atSindresorhusIsLib.atSindresorhusIsLibStrings.idle | atSindresorhusIsLib.atSindresorhusIsLibStrings.running | atSindresorhusIsLib.atSindresorhusIsLibStrings.paused | atSindresorhusIsLib.atSindresorhusIsLibStrings.finished
  type AppendMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.segments | atSindresorhusIsLib.atSindresorhusIsLibStrings.sequence
  type ArrayBufferLike = SharedArrayBuffer | ArrayBuffer
  type AudioContextLatencyCategory = atSindresorhusIsLib.atSindresorhusIsLibStrings.balanced | atSindresorhusIsLib.atSindresorhusIsLibStrings.interactive | atSindresorhusIsLib.atSindresorhusIsLibStrings.playback
  type AudioContextState = atSindresorhusIsLib.atSindresorhusIsLibStrings.suspended | atSindresorhusIsLib.atSindresorhusIsLibStrings.running | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type AudioWorklet = Worklet
  type AutoKeyword = atSindresorhusIsLib.atSindresorhusIsLibStrings.auto
  type AutomationRate = atSindresorhusIsLib.atSindresorhusIsLibStrings.`a-rate` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`k-rate`
  type BigInteger = Uint8Array
  type BinaryType = atSindresorhusIsLib.atSindresorhusIsLibStrings.blob | atSindresorhusIsLib.atSindresorhusIsLibStrings.arraybuffer
  type BiquadFilterType = atSindresorhusIsLib.atSindresorhusIsLibStrings.lowpass | atSindresorhusIsLib.atSindresorhusIsLibStrings.highpass | atSindresorhusIsLib.atSindresorhusIsLibStrings.bandpass | atSindresorhusIsLib.atSindresorhusIsLibStrings.lowshelf | atSindresorhusIsLib.atSindresorhusIsLibStrings.highshelf | atSindresorhusIsLib.atSindresorhusIsLibStrings.peaking | atSindresorhusIsLib.atSindresorhusIsLibStrings.notch | atSindresorhusIsLib.atSindresorhusIsLibStrings.allpass
  type BlobCallback = js.Function1[/* blob */ Blob | scala.Null, scala.Unit]
  type BlobPart = BufferSource | Blob | java.lang.String
  type BodyInit = Blob | BufferSource | FormData | URLSearchParams | ReadableStream[Uint8Array] | java.lang.String
  type BufferSource = ArrayBufferView | ArrayBuffer
  type CDATASection = Text
  type CSSSupportsRule = CSSConditionRule
  type CanPlayTypeResult = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.maybe | atSindresorhusIsLib.atSindresorhusIsLibStrings.probably
  type CanvasDirection = atSindresorhusIsLib.atSindresorhusIsLibStrings.ltr | atSindresorhusIsLib.atSindresorhusIsLibStrings.rtl | atSindresorhusIsLib.atSindresorhusIsLibStrings.inherit
  type CanvasFillRule = atSindresorhusIsLib.atSindresorhusIsLibStrings.nonzero | atSindresorhusIsLib.atSindresorhusIsLibStrings.evenodd
  type CanvasImageSource = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap
  type CanvasLineCap = atSindresorhusIsLib.atSindresorhusIsLibStrings.butt | atSindresorhusIsLib.atSindresorhusIsLibStrings.round | atSindresorhusIsLib.atSindresorhusIsLibStrings.square
  type CanvasLineJoin = atSindresorhusIsLib.atSindresorhusIsLibStrings.round | atSindresorhusIsLib.atSindresorhusIsLibStrings.bevel | atSindresorhusIsLib.atSindresorhusIsLibStrings.miter
  type CanvasTextAlign = atSindresorhusIsLib.atSindresorhusIsLibStrings.start | atSindresorhusIsLib.atSindresorhusIsLibStrings.end | atSindresorhusIsLib.atSindresorhusIsLibStrings.left | atSindresorhusIsLib.atSindresorhusIsLibStrings.right | atSindresorhusIsLib.atSindresorhusIsLibStrings.center
  type CanvasTextBaseline = atSindresorhusIsLib.atSindresorhusIsLibStrings.top | atSindresorhusIsLib.atSindresorhusIsLibStrings.hanging | atSindresorhusIsLib.atSindresorhusIsLibStrings.middle | atSindresorhusIsLib.atSindresorhusIsLibStrings.alphabetic | atSindresorhusIsLib.atSindresorhusIsLibStrings.ideographic | atSindresorhusIsLib.atSindresorhusIsLibStrings.bottom
  type ChannelCountMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.max | atSindresorhusIsLib.atSindresorhusIsLibStrings.`clamped-max` | atSindresorhusIsLib.atSindresorhusIsLibStrings.explicit
  type ChannelInterpretation = atSindresorhusIsLib.atSindresorhusIsLibStrings.speakers | atSindresorhusIsLib.atSindresorhusIsLibStrings.discrete
  type ChannelMergerNode = AudioNode
  type ChannelSplitterNode = AudioNode
  type ClassDecorator = js.Function1[/* target */ Function, Function | scala.Unit]
  type ClientTypes = atSindresorhusIsLib.atSindresorhusIsLibStrings.window | atSindresorhusIsLib.atSindresorhusIsLibStrings.worker | atSindresorhusIsLib.atSindresorhusIsLibStrings.sharedworker | atSindresorhusIsLib.atSindresorhusIsLibStrings.all
  type Comment = CharacterData
  type CompositeOperation = atSindresorhusIsLib.atSindresorhusIsLibStrings.replace | atSindresorhusIsLib.atSindresorhusIsLibStrings.add | atSindresorhusIsLib.atSindresorhusIsLibStrings.accumulate
  type CompositeOperationOrAuto = atSindresorhusIsLib.atSindresorhusIsLibStrings.replace | atSindresorhusIsLib.atSindresorhusIsLibStrings.add | atSindresorhusIsLib.atSindresorhusIsLibStrings.accumulate | atSindresorhusIsLib.atSindresorhusIsLibStrings.auto
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | ConstrainDoubleRange
  type ConstrainLong = scala.Double | ConstrainLongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = scala.Double
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, scala.Unit]
  type DirectionSetting = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.rl | atSindresorhusIsLib.atSindresorhusIsLibStrings.lr
  type DisplayCaptureSurfaceType = atSindresorhusIsLib.atSindresorhusIsLibStrings.monitor | atSindresorhusIsLib.atSindresorhusIsLibStrings.window | atSindresorhusIsLib.atSindresorhusIsLibStrings.application | atSindresorhusIsLib.atSindresorhusIsLibStrings.browser
  type DistanceModelType = atSindresorhusIsLib.atSindresorhusIsLibStrings.linear | atSindresorhusIsLib.atSindresorhusIsLibStrings.inverse | atSindresorhusIsLib.atSindresorhusIsLibStrings.exponential
  type DocumentReadyState = atSindresorhusIsLib.atSindresorhusIsLibStrings.loading | atSindresorhusIsLib.atSindresorhusIsLibStrings.interactive | atSindresorhusIsLib.atSindresorhusIsLibStrings.complete
  type DocumentTimeline = AnimationTimeline
  type DomElement = js.Object with Anon_1
  type EndOfStreamError = atSindresorhusIsLib.atSindresorhusIsLibStrings.network | atSindresorhusIsLib.atSindresorhusIsLibStrings.decode
  type EndingType = atSindresorhusIsLib.atSindresorhusIsLibStrings.transparent | atSindresorhusIsLib.atSindresorhusIsLibStrings.native
  type ErrorEventHandler = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* fileno */ js.UndefOr[scala.Double], 
    /* columnNumber */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[Error], 
    scala.Unit
  ]
  type EvalError = Error
  type EventHandlerNonNull = js.Function1[/* event */ Event, js.Any]
  type EventListener = js.Function1[/* evt */ Event, scala.Unit]
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type FillMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.forwards | atSindresorhusIsLib.atSindresorhusIsLibStrings.backwards | atSindresorhusIsLib.atSindresorhusIsLibStrings.both | atSindresorhusIsLib.atSindresorhusIsLibStrings.auto
  type Float32List = Float32Array | Array[GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | scala.Null, 
    /* status */ MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GamepadHand = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.left | atSindresorhusIsLib.atSindresorhusIsLibStrings.right
  type GamepadHapticActuatorType = atSindresorhusIsLib.atSindresorhusIsLibStrings.vibration
  type GamepadInputEmulationType = atSindresorhusIsLib.atSindresorhusIsLibStrings.mouse | atSindresorhusIsLib.atSindresorhusIsLibStrings.keyboard | atSindresorhusIsLib.atSindresorhusIsLibStrings.gamepad
  type GamepadMappingType = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.standard
  type Generator = Iterator[js.Any]
  type HTMLOrSVGImageElement = HTMLImageElement | SVGImageElement
  type HTMLOrSVGScriptElement = HTMLScriptElement | SVGScriptElement
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | Array[Array[java.lang.String]] | (Record[java.lang.String, java.lang.String])
  type IDBCursorDirection = atSindresorhusIsLib.atSindresorhusIsLibStrings.next | atSindresorhusIsLib.atSindresorhusIsLibStrings.nextunique | atSindresorhusIsLib.atSindresorhusIsLibStrings.prev | atSindresorhusIsLib.atSindresorhusIsLibStrings.prevunique
  type IDBKeyPath = java.lang.String
  type IDBRequestReadyState = atSindresorhusIsLib.atSindresorhusIsLibStrings.pending | atSindresorhusIsLib.atSindresorhusIsLibStrings.done
  type IDBTransactionMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.readonly | atSindresorhusIsLib.atSindresorhusIsLibStrings.readwrite | atSindresorhusIsLib.atSindresorhusIsLibStrings.versionchange
  type IDBValidKey = scala.Double | java.lang.String | Date | BufferSource | IDBArrayKey
  type ImageBitmapSource = CanvasImageSource | Blob | ImageData
  type ImageSmoothingQuality = atSindresorhusIsLib.atSindresorhusIsLibStrings.low | atSindresorhusIsLib.atSindresorhusIsLibStrings.medium | atSindresorhusIsLib.atSindresorhusIsLibStrings.high
  type InsertPosition = atSindresorhusIsLib.atSindresorhusIsLibStrings.beforebegin | atSindresorhusIsLib.atSindresorhusIsLibStrings.afterbegin | atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeend | atSindresorhusIsLib.atSindresorhusIsLibStrings.afterend
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type Int32List = Int32Array | Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    scala.Unit
  ]
  type IterationCompositeOperation = atSindresorhusIsLib.atSindresorhusIsLibStrings.replace | atSindresorhusIsLib.atSindresorhusIsLibStrings.accumulate
  type KeyFormat = atSindresorhusIsLib.atSindresorhusIsLibStrings.raw | atSindresorhusIsLib.atSindresorhusIsLibStrings.spki | atSindresorhusIsLib.atSindresorhusIsLibStrings.pkcs8 | atSindresorhusIsLib.atSindresorhusIsLibStrings.jwk
  type KeyType = atSindresorhusIsLib.atSindresorhusIsLibStrings.public | atSindresorhusIsLib.atSindresorhusIsLibStrings.`private` | atSindresorhusIsLib.atSindresorhusIsLibStrings.secret
  type KeyUsage = atSindresorhusIsLib.atSindresorhusIsLibStrings.encrypt | atSindresorhusIsLib.atSindresorhusIsLibStrings.decrypt | atSindresorhusIsLib.atSindresorhusIsLibStrings.sign | atSindresorhusIsLib.atSindresorhusIsLibStrings.verify | atSindresorhusIsLib.atSindresorhusIsLibStrings.deriveKey | atSindresorhusIsLib.atSindresorhusIsLibStrings.deriveBits | atSindresorhusIsLib.atSindresorhusIsLibStrings.wrapKey | atSindresorhusIsLib.atSindresorhusIsLibStrings.unwrapKey
  type LineAlignSetting = atSindresorhusIsLib.atSindresorhusIsLibStrings.start | atSindresorhusIsLib.atSindresorhusIsLibStrings.center | atSindresorhusIsLib.atSindresorhusIsLibStrings.end
  type LineAndPositionSetting = scala.Double | AutoKeyword
  type ListeningState = atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive | atSindresorhusIsLib.atSindresorhusIsLibStrings.active | atSindresorhusIsLib.atSindresorhusIsLibStrings.disambiguation
  type MSCredentialType = atSindresorhusIsLib.atSindresorhusIsLibStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MSTransportType = atSindresorhusIsLib.atSindresorhusIsLibStrings.Embedded | atSindresorhusIsLib.atSindresorhusIsLibStrings.USB | atSindresorhusIsLib.atSindresorhusIsLibStrings.NFC | atSindresorhusIsLib.atSindresorhusIsLibStrings.BT
  type MSWebViewPermissionState = atSindresorhusIsLib.atSindresorhusIsLibStrings.unknown | atSindresorhusIsLib.atSindresorhusIsLibStrings.defer | atSindresorhusIsLib.atSindresorhusIsLibStrings.allow | atSindresorhusIsLib.atSindresorhusIsLibStrings.deny
  type MSWebViewPermissionType = atSindresorhusIsLib.atSindresorhusIsLibStrings.geolocation | atSindresorhusIsLib.atSindresorhusIsLibStrings.unlimitedIndexedDBQuota | atSindresorhusIsLib.atSindresorhusIsLibStrings.media | atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerlock | atSindresorhusIsLib.atSindresorhusIsLibStrings.webnotifications
  type MediaDeviceKind = atSindresorhusIsLib.atSindresorhusIsLibStrings.audioinput | atSindresorhusIsLib.atSindresorhusIsLibStrings.audiooutput | atSindresorhusIsLib.atSindresorhusIsLibStrings.videoinput
  type MediaKeyMessageType = atSindresorhusIsLib.atSindresorhusIsLibStrings.`license-request` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`license-renewal` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`license-release` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`individualization-request`
  type MediaKeySessionType = atSindresorhusIsLib.atSindresorhusIsLibStrings.temporary | atSindresorhusIsLib.atSindresorhusIsLibStrings.`persistent-license` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`persistent-release-message`
  type MediaKeyStatus = atSindresorhusIsLib.atSindresorhusIsLibStrings.usable | atSindresorhusIsLib.atSindresorhusIsLibStrings.expired | atSindresorhusIsLib.atSindresorhusIsLibStrings.`output-downscaled` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`output-not-allowed` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`status-pending` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`internal-error`
  type MediaKeysRequirement = atSindresorhusIsLib.atSindresorhusIsLibStrings.required | atSindresorhusIsLib.atSindresorhusIsLibStrings.optional | atSindresorhusIsLib.atSindresorhusIsLibStrings.`not-allowed`
  type MediaStreamTrackAudioSourceNode = AudioNode
  type MediaStreamTrackState = atSindresorhusIsLib.atSindresorhusIsLibStrings.live | atSindresorhusIsLib.atSindresorhusIsLibStrings.ended
  type MessageEventSource = WindowProxy | MessagePort | ServiceWorker
  type MethodDecorator = js.Function3[
    /* target */ Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = WheelEvent
  type MutationCallback = js.Function2[/* mutations */ Array[MutationRecord], /* observer */ MutationObserver, scala.Unit]
  type MutationRecordType = atSindresorhusIsLib.atSindresorhusIsLibStrings.attributes | atSindresorhusIsLib.atSindresorhusIsLibStrings.characterData | atSindresorhusIsLib.atSindresorhusIsLibStrings.childList
  type NamedCurve = java.lang.String
  type NavigationReason = atSindresorhusIsLib.atSindresorhusIsLibStrings.up | atSindresorhusIsLib.atSindresorhusIsLibStrings.down | atSindresorhusIsLib.atSindresorhusIsLibStrings.left | atSindresorhusIsLib.atSindresorhusIsLibStrings.right
  type NavigationType = atSindresorhusIsLib.atSindresorhusIsLibStrings.navigate | atSindresorhusIsLib.atSindresorhusIsLibStrings.reload | atSindresorhusIsLib.atSindresorhusIsLibStrings.back_forward | atSindresorhusIsLib.atSindresorhusIsLibStrings.prerender
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, scala.Unit]
  type NodeStream = js.Object with Anon_Pipe
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationDirection = atSindresorhusIsLib.atSindresorhusIsLibStrings.auto | atSindresorhusIsLib.atSindresorhusIsLibStrings.ltr | atSindresorhusIsLib.atSindresorhusIsLibStrings.rtl
  type NotificationPermission = atSindresorhusIsLib.atSindresorhusIsLibStrings.default | atSindresorhusIsLib.atSindresorhusIsLibStrings.denied | atSindresorhusIsLib.atSindresorhusIsLibStrings.granted
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, scala.Unit]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | scala.Null]
  type OnErrorEventHandler = OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Any], 
    js.Any
  ]
  type OrientationLockType = atSindresorhusIsLib.atSindresorhusIsLibStrings.any | atSindresorhusIsLib.atSindresorhusIsLibStrings.natural | atSindresorhusIsLib.atSindresorhusIsLibStrings.landscape | atSindresorhusIsLib.atSindresorhusIsLibStrings.portrait | atSindresorhusIsLib.atSindresorhusIsLibStrings.`portrait-primary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`portrait-secondary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`landscape-primary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`landscape-secondary`
  type OrientationType = atSindresorhusIsLib.atSindresorhusIsLibStrings.`portrait-primary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`portrait-secondary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`landscape-primary` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`landscape-secondary`
  type OscillatorType = atSindresorhusIsLib.atSindresorhusIsLibStrings.sine | atSindresorhusIsLib.atSindresorhusIsLibStrings.square | atSindresorhusIsLib.atSindresorhusIsLibStrings.sawtooth | atSindresorhusIsLib.atSindresorhusIsLibStrings.triangle | atSindresorhusIsLib.atSindresorhusIsLibStrings.custom
  type OverSampleType = atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.`2x` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`4x`
  type PanningModelType = atSindresorhusIsLib.atSindresorhusIsLibStrings.equalpower | atSindresorhusIsLib.atSindresorhusIsLibStrings.HRTF
  type ParameterDecorator = js.Function3[
    /* target */ Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = atSindresorhusIsLib.atSindresorhusIsLibStrings.Partial with T
  type PaymentComplete = atSindresorhusIsLib.atSindresorhusIsLibStrings.success | atSindresorhusIsLib.atSindresorhusIsLibStrings.fail | atSindresorhusIsLib.atSindresorhusIsLibStrings.unknown
  type PaymentRequestUpdateEventInit = EventInit
  type PaymentShippingType = atSindresorhusIsLib.atSindresorhusIsLibStrings.shipping | atSindresorhusIsLib.atSindresorhusIsLibStrings.delivery | atSindresorhusIsLib.atSindresorhusIsLibStrings.pickup
  type PerformanceEntryList = Array[PerformanceEntry]
  type PerformanceMark = PerformanceEntry
  type PerformanceMeasure = PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ PerformanceObserverEntryList, 
    /* observer */ PerformanceObserver, 
    scala.Unit
  ]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = atSindresorhusIsLib.atSindresorhusIsLibStrings.Pick with T
  type PlaybackDirection = atSindresorhusIsLib.atSindresorhusIsLibStrings.normal | atSindresorhusIsLib.atSindresorhusIsLibStrings.reverse | atSindresorhusIsLib.atSindresorhusIsLibStrings.alternate | atSindresorhusIsLib.atSindresorhusIsLibStrings.`alternate-reverse`
  type PositionAlignSetting = atSindresorhusIsLib.atSindresorhusIsLibStrings.`line-left` | atSindresorhusIsLib.atSindresorhusIsLibStrings.center | atSindresorhusIsLib.atSindresorhusIsLibStrings.`line-right` | atSindresorhusIsLib.atSindresorhusIsLibStrings.auto
  type PositionCallback = js.Function1[/* position */ Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ PositionError, scala.Unit]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | Symbol]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    PromiseLike[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type PushEncryptionKeyName = atSindresorhusIsLib.atSindresorhusIsLibStrings.p256dh | atSindresorhusIsLib.atSindresorhusIsLibStrings.auth
  type PushPermissionState = atSindresorhusIsLib.atSindresorhusIsLibStrings.denied | atSindresorhusIsLib.atSindresorhusIsLibStrings.granted | atSindresorhusIsLib.atSindresorhusIsLibStrings.prompt
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCBundlePolicy = atSindresorhusIsLib.atSindresorhusIsLibStrings.balanced | atSindresorhusIsLib.atSindresorhusIsLibStrings.`max-compat` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`max-bundle`
  type RTCDataChannelState = atSindresorhusIsLib.atSindresorhusIsLibStrings.connecting | atSindresorhusIsLib.atSindresorhusIsLibStrings.open | atSindresorhusIsLib.atSindresorhusIsLibStrings.closing | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCDegradationPreference = atSindresorhusIsLib.atSindresorhusIsLibStrings.`maintain-framerate` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`maintain-resolution` | atSindresorhusIsLib.atSindresorhusIsLibStrings.balanced
  type RTCDtlsRole = atSindresorhusIsLib.atSindresorhusIsLibStrings.auto | atSindresorhusIsLib.atSindresorhusIsLibStrings.client | atSindresorhusIsLib.atSindresorhusIsLibStrings.server
  type RTCDtlsTransportState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.connecting | atSindresorhusIsLib.atSindresorhusIsLibStrings.connected | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed | atSindresorhusIsLib.atSindresorhusIsLibStrings.failed
  type RTCDtxStatus = atSindresorhusIsLib.atSindresorhusIsLibStrings.disabled | atSindresorhusIsLib.atSindresorhusIsLibStrings.enabled
  type RTCErrorDetailType = atSindresorhusIsLib.atSindresorhusIsLibStrings.`data-channel-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`dtls-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`fingerprint-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-bad-script-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-execution-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-load-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-need-login` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-timeout` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-tls-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-token-expired` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`idp-token-invalid` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`sctp-failure` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`sdp-syntax-error` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`hardware-encoder-not-available` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`hardware-encoder-error`
  type RTCIceCandidateType = atSindresorhusIsLib.atSindresorhusIsLibStrings.host | atSindresorhusIsLib.atSindresorhusIsLibStrings.srflx | atSindresorhusIsLib.atSindresorhusIsLibStrings.prflx | atSindresorhusIsLib.atSindresorhusIsLibStrings.relay
  type RTCIceComponent = atSindresorhusIsLib.atSindresorhusIsLibStrings.rtp | atSindresorhusIsLib.atSindresorhusIsLibStrings.rtcp
  type RTCIceConnectionState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.checking | atSindresorhusIsLib.atSindresorhusIsLibStrings.connected | atSindresorhusIsLib.atSindresorhusIsLibStrings.completed | atSindresorhusIsLib.atSindresorhusIsLibStrings.disconnected | atSindresorhusIsLib.atSindresorhusIsLibStrings.failed | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCIceCredentialType = atSindresorhusIsLib.atSindresorhusIsLibStrings.password | atSindresorhusIsLib.atSindresorhusIsLibStrings.oauth
  type RTCIceGatherCandidate = RTCIceCandidateDictionary | RTCIceCandidateComplete
  type RTCIceGatherPolicy = atSindresorhusIsLib.atSindresorhusIsLibStrings.all | atSindresorhusIsLib.atSindresorhusIsLibStrings.nohost | atSindresorhusIsLib.atSindresorhusIsLibStrings.relay
  type RTCIceGathererState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.gathering | atSindresorhusIsLib.atSindresorhusIsLibStrings.complete
  type RTCIceGatheringState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.gathering | atSindresorhusIsLib.atSindresorhusIsLibStrings.complete
  type RTCIceProtocol = atSindresorhusIsLib.atSindresorhusIsLibStrings.udp | atSindresorhusIsLib.atSindresorhusIsLibStrings.tcp
  type RTCIceRole = atSindresorhusIsLib.atSindresorhusIsLibStrings.controlling | atSindresorhusIsLib.atSindresorhusIsLibStrings.controlled
  type RTCIceTcpCandidateType = atSindresorhusIsLib.atSindresorhusIsLibStrings.active | atSindresorhusIsLib.atSindresorhusIsLibStrings.passive | atSindresorhusIsLib.atSindresorhusIsLibStrings.so
  type RTCIceTransportPolicy = atSindresorhusIsLib.atSindresorhusIsLibStrings.relay | atSindresorhusIsLib.atSindresorhusIsLibStrings.all
  type RTCIceTransportState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.checking | atSindresorhusIsLib.atSindresorhusIsLibStrings.connected | atSindresorhusIsLib.atSindresorhusIsLibStrings.completed | atSindresorhusIsLib.atSindresorhusIsLibStrings.disconnected | atSindresorhusIsLib.atSindresorhusIsLibStrings.failed | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type RTCPeerConnectionState = atSindresorhusIsLib.atSindresorhusIsLibStrings.`new` | atSindresorhusIsLib.atSindresorhusIsLibStrings.connecting | atSindresorhusIsLib.atSindresorhusIsLibStrings.connected | atSindresorhusIsLib.atSindresorhusIsLibStrings.disconnected | atSindresorhusIsLib.atSindresorhusIsLibStrings.failed | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCPriorityType = atSindresorhusIsLib.atSindresorhusIsLibStrings.`very-low` | atSindresorhusIsLib.atSindresorhusIsLibStrings.low | atSindresorhusIsLib.atSindresorhusIsLibStrings.medium | atSindresorhusIsLib.atSindresorhusIsLibStrings.high
  type RTCRtcpMuxPolicy = atSindresorhusIsLib.atSindresorhusIsLibStrings.negotiate | atSindresorhusIsLib.atSindresorhusIsLibStrings.require
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCRtpTransceiverDirection = atSindresorhusIsLib.atSindresorhusIsLibStrings.sendrecv | atSindresorhusIsLib.atSindresorhusIsLibStrings.sendonly | atSindresorhusIsLib.atSindresorhusIsLibStrings.recvonly | atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive
  type RTCSctpTransportState = atSindresorhusIsLib.atSindresorhusIsLibStrings.connecting | atSindresorhusIsLib.atSindresorhusIsLibStrings.connected | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCSdpType = atSindresorhusIsLib.atSindresorhusIsLibStrings.offer | atSindresorhusIsLib.atSindresorhusIsLibStrings.pranswer | atSindresorhusIsLib.atSindresorhusIsLibStrings.answer | atSindresorhusIsLib.atSindresorhusIsLibStrings.rollback
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, scala.Unit]
  type RTCSignalingState = atSindresorhusIsLib.atSindresorhusIsLibStrings.stable | atSindresorhusIsLib.atSindresorhusIsLibStrings.`have-local-offer` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`have-remote-offer` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`have-local-pranswer` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`have-remote-pranswer` | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, scala.Unit]
  type RTCStatsIceCandidatePairState = atSindresorhusIsLib.atSindresorhusIsLibStrings.frozen | atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting | atSindresorhusIsLib.atSindresorhusIsLibStrings.inprogress | atSindresorhusIsLib.atSindresorhusIsLibStrings.failed | atSindresorhusIsLib.atSindresorhusIsLibStrings.succeeded | atSindresorhusIsLib.atSindresorhusIsLibStrings.cancelled
  type RTCStatsIceCandidateType = atSindresorhusIsLib.atSindresorhusIsLibStrings.host | atSindresorhusIsLib.atSindresorhusIsLibStrings.serverreflexive | atSindresorhusIsLib.atSindresorhusIsLibStrings.peerreflexive | atSindresorhusIsLib.atSindresorhusIsLibStrings.relayed
  type RTCStatsType = atSindresorhusIsLib.atSindresorhusIsLibStrings.inboundrtp | atSindresorhusIsLib.atSindresorhusIsLibStrings.outboundrtp | atSindresorhusIsLib.atSindresorhusIsLibStrings.session | atSindresorhusIsLib.atSindresorhusIsLibStrings.datachannel | atSindresorhusIsLib.atSindresorhusIsLibStrings.track | atSindresorhusIsLib.atSindresorhusIsLibStrings.transport | atSindresorhusIsLib.atSindresorhusIsLibStrings.candidatepair | atSindresorhusIsLib.atSindresorhusIsLibStrings.localcandidate | atSindresorhusIsLib.atSindresorhusIsLibStrings.remotecandidate
  type RTCTransport = RTCDtlsTransport | RTCSrtpSdesTransport
  type RangeError = Error
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ ReadableByteStreamController, 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ ReadableStreamDefaultController[R], 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | PromiseLike[scala.Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = atSindresorhusIsLib.atSindresorhusIsLibStrings.Readonly with T
  type ReadyState = atSindresorhusIsLib.atSindresorhusIsLibStrings.closed | atSindresorhusIsLib.atSindresorhusIsLibStrings.open | atSindresorhusIsLib.atSindresorhusIsLibStrings.ended
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[K]
  type ReferenceError = Error
  type ReferrerPolicy = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-referrer` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-referrer-when-downgrade` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`origin-only` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`origin-when-cross-origin` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`unsafe-url`
  type RenderingContext = CanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext
  type RequestCache = atSindresorhusIsLib.atSindresorhusIsLibStrings.default | atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-store` | atSindresorhusIsLib.atSindresorhusIsLibStrings.reload | atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-cache` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`force-cache` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`only-if-cached`
  type RequestCredentials = atSindresorhusIsLib.atSindresorhusIsLibStrings.omit | atSindresorhusIsLib.atSindresorhusIsLibStrings.`same-origin` | atSindresorhusIsLib.atSindresorhusIsLibStrings.include
  type RequestDestination = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.audio | atSindresorhusIsLib.atSindresorhusIsLibStrings.audioworklet | atSindresorhusIsLib.atSindresorhusIsLibStrings.document | atSindresorhusIsLib.atSindresorhusIsLibStrings.embed | atSindresorhusIsLib.atSindresorhusIsLibStrings.font | atSindresorhusIsLib.atSindresorhusIsLibStrings.image | atSindresorhusIsLib.atSindresorhusIsLibStrings.manifest | atSindresorhusIsLib.atSindresorhusIsLibStrings.`object` | atSindresorhusIsLib.atSindresorhusIsLibStrings.paintworklet | atSindresorhusIsLib.atSindresorhusIsLibStrings.report | atSindresorhusIsLib.atSindresorhusIsLibStrings.script | atSindresorhusIsLib.atSindresorhusIsLibStrings.sharedworker | atSindresorhusIsLib.atSindresorhusIsLibStrings.style | atSindresorhusIsLib.atSindresorhusIsLibStrings.track | atSindresorhusIsLib.atSindresorhusIsLibStrings.video | atSindresorhusIsLib.atSindresorhusIsLibStrings.worker | atSindresorhusIsLib.atSindresorhusIsLibStrings.xslt
  type RequestInfo = Request | java.lang.String
  type RequestMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.navigate | atSindresorhusIsLib.atSindresorhusIsLibStrings.`same-origin` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-cors` | atSindresorhusIsLib.atSindresorhusIsLibStrings.cors
  type RequestRedirect = atSindresorhusIsLib.atSindresorhusIsLibStrings.follow | atSindresorhusIsLib.atSindresorhusIsLibStrings.error | atSindresorhusIsLib.atSindresorhusIsLibStrings.manual
  /**
    * Make all properties in T required
    */
  type Required[T] = atSindresorhusIsLib.atSindresorhusIsLibStrings.Required with T
  type ResponseType = atSindresorhusIsLib.atSindresorhusIsLibStrings.basic | atSindresorhusIsLib.atSindresorhusIsLibStrings.cors | atSindresorhusIsLib.atSindresorhusIsLibStrings.default | atSindresorhusIsLib.atSindresorhusIsLibStrings.error | atSindresorhusIsLib.atSindresorhusIsLibStrings.opaque | atSindresorhusIsLib.atSindresorhusIsLibStrings.opaqueredirect
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = atSindresorhusIsLib.atSindresorhusIsLibStrings.ScopedCred
  type ScrollBehavior = atSindresorhusIsLib.atSindresorhusIsLibStrings.auto | atSindresorhusIsLib.atSindresorhusIsLibStrings.smooth
  type ScrollLogicalPosition = atSindresorhusIsLib.atSindresorhusIsLibStrings.start | atSindresorhusIsLib.atSindresorhusIsLibStrings.center | atSindresorhusIsLib.atSindresorhusIsLibStrings.end | atSindresorhusIsLib.atSindresorhusIsLibStrings.nearest
  type ScrollRestoration = atSindresorhusIsLib.atSindresorhusIsLibStrings.auto | atSindresorhusIsLib.atSindresorhusIsLibStrings.manual
  type ScrollSetting = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.up
  type SelectionMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.select | atSindresorhusIsLib.atSindresorhusIsLibStrings.start | atSindresorhusIsLib.atSindresorhusIsLibStrings.end | atSindresorhusIsLib.atSindresorhusIsLibStrings.preserve
  type ServiceWorkerState = atSindresorhusIsLib.atSindresorhusIsLibStrings.installing | atSindresorhusIsLib.atSindresorhusIsLibStrings.installed | atSindresorhusIsLib.atSindresorhusIsLibStrings.activating | atSindresorhusIsLib.atSindresorhusIsLibStrings.activated | atSindresorhusIsLib.atSindresorhusIsLibStrings.redundant
  type ServiceWorkerUpdateViaCache = atSindresorhusIsLib.atSindresorhusIsLibStrings.imports | atSindresorhusIsLib.atSindresorhusIsLibStrings.all | atSindresorhusIsLib.atSindresorhusIsLibStrings.none
  type ShadowRootMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.open | atSindresorhusIsLib.atSindresorhusIsLibStrings.closed
  type SpeechRecognitionErrorCode = atSindresorhusIsLib.atSindresorhusIsLibStrings.`no-speech` | atSindresorhusIsLib.atSindresorhusIsLibStrings.aborted | atSindresorhusIsLib.atSindresorhusIsLibStrings.`audio-capture` | atSindresorhusIsLib.atSindresorhusIsLibStrings.network | atSindresorhusIsLib.atSindresorhusIsLibStrings.`not-allowed` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`service-not-allowed` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`bad-grammar` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`language-not-supported`
  type SpeechSynthesisErrorCode = atSindresorhusIsLib.atSindresorhusIsLibStrings.canceled | atSindresorhusIsLib.atSindresorhusIsLibStrings.interrupted | atSindresorhusIsLib.atSindresorhusIsLibStrings.`audio-busy` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`audio-hardware` | atSindresorhusIsLib.atSindresorhusIsLibStrings.network | atSindresorhusIsLib.atSindresorhusIsLibStrings.`synthesis-unavailable` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`synthesis-failed` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`language-unavailable` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`voice-unavailable` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`text-too-long` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`invalid-argument`
  type StaticRange = AbstractRange
  type SupportedType = atSindresorhusIsLib.atSindresorhusIsLibStrings.`text/html` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`text/xml` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`application/xml` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`application/xhtml+xml` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`image/svg+xml`
  type SyntaxError = Error
  type TexImageSource = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
  type TextTrackKind = atSindresorhusIsLib.atSindresorhusIsLibStrings.subtitles | atSindresorhusIsLib.atSindresorhusIsLibStrings.captions | atSindresorhusIsLib.atSindresorhusIsLibStrings.descriptions | atSindresorhusIsLib.atSindresorhusIsLibStrings.chapters | atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata
  type TextTrackMode = atSindresorhusIsLib.atSindresorhusIsLibStrings.disabled | atSindresorhusIsLib.atSindresorhusIsLibStrings.hidden | atSindresorhusIsLib.atSindresorhusIsLibStrings.showing
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | Function
  type TouchType = atSindresorhusIsLib.atSindresorhusIsLibStrings.direct | atSindresorhusIsLib.atSindresorhusIsLibStrings.stylus
  type Transferable = ArrayBuffer | MessagePort | ImageBitmap
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type Transport = atSindresorhusIsLib.atSindresorhusIsLibStrings.usb | atSindresorhusIsLib.atSindresorhusIsLibStrings.nfc | atSindresorhusIsLib.atSindresorhusIsLibStrings.ble
  type TypeError = Error
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
  type URIError = Error
  type VRDisplayEventReason = atSindresorhusIsLib.atSindresorhusIsLibStrings.mounted | atSindresorhusIsLib.atSindresorhusIsLibStrings.navigation | atSindresorhusIsLib.atSindresorhusIsLibStrings.requested | atSindresorhusIsLib.atSindresorhusIsLibStrings.unmounted
  type VibratePattern = scala.Double | Array[scala.Double]
  type VideoFacingModeEnum = atSindresorhusIsLib.atSindresorhusIsLibStrings.user | atSindresorhusIsLib.atSindresorhusIsLibStrings.environment | atSindresorhusIsLib.atSindresorhusIsLibStrings.left | atSindresorhusIsLib.atSindresorhusIsLibStrings.right
  type VisibilityState = atSindresorhusIsLib.atSindresorhusIsLibStrings.hidden | atSindresorhusIsLib.atSindresorhusIsLibStrings.visible | atSindresorhusIsLib.atSindresorhusIsLibStrings.prerender
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = WebGLObject
  type WebGLFramebuffer = WebGLObject
  type WebGLPowerPreference = atSindresorhusIsLib.atSindresorhusIsLibStrings.default | atSindresorhusIsLib.atSindresorhusIsLibStrings.`low-power` | atSindresorhusIsLib.atSindresorhusIsLibStrings.`high-performance`
  type WebGLProgram = WebGLObject
  type WebGLRenderbuffer = WebGLObject
  type WebGLRenderingContext = WebGLRenderingContextBase
  type WebGLShader = WebGLObject
  type WebGLTexture = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
  type WorkerType = atSindresorhusIsLib.atSindresorhusIsLibStrings.classic | atSindresorhusIsLib.atSindresorhusIsLibStrings.module
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | PromiseLike[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | PromiseLike[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | PromiseLike[scala.Unit]]
  type XMLHttpRequestResponseType = atSindresorhusIsLib.atSindresorhusIsLibStrings.Empty | atSindresorhusIsLib.atSindresorhusIsLibStrings.arraybuffer | atSindresorhusIsLib.atSindresorhusIsLibStrings.blob | atSindresorhusIsLib.atSindresorhusIsLibStrings.document | atSindresorhusIsLib.atSindresorhusIsLibStrings.json | atSindresorhusIsLib.atSindresorhusIsLibStrings.text
  type webkitURL = URL
}
