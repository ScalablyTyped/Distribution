package typings.stringUnderscoreScore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  def score(word: java.lang.String): Double = js.native
  def score(word: java.lang.String, fuzzy: Double): Double = js.native
}

