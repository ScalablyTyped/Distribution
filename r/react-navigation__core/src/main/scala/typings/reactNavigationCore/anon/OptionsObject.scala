package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsObject extends StObject {
  
  var options: js.Object = js.native
}
object OptionsObject {
  
  @scala.inline
  def apply(options: js.Object): OptionsObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsObject]
  }
  
  @scala.inline
  implicit class OptionsObjectMutableBuilder[Self <: OptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
