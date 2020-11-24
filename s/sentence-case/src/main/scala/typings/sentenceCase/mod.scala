package typings.sentenceCase

import typings.noCase.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sentence-case", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sentenceCase(input: String): String = js.native
  def sentenceCase(input: String, options: Options): String = js.native
  
  def sentenceCaseTransform(input: String, index: Double): String = js.native
}
