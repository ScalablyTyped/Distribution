package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharResult extends StObject {
  
  def get_value(): js.Any = js.native
}
object CharResult {
  
  @scala.inline
  def apply(get_value: () => js.Any): CharResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[CharResult]
  }
  
  @scala.inline
  implicit class CharResultMutableBuilder[Self <: CharResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => js.Any): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
