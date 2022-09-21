package typings.reachCombobox

import typings.reachCombobox.anon.AutoEscape
import typings.reachCombobox.anon.CaseSensitive
import typings.reachCombobox.anon.Chunks
import typings.reachCombobox.anon.ChunksToHighlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object HighlightWords {
    
    @JSImport("@reach/combobox/dist/declarations/src/utils", "HighlightWords")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@reach/combobox/dist/declarations/src/utils", "HighlightWords.combineChunks")
    @js.native
    def combineChunks: js.Function1[/* hasChunks */ Chunks, js.Array[Chunk]] = js.native
    inline def combineChunks_=(x: js.Function1[/* hasChunks */ Chunks, js.Array[Chunk]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combineChunks")(x.asInstanceOf[js.Any])
    
    @JSImport("@reach/combobox/dist/declarations/src/utils", "HighlightWords.fillInChunks")
    @js.native
    def fillInChunks: js.Function1[/* hasChunksToHighlightTotalLength */ ChunksToHighlight, js.Array[Chunk]] = js.native
    inline def fillInChunks_=(x: js.Function1[/* hasChunksToHighlightTotalLength */ ChunksToHighlight, js.Array[Chunk]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillInChunks")(x.asInstanceOf[js.Any])
    
    @JSImport("@reach/combobox/dist/declarations/src/utils", "HighlightWords.findAll")
    @js.native
    def findAll: js.Function1[
        /* hasAutoEscapeCaseSensitiveFindChunksSanitizeSearchWordsTextToHighlight */ AutoEscape, 
        js.Array[Chunk]
      ] = js.native
    inline def findAll_=(
      x: js.Function1[
          /* hasAutoEscapeCaseSensitiveFindChunksSanitizeSearchWordsTextToHighlight */ AutoEscape, 
          js.Array[Chunk]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAll")(x.asInstanceOf[js.Any])
    
    @JSImport("@reach/combobox/dist/declarations/src/utils", "HighlightWords.findChunks")
    @js.native
    def findChunks: js.Function1[
        /* hasAutoEscapeCaseSensitiveSanitizeSearchWordsTextToHighlight */ CaseSensitive, 
        js.Array[Chunk]
      ] = js.native
    inline def findChunks_=(
      x: js.Function1[
          /* hasAutoEscapeCaseSensitiveSanitizeSearchWordsTextToHighlight */ CaseSensitive, 
          js.Array[Chunk]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findChunks")(x.asInstanceOf[js.Any])
  }
  
  trait Chunk extends StObject {
    
    var end: Double
    
    var highlight: Boolean
    
    var start: Double
  }
  object Chunk {
    
    inline def apply(end: Double, highlight: Boolean, start: Double): Chunk = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
