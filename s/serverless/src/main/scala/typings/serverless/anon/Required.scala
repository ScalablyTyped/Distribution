package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var shortcut: js.UndefOr[String] = js.undefined
  
  var usage: js.UndefOr[String] = js.undefined
}
object Required {
  
  @scala.inline
  def apply(): Required = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
