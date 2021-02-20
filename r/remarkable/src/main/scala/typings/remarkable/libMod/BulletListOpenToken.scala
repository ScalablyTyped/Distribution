package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.bullet_list_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait BulletListOpenToken extends TagToken {
  
  @JSName("type")
  var type_BulletListOpenToken: bullet_list_open = js.native
}
object BulletListOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: bullet_list_open): BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletListOpenToken]
  }
  
  @scala.inline
  implicit class BulletListOpenTokenMutableBuilder[Self <: BulletListOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: bullet_list_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
