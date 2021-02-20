package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Priority extends StObject {
  
  @JSName(".priority")
  var Dotpriority: String | Double | Null = js.native
  
  @JSName(".value")
  var Dotvalue: js.Any = js.native
}
object Priority {
  
  @scala.inline
  def apply(Dotvalue: js.Any): Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  
  @scala.inline
  implicit class PriorityMutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDotpriority(value: String | Double): Self = StObject.set(x, ".priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotpriorityNull: Self = StObject.set(x, ".priority", null)
    
    @scala.inline
    def setDotvalue(value: js.Any): Self = StObject.set(x, ".value", value.asInstanceOf[js.Any])
  }
}
