package typings.stringDashSimilarity.stringDashSimilarityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-similarity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compareTwoStrings(string1: String, string2: String): Double = js.native
  def findBestMatch(mainString: String, targetStrings: js.Array[String]): BestMatch = js.native
}

