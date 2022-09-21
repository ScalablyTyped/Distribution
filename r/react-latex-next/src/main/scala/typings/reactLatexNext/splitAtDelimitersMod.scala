package typings.reactLatexNext

import typings.reactLatexNext.typesMod.Delimiter
import typings.reactLatexNext.typesMod.KatexData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitAtDelimitersMod {
  
  @JSImport("react-latex-next/dist/splitAtDelimiters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, delimiters: js.Array[Delimiter]): js.Array[KatexData] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], delimiters.asInstanceOf[js.Any])).asInstanceOf[js.Array[KatexData]]
}
