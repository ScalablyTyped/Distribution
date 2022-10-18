package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchFindMatchIndexMod {
  
  @JSImport("@react-md/utils/types/search/findMatchIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchInRange")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], isSelfMatchable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type FindMatchIndex_ = js.Function4[
    /* value */ String, 
    /* values */ js.Array[String], 
    /* startIndex */ Double, 
    /* isSelfMatchable */ js.UndefOr[Boolean], 
    Double
  ]
}
