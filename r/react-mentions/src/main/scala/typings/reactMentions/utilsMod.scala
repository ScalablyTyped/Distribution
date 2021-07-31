package typings.reactMentions

import typings.reactMentions.mod.DisplayTransformFunc
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-mentions/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mapPlainTextIndex(
    value: String,
    markup: String,
    indexInPlainText: Double,
    inMarkupCorrection: String,
    displayTransform: DisplayTransformFunc,
    regex: RegExp
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPlainTextIndex")(value.asInstanceOf[js.Any], markup.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any], inMarkupCorrection.asInstanceOf[js.Any], displayTransform.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[Double]
}
