package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stdLib {
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AlignSetting = stdLib.stdLibStrings.start | stdLib.stdLibStrings.center | stdLib.stdLibStrings.end | stdLib.stdLibStrings.left | stdLib.stdLibStrings.right
  type AnimationPlayState = stdLib.stdLibStrings.idle | stdLib.stdLibStrings.running | stdLib.stdLibStrings.paused | stdLib.stdLibStrings.finished
  type AppendMode = stdLib.stdLibStrings.segments | stdLib.stdLibStrings.sequence
  type ArrayBufferLike = /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBufferTypes))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBufferTypes))),List())))) */js.Any
  type AudioContextLatencyCategory = stdLib.stdLibStrings.balanced | stdLib.stdLibStrings.interactive | stdLib.stdLibStrings.playback
  type AudioContextState = stdLib.stdLibStrings.suspended | stdLib.stdLibStrings.running | stdLib.stdLibStrings.closed
  type AudioWorklet = Worklet
  type AutoKeyword = stdLib.stdLibStrings.auto
  type AutomationRate = stdLib.stdLibStrings.`a-rate` | stdLib.stdLibStrings.`k-rate`
  type BigInteger = Uint8Array
  type BinaryType = stdLib.stdLibStrings.blob | stdLib.stdLibStrings.arraybuffer
  type BiquadFilterType = stdLib.stdLibStrings.lowpass | stdLib.stdLibStrings.highpass | stdLib.stdLibStrings.bandpass | stdLib.stdLibStrings.lowshelf | stdLib.stdLibStrings.highshelf | stdLib.stdLibStrings.peaking | stdLib.stdLibStrings.notch | stdLib.stdLibStrings.allpass
  type BlobCallback = js.Function1[/* blob */ Blob | scala.Null, scala.Unit]
  type BlobPart = BufferSource | Blob | java.lang.String
  type BodyInit = Blob | BufferSource | FormData | URLSearchParams | ReadableStream[Uint8Array] | java.lang.String
  type BufferSource = ArrayBufferView | ArrayBuffer
  type CDATASection = Text
  type CSSSupportsRule = CSSConditionRule
  type CanPlayTypeResult = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.maybe | stdLib.stdLibStrings.probably
  type CanvasDirection = stdLib.stdLibStrings.ltr | stdLib.stdLibStrings.rtl | stdLib.stdLibStrings.inherit
  type CanvasFillRule = stdLib.stdLibStrings.nonzero | stdLib.stdLibStrings.evenodd
  type CanvasImageSource = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap
  type CanvasLineCap = stdLib.stdLibStrings.butt | stdLib.stdLibStrings.round | stdLib.stdLibStrings.square
  type CanvasLineJoin = stdLib.stdLibStrings.round | stdLib.stdLibStrings.bevel | stdLib.stdLibStrings.miter
  type CanvasTextAlign = stdLib.stdLibStrings.start | stdLib.stdLibStrings.end | stdLib.stdLibStrings.left | stdLib.stdLibStrings.right | stdLib.stdLibStrings.center
  type CanvasTextBaseline = stdLib.stdLibStrings.top | stdLib.stdLibStrings.hanging | stdLib.stdLibStrings.middle | stdLib.stdLibStrings.alphabetic | stdLib.stdLibStrings.ideographic | stdLib.stdLibStrings.bottom
  type ChannelCountMode = stdLib.stdLibStrings.max | stdLib.stdLibStrings.`clamped-max` | stdLib.stdLibStrings.explicit
  type ChannelInterpretation = stdLib.stdLibStrings.speakers | stdLib.stdLibStrings.discrete
  type ChannelMergerNode = AudioNode
  type ChannelSplitterNode = AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type ClientTypes = stdLib.stdLibStrings.window | stdLib.stdLibStrings.worker | stdLib.stdLibStrings.sharedworker | stdLib.stdLibStrings.all
  type Comment = CharacterData
  type CompositeOperation = stdLib.stdLibStrings.replace | stdLib.stdLibStrings.add | stdLib.stdLibStrings.accumulate
  type CompositeOperationOrAuto = stdLib.stdLibStrings.replace | stdLib.stdLibStrings.add | stdLib.stdLibStrings.accumulate | stdLib.stdLibStrings.auto
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
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
  type DirectionSetting = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.rl | stdLib.stdLibStrings.lr
  type DisplayCaptureSurfaceType = stdLib.stdLibStrings.monitor | stdLib.stdLibStrings.window | stdLib.stdLibStrings.application | stdLib.stdLibStrings.browser
  type DistanceModelType = stdLib.stdLibStrings.linear | stdLib.stdLibStrings.inverse | stdLib.stdLibStrings.exponential
  type DocumentReadyState = stdLib.stdLibStrings.loading | stdLib.stdLibStrings.interactive | stdLib.stdLibStrings.complete
  type DocumentTimeline = AnimationTimeline
  type EndOfStreamError = stdLib.stdLibStrings.network | stdLib.stdLibStrings.decode
  type EndingType = stdLib.stdLibStrings.transparent | stdLib.stdLibStrings.native
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
  type FillMode = stdLib.stdLibStrings.none | stdLib.stdLibStrings.forwards | stdLib.stdLibStrings.backwards | stdLib.stdLibStrings.both | stdLib.stdLibStrings.auto
  type Float32List = Float32Array | js.Array[GLfloat]
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
  type GamepadHand = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.left | stdLib.stdLibStrings.right
  type GamepadHapticActuatorType = stdLib.stdLibStrings.vibration
  type GamepadInputEmulationType = stdLib.stdLibStrings.mouse | stdLib.stdLibStrings.keyboard | stdLib.stdLibStrings.gamepad
  type GamepadMappingType = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.standard
  type Generator = Iterator[js.Any]
  type HTMLOrSVGImageElement = HTMLImageElement | SVGImageElement
  type HTMLOrSVGScriptElement = HTMLScriptElement | SVGScriptElement
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | (Record[java.lang.String, java.lang.String])
  type IDBCursorDirection = stdLib.stdLibStrings.next | stdLib.stdLibStrings.nextunique | stdLib.stdLibStrings.prev | stdLib.stdLibStrings.prevunique
  type IDBKeyPath = java.lang.String
  type IDBRequestReadyState = stdLib.stdLibStrings.pending | stdLib.stdLibStrings.done
  type IDBTransactionMode = stdLib.stdLibStrings.readonly | stdLib.stdLibStrings.readwrite | stdLib.stdLibStrings.versionchange
  type IDBValidKey = scala.Double | java.lang.String | Date | BufferSource | IDBArrayKey
  type ImageBitmapSource = CanvasImageSource | Blob | ImageData
  type ImageSmoothingQuality = stdLib.stdLibStrings.low | stdLib.stdLibStrings.medium | stdLib.stdLibStrings.high
  type InsertPosition = stdLib.stdLibStrings.beforebegin | stdLib.stdLibStrings.afterbegin | stdLib.stdLibStrings.beforeend | stdLib.stdLibStrings.afterend
  /**
   * Obtain the return type of a constructor function type
   */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type Int32List = Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    scala.Unit
  ]
  type IterationCompositeOperation = stdLib.stdLibStrings.replace | stdLib.stdLibStrings.accumulate
  type KeyFormat = stdLib.stdLibStrings.raw | stdLib.stdLibStrings.spki | stdLib.stdLibStrings.pkcs8 | stdLib.stdLibStrings.jwk
  type KeyType = stdLib.stdLibStrings.public | stdLib.stdLibStrings.`private` | stdLib.stdLibStrings.secret
  type KeyUsage = stdLib.stdLibStrings.encrypt | stdLib.stdLibStrings.decrypt | stdLib.stdLibStrings.sign | stdLib.stdLibStrings.verify | stdLib.stdLibStrings.deriveKey | stdLib.stdLibStrings.deriveBits | stdLib.stdLibStrings.wrapKey | stdLib.stdLibStrings.unwrapKey
  type LineAlignSetting = stdLib.stdLibStrings.start | stdLib.stdLibStrings.center | stdLib.stdLibStrings.end
  type LineAndPositionSetting = scala.Double | AutoKeyword
  type ListeningState = stdLib.stdLibStrings.inactive | stdLib.stdLibStrings.active | stdLib.stdLibStrings.disambiguation
  type MSCredentialType = stdLib.stdLibStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MSTransportType = stdLib.stdLibStrings.Embedded | stdLib.stdLibStrings.USB | stdLib.stdLibStrings.NFC | stdLib.stdLibStrings.BT
  type MSWebViewPermissionState = stdLib.stdLibStrings.unknown | stdLib.stdLibStrings.defer | stdLib.stdLibStrings.allow | stdLib.stdLibStrings.deny
  type MSWebViewPermissionType = stdLib.stdLibStrings.geolocation | stdLib.stdLibStrings.unlimitedIndexedDBQuota | stdLib.stdLibStrings.media | stdLib.stdLibStrings.pointerlock | stdLib.stdLibStrings.webnotifications
  type MediaDeviceKind = stdLib.stdLibStrings.audioinput | stdLib.stdLibStrings.audiooutput | stdLib.stdLibStrings.videoinput
  type MediaKeyMessageType = stdLib.stdLibStrings.`license-request` | stdLib.stdLibStrings.`license-renewal` | stdLib.stdLibStrings.`license-release` | stdLib.stdLibStrings.`individualization-request`
  type MediaKeySessionType = stdLib.stdLibStrings.temporary | stdLib.stdLibStrings.`persistent-license` | stdLib.stdLibStrings.`persistent-release-message`
  type MediaKeyStatus = stdLib.stdLibStrings.usable | stdLib.stdLibStrings.expired | stdLib.stdLibStrings.`output-downscaled` | stdLib.stdLibStrings.`output-not-allowed` | stdLib.stdLibStrings.`status-pending` | stdLib.stdLibStrings.`internal-error`
  type MediaKeysRequirement = stdLib.stdLibStrings.required | stdLib.stdLibStrings.optional | stdLib.stdLibStrings.`not-allowed`
  type MediaStreamTrackAudioSourceNode = AudioNode
  type MediaStreamTrackState = stdLib.stdLibStrings.live | stdLib.stdLibStrings.ended
  type MessageEventSource = WindowProxy | MessagePort | ServiceWorker
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[MutationRecord], 
    /* observer */ MutationObserver, 
    scala.Unit
  ]
  type MutationRecordType = stdLib.stdLibStrings.attributes | stdLib.stdLibStrings.characterData | stdLib.stdLibStrings.childList
  type NamedCurve = java.lang.String
  type NavigationReason = stdLib.stdLibStrings.up | stdLib.stdLibStrings.down | stdLib.stdLibStrings.left | stdLib.stdLibStrings.right
  type NavigationType = stdLib.stdLibStrings.navigate | stdLib.stdLibStrings.reload | stdLib.stdLibStrings.back_forward | stdLib.stdLibStrings.prerender
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, scala.Unit]
  /**
   * Exclude null and undefined from T
   */
  type NonNullable[T] = T
  type NotificationDirection = stdLib.stdLibStrings.auto | stdLib.stdLibStrings.ltr | stdLib.stdLibStrings.rtl
  type NotificationPermission = stdLib.stdLibStrings.default | stdLib.stdLibStrings.denied | stdLib.stdLibStrings.granted
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, scala.Unit]
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
  type OrientationLockType = stdLib.stdLibStrings.any | stdLib.stdLibStrings.natural | stdLib.stdLibStrings.landscape | stdLib.stdLibStrings.portrait | stdLib.stdLibStrings.`portrait-primary` | stdLib.stdLibStrings.`portrait-secondary` | stdLib.stdLibStrings.`landscape-primary` | stdLib.stdLibStrings.`landscape-secondary`
  type OrientationType = stdLib.stdLibStrings.`portrait-primary` | stdLib.stdLibStrings.`portrait-secondary` | stdLib.stdLibStrings.`landscape-primary` | stdLib.stdLibStrings.`landscape-secondary`
  type OscillatorType = stdLib.stdLibStrings.sine | stdLib.stdLibStrings.square | stdLib.stdLibStrings.sawtooth | stdLib.stdLibStrings.triangle | stdLib.stdLibStrings.custom
  type OverSampleType = stdLib.stdLibStrings.none | stdLib.stdLibStrings.`2x` | stdLib.stdLibStrings.`4x`
  type PanningModelType = stdLib.stdLibStrings.equalpower | stdLib.stdLibStrings.HRTF
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
   * Obtain the parameters of a function type in a tuple
   */
  type Parameters[T /* <: js.Function1[/* repeated */js.Any, _] */] = js.Any
  /**
   * Make all properties in T optional
   */
  type Partial[T] = stdLib.stdLibStrings.Partial with T
  type PaymentComplete = stdLib.stdLibStrings.success | stdLib.stdLibStrings.fail | stdLib.stdLibStrings.unknown
  type PaymentRequestUpdateEventInit = EventInit
  type PaymentShippingType = stdLib.stdLibStrings.shipping | stdLib.stdLibStrings.delivery | stdLib.stdLibStrings.pickup
  type PerformanceEntryList = js.Array[PerformanceEntry]
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
  type Pick[T, K /* <: java.lang.String */] = stdLib.stdLibStrings.Pick with T
  type PlaybackDirection = stdLib.stdLibStrings.normal | stdLib.stdLibStrings.reverse | stdLib.stdLibStrings.alternate | stdLib.stdLibStrings.`alternate-reverse`
  type PositionAlignSetting = stdLib.stdLibStrings.`line-left` | stdLib.stdLibStrings.center | stdLib.stdLibStrings.`line-right` | stdLib.stdLibStrings.auto
  type PositionCallback = js.Function1[/* position */ Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ PositionError, scala.Unit]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type PushEncryptionKeyName = stdLib.stdLibStrings.p256dh | stdLib.stdLibStrings.auth
  type PushPermissionState = stdLib.stdLibStrings.denied | stdLib.stdLibStrings.granted | stdLib.stdLibStrings.prompt
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCBundlePolicy = stdLib.stdLibStrings.balanced | stdLib.stdLibStrings.`max-compat` | stdLib.stdLibStrings.`max-bundle`
  type RTCDataChannelState = stdLib.stdLibStrings.connecting | stdLib.stdLibStrings.open | stdLib.stdLibStrings.closing | stdLib.stdLibStrings.closed
  type RTCDegradationPreference = stdLib.stdLibStrings.`maintain-framerate` | stdLib.stdLibStrings.`maintain-resolution` | stdLib.stdLibStrings.balanced
  type RTCDtlsRole = stdLib.stdLibStrings.auto | stdLib.stdLibStrings.client | stdLib.stdLibStrings.server
  type RTCDtlsTransportState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.connecting | stdLib.stdLibStrings.connected | stdLib.stdLibStrings.closed | stdLib.stdLibStrings.failed
  type RTCDtxStatus = stdLib.stdLibStrings.disabled | stdLib.stdLibStrings.enabled
  type RTCErrorDetailType = stdLib.stdLibStrings.`data-channel-failure` | stdLib.stdLibStrings.`dtls-failure` | stdLib.stdLibStrings.`fingerprint-failure` | stdLib.stdLibStrings.`idp-bad-script-failure` | stdLib.stdLibStrings.`idp-execution-failure` | stdLib.stdLibStrings.`idp-load-failure` | stdLib.stdLibStrings.`idp-need-login` | stdLib.stdLibStrings.`idp-timeout` | stdLib.stdLibStrings.`idp-tls-failure` | stdLib.stdLibStrings.`idp-token-expired` | stdLib.stdLibStrings.`idp-token-invalid` | stdLib.stdLibStrings.`sctp-failure` | stdLib.stdLibStrings.`sdp-syntax-error` | stdLib.stdLibStrings.`hardware-encoder-not-available` | stdLib.stdLibStrings.`hardware-encoder-error`
  type RTCIceCandidateType = stdLib.stdLibStrings.host | stdLib.stdLibStrings.srflx | stdLib.stdLibStrings.prflx | stdLib.stdLibStrings.relay
  type RTCIceComponent = stdLib.stdLibStrings.rtp | stdLib.stdLibStrings.rtcp
  type RTCIceConnectionState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.checking | stdLib.stdLibStrings.connected | stdLib.stdLibStrings.completed | stdLib.stdLibStrings.disconnected | stdLib.stdLibStrings.failed | stdLib.stdLibStrings.closed
  type RTCIceCredentialType = stdLib.stdLibStrings.password | stdLib.stdLibStrings.oauth
  type RTCIceGatherCandidate = RTCIceCandidateDictionary | RTCIceCandidateComplete
  type RTCIceGatherPolicy = stdLib.stdLibStrings.all | stdLib.stdLibStrings.nohost | stdLib.stdLibStrings.relay
  type RTCIceGathererState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.gathering | stdLib.stdLibStrings.complete
  type RTCIceGatheringState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.gathering | stdLib.stdLibStrings.complete
  type RTCIceProtocol = stdLib.stdLibStrings.udp | stdLib.stdLibStrings.tcp
  type RTCIceRole = stdLib.stdLibStrings.controlling | stdLib.stdLibStrings.controlled
  type RTCIceTcpCandidateType = stdLib.stdLibStrings.active | stdLib.stdLibStrings.passive | stdLib.stdLibStrings.so
  type RTCIceTransportPolicy = stdLib.stdLibStrings.relay | stdLib.stdLibStrings.all
  type RTCIceTransportState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.checking | stdLib.stdLibStrings.connected | stdLib.stdLibStrings.completed | stdLib.stdLibStrings.disconnected | stdLib.stdLibStrings.failed | stdLib.stdLibStrings.closed
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type RTCPeerConnectionState = stdLib.stdLibStrings.`new` | stdLib.stdLibStrings.connecting | stdLib.stdLibStrings.connected | stdLib.stdLibStrings.disconnected | stdLib.stdLibStrings.failed | stdLib.stdLibStrings.closed
  type RTCPriorityType = stdLib.stdLibStrings.`very-low` | stdLib.stdLibStrings.low | stdLib.stdLibStrings.medium | stdLib.stdLibStrings.high
  type RTCRtcpMuxPolicy = stdLib.stdLibStrings.negotiate | stdLib.stdLibStrings.require
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCRtpTransceiverDirection = stdLib.stdLibStrings.sendrecv | stdLib.stdLibStrings.sendonly | stdLib.stdLibStrings.recvonly | stdLib.stdLibStrings.inactive
  type RTCSctpTransportState = stdLib.stdLibStrings.connecting | stdLib.stdLibStrings.connected | stdLib.stdLibStrings.closed
  type RTCSdpType = stdLib.stdLibStrings.offer | stdLib.stdLibStrings.pranswer | stdLib.stdLibStrings.answer | stdLib.stdLibStrings.rollback
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, scala.Unit]
  type RTCSignalingState = stdLib.stdLibStrings.stable | stdLib.stdLibStrings.`have-local-offer` | stdLib.stdLibStrings.`have-remote-offer` | stdLib.stdLibStrings.`have-local-pranswer` | stdLib.stdLibStrings.`have-remote-pranswer` | stdLib.stdLibStrings.closed
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, scala.Unit]
  type RTCStatsIceCandidatePairState = stdLib.stdLibStrings.frozen | stdLib.stdLibStrings.waiting | stdLib.stdLibStrings.inprogress | stdLib.stdLibStrings.failed | stdLib.stdLibStrings.succeeded | stdLib.stdLibStrings.cancelled
  type RTCStatsIceCandidateType = stdLib.stdLibStrings.host | stdLib.stdLibStrings.serverreflexive | stdLib.stdLibStrings.peerreflexive | stdLib.stdLibStrings.relayed
  type RTCStatsType = stdLib.stdLibStrings.inboundrtp | stdLib.stdLibStrings.outboundrtp | stdLib.stdLibStrings.session | stdLib.stdLibStrings.datachannel | stdLib.stdLibStrings.track | stdLib.stdLibStrings.transport | stdLib.stdLibStrings.candidatepair | stdLib.stdLibStrings.localcandidate | stdLib.stdLibStrings.remotecandidate
  type RTCTransport = RTCDtlsTransport | RTCSrtpSdesTransport
  type RangeError = Error
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /**
   * Make all properties in T readonly
   */
  type Readonly[T] = stdLib.stdLibStrings.Readonly with T
  type ReadyState = stdLib.stdLibStrings.closed | stdLib.stdLibStrings.open | stdLib.stdLibStrings.ended
  /**
   * Construct a type with a set of properties K of type T
   */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[K]
  type ReferenceError = Error
  type ReferrerPolicy = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.`no-referrer` | stdLib.stdLibStrings.`no-referrer-when-downgrade` | stdLib.stdLibStrings.`origin-only` | stdLib.stdLibStrings.`origin-when-cross-origin` | stdLib.stdLibStrings.`unsafe-url`
  type RenderingContext = CanvasRenderingContext2D | ImageBitmapRenderingContext | WebGLRenderingContext
  type RequestCache = stdLib.stdLibStrings.default | stdLib.stdLibStrings.`no-store` | stdLib.stdLibStrings.reload | stdLib.stdLibStrings.`no-cache` | stdLib.stdLibStrings.`force-cache` | stdLib.stdLibStrings.`only-if-cached`
  type RequestCredentials = stdLib.stdLibStrings.omit | stdLib.stdLibStrings.`same-origin` | stdLib.stdLibStrings.include
  type RequestDestination = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.audio | stdLib.stdLibStrings.audioworklet | stdLib.stdLibStrings.document | stdLib.stdLibStrings.embed | stdLib.stdLibStrings.font | stdLib.stdLibStrings.image | stdLib.stdLibStrings.manifest | stdLib.stdLibStrings.`object` | stdLib.stdLibStrings.paintworklet | stdLib.stdLibStrings.report | stdLib.stdLibStrings.script | stdLib.stdLibStrings.sharedworker | stdLib.stdLibStrings.style | stdLib.stdLibStrings.track | stdLib.stdLibStrings.video | stdLib.stdLibStrings.worker | stdLib.stdLibStrings.xslt
  type RequestInfo = Request | java.lang.String
  type RequestMode = stdLib.stdLibStrings.navigate | stdLib.stdLibStrings.`same-origin` | stdLib.stdLibStrings.`no-cors` | stdLib.stdLibStrings.cors
  type RequestRedirect = stdLib.stdLibStrings.follow | stdLib.stdLibStrings.error | stdLib.stdLibStrings.manual
  /**
   * Make all properties in T required
   */
  type Required[T] = stdLib.stdLibStrings.Required with T
  type ResponseType = stdLib.stdLibStrings.basic | stdLib.stdLibStrings.cors | stdLib.stdLibStrings.default | stdLib.stdLibStrings.error | stdLib.stdLibStrings.opaque | stdLib.stdLibStrings.opaqueredirect
  /**
   * Obtain the return type of a function type
   */
  type ReturnType[T /* <: js.Function1[/* repeated */js.Any, _] */] = js.Any
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = stdLib.stdLibStrings.ScopedCred
  type ScrollBehavior = stdLib.stdLibStrings.auto | stdLib.stdLibStrings.smooth
  type ScrollLogicalPosition = stdLib.stdLibStrings.start | stdLib.stdLibStrings.center | stdLib.stdLibStrings.end | stdLib.stdLibStrings.nearest
  type ScrollRestoration = stdLib.stdLibStrings.auto | stdLib.stdLibStrings.manual
  type ScrollSetting = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.up
  type SelectionMode = stdLib.stdLibStrings.select | stdLib.stdLibStrings.start | stdLib.stdLibStrings.end | stdLib.stdLibStrings.preserve
  type ServiceWorkerState = stdLib.stdLibStrings.installing | stdLib.stdLibStrings.installed | stdLib.stdLibStrings.activating | stdLib.stdLibStrings.activated | stdLib.stdLibStrings.redundant
  type ServiceWorkerUpdateViaCache = stdLib.stdLibStrings.imports | stdLib.stdLibStrings.all | stdLib.stdLibStrings.none
  type ShadowRootMode = stdLib.stdLibStrings.open | stdLib.stdLibStrings.closed
  type SpeechRecognitionErrorCode = stdLib.stdLibStrings.`no-speech` | stdLib.stdLibStrings.aborted | stdLib.stdLibStrings.`audio-capture` | stdLib.stdLibStrings.network | stdLib.stdLibStrings.`not-allowed` | stdLib.stdLibStrings.`service-not-allowed` | stdLib.stdLibStrings.`bad-grammar` | stdLib.stdLibStrings.`language-not-supported`
  type SpeechSynthesisErrorCode = stdLib.stdLibStrings.canceled | stdLib.stdLibStrings.interrupted | stdLib.stdLibStrings.`audio-busy` | stdLib.stdLibStrings.`audio-hardware` | stdLib.stdLibStrings.network | stdLib.stdLibStrings.`synthesis-unavailable` | stdLib.stdLibStrings.`synthesis-failed` | stdLib.stdLibStrings.`language-unavailable` | stdLib.stdLibStrings.`voice-unavailable` | stdLib.stdLibStrings.`text-too-long` | stdLib.stdLibStrings.`invalid-argument`
  type StaticRange = AbstractRange
  type SupportedType = stdLib.stdLibStrings.`text/html` | stdLib.stdLibStrings.`text/xml` | stdLib.stdLibStrings.`application/xml` | stdLib.stdLibStrings.`application/xhtml+xml` | stdLib.stdLibStrings.`image/svg+xml`
  type SyntaxError = Error
  type TexImageSource = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
  type TextTrackKind = stdLib.stdLibStrings.subtitles | stdLib.stdLibStrings.captions | stdLib.stdLibStrings.descriptions | stdLib.stdLibStrings.chapters | stdLib.stdLibStrings.metadata
  type TextTrackMode = stdLib.stdLibStrings.disabled | stdLib.stdLibStrings.hidden | stdLib.stdLibStrings.showing
  type TimerHandler = java.lang.String | js.Function
  type TouchType = stdLib.stdLibStrings.direct | stdLib.stdLibStrings.stylus
  type Transferable = ArrayBuffer | MessagePort | ImageBitmap
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type Transport = stdLib.stdLibStrings.usb | stdLib.stdLibStrings.nfc | stdLib.stdLibStrings.ble
  type TypeError = Error
  type URIError = Error
  type VRDisplayEventReason = stdLib.stdLibStrings.mounted | stdLib.stdLibStrings.navigation | stdLib.stdLibStrings.requested | stdLib.stdLibStrings.unmounted
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VideoFacingModeEnum = stdLib.stdLibStrings.user | stdLib.stdLibStrings.environment | stdLib.stdLibStrings.left | stdLib.stdLibStrings.right
  type VisibilityState = stdLib.stdLibStrings.hidden | stdLib.stdLibStrings.visible | stdLib.stdLibStrings.prerender
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = WebGLObject
  type WebGLFramebuffer = WebGLObject
  type WebGLPowerPreference = stdLib.stdLibStrings.default | stdLib.stdLibStrings.`low-power` | stdLib.stdLibStrings.`high-performance`
  type WebGLProgram = WebGLObject
  type WebGLRenderbuffer = WebGLObject
  type WebGLRenderingContext = WebGLRenderingContextBase
  type WebGLShader = WebGLObject
  type WebGLTexture = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
  type WorkerType = stdLib.stdLibStrings.classic | stdLib.stdLibStrings.module
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type XMLHttpRequestResponseType = stdLib.stdLibStrings.Empty | stdLib.stdLibStrings.arraybuffer | stdLib.stdLibStrings.blob | stdLib.stdLibStrings.document | stdLib.stdLibStrings.json | stdLib.stdLibStrings.text
  type webkitURL = URL
}
