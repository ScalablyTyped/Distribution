package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distUtilsMod.FormEncType
import typings.remixRunRouter.distUtilsMod.HTMLFormMethod
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a navigate() call for a Form navigation
  */
trait SubmissionNavigateOptions
  extends StObject
     with BaseNavigateOptions {
  
  var formData: FormData
  
  var formEncType: js.UndefOr[FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[HTMLFormMethod] = js.undefined
}
object SubmissionNavigateOptions {
  
  inline def apply(formData: FormData): SubmissionNavigateOptions = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmissionNavigateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmissionNavigateOptions] (val x: Self) extends AnyVal {
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: HTMLFormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
  }
}
