package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type AAGUID = typings.std.BufferSource
  type AlgorithmIdentifier = java.lang.String | typings.std.Algorithm
  type AudioWorklet = typings.std.Worklet
  type AuthenticationExtensionsSupported = js.Array[java.lang.String]
  type AuthenticatorSelectionList = js.Array[typings.std.AAGUID]
  type AutoKeyword = typings.std.stdStrings.auto
  type BigInteger = typings.std.Uint8Array
  type BlobCallback = js.Function1[/* blob */ typings.std.Blob | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.std.BufferSource
    - typings.std.Blob
    - java.lang.String
  */
  type BlobPart = typings.std._BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.std.Blob
    - typings.std.BufferSource
    - typings.std.FormData
    - typings.std.URLSearchParams
    - typings.std.ReadableStream[typings.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = typings.std._BodyInit | typings.std.ReadableStream[typings.std.Uint8Array] | java.lang.String
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = typings.std.Text
  type COSEAlgorithmIdentifier = scala.Double
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = typings.std.CSSConditionRule
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = typings.std.AudioNode
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = typings.std.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = typings.std.CharacterData
  type ConstrainBoolean = scala.Boolean | typings.std.ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | typings.std.ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | typings.std.ConstrainDoubleRange
  type ConstrainULong = scala.Double | typings.std.ConstrainULongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = scala.Double
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ typings.std.DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ typings.std.AudioBuffer, scala.Unit]
  type DocumentTimeline = typings.std.AnimationTimeline
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = typings.std.HTMLElementTagNameMap with (typings.std.Pick[
    typings.std.SVGElementTagNameMap, 
    typings.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ])
  type EvalError = typings.std.Error
  type EventHandlerNonNull = js.Function1[/* event */ typings.std.Event_, js.Any]
  type EventListener = js.Function1[/* evt */ typings.std.Event_, scala.Unit]
  type EventListenerOrEventListenerObject = typings.std.EventListener | typings.std.EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type Float32List = typings.std.Float32Array | js.Array[typings.std.GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ typings.std.Int8Array | typings.std.Int16Array | typings.std.Int32Array | typings.std.Uint8Array | typings.std.Uint16Array | typings.std.Uint32Array | typings.std.Uint8ClampedArray | typings.std.Float32Array | typings.std.Float64Array | typings.std.DataView | typings.std.ArrayBuffer | scala.Null, 
    /* status */ typings.std.MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = typings.std.File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLint64 = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GLuint64 = scala.Double
  type GamepadHapticActuatorType = typings.std.stdStrings.vibration
  type HashAlgorithmIdentifier = typings.std.AlgorithmIdentifier
  type HeadersInit = typings.std.Headers | js.Array[js.Array[java.lang.String]] | (typings.std.Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - typings.std.Date
    - typings.std.BufferSource
    - typings.std.IDBArrayKey
  */
  type IDBValidKey = typings.std._IDBValidKey | scala.Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type Int32List = typings.std.Int32Array | js.Array[typings.std.GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[typings.std.IntersectionObserverEntry], 
    /* observer */ typings.std.IntersectionObserver, 
    scala.Unit
  ]
  type LineAndPositionSetting = scala.Double | typings.std.AutoKeyword
  type MSCredentialType = typings.std.stdStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaStreamTrackAudioSourceNode = typings.std.AudioNode
  /* Rewritten from type alias, can be one of: 
    - typings.std.WindowProxy
    - typings.std.MessagePort
    - typings.std.ServiceWorker
  */
  type MessageEventSource = typings.std._MessageEventSource | typings.std.WindowProxy
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typings.std.TypedPropertyDescriptor[js.Any], 
    typings.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = typings.std.WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[typings.std.MutationRecord], 
    /* observer */ typings.std.MutationObserver, 
    scala.Unit
  ]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ typings.std.MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ typings.std.MediaStream, scala.Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ typings.std.NotificationPermission, scala.Unit]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = typings.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ typings.std.Event_, java.lang.String | scala.Null]
  type OnErrorEventHandler = typings.std.OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ typings.std.Event_ | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[typings.std.Error], 
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
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.std.stdStrings.Partial with T
  type PaymentRequestUpdateEventInit = typings.std.EventInit
  type PerformanceEntryList = js.Array[typings.std.PerformanceEntry]
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = typings.std.PerformanceEntry
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = typings.std.PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ typings.std.PerformanceObserverEntryList, 
    /* observer */ typings.std.PerformanceObserver, 
    scala.Unit
  ]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typings.std.stdStrings.Pick with T
  type PositionCallback = js.Function1[/* position */ typings.std.Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ typings.std.PositionError, scala.Unit]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[typings.std.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type PublicKeyCredentialType = typings.std.stdStrings.`public-key`
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = typings.std.RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ typings.std.DOMException, scala.Unit]
  type RTCRtpDecodingParameters = typings.std.RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[/* description */ typings.std.RTCSessionDescriptionInit, scala.Unit]
  type RTCStatsCallback = js.Function1[/* report */ typings.std.RTCStatsReport, scala.Unit]
  type RangeError = typings.std.Error
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ typings.std.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ typings.std.ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typings.std.stdStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[K]
  type ReferenceError = typings.std.Error
  type RequestInfo = typings.std.Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typings.std.stdStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  type SVGMatrix = typings.std.DOMMatrix
  type SVGPathSegClosePath = typings.std.SVGPathSeg
  type SVGPoint = typings.std.DOMPoint
  type SVGRect = typings.std.DOMRect
  type ScopedCredentialType = typings.std.stdStrings.ScopedCred
  type StaticRange = typings.std.AbstractRange
  type SyntaxError = typings.std.Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ typings.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ typings.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TypeError = typings.std.Error
  type URIError = typings.std.Error
  type Uint32List = typings.std.Uint32Array | js.Array[typings.std.GLuint]
  type UvmEntries = js.Array[typings.std.UvmEntry]
  type UvmEntry = js.Array[scala.Double]
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VoidFunction = js.Function0[scala.Unit]
  /** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = typings.std.WebGLObject
  /** Part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = typings.std.WebGLObject
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = typings.std.WebGLObject
  type WebGLQuery = typings.std.WebGLObject
  /** Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = typings.std.WebGLObject
  type WebGLSampler = typings.std.WebGLObject
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = typings.std.WebGLObject
  type WebGLSync = typings.std.WebGLObject
  /** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = typings.std.WebGLObject
  type WebGLTransformFeedback = typings.std.WebGLObject
  type WebGLVertexArrayObject = typings.std.WebGLObject
  type WebGLVertexArrayObjectOES = typings.std.WebGLObject
  type WebKitCSSMatrix = typings.std.DOMMatrix
  type WindowProxy = typings.std.Window_
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ typings.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ typings.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = typings.std.XPathEvaluatorBase
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | typings.std.AnonLookupNamespaceURI
  type webkitURL = typings.std.URL
}
