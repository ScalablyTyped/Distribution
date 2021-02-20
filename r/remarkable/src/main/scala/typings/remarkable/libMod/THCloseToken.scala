package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.th_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait THCloseToken extends TagToken {
  
  @JSName("type")
  var type_THCloseToken: th_close = js.native
}
object THCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: th_close): THCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[THCloseToken]
  }
  
  @scala.inline
  implicit class THCloseTokenMutableBuilder[Self <: THCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: th_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
