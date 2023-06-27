package typings.remixRunRouter.distUtilsMod

import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.remixRunRouter.anon.Text
  - typings.remixRunRouter.anon.FormActionFormData
  - typings.remixRunRouter.anon.FormDataFormEncType
*/
trait Submission extends StObject
object Submission {
  
  inline def FormActionFormData(
    formAction: String,
    formData: Unit,
    formEncType: FormEncType,
    formMethod: FormMethod | V7FormMethod,
    text: Unit
  ): typings.remixRunRouter.anon.FormActionFormData = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], json = null)
    __obj.asInstanceOf[typings.remixRunRouter.anon.FormActionFormData]
  }
  
  inline def FormDataFormEncType(
    formAction: String,
    formData: Unit,
    formEncType: FormEncType,
    formMethod: FormMethod | V7FormMethod,
    json: Unit,
    text: String
  ): typings.remixRunRouter.anon.FormDataFormEncType = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.anon.FormDataFormEncType]
  }
  
  inline def Text(
    formAction: String,
    formData: FormData,
    formEncType: FormEncType,
    formMethod: FormMethod | V7FormMethod,
    json: Unit,
    text: Unit
  ): typings.remixRunRouter.anon.Text = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.anon.Text]
  }
}
