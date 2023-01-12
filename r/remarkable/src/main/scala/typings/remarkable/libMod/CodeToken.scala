package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait CodeToken
  extends StObject
     with BlockContentToken {
  
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: Boolean
  
  @JSName("type")
  var type_CodeToken: code
}
object CodeToken {
  
  inline def apply(block: Boolean, level: Double): CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[CodeToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeToken] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
