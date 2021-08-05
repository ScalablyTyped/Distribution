package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxPage extends StObject {
  
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on
    * whether the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: Double
  
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: Double
  
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: Double
  
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether
    * the cells are expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: Double
}
object INxPage {
  
  inline def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): INxPage = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPage]
  }
  
  extension [Self <: INxPage](x: Self) {
    
    inline def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    inline def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    inline def setQTop(value: Double): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    inline def setQWidth(value: Double): Self = StObject.set(x, "qWidth", value.asInstanceOf[js.Any])
  }
}
