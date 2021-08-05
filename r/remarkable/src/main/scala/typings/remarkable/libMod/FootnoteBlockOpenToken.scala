package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteBlockOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_FootnoteBlockOpenToken: footnote_block_open
}
object FootnoteBlockOpenToken {
  
  inline def apply(level: Double): FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_block_open")
    __obj.asInstanceOf[FootnoteBlockOpenToken]
  }
  
  extension [Self <: FootnoteBlockOpenToken](x: Self) {
    
    inline def setType(value: footnote_block_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
