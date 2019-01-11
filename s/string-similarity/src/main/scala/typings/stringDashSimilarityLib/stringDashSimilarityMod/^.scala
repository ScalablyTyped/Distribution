package typings
package stringDashSimilarityLib.stringDashSimilarityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-similarity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compareTwoStrings(string1: java.lang.String, string2: java.lang.String): scala.Double = js.native
  def findBestMatch(mainString: java.lang.String, targetStrings: js.Array[java.lang.String]): stringDashSimilarityLib.stringDashSimilarityMod.BestMatch = js.native
}

