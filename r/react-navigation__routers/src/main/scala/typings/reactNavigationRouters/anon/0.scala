package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: drawer
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("drawer")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
