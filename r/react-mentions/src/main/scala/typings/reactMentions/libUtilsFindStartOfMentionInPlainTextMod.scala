package typings.reactMentions

import typings.reactMentions.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsFindStartOfMentionInPlainTextMod {
  
  @JSImport("react-mentions/lib/utils/findStartOfMentionInPlainText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findStartOfMentionInPlainText(value: String, config: js.Array[PartialConfig], indexInPlainText: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findStartOfMentionInPlainText")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any])).asInstanceOf[Double]
}
