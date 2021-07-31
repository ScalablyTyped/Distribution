package typings.reactLatexNext

import typings.reactLatexNext.typesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderLatexMod {
  
  @JSImport("react-latex-next/dist/renderLatex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(text: String, delimiters: js.Array[Delimiter], strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
}
