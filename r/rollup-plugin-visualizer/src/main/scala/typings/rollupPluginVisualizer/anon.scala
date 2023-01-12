package typings.rollupPluginVisualizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Brotli extends StObject {
    
    var brotli: Boolean
    
    var gzip: Boolean
    
    var sourcemap: Boolean
  }
  object Brotli {
    
    inline def apply(brotli: Boolean, gzip: Boolean, sourcemap: Boolean): Brotli = {
      val __obj = js.Dynamic.literal(brotli = brotli.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Brotli]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Brotli] (val x: Self) extends AnyVal {
      
      inline def setBrotli(value: Boolean): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsEntry extends StObject {
    
    var isEntry: js.UndefOr[Boolean] = js.undefined
    
    var isExternal: js.UndefOr[Boolean] = js.undefined
  }
  object IsEntry {
    
    inline def apply(): IsEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsEntry] (val x: Self) extends AnyVal {
      
      inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
      
      inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    }
  }
  
  /* Inlined rollup-plugin-visualizer.rollup-plugin-visualizer/dist/types/types.ModuleLengths & {  id :string} */
  trait ModuleLengthsidstring extends StObject {
    
    var brotliLength: Double
    
    var gzipLength: Double
    
    var id: String
    
    var renderedLength: Double
  }
  object ModuleLengthsidstring {
    
    inline def apply(brotliLength: Double, gzipLength: Double, id: String, renderedLength: Double): ModuleLengthsidstring = {
      val __obj = js.Dynamic.literal(brotliLength = brotliLength.asInstanceOf[js.Any], gzipLength = gzipLength.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleLengthsidstring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleLengthsidstring] (val x: Self) extends AnyVal {
      
      inline def setBrotliLength(value: Double): Self = StObject.set(x, "brotliLength", value.asInstanceOf[js.Any])
      
      inline def setGzipLength(value: Double): Self = StObject.set(x, "gzipLength", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRenderedLength(value: Double): Self = StObject.set(x, "renderedLength", value.asInstanceOf[js.Any])
    }
  }
}
