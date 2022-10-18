package typings.railsUjs

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsFormMod {
  
  @JSImport("@rails/ujs/utils/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formElements(form: Element, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("formElements")(form.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def serializeElement(element: Element, additionalParam: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeElement")(element.asInstanceOf[js.Any], additionalParam.asInstanceOf[js.Any])).asInstanceOf[String]
}
