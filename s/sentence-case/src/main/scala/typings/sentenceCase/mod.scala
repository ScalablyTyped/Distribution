package typings.sentenceCase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sentence-case", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def sentenceCase(input: String): String = js.native
  def sentenceCase(
    input: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): String = js.native
  def sentenceCaseTransform(input: String, index: Double): String = js.native
}

