package typings.rsocketCore

import typings.node.bufferMod.global.Buffer
import typings.rsocketCore.anon.ErrorsourceErrorSource
import typings.rsocketCore.authMetadataMod.AuthMetadata
import typings.rsocketCore.authMetadataMod.UsernameAndPassword
import typings.rsocketCore.compositeMetadataMod.Entry
import typings.rsocketCore.rsocketbufferutilsMod.Encoding
import typings.rsocketCore.rsocketclientMod.ClientConfig
import typings.rsocketCore.rsocketclientMod.default
import typings.rsocketCore.rsocketencodingMod.Encoder
import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketCore.rsocketleaseMod.LeaseStats
import typings.rsocketCore.rsocketresumabletransportMod.Options
import typings.rsocketCore.rsocketserializationMod.Serializer
import typings.rsocketCore.rsocketserverMod.ServerConfig
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
import typings.rsocketTypes.reactiveSocketTypesMod.Frame
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-core", "APPLICATION_AVRO")
  @js.native
  val APPLICATION_AVRO: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_CBOR")
  @js.native
  val APPLICATION_CBOR: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_CLOUDEVENTS_JSON")
  @js.native
  val APPLICATION_CLOUDEVENTS_JSON: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_GRAPHQL")
  @js.native
  val APPLICATION_GRAPHQL: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_GZIP")
  @js.native
  val APPLICATION_GZIP: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_HESSIAN")
  @js.native
  val APPLICATION_HESSIAN: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JAVASCRIPT")
  @js.native
  val APPLICATION_JAVASCRIPT: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JAVA_OBJECT")
  @js.native
  val APPLICATION_JAVA_OBJECT: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JSON")
  @js.native
  val APPLICATION_JSON: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_OCTET_STREAM")
  @js.native
  val APPLICATION_OCTET_STREAM: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_PDF")
  @js.native
  val APPLICATION_PDF: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_PROTOBUF")
  @js.native
  val APPLICATION_PROTOBUF: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_THRIFT")
  @js.native
  val APPLICATION_THRIFT: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_ZIP")
  @js.native
  val APPLICATION_ZIP: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_AAC")
  @js.native
  val AUDIO_AAC: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MP3")
  @js.native
  val AUDIO_MP3: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MP4")
  @js.native
  val AUDIO_MP4: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MPEG")
  @js.native
  val AUDIO_MPEG: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MPEG3")
  @js.native
  val AUDIO_MPEG3: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_OGG")
  @js.native
  val AUDIO_OGG: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_OPUS")
  @js.native
  val AUDIO_OPUS: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_VORBIS")
  @js.native
  val AUDIO_VORBIS: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "BEARER")
  @js.native
  val BEARER: typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = js.native
  
  @JSImport("rsocket-core", "BufferEncoder")
  @js.native
  val BufferEncoder: Encoder[Buffer] = js.native
  
  @JSImport("rsocket-core", "BufferEncoders")
  @js.native
  val BufferEncoders: Encoders[Buffer] = js.native
  
  @JSImport("rsocket-core", "CONNECTION_STREAM_ID")
  @js.native
  val CONNECTION_STREAM_ID: /* 0 */ Double = js.native
  
  @JSImport("rsocket-core", "CompositeMetadata")
  @js.native
  open class CompositeMetadata protected ()
    extends typings.rsocketCore.compositeMetadataMod.CompositeMetadata {
    def this(buffer: Buffer) = this()
  }
  
  object ERROR_CODES {
    
    @JSImport("rsocket-core", "ERROR_CODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "ERROR_CODES.APPLICATION_ERROR")
    @js.native
    def APPLICATION_ERROR: Double = js.native
    inline def APPLICATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APPLICATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CANCELED")
    @js.native
    def CANCELED: Double = js.native
    inline def CANCELED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CONNECTION_CLOSE")
    @js.native
    def CONNECTION_CLOSE: Double = js.native
    inline def CONNECTION_CLOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CLOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CONNECTION_ERROR")
    @js.native
    def CONNECTION_ERROR: Double = js.native
    inline def CONNECTION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.INVALID")
    @js.native
    def INVALID: Double = js.native
    inline def INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.INVALID_SETUP")
    @js.native
    def INVALID_SETUP: Double = js.native
    inline def INVALID_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED")
    @js.native
    def REJECTED: Double = js.native
    inline def REJECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED_RESUME")
    @js.native
    def REJECTED_RESUME: Double = js.native
    inline def REJECTED_RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED_SETUP")
    @js.native
    def REJECTED_SETUP: Double = js.native
    inline def REJECTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    inline def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.RESERVED_EXTENSION")
    @js.native
    def RESERVED_EXTENSION: Double = js.native
    inline def RESERVED_EXTENSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.UNSUPPORTED_SETUP")
    @js.native
    def UNSUPPORTED_SETUP: Double = js.native
    inline def UNSUPPORTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SETUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "ExplicitMimeTimeEntry")
  @js.native
  open class ExplicitMimeTimeEntry protected ()
    extends typings.rsocketCore.compositeMetadataMod.ExplicitMimeTimeEntry {
    def this(content: Buffer, `type`: String) = this()
  }
  
  object FLAGS {
    
    @JSImport("rsocket-core", "FLAGS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "FLAGS.COMPLETE")
    @js.native
    def COMPLETE: Double = js.native
    inline def COMPLETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.FOLLOWS")
    @js.native
    def FOLLOWS: Double = js.native
    inline def FOLLOWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOLLOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.IGNORE")
    @js.native
    def IGNORE: Double = js.native
    inline def IGNORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.LEASE")
    @js.native
    def LEASE: Double = js.native
    inline def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.METADATA")
    @js.native
    def METADATA: Double = js.native
    inline def METADATA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.NEXT")
    @js.native
    def NEXT: Double = js.native
    inline def NEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.RESPOND")
    @js.native
    def RESPOND: Double = js.native
    inline def RESPOND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPOND")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.RESUME_ENABLE")
    @js.native
    def RESUME_ENABLE: Double = js.native
    inline def RESUME_ENABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_ENABLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "FLAGS_MASK")
  @js.native
  val FLAGS_MASK: /* 1023 */ Double = js.native
  
  object FRAME_TYPES {
    
    @JSImport("rsocket-core", "FRAME_TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "FRAME_TYPES.CANCEL")
    @js.native
    def CANCEL: Double = js.native
    inline def CANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.EXT")
    @js.native
    def EXT: Double = js.native
    inline def EXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.KEEPALIVE")
    @js.native
    def KEEPALIVE: Double = js.native
    inline def KEEPALIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.LEASE")
    @js.native
    def LEASE: Double = js.native
    inline def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.METADATA_PUSH")
    @js.native
    def METADATA_PUSH: Double = js.native
    inline def METADATA_PUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA_PUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.PAYLOAD")
    @js.native
    def PAYLOAD: Double = js.native
    inline def PAYLOAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAYLOAD")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_CHANNEL")
    @js.native
    def REQUEST_CHANNEL: Double = js.native
    inline def REQUEST_CHANNEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_FNF")
    @js.native
    def REQUEST_FNF: Double = js.native
    inline def REQUEST_FNF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_FNF")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_N")
    @js.native
    def REQUEST_N: Double = js.native
    inline def REQUEST_N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_N")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_RESPONSE")
    @js.native
    def REQUEST_RESPONSE: Double = js.native
    inline def REQUEST_RESPONSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_STREAM")
    @js.native
    def REQUEST_STREAM: Double = js.native
    inline def REQUEST_STREAM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    inline def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESUME")
    @js.native
    def RESUME: Double = js.native
    inline def RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESUME_OK")
    @js.native
    def RESUME_OK: Double = js.native
    inline def RESUME_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_OK")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.SETUP")
    @js.native
    def SETUP: Double = js.native
    inline def SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SETUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "FRAME_TYPE_OFFFSET")
  @js.native
  val FRAME_TYPE_OFFFSET: /* 10 */ Double = js.native
  
  @JSImport("rsocket-core", "IMAGE_BMP")
  @js.native
  val IMAGE_BMP: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_GIG")
  @js.native
  val IMAGE_GIG: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIC")
  @js.native
  val IMAGE_HEIC: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIC_SEQUENCE")
  @js.native
  val IMAGE_HEIC_SEQUENCE: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIF")
  @js.native
  val IMAGE_HEIF: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIF_SEQUENCE")
  @js.native
  val IMAGE_HEIF_SEQUENCE: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_JPEG")
  @js.native
  val IMAGE_JPEG: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_PNG")
  @js.native
  val IMAGE_PNG: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_TIFF")
  @js.native
  val IMAGE_TIFF: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IdentitySerializer")
  @js.native
  val IdentitySerializer: Serializer[Encodable] = js.native
  
  object IdentitySerializers {
    
    @JSImport("rsocket-core", "IdentitySerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "IdentitySerializers.data")
    @js.native
    def data: Serializer[Any] = js.native
    inline def data_=(x: Serializer[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "IdentitySerializers.metadata")
    @js.native
    def metadata: Serializer[Any] = js.native
    inline def metadata_=(x: Serializer[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "JsonSerializer")
  @js.native
  val JsonSerializer: Serializer[Any] = js.native
  
  object JsonSerializers {
    
    @JSImport("rsocket-core", "JsonSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "JsonSerializers.data")
    @js.native
    def data: Serializer[Any] = js.native
    inline def data_=(x: Serializer[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "JsonSerializers.metadata")
    @js.native
    def metadata: Serializer[Any] = js.native
    inline def metadata_=(x: Serializer[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "Lease")
  @js.native
  open class Lease protected ()
    extends typings.rsocketCore.rsocketleaseMod.Lease {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
  }
  
  @JSImport("rsocket-core", "Leases")
  @js.native
  open class Leases[T /* <: LeaseStats */] ()
    extends typings.rsocketCore.rsocketleaseMod.Leases[T]
  
  @JSImport("rsocket-core", "MAX_CODE")
  @js.native
  val MAX_CODE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_KEEPALIVE")
  @js.native
  val MAX_KEEPALIVE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_LIFETIME")
  @js.native
  val MAX_LIFETIME: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_MIME_LENGTH")
  @js.native
  val MAX_MIME_LENGTH: /* 255 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_RESUME_LENGTH")
  @js.native
  val MAX_RESUME_LENGTH: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_STREAM_ID")
  @js.native
  val MAX_STREAM_ID: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_VERSION")
  @js.native
  val MAX_VERSION: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_ACCEPT_MIMETYPES")
  @js.native
  val MESSAGE_RSOCKET_ACCEPT_MIMETYPES: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_AUTHENTICATION")
  @js.native
  val MESSAGE_RSOCKET_AUTHENTICATION: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_COMPOSITE_METADATA")
  @js.native
  val MESSAGE_RSOCKET_COMPOSITE_METADATA: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_MIMETYPE")
  @js.native
  val MESSAGE_RSOCKET_MIMETYPE: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_ROUTING")
  @js.native
  val MESSAGE_RSOCKET_ROUTING: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_TRACING_ZIPKIN")
  @js.native
  val MESSAGE_RSOCKET_TRACING_ZIPKIN: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MULTIPART_MIXED")
  @js.native
  val MULTIPART_MIXED: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "RSocketClient")
  @js.native
  open class RSocketClient[D, M] protected () extends default[D, M] {
    def this(config: ClientConfig[D, M]) = this()
  }
  
  @JSImport("rsocket-core", "RSocketResumableTransport")
  @js.native
  open class RSocketResumableTransport protected ()
    extends typings.rsocketCore.rsocketresumabletransportMod.default {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[Any]) = this()
  }
  
  @JSImport("rsocket-core", "RSocketServer")
  @js.native
  open class RSocketServer[D, M] protected ()
    extends typings.rsocketCore.rsocketserverMod.default[D, M] {
    def this(config: ServerConfig[D, M]) = this()
  }
  
  @JSImport("rsocket-core", "ReservedMimeTypeEntry")
  @js.native
  open class ReservedMimeTypeEntry protected ()
    extends typings.rsocketCore.compositeMetadataMod.ReservedMimeTypeEntry {
    def this(content: Buffer, `type`: Double) = this()
  }
  
  @JSImport("rsocket-core", "SIMPLE")
  @js.native
  val SIMPLE: typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = js.native
  
  @JSImport("rsocket-core", "TEXT_CSS")
  @js.native
  val TEXT_CSS: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_CSV")
  @js.native
  val TEXT_CSV: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_HTML")
  @js.native
  val TEXT_HTML: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_PLAIN")
  @js.native
  val TEXT_PLAIN: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_XML")
  @js.native
  val TEXT_XML: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UNKNOWN_RESERVED_AUTH_TYPE")
  @js.native
  val UNKNOWN_RESERVED_AUTH_TYPE: typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = js.native
  
  @JSImport("rsocket-core", "UNKNOWN_RESERVED_MIME_TYPE")
  @js.native
  val UNKNOWN_RESERVED_MIME_TYPE: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UNPARSEABLE_AUTH_TYPE")
  @js.native
  val UNPARSEABLE_AUTH_TYPE: typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = js.native
  
  @JSImport("rsocket-core", "UNPARSEABLE_MIME_TYPE")
  @js.native
  val UNPARSEABLE_MIME_TYPE: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UTF8Encoder")
  @js.native
  val UTF8Encoder: Encoder[String] = js.native
  
  @JSImport("rsocket-core", "Utf8Encoders")
  @js.native
  val Utf8Encoders: Encoders[String] = js.native
  
  @JSImport("rsocket-core", "VIDEO_H264")
  @js.native
  val VIDEO_H264: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "VIDEO_H265")
  @js.native
  val VIDEO_H265: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "VIDEO_VP8")
  @js.native
  val VIDEO_VP8: typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "WellKnownAuthType")
  @js.native
  open class WellKnownAuthType protected ()
    extends typings.rsocketCore.wellKnownAuthTypeMod.default {
    def this(str: String, identifier: Double) = this()
  }
  /* static members */
  object WellKnownAuthType {
    
    @JSImport("rsocket-core", "WellKnownAuthType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the {@link WellKnownAuthType} for the given identifier (as an {@link number}). Valid
      * identifiers are defined to be integers between 0 and 127, inclusive. Identifiers outside of
      * this range will produce the {@link #UNPARSEABLE_AUTH_TYPE}. Additionally, some identifiers in
      * that range are still only reserved and don't have a type associated yet: this method returns
      * the {@link #UNKNOWN_RESERVED_AUTH_TYPE} when passing such an identifier, which lets call sites
      * potentially detect this and keep the original representation when transmitting the associated
      * metadata buffer.
      *
      * @param id the looked up identifier
      * @return the {@link WellKnownAuthType}, or {@link #UNKNOWN_RESERVED_AUTH_TYPE} if the id is out
      *     of the specification's range, or {@link #UNKNOWN_RESERVED_AUTH_TYPE} if the id is one that
      *     is merely reserved but unknown to this implementation.
      */
    inline def fromIdentifier(id: Double): typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType]
    
    /**
      * Find the {@link WellKnownAuthType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownAuthType}, the {@link
      * #UNPARSEABLE_AUTH_TYPE} is returned.
      *
      * @param authTypeString the looked up mime type
      * @return the matching {@link WellKnownAuthType}, or {@link #UNPARSEABLE_AUTH_TYPE} if none
      *     matches
      */
    inline def fromString(authTypeString: String): typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(authTypeString.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketCore.wellKnownAuthTypeMod.WellKnownAuthType]
  }
  
  @JSImport("rsocket-core", "WellKnownMimeType")
  @js.native
  open class WellKnownMimeType protected ()
    extends typings.rsocketCore.wellKnownMimeTypeMod.default {
    def this(str: String, identifier: Double) = this()
  }
  /* static members */
  object WellKnownMimeType {
    
    @JSImport("rsocket-core", "WellKnownMimeType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the {@link WellKnownMimeType} for the given identifier (as an {@code int}). Valid
      * identifiers are defined to be integers between 0 and 127, inclusive. Identifiers outside of
      * this range will produce the {@link #UNPARSEABLE_MIME_TYPE}. Additionally, some identifiers in
      * that range are still only reserved and don't have a type associated yet: this method returns
      * the {@link #UNKNOWN_RESERVED_MIME_TYPE} when passing such an identifier, which lets call sites
      * potentially detect this and keep the original representation when transmitting the associated
      * metadata buffer.
      *
      * @param id the looked up identifier
      * @return the {@link WellKnownMimeType}, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is out
      *     of the specification's range, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is one that
      *     is merely reserved but unknown to this implementation.
      */
    inline def fromIdentifier(id: Double): typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType]
    
    /**
      * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
      * #UNPARSEABLE_MIME_TYPE} is returned.
      *
      * @param mimeType the looked up mime type
      * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
      */
    inline def fromString(mimeType: String): typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(mimeType.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType]
  }
  
  @JSImport("rsocket-core", "WellKnownMimeTypeEntry")
  @js.native
  open class WellKnownMimeTypeEntry protected ()
    extends typings.rsocketCore.compositeMetadataMod.WellKnownMimeTypeEntry {
    def this(content: Buffer, `type`: typings.rsocketCore.wellKnownMimeTypeMod.default) = this()
  }
  
  inline def byteLength(data: Any, encoding: Encoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createBuffer(args: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
  
  inline def createErrorFromFrame(frame: ErrorFrame): ErrorsourceErrorSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorFromFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[ErrorsourceErrorSource]
  
  inline def decodeAuthMetadata(metadata: Buffer): AuthMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAuthMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[AuthMetadata]
  
  inline def decodeCompositeMetadata(buffer: Buffer): js.Iterator[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCompositeMetadata")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[Entry]]
  
  inline def decodeRoutes(routeMetadataBuffer: Buffer): js.Iterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRoutes")(routeMetadataBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[String]]
  
  inline def decodeSimpleAuthPayload(authPayload: Buffer): UsernameAndPassword = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSimpleAuthPayload")(authPayload.asInstanceOf[js.Any]).asInstanceOf[UsernameAndPassword]
  
  inline def deserializeFrame(buffer: Buffer): Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrame")(buffer.asInstanceOf[js.Any]).asInstanceOf[Frame]
  inline def deserializeFrame(buffer: Buffer, encoders: Encoders[Any]): Frame = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrame")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Frame]
  
  inline def deserializeFrameWithLength(buffer: Buffer): Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrameWithLength")(buffer.asInstanceOf[js.Any]).asInstanceOf[Frame]
  inline def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[Any]): Frame = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrameWithLength")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Frame]
  
  inline def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrames")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Frame], Buffer]]
  inline def deserializeFrames(buffer: Buffer, encoders: Encoders[Any]): js.Tuple2[js.Array[Frame], Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFrames")(buffer.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Frame], Buffer]]
  
  inline def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddCustomMetadata")(compositeMetaData.asInstanceOf[js.Any], customMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddWellKnownMetadata")(compositeMetaData.asInstanceOf[js.Any], knownMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeAndAddWellKnownMetadata(
    compositeMetaData: Buffer,
    knownMimeType: typings.rsocketCore.wellKnownMimeTypeMod.default,
    metadata: Buffer
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddWellKnownMetadata")(compositeMetaData.asInstanceOf[js.Any], knownMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeBearerAuthMetadata(token: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBearerAuthMetadata")(token.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encodeBearerAuthMetadata(token: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBearerAuthMetadata")(token.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encodeCompositeMetadata(
    metadata: js.Array[
      js.Tuple2[
        String | typings.rsocketCore.wellKnownMimeTypeMod.default | Double, 
        Buffer | js.Function0[Buffer]
      ]
    ]
  ): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCompositeMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encodeCompositeMetadata(
    metadata: Map[
      String | typings.rsocketCore.wellKnownMimeTypeMod.default | Double, 
      Buffer | js.Function0[Buffer]
    ]
  ): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCompositeMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encodeCustomAuthMetadata(customAuthType: String, authPayloadBuffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCustomAuthMetadata")(customAuthType.asInstanceOf[js.Any], authPayloadBuffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeRoute(route: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encodeRoutes(routes: String*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRoutes")(routes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
  
  inline def encodeSimpleAuthMetadata(username: String, password: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: String, password: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: Buffer, password: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: Buffer, password: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeWellKnownAuthMetadata(authType: typings.rsocketCore.wellKnownAuthTypeMod.default, authPayloadBuffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWellKnownAuthMetadata")(authType.asInstanceOf[js.Any], authPayloadBuffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getErrorCodeExplanation(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorCodeExplanation")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isComplete(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComplete")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIgnore(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIgnore")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLease(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLease")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMetadata(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetadata")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNext(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNext")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRespond(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRespond")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isResumeEnable(flags: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResumeEnable")(flags.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def printFrame(frame: Frame): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readUInt24BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt24BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def serializeFrame(frame: Frame): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def serializeFrame(frame: Frame, encoders: Encoders[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrame")(frame.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def serializeFrameWithLength(frame: Frame): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrameWithLength")(frame.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def serializeFrameWithLength(frame: Frame, encoders: Encoders[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFrameWithLength")(frame.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toBuffer(data: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt24BE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
