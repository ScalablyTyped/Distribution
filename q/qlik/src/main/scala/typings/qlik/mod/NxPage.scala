package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxPage extends StObject {
  
  var qHeight: js.UndefOr[Double] = js.undefined
  
  var qLeft: js.UndefOr[Double] = js.undefined
  
  var qTop: js.UndefOr[Double] = js.undefined
  
  var qWidth: js.UndefOr[Double] = js.undefined
}
object NxPage {
  
  @scala.inline
  def apply(): NxPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NxPage]
  }
  
  @scala.inline
  implicit class NxPageMutableBuilder[Self <: NxPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHeightUndefined: Self = StObject.set(x, "qHeight", js.undefined)
    
    @scala.inline
    def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeftUndefined: Self = StObject.set(x, "qLeft", js.undefined)
    
    @scala.inline
    def setQTop(value: Double): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTopUndefined: Self = StObject.set(x, "qTop", js.undefined)
    
    @scala.inline
    def setQWidth(value: Double): Self = StObject.set(x, "qWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQWidthUndefined: Self = StObject.set(x, "qWidth", js.undefined)
  }
}
