package typings.snowballDashStemmers.snowballDashStemmersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stemmer extends js.Object {
  def stem(term: String): String
}

object Stemmer {
  @scala.inline
  def apply(stem: String => String): Stemmer = {
    val __obj = js.Dynamic.literal(stem = js.Any.fromFunction1(stem))
  
    __obj.asInstanceOf[Stemmer]
  }
}

