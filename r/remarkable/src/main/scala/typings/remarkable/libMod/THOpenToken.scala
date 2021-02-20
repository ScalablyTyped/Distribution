package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.th_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait THOpenToken extends TagToken {
  
  @JSName("type")
  var type_THOpenToken: th_open = js.native
}
object THOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: th_open): THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[THOpenToken]
  }
  
  @scala.inline
  implicit class THOpenTokenMutableBuilder[Self <: THOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: th_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
