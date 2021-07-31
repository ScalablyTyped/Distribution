package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DlCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_DlCloseToken: dl_close
}
object DlCloseToken {
  
  @scala.inline
  def apply(level: Double): DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dl_close")
    __obj.asInstanceOf[DlCloseToken]
  }
  
  @scala.inline
  implicit class DlCloseTokenMutableBuilder[Self <: DlCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dl_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
