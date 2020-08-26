package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/search/findMatchIndex", JSImport.Namespace)
@js.native
object findMatchIndexMod extends js.Object {
  def default(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  def default(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = js.native
  type FindMatchIndex = js.Function4[
    /* value */ String, 
    /* values */ js.Array[String], 
    /* startIndex */ Double, 
    /* isSelfMatchable */ js.UndefOr[Boolean], 
    Double
  ]
}

