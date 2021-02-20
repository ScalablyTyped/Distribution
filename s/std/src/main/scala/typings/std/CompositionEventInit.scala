package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionEventInit extends UIEventInit {
  
  var data: js.UndefOr[java.lang.String] = js.native
}
object CompositionEventInit {
  
  @scala.inline
  def apply(): CompositionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEventInit]
  }
  
  @scala.inline
  implicit class CompositionEventInitMutableBuilder[Self <: CompositionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
