package typings.remixRunWebFormData

import org.scalablytyped.runtime.Instantiable1
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibDotnodeMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@remix-run/web-form-data/dist/src/lib.node", "FormData")
  @js.native
  /**
    * @param {HTMLFormElement} [form]
    */
  open class FormData ()
    extends typings.remixRunWebFormData.distSrcFormDataMod.FormData {
    def this(form: HTMLFormElement) = this()
  }
  @JSImport("@remix-run/web-form-data/dist/src/lib.node", "FormData")
  @js.native
  val FormData: Instantiable1[
    /* form */ js.UndefOr[HTMLFormElement], 
    typings.remixRunWebFormData.distSrcFormDataMod.FormData
  ] = js.native
}
