package typings.reachCombobox

import typings.reachCombobox.utilsMod.Chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoEscape extends StObject {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var findChunks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultFindChunks */ js.Any
      ] = js.undefined
    
    var sanitize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultSanitize */ js.Any
      ] = js.undefined
    
    var searchWords: js.Array[String]
    
    var textToHighlight: js.UndefOr[String | Null] = js.undefined
  }
  object AutoEscape {
    
    inline def apply(searchWords: js.Array[String]): AutoEscape = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoEscape]
    }
    
    extension [Self <: AutoEscape](x: Self) {
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setFindChunks(
        value: /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultFindChunks */ js.Any
      ): Self = StObject.set(x, "findChunks", value.asInstanceOf[js.Any])
      
      inline def setFindChunksUndefined: Self = StObject.set(x, "findChunks", js.undefined)
      
      inline def setSanitize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultSanitize */ js.Any
      ): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
      
      inline def setTextToHighlightNull: Self = StObject.set(x, "textToHighlight", null)
      
      inline def setTextToHighlightUndefined: Self = StObject.set(x, "textToHighlight", js.undefined)
    }
  }
  
  trait CaseSensitive extends StObject {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var sanitize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultSanitize */ js.Any
      ] = js.undefined
    
    var searchWords: js.Array[String]
    
    var textToHighlight: js.UndefOr[String | Null] = js.undefined
  }
  object CaseSensitive {
    
    inline def apply(searchWords: js.Array[String]): CaseSensitive = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaseSensitive]
    }
    
    extension [Self <: CaseSensitive](x: Self) {
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setSanitize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: typeof defaultSanitize */ js.Any
      ): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
      
      inline def setTextToHighlightNull: Self = StObject.set(x, "textToHighlight", null)
      
      inline def setTextToHighlightUndefined: Self = StObject.set(x, "textToHighlight", js.undefined)
    }
  }
  
  trait Chunks extends StObject {
    
    var chunks: js.Array[Chunk]
  }
  object Chunks {
    
    inline def apply(chunks: js.Array[Chunk]): Chunks = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunks]
    }
    
    extension [Self <: Chunks](x: Self) {
      
      inline def setChunks(value: js.Array[Chunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: Chunk*): Self = StObject.set(x, "chunks", js.Array(value*))
    }
  }
  
  trait ChunksToHighlight extends StObject {
    
    var chunksToHighlight: js.Array[Chunk]
    
    var totalLength: Double
  }
  object ChunksToHighlight {
    
    inline def apply(chunksToHighlight: js.Array[Chunk], totalLength: Double): ChunksToHighlight = {
      val __obj = js.Dynamic.literal(chunksToHighlight = chunksToHighlight.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunksToHighlight]
    }
    
    extension [Self <: ChunksToHighlight](x: Self) {
      
      inline def setChunksToHighlight(value: js.Array[Chunk]): Self = StObject.set(x, "chunksToHighlight", value.asInstanceOf[js.Any])
      
      inline def setChunksToHighlightVarargs(value: Chunk*): Self = StObject.set(x, "chunksToHighlight", js.Array(value*))
      
      inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
    }
  }
}
