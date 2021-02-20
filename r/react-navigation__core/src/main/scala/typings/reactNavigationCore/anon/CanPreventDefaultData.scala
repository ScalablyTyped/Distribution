package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPreventDefaultData extends StObject {
  
  var canPreventDefault: `true` = js.native
  
  var data: Action = js.native
}
object CanPreventDefaultData {
  
  @scala.inline
  def apply(canPreventDefault: `true`, data: Action): CanPreventDefaultData = {
    val __obj = js.Dynamic.literal(canPreventDefault = canPreventDefault.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPreventDefaultData]
  }
  
  @scala.inline
  implicit class CanPreventDefaultDataMutableBuilder[Self <: CanPreventDefaultData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPreventDefault(value: `true`): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Action): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
