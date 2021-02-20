package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateidString extends StObject {
  
  var template_id: String = js.native
}
object TemplateidString {
  
  @scala.inline
  def apply(template_id: String): TemplateidString = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateidString]
  }
  
  @scala.inline
  implicit class TemplateidStringMutableBuilder[Self <: TemplateidString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
  }
}
