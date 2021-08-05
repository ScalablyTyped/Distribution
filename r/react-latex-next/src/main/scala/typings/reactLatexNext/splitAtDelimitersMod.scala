package typings.reactLatexNext

import typings.reactLatexNext.typesMod.KatexData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitAtDelimitersMod {
  
  @JSImport("react-latex-next/dist/splitAtDelimiters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    startData: js.Array[KatexData],
    leftDelimiterValue: String,
    rightDelimiterValue: String,
    display: Boolean
  ): js.Array[KatexData] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(startData.asInstanceOf[js.Any], leftDelimiterValue.asInstanceOf[js.Any], rightDelimiterValue.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[js.Array[KatexData]]
}
