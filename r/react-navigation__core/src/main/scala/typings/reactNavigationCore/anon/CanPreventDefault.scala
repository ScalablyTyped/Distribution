package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPreventDefault extends StObject {
  
  var canPreventDefault: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
}
object CanPreventDefault {
  
  @scala.inline
  def apply(): CanPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanPreventDefault]
  }
  
  @scala.inline
  implicit class CanPreventDefaultMutableBuilder[Self <: CanPreventDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPreventDefault(value: Boolean): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPreventDefaultUndefined: Self = StObject.set(x, "canPreventDefault", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
