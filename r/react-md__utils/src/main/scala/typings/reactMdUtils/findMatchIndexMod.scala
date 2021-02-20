package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMatchIndexMod {
  
  @JSImport("@react-md/utils/types/search/findMatchIndex", "findMatchInRange")
  @js.native
  def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = js.native
  
  @JSImport("@react-md/utils/types/search/findMatchIndex", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = js.native
  @JSImport("@react-md/utils/types/search/findMatchIndex", "findMatchIndex")
  @js.native
  def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = js.native
  
  type FindMatchIndex_ = js.Function4[
    /* value */ String, 
    /* values */ js.Array[String], 
    /* startIndex */ Double, 
    /* isSelfMatchable */ js.UndefOr[Boolean], 
    Double
  ]
}
