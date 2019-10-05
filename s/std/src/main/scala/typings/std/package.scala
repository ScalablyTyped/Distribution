package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.stdStrings.FIDO_2_0
  import typings.std.stdStrings.ScopedCred
  import typings.std.stdStrings.`public-key`
  import typings.std.stdStrings.auto
  import typings.std.stdStrings.vibration

  type AAGUID = BufferSource
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AudioWorklet = Worklet
  type AuthenticationExtensionsSupported = js.Array[java.lang.String]
  type AuthenticatorSelectionList = js.Array[AAGUID]
  type AutoKeyword = auto
  type BigInteger = Uint8Array
  type BlobCallback = js.Function1[/* blob */ Blob | Null, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.std.BufferSource
    - typings.std.Blob
    - java.lang.String
  */
  type BlobPart = _BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.std.Blob
    - typings.std.BufferSource
    - typings.std.FormData
    - typings.std.URLSearchParams
    - typings.std.ReadableStream[typings.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = _BodyInit | ReadableStream[Uint8Array] | java.lang.String
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = Text
  type COSEAlgorithmIdentifier = Double
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = CSSConditionRule
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = AudioNode
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = CharacterData
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = Double | ConstrainDoubleRange
  type ConstrainULong = Double | ConstrainULongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = Double
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = StringDictionary[js.UndefOr[java.lang.String]]
  type DOMTimeStamp = Double
  type DecodeErrorCallback = js.Function1[/* error */ DOMException, Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, Unit]
  type DocumentTimeline = AnimationTimeline
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = HTMLElementTagNameMap with (Pick[
    SVGElementTagNameMap, 
    Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ])
  type EvalError = Error
  type EventHandlerNonNull = js.Function1[/* event */ Event, js.Any]
  type EventListener = js.Function1[/* evt */ Event, Unit]
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type Float32List = Float32Array | js.Array[GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null, 
    /* status */ MediaKeyStatus, 
    Unit
  ]
  type FormDataEntryValue = File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ Double, Unit]
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
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | (Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - typings.std.Date
    - typings.std.BufferSource
    - typings.std.IDBArrayKey
  */
  type IDBValidKey = _IDBValidKey | Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type Int32List = Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    Unit
  ]
  type LineAndPositionSetting = Double | AutoKeyword
  type MSCredentialType = FIDO_2_0
  type MSLaunchUriCallback = js.Function0[Unit]
  type MediaStreamTrackAudioSourceNode = AudioNode
  /* Rewritten from type alias, can be one of: 
    - typings.std.WindowProxy
    - typings.std.MessagePort
    - typings.std.ServiceWorker
  */
  type MessageEventSource = _MessageEventSource | WindowProxy
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = WheelEvent
  type MutationCallback = js.Function2[/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver, Unit]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = Pick[T, Exclude[java.lang.String, K]]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | Null]
  type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[Double], 
    /* colno */ js.UndefOr[Double], 
    /* error */ js.UndefOr[Error], 
    js.Any
  ]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ Double, 
    Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.std.stdStrings.Partial with T
  type PaymentRequestUpdateEventInit = EventInit
  type PerformanceEntryList = js.Array[PerformanceEntry]
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = PerformanceEntry
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = PerformanceEntry
  type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typings.std.stdStrings.Pick with T
  type PositionCallback = js.Function1[/* position */ Position, Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ PositionError, Unit]
  type PromiseConstructorLike = Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]
  type PropertyDescriptorMap = StringDictionary[PropertyDescriptor]
  type PropertyKey = java.lang.String | Double | js.Symbol
  type PublicKeyCredentialType = `public-key`
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, Unit]
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, Unit]
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, Unit]
  type RangeError = Error
  type ReadableByteStreamControllerCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Thenable[Unit]]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | js.Thenable[Unit]]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, Unit | js.Thenable[Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typings.std.stdStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = StringDictionary[K]
  type ReferenceError = Error
  type RequestInfo = Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typings.std.stdStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = ScopedCred
  type StaticRange = AbstractRange
  type SyntaxError = Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Thenable[Unit]]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    Unit | js.Thenable[Unit]
  ]
  type TypeError = Error
  type URIError = Error
  type Uint32List = Uint32Array | js.Array[GLuint]
  type UvmEntries = js.Array[UvmEntry]
  type UvmEntry = js.Array[Double]
  type VibratePattern = Double | js.Array[Double]
  type VoidFunction = js.Function0[Unit]
  /** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = WebGLObject
  /** Part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = WebGLObject
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = WebGLObject
  type WebGLQuery = WebGLObject
  /** Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = WebGLObject
  type WebGLSampler = WebGLObject
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = WebGLObject
  type WebGLSync = WebGLObject
  /** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = WebGLObject
  type WebGLTransformFeedback = WebGLObject
  type WebGLVertexArrayObject = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
  type WritableStreamDefaultControllerCloseCallback = js.Function0[Unit | js.Thenable[Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Unit | js.Thenable[Unit]]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ WritableStreamDefaultController, 
    Unit | js.Thenable[Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, Unit | js.Thenable[Unit]]
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = XPathEvaluatorBase
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | Anon_LookupNamespaceURI
  type webkitURL = URL
}
