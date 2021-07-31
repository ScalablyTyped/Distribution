package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.thead_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THeadOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_THeadOpenToken: thead_open
}
object THeadOpenToken {
  
  @scala.inline
  def apply(level: Double): THeadOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thead_open")
    __obj.asInstanceOf[THeadOpenToken]
  }
  
  @scala.inline
  implicit class THeadOpenTokenMutableBuilder[Self <: THeadOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: thead_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
