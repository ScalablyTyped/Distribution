package typings.rsocketCore

import typings.node.Buffer
import typings.rsocketCore.wellKnownMimeTypeMod.default
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositeMetadataMod {
  
  @JSImport("rsocket-core/CompositeMetadata", "CompositeMetadata")
  @js.native
  class CompositeMetadata protected () extends StObject {
    def this(buffer: Buffer) = this()
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Entry, _, js.UndefOr[scala.Nothing]]] = js.native
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "ExplicitMimeTimeEntry")
  @js.native
  class ExplicitMimeTimeEntry protected () extends Entry {
    def this(content: Buffer, `type`: String) = this()
    
    @JSName("mimeType")
    val mimeType_ExplicitMimeTimeEntry: String = js.native
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "ReservedMimeTypeEntry")
  @js.native
  class ReservedMimeTypeEntry protected () extends Entry {
    def this(content: Buffer, `type`: Double) = this()
    
    /**
      * {@inheritDoc} Since this entry represents a compressed id that couldn't be decoded, this is
      * always {@code null}.
      */
    @JSName("mimeType")
    val mimeType_ReservedMimeTypeEntry: js.UndefOr[scala.Nothing] = js.native
    
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
  class WellKnownMimeTypeEntry protected () extends Entry {
    def this(content: Buffer, `type`: default) = this()
    
    @JSName("mimeType")
    val mimeType_WellKnownMimeTypeEntry: String = js.native
    
    /**
      * Returns the {@link WellKnownMimeType} for this entry.
      *
      * @return the {@link WellKnownMimeType} for this entry
      */
    val `type`: default = js.native
  }
  
  @JSImport("rsocket-core/CompositeMetadata", "decodeMimeAndContentBuffersSlices")
  @js.native
  def decodeMimeAndContentBuffersSlices(compositeMetadata: Buffer, entryIndex: Double): js.Array[Buffer] = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "decodeMimeTypeFromMimeBuffer")
  @js.native
  def decodeMimeTypeFromMimeBuffer(flyweightMimeBuffer: Buffer): String = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "encodeAndAddCustomMetadata")
  @js.native
  def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "encodeAndAddWellKnownMetadata")
  @js.native
  def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = js.native
  @JSImport("rsocket-core/CompositeMetadata", "encodeAndAddWellKnownMetadata")
  @js.native
  def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: default, metadata: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "encodeCustomMetadataHeader")
  @js.native
  def encodeCustomMetadataHeader(customMime: String, metadataLength: Double): Buffer = js.native
  
  @JSImport("rsocket-core/CompositeMetadata", "encodeWellKnownMetadataHeader")
  @js.native
  def encodeWellKnownMetadataHeader(mimeType: Double, metadataLength: Double): Buffer = js.native
  
  @js.native
  trait Entry extends StObject {
    
    /**
      * Returns the un-decoded content of the {@link Entry}.
      *
      * @return the un-decoded content of the {@link Entry}
      */
    val content: Buffer = js.native
    
    /**
      * Returns the MIME type of the entry, if it can be decoded.
      *
      * @return the MIME type of the entry, if it can be decoded, otherwise {@code null}.
      */
    val mimeType: js.UndefOr[String] = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(content: Buffer): Entry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    }
  }
}
