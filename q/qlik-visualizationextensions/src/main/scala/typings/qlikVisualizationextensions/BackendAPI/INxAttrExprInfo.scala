package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxAttrExprInfo extends StObject {
  
  /**
    * Is continuous axis used.
    */
  var qContinuousAxes: Boolean
  
  /**
    * Corresponds to the label of the dimension that is selected.
    */
  var qFallbackTitle: String
  
  /**
    * Is a cyclic dimension used.
    */
  var qIsCyclic: Boolean
  
  /**
    * Maximum value.
    */
  var qMax: Double
  
  /**
    * Minimum value.
    */
  var qMin: Double
}
object INxAttrExprInfo {
  
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): INxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprInfo]
  }
  
  @scala.inline
  implicit class INxAttrExprInfoMutableBuilder[Self <: INxAttrExprInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQContinuousAxes(value: Boolean): Self = StObject.set(x, "qContinuousAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsCyclic(value: Boolean): Self = StObject.set(x, "qIsCyclic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
  }
}
