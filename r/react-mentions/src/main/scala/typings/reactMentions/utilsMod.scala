package typings.reactMentions

import typings.reactMentions.mod.DisplayTransformFunc
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-mentions/lib/utils", "mapPlainTextIndex")
  @js.native
  def mapPlainTextIndex(
    value: String,
    markup: String,
    indexInPlainText: Double,
    inMarkupCorrection: String,
    displayTransform: DisplayTransformFunc,
    regex: RegExp
  ): Double = js.native
}
