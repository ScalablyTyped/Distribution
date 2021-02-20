package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait HeadingToken extends TagToken {
  
  var hLevel: HeadingValue = js.native
}
object HeadingToken {
  
  @scala.inline
  def apply(hLevel: HeadingValue, level: Double, `type`: String): HeadingToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingToken]
  }
  
  @scala.inline
  implicit class HeadingTokenMutableBuilder[Self <: HeadingToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHLevel(value: HeadingValue): Self = StObject.set(x, "hLevel", value.asInstanceOf[js.Any])
  }
}
