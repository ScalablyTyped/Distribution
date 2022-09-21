package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumsType extends StObject {
  
  var nextPanesSize: Double
  
  var nextReachedMinPanes: Double
  
  var prevPanesSize: Double
  
  var prevReachedMinPanes: Double
}
object SumsType {
  
  inline def apply(
    nextPanesSize: Double,
    nextReachedMinPanes: Double,
    prevPanesSize: Double,
    prevReachedMinPanes: Double
  ): SumsType = {
    val __obj = js.Dynamic.literal(nextPanesSize = nextPanesSize.asInstanceOf[js.Any], nextReachedMinPanes = nextReachedMinPanes.asInstanceOf[js.Any], prevPanesSize = prevPanesSize.asInstanceOf[js.Any], prevReachedMinPanes = prevReachedMinPanes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumsType]
  }
  
  extension [Self <: SumsType](x: Self) {
    
    inline def setNextPanesSize(value: Double): Self = StObject.set(x, "nextPanesSize", value.asInstanceOf[js.Any])
    
    inline def setNextReachedMinPanes(value: Double): Self = StObject.set(x, "nextReachedMinPanes", value.asInstanceOf[js.Any])
    
    inline def setPrevPanesSize(value: Double): Self = StObject.set(x, "prevPanesSize", value.asInstanceOf[js.Any])
    
    inline def setPrevReachedMinPanes(value: Double): Self = StObject.set(x, "prevReachedMinPanes", value.asInstanceOf[js.Any])
  }
}
