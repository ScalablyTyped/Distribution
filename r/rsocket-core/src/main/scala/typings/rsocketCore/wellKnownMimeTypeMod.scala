package typings.rsocketCore

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wellKnownMimeTypeMod {
  
  @JSImport("rsocket-core/WellKnownMimeType", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WellKnownMimeType {
    def this(str: String, identifier: Double) = this()
    
    /** @return the byte identifier of the mime type, guaranteed to be positive or zero. */
    /* CompleteClass */
    override val identifier: Double = js.native
    
    /**
      * @return the mime type represented as a {@link String}, which is made of US_ASCII compatible
      *     characters only
      */
    /* CompleteClass */
    override val string: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-core/WellKnownMimeType", JSImport.Default)
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
    inline def fromIdentifier(id: Double): WellKnownMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[WellKnownMimeType]
    
    /**
      * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
      * #UNPARSEABLE_MIME_TYPE} is returned.
      *
      * @param mimeType the looked up mime type
      * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
      */
    inline def fromString(mimeType: String): WellKnownMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(mimeType.asInstanceOf[js.Any]).asInstanceOf[WellKnownMimeType]
  }
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_AVRO")
  @js.native
  val APPLICATION_AVRO: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_CBOR")
  @js.native
  val APPLICATION_CBOR: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_CLOUDEVENTS_JSON")
  @js.native
  val APPLICATION_CLOUDEVENTS_JSON: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_GRAPHQL")
  @js.native
  val APPLICATION_GRAPHQL: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_GZIP")
  @js.native
  val APPLICATION_GZIP: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_HESSIAN")
  @js.native
  val APPLICATION_HESSIAN: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_JAVASCRIPT")
  @js.native
  val APPLICATION_JAVASCRIPT: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_JAVA_OBJECT")
  @js.native
  val APPLICATION_JAVA_OBJECT: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_JSON")
  @js.native
  val APPLICATION_JSON: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_OCTET_STREAM")
  @js.native
  val APPLICATION_OCTET_STREAM: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_PDF")
  @js.native
  val APPLICATION_PDF: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_PROTOBUF")
  @js.native
  val APPLICATION_PROTOBUF: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_THRIFT")
  @js.native
  val APPLICATION_THRIFT: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "APPLICATION_ZIP")
  @js.native
  val APPLICATION_ZIP: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_AAC")
  @js.native
  val AUDIO_AAC: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_MP3")
  @js.native
  val AUDIO_MP3: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_MP4")
  @js.native
  val AUDIO_MP4: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_MPEG")
  @js.native
  val AUDIO_MPEG: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_MPEG3")
  @js.native
  val AUDIO_MPEG3: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_OGG")
  @js.native
  val AUDIO_OGG: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_OPUS")
  @js.native
  val AUDIO_OPUS: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "AUDIO_VORBIS")
  @js.native
  val AUDIO_VORBIS: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_BMP")
  @js.native
  val IMAGE_BMP: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_GIG")
  @js.native
  val IMAGE_GIG: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_HEIC")
  @js.native
  val IMAGE_HEIC: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_HEIC_SEQUENCE")
  @js.native
  val IMAGE_HEIC_SEQUENCE: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_HEIF")
  @js.native
  val IMAGE_HEIF: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_HEIF_SEQUENCE")
  @js.native
  val IMAGE_HEIF_SEQUENCE: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_JPEG")
  @js.native
  val IMAGE_JPEG: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_PNG")
  @js.native
  val IMAGE_PNG: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "IMAGE_TIFF")
  @js.native
  val IMAGE_TIFF: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_ACCEPT_MIMETYPES")
  @js.native
  val MESSAGE_RSOCKET_ACCEPT_MIMETYPES: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_AUTHENTICATION")
  @js.native
  val MESSAGE_RSOCKET_AUTHENTICATION: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_COMPOSITE_METADATA")
  @js.native
  val MESSAGE_RSOCKET_COMPOSITE_METADATA: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_MIMETYPE")
  @js.native
  val MESSAGE_RSOCKET_MIMETYPE: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_ROUTING")
  @js.native
  val MESSAGE_RSOCKET_ROUTING: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MESSAGE_RSOCKET_TRACING_ZIPKIN")
  @js.native
  val MESSAGE_RSOCKET_TRACING_ZIPKIN: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "MULTIPART_MIXED")
  @js.native
  val MULTIPART_MIXED: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TEXT_CSS")
  @js.native
  val TEXT_CSS: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TEXT_CSV")
  @js.native
  val TEXT_CSV: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TEXT_HTML")
  @js.native
  val TEXT_HTML: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TEXT_PLAIN")
  @js.native
  val TEXT_PLAIN: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TEXT_XML")
  @js.native
  val TEXT_XML: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TYPES_BY_MIME_ID")
  @js.native
  val TYPES_BY_MIME_ID: js.Array[WellKnownMimeType] = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "TYPES_BY_MIME_STRING")
  @js.native
  val TYPES_BY_MIME_STRING: Map[String, WellKnownMimeType] = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "UNKNOWN_RESERVED_MIME_TYPE")
  @js.native
  val UNKNOWN_RESERVED_MIME_TYPE: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "UNPARSEABLE_MIME_TYPE")
  @js.native
  val UNPARSEABLE_MIME_TYPE: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "VIDEO_H264")
  @js.native
  val VIDEO_H264: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "VIDEO_H265")
  @js.native
  val VIDEO_H265: WellKnownMimeType = js.native
  
  @JSImport("rsocket-core/WellKnownMimeType", "VIDEO_VP8")
  @js.native
  val VIDEO_VP8: WellKnownMimeType = js.native
  
  trait WellKnownMimeType extends StObject {
    
    /** @return the byte identifier of the mime type, guaranteed to be positive or zero. */
    val identifier: Double
    
    /**
      * @return the mime type represented as a {@link String}, which is made of US_ASCII compatible
      *     characters only
      */
    val string: String
  }
  object WellKnownMimeType {
    
    inline def apply(identifier: Double, string: String): WellKnownMimeType = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[WellKnownMimeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WellKnownMimeType] (val x: Self) extends AnyVal {
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
