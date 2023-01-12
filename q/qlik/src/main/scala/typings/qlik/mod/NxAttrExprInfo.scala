package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttrExprInfo extends StObject {
  
  var qContinuousAxes: Boolean
  
  var qFallbackTitle: String
  
  var qIsCyclic: Boolean
  
  var qMax: Double
  
  var qMin: Double
}
object NxAttrExprInfo {
  
  inline def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrExprInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxAttrExprInfo] (val x: Self) extends AnyVal {
    
    inline def setQContinuousAxes(value: Boolean): Self = StObject.set(x, "qContinuousAxes", value.asInstanceOf[js.Any])
    
    inline def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    inline def setQIsCyclic(value: Boolean): Self = StObject.set(x, "qIsCyclic", value.asInstanceOf[js.Any])
    
    inline def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    inline def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
  }
}
