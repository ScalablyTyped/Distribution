package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tr_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TRCloseToken extends TagToken {
  
  @JSName("type")
  var type_TRCloseToken: tr_close = js.native
}
object TRCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: tr_close): TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRCloseToken]
  }
  
  @scala.inline
  implicit class TRCloseTokenMutableBuilder[Self <: TRCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: tr_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
