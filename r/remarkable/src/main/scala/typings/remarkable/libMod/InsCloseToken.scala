package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ins_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait InsCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_InsCloseToken: ins_close
}
object InsCloseToken {
  
  @scala.inline
  def apply(level: Double): InsCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ins_close")
    __obj.asInstanceOf[InsCloseToken]
  }
  
  @scala.inline
  implicit class InsCloseTokenMutableBuilder[Self <: InsCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ins_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
