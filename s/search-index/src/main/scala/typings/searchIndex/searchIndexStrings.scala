package typings.searchIndex

import typings.searchIndex.mod.Direction
import typings.searchIndex.mod.Score
import typings.searchIndex.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchIndexStrings {
  
  @js.native
  sealed trait ALPHABETIC
    extends StObject
       with Type
  inline def ALPHABETIC: ALPHABETIC = "ALPHABETIC".asInstanceOf[ALPHABETIC]
  
  @js.native
  sealed trait ASCENDING
    extends StObject
       with Direction
  inline def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  
  @js.native
  sealed trait CONCAT
    extends StObject
       with Score
  inline def CONCAT: CONCAT = "CONCAT".asInstanceOf[CONCAT]
  
  @js.native
  sealed trait DESCENDING
    extends StObject
       with Direction
  inline def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with Type
  inline def NUMERIC: NUMERIC = "NUMERIC".asInstanceOf[NUMERIC]
  
  @js.native
  sealed trait PRODUCT
    extends StObject
       with Score
  inline def PRODUCT: PRODUCT = "PRODUCT".asInstanceOf[PRODUCT]
  
  @js.native
  sealed trait ReplaceValues extends StObject
  inline def ReplaceValues: ReplaceValues = "ReplaceValues".asInstanceOf[ReplaceValues]
  
  @js.native
  sealed trait SUM
    extends StObject
       with Score
  inline def SUM: SUM = "SUM".asInstanceOf[SUM]
  
  @js.native
  sealed trait TFIDF
    extends StObject
       with Score
  inline def TFIDF: TFIDF = "TFIDF".asInstanceOf[TFIDF]
}
