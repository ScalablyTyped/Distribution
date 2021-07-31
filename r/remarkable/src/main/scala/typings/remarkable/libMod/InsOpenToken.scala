package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ins_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait InsOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_InsOpenToken: ins_open
}
object InsOpenToken {
  
  @scala.inline
  def apply(level: Double): InsOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ins_open")
    __obj.asInstanceOf[InsOpenToken]
  }
  
  @scala.inline
  implicit class InsOpenTokenMutableBuilder[Self <: InsOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ins_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
