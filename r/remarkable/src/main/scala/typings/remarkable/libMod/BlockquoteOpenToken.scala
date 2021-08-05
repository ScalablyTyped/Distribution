package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.blockquote_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait BlockquoteOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_BlockquoteOpenToken: blockquote_open
}
object BlockquoteOpenToken {
  
  inline def apply(level: Double): BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_open")
    __obj.asInstanceOf[BlockquoteOpenToken]
  }
  
  extension [Self <: BlockquoteOpenToken](x: Self) {
    
    inline def setType(value: blockquote_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
