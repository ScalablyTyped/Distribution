package typings.rsocketCore

import typings.node.bufferMod.global.Buffer
import typings.rsocketCore.wellKnownMimeTypeMod.default
import typings.std.Iterable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeMetadataMod {
  
  @JSImport("rsocket-core/CompositeMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "CompositeMetadata")
  @js.native
  open class CompositeMetadata protected ()
    extends StObject
       with Iterable[Entry] {
    def this(buffer: Buffer) = this()
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "ExplicitMimeTimeEntry")
  @js.native
  open class ExplicitMimeTimeEntry protected ()
    extends StObject
       with Entry {
    def this(content: Buffer, `type`: String) = this()
    
    /**
      * Returns the un-decoded content of the {@link Entry}.
      *
      * @return the un-decoded content of the {@link Entry}
      */
    /* CompleteClass */
    override val content: Buffer = js.native
    
    @JSName("mimeType")
    val mimeType_ExplicitMimeTimeEntry: String = js.native
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "ReservedMimeTypeEntry")
  @js.native
  open class ReservedMimeTypeEntry protected ()
    extends StObject
       with Entry {
    def this(content: Buffer, `type`: Double) = this()
    
    /**
      * Returns the un-decoded content of the {@link Entry}.
      *
      * @return the un-decoded content of the {@link Entry}
      */
    /* CompleteClass */
    override val content: Buffer = js.native
    
    /**
      * {@inheritDoc} Since this entry represents a compressed id that couldn't be decoded, this is
      * always {@code null}.
      */
    @JSName("mimeType")
    val mimeType_ReservedMimeTypeEntry: Unit = js.native
    
    /**
      * Returns the reserved, but unknown {@link WellKnownMimeType} for this entry. Range is 0-127
      * (inclusive).
      *
      * @return the reserved, but unknown {@link WellKnownMimeType} for this entry
      */
    val `type`: Double = js.native
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "WellKnownMimeTypeEntry")
  @js.native
  open class WellKnownMimeTypeEntry protected ()
    extends StObject
       with Entry {
    def this(content: Buffer, `type`: default) = this()
    
    /**
      * Returns the un-decoded content of the {@link Entry}.
      *
      * @return the un-decoded content of the {@link Entry}
      */
    /* CompleteClass */
    override val content: Buffer = js.native
    
    @JSName("mimeType")
    val mimeType_WellKnownMimeTypeEntry: String = js.native
    
    /**
      * Returns the {@link WellKnownMimeType} for this entry.
      *
      * @return the {@link WellKnownMimeType} for this entry
      */
    val `type`: default = js.native
  }
  
  inline def decodeCompositeMetadata(buffer: Buffer): js.Iterator[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeCompositeMetadata")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[Entry]]
  
  inline def decodeMimeAndContentBuffersSlices(compositeMetadata: Buffer, entryIndex: Double): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMimeAndContentBuffersSlices")(compositeMetadata.asInstanceOf[js.Any], entryIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  inline def decodeMimeTypeFromMimeBuffer(flyweightMimeBuffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeMimeTypeFromMimeBuffer")(flyweightMimeBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddCustomMetadata")(compositeMetaData.asInstanceOf[js.Any], customMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddWellKnownMetadata")(compositeMetaData.asInstanceOf[js.Any], knownMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: default, metadata: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAndAddWellKnownMetadata")(compositeMetaData.asInstanceOf[js.Any], knownMimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeCompositeMetadata(metadata: js.Array[js.Tuple2[String | default | Double, Buffer | js.Function0[Buffer]]]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCompositeMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encodeCompositeMetadata(metadata: Map[String | default | Double, Buffer | js.Function0[Buffer]]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCompositeMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encodeCustomMetadataHeader(customMime: String, metadataLength: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCustomMetadataHeader")(customMime.asInstanceOf[js.Any], metadataLength.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeWellKnownMetadataHeader(mimeType: Double, metadataLength: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWellKnownMetadataHeader")(mimeType.asInstanceOf[js.Any], metadataLength.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait Entry extends StObject {
    
    /**
      * Returns the un-decoded content of the {@link Entry}.
      *
      * @return the un-decoded content of the {@link Entry}
      */
    val content: Buffer
    
    /**
      * Returns the MIME type of the entry, if it can be decoded.
      *
      * @return the MIME type of the entry, if it can be decoded, otherwise {@code null}.
      */
    val mimeType: js.UndefOr[String] = js.undefined
  }
  object Entry {
    
    inline def apply(content: Buffer): Entry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    }
  }
}
