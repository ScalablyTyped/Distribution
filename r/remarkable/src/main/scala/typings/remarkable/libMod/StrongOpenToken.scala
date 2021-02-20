package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.strong_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait StrongOpenToken extends TagToken {
  
  @JSName("type")
  var type_StrongOpenToken: strong_open = js.native
}
object StrongOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: strong_open): StrongOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrongOpenToken]
  }
  
  @scala.inline
  implicit class StrongOpenTokenMutableBuilder[Self <: StrongOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: strong_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
