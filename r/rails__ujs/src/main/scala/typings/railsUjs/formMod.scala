package typings.railsUjs

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("@rails/ujs/utils/form", "formElements")
  @js.native
  def formElements(form: Element, selector: String): js.Array[HTMLElement] = js.native
  
  @JSImport("@rails/ujs/utils/form", "serializeElement")
  @js.native
  def serializeElement(element: Element, additionalParam: js.Any): String = js.native
}
