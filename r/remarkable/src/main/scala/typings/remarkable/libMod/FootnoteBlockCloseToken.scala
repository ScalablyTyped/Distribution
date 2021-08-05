package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteBlockCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_FootnoteBlockCloseToken: footnote_block_close
}
object FootnoteBlockCloseToken {
  
  inline def apply(level: Double): FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_block_close")
    __obj.asInstanceOf[FootnoteBlockCloseToken]
  }
  
  extension [Self <: FootnoteBlockCloseToken](x: Self) {
    
    inline def setType(value: footnote_block_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
