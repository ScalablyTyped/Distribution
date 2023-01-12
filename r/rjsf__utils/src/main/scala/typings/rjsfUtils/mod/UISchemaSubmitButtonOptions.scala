package typings.rjsfUtils.mod

import typings.rjsfUtils.anon.GenericObjectTypedisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type that defines how to change the behavior of the submit button for the form */
trait UISchemaSubmitButtonOptions extends StObject {
  
  /** Flag, if `true`, removes the submit button completely from the form */
  var norender: js.UndefOr[Boolean] = js.undefined
  
  /** Any other props to be passed to the submit button itself */
  var props: js.UndefOr[GenericObjectTypedisabled] = js.undefined
  
  /** The text of the submit button. Set to "Submit" by default */
  var submitText: js.UndefOr[String] = js.undefined
}
object UISchemaSubmitButtonOptions {
  
  inline def apply(): UISchemaSubmitButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISchemaSubmitButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UISchemaSubmitButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setNorender(value: Boolean): Self = StObject.set(x, "norender", value.asInstanceOf[js.Any])
    
    inline def setNorenderUndefined: Self = StObject.set(x, "norender", js.undefined)
    
    inline def setProps(value: GenericObjectTypedisabled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
    
    inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
  }
}
