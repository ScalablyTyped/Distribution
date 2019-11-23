package typings.rsocketDashCore

import typings.node.Buffer
import typings.rsocketDashCore.rSocketBufferUtilsMod.Encoding
import typings.rsocketDashCore.rSocketClientMod.ClientConfig
import typings.rsocketDashCore.rSocketClientMod.default
import typings.rsocketDashCore.rSocketEncodingMod.Encoder
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashCore.rSocketLeaseMod.LeaseStats
import typings.rsocketDashCore.rSocketResumableTransportMod.Options
import typings.rsocketDashCore.rSocketSerializationMod.Serializer
import typings.rsocketDashCore.rSocketServerMod.ServerConfig
import typings.rsocketDashCore.rsocketDashCoreNumbers.`0`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`1023`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`10`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`2147483647`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`255`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`65535`
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketDashTypes.reactiveSocketTypesMod.Encodable
import typings.rsocketDashTypes.reactiveSocketTypesMod.ErrorFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core", JSImport.Namespace)
@js.native
object rsocketDashCoreMod extends js.Object {
  @js.native
  class CompositeMetadata protected ()
    extends typings.rsocketDashCore.compositeMetadataMod.CompositeMetadata {
    def this(buffer: Buffer) = this()
  }
  
  @js.native
  class ExplicitMimeTimeEntry protected ()
    extends typings.rsocketDashCore.compositeMetadataMod.ExplicitMimeTimeEntry {
    def this(content: Buffer, `type`: String) = this()
  }
  
  @js.native
  class Lease protected ()
    extends typings.rsocketDashCore.rSocketLeaseMod.Lease {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
  }
  
  @js.native
  class Leases[T /* <: LeaseStats */] ()
    extends typings.rsocketDashCore.rSocketLeaseMod.Leases[T]
  
  @js.native
  class RSocketClient[D, M] protected () extends default[D, M] {
    def this(config: ClientConfig[D, M]) = this()
  }
  
