package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfBindingData
  extends BaseBindingData
     with BindingData {
  
  var template: TemplateChunk[_, _] = js.native
}
object IfBindingData {
  
  @scala.inline
  def apply(template: TemplateChunk[_, _]): IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBindingData]
  }
  
  @scala.inline
  implicit class IfBindingDataMutableBuilder[Self <: IfBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: TemplateChunk[_, _]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
