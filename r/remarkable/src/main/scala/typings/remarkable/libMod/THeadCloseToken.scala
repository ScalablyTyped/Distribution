package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.thead_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait THeadCloseToken extends TagToken {
  
  @JSName("type")
  var type_THeadCloseToken: thead_close = js.native
}
object THeadCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: thead_close): THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[THeadCloseToken]
  }
  
  @scala.inline
  implicit class THeadCloseTokenMutableBuilder[Self <: THeadCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: thead_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