  @js.native
  class RSocketResumableTransport protected ()
    extends typings.rsocketDashCore.rSocketResumableTransportMod.default {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class RSocketServer[D, M] protected ()
    extends typings.rsocketDashCore.rSocketServerMod.default[D, M] {
    def this(config: ServerConfig[D, M]) = this()
  }
  
  @js.native
  class ReservedMimeTypeEntry protected ()
    extends typings.rsocketDashCore.compositeMetadataMod.ReservedMimeTypeEntry {
    def this(content: Buffer, `type`: Double) = this()
  }
  
  @js.native
  class WellKnownMimeType protected ()
    extends typings.rsocketDashCore.wellKnownMimeTypeMod.default {
    def this(str: String, identifier: Double) = this()
  }
  
  @js.native
  class WellKnownMimeTypeEntry protected ()
    extends typings.rsocketDashCore.compositeMetadataMod.WellKnownMimeTypeEntry {
    def this(content: Buffer, `type`: typings.rsocketDashCore.wellKnownMimeTypeMod.default) = this()
  }
  
  val APPLICATION_AVRO: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_CBOR: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_CLOUDEVENTS_JSON: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_GRAPHQL: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_GZIP: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_HESSIAN: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JAVASCRIPT: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JAVA_OBJECT: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JSON: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_OCTET_STREAM: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_PDF: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_PROTOBUF: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_THRIFT: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_XML: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_ZIP: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_AAC: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MP3: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MP4: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MPEG: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MPEG3: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_OGG: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_OPUS: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_VORBIS: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val BufferEncoder: Encoder[Buffer] = js.native
  val BufferEncoders: Encoders[Buffer] = js.native
  val CONNECTION_STREAM_ID: `0` = js.native
  val FLAGS_MASK: `1023` = js.native
  val FRAME_TYPE_OFFFSET: `10` = js.native
  val IMAGE_BMP: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_GIG: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIC: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIC_SEQUENCE: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIF: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIF_SEQUENCE: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_JPEG: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_PNG: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_TIFF: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IdentitySerializer: Serializer[Encodable] = js.native
  val JsonSerializer: Serializer[js.Any] = js.native
  val MAX_CODE: `2147483647` = js.native
  val MAX_KEEPALIVE: `2147483647` = js.native
  val MAX_LIFETIME: `2147483647` = js.native
  val MAX_MIME_LENGTH: `255` = js.native
  val MAX_RESUME_LENGTH: `65535` = js.native
  val MAX_STREAM_ID: `2147483647` = js.native
  val MAX_VERSION: `65535` = js.native
  val MESSAGE_RSOCKET_COMPOSITE_METADATA: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MESSAGE_RSOCKET_ROUTING: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MESSAGE_RSOCKET_TRACING_ZIPKIN: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MULTIPART_MIXED: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_CSS: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_CSV: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_HTML: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_PLAIN: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_XML: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UNKNOWN_RESERVED_MIME_TYPE: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UNPARSEABLE_MIME_TYPE: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UTF8Encoder: Encoder[String] = js.native
  val Utf8Encoders: Encoders[String] = js.native
  val VIDEO_H264: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val VIDEO_H265: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val VIDEO_VP8: typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  def createErrorFromFrame(frame: ErrorFrame): Error = js.native
  def deserializeFrame(buffer: Buffer): Frame = js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = js.native
  def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = js.native
  def encodeAndAddWellKnownMetadata(
    compositeMetaData: Buffer,
    knownMimeType: typings.rsocketDashCore.wellKnownMimeTypeMod.default,
    metadata: Buffer
  ): Buffer = js.native
  def getErrorCodeExplanation(code: Double): String = js.native
  def isComplete(flags: Double): Boolean = js.native
  def isIgnore(flags: Double): Boolean = js.native
  def isLease(flags: Double): Boolean = js.native
  def isMetadata(flags: Double): Boolean = js.native
  def isNext(flags: Double): Boolean = js.native
  def isRespond(flags: Double): Boolean = js.native
  def isResumeEnable(flags: Double): Boolean = js.native
  def printFrame(frame: Frame): String = js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def toBuffer(data: js.Any): Buffer = js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  @js.native
  object ERROR_CODES extends js.Object {
    var APPLICATION_ERROR: Double = js.native
    var CANCELED: Double = js.native
    var CONNECTION_CLOSE: Double = js.native
    var CONNECTION_ERROR: Double = js.native
    var INVALID: Double = js.native
    var INVALID_SETUP: Double = js.native
    var REJECTED: Double = js.native
    var REJECTED_RESUME: Double = js.native
    var REJECTED_SETUP: Double = js.native
    var RESERVED: Double = js.native
    var RESERVED_EXTENSION: Double = js.native
    var UNSUPPORTED_SETUP: Double = js.native
  }
  
  @js.native
  object FLAGS extends js.Object {
    var COMPLETE: Double = js.native
    var FOLLOWS: Double = js.native
    var IGNORE: Double = js.native
    var LEASE: Double = js.native
    var METADATA: Double = js.native
    var NEXT: Double = js.native
    var RESPOND: Double = js.native
    var RESUME_ENABLE: Double = js.native
  }
  
  @js.native
  object FRAME_TYPES extends js.Object {
    var CANCEL: Double = js.native
    var ERROR: Double = js.native
    var EXT: Double = js.native
    var KEEPALIVE: Double = js.native
    var LEASE: Double = js.native
    var METADATA_PUSH: Double = js.native
    var PAYLOAD: Double = js.native
    var REQUEST_CHANNEL: Double = js.native
    var REQUEST_FNF: Double = js.native
    var REQUEST_N: Double = js.native
    var REQUEST_RESPONSE: Double = js.native
    var REQUEST_STREAM: Double = js.native
    var RESERVED: Double = js.native
    var RESUME: Double = js.native
    var RESUME_OK: Double = js.native
    var SETUP: Double = js.native
  }
  
  @js.native
  object IdentitySerializers extends js.Object {
    var data: Serializer[_] = js.native
    var metadata: Serializer[_] = js.native
  }
  
  @js.native
  object JsonSerializers extends js.Object {
    var data: Serializer[_] = js.native
    var metadata: Serializer[_] = js.native
  }
  
  /* static members */
  @js.native
  object WellKnownMimeType extends js.Object {
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
    def fromIdentifier(id: Double): typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
    /**
      * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
      * #UNPARSEABLE_MIME_TYPE} is returned.
      *
      * @param mimeType the looked up mime type
      * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
      */
    def fromString(mimeType: String): typings.rsocketDashCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  }
  
}

