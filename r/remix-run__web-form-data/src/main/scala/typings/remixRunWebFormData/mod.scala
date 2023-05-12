package typings.remixRunWebFormData

import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@remix-run/web-form-data", "FormData")
  @js.native
  open class FormData ()
    extends StObject
       with typings.std.FormData {
    def this(form: HTMLFormElement) = this()
  }
}
