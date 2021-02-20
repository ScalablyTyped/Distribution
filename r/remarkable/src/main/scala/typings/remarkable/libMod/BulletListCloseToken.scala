package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.bullet_list_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait BulletListCloseToken extends TagToken {
  
  @JSName("type")
  var type_BulletListCloseToken: bullet_list_close = js.native
}
object BulletListCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: bullet_list_close): BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletListCloseToken]
  }
  
  @scala.inline
  implicit class BulletListCloseTokenMutableBuilder[Self <: BulletListCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: bullet_list_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
