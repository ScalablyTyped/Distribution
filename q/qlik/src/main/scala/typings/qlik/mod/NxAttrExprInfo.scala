package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAttrExprInfo extends StObject {
  
  var qContinuousAxes: Boolean = js.native
  
  var qFallbackTitle: String = js.native
  
  var qIsCyclic: Boolean = js.native
  
  var qMax: Double = js.native
  
  var qMin: Double = js.native
}
object NxAttrExprInfo {
  
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrExprInfo]
  }
  
  @scala.inline
  implicit class NxAttrExprInfoMutableBuilder[Self <: NxAttrExprInfo] (val x: Self) extends AnyVal {
    
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
