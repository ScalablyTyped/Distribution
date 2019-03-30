package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stdLib {
  type AlgorithmIdentifier = java.lang.String | Algorithm
  type AudioWorklet = Worklet
  type AutoKeyword = stdLib.stdLibStrings.auto
  type BigInteger = Uint8Array
  type BlobCallback = js.Function1[/* blob */ Blob | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - BufferSource
    - Blob
    - java.lang.String
  */
  type BlobPart = _BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - Blob
    - BufferSource
    - FormData
    - URLSearchParams
    - ReadableStream[Uint8Array]
    - java.lang.String
  */
  type BodyInit = _BodyInit | ReadableStream[Uint8Array] | java.lang.String
  /** The CDATASection interface represents a CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = Text
  /** The CSSSupportsRule interface describes an object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = CSSConditionRule
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = AudioNode
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  /** The Comment interface represents textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. Comments are represented in HTML and XML as content between '<!--' and '-->'. In XML, the character sequence '--' cannot be used within a comment. */
  type Comment = CharacterData
  type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | ConstrainDoubleRange
  type ConstrainLong = scala.Double | ConstrainLongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = scala.Double
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, scala.Unit]
  type DocumentTimeline = AnimationTimeline
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
  type GamepadHapticActuatorType = stdLib.stdLibStrings.vibration
  type Generator = Iterator[js.Any]
  type HashAlgorithmIdentifier = AlgorithmIdentifier
  type HeadersInit = Headers | js.Array[js.Array[java.lang.String]] | (Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - Date
    - BufferSource
    - IDBArrayKey
  */
  type IDBValidKey = _IDBValidKey | scala.Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type Int32List = Int32Array | js.Array[GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[IntersectionObserverEntry], 
    /* observer */ IntersectionObserver, 
    scala.Unit
  ]
  type LineAndPositionSetting = scala.Double | AutoKeyword
  type MSCredentialType = stdLib.stdLibStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaStreamTrackAudioSourceNode = AudioNode
  /* Rewritten from type alias, can be one of: 
    - WindowProxy
    - MessagePort
    - ServiceWorker
  */
  type MessageEventSource = _MessageEventSource | WindowProxy
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
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ MediaStream, scala.Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
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
    /* error */ js.UndefOr[Error], 
    js.Any
  ]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
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
    */ stdLib.stdLibStrings.Partial with T
  type PaymentRequestUpdateEventInit = EventInit
  type PerformanceEntryList = js.Array[PerformanceEntry]
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = PerformanceEntry
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ PerformanceObserverEntryList, 
    /* observer */ PerformanceObserver, 
    scala.Unit
  ]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ stdLib.stdLibStrings.Pick with T
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
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, scala.Unit]
  type RTCRtpDecodingParameters = RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, scala.Unit]
  type RTCStatsCallback = js.Function1[/* report */ RTCStatsReport, scala.Unit]
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
  type Readonly[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ stdLib.stdLibStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[K]
  type ReferenceError = Error
  /* Rewritten from type alias, can be one of: 
    - CanvasRenderingContext2D
    - ImageBitmapRenderingContext
    - WebGLRenderingContext
  */
  type RenderingContext = _RenderingContext | WebGLRenderingContext
  type RequestInfo = Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ stdLib.stdLibStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  type SVGMatrix = DOMMatrix
  type SVGPathSegClosePath = SVGPathSeg
  type SVGPoint = DOMPoint
  type SVGRect = DOMRect
  type ScopedCredentialType = stdLib.stdLibStrings.ScopedCred
  type StaticRange = AbstractRange
  type SyntaxError = Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TypeError = Error
  type URIError = Error
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VoidFunction = js.Function0[scala.Unit]
  /** The WebGLBuffer interface is part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = WebGLObject
  /** The WebGLFramebuffer interface is part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = WebGLObject
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = WebGLObject
  /** The WebGLRenderbuffer interface is part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = WebGLObject
  /** The WebGLRenderingContext interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML <canvas> element. */
  type WebGLRenderingContext = WebGLRenderingContextBase
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = WebGLObject
  /** The WebGLTexture interface is part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = WebGLObject
  type WebGLVertexArrayObjectOES = WebGLObject
  type WebKitCSSMatrix = DOMMatrix
  type WindowProxy = Window
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
  type webkitURL = URL
}
