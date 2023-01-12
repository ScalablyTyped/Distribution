package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.bullet_list_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait BulletListCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_BulletListCloseToken: bullet_list_close
}
object BulletListCloseToken {
  
  inline def apply(level: Double): BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bullet_list_close")
    __obj.asInstanceOf[BulletListCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulletListCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: bullet_list_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
