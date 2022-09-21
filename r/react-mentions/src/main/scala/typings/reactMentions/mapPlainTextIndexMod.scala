package typings.reactMentions

import typings.reactMentions.reactMentionsStrings.END
import typings.reactMentions.reactMentionsStrings.NULL
import typings.reactMentions.reactMentionsStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapPlainTextIndexMod {
  
  @JSImport("react-mentions/lib/utils/mapPlainTextIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapPlainTextIndex(value: String, markup: String, indexInPlainText: Double, inMarkupCorrection: START | END | NULL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPlainTextIndex")(value.asInstanceOf[js.Any], markup.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any], inMarkupCorrection.asInstanceOf[js.Any])).asInstanceOf[Double]
}
