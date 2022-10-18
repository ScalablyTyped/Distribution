package typings.reactLatexNext

import org.scalablytyped.runtime.StringDictionary
import typings.reactLatexNext.distTypesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderLatexMod {
  
  @JSImport("react-latex-next/dist/renderLatex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, delimiters: js.Array[Delimiter], strict: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(text: String, delimiters: js.Array[Delimiter], strict: Boolean, macros: Macros): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], macros.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Macros = StringDictionary[String]
}
