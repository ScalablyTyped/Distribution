package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends StObject {
  
  var qHyperCube: HyperCube = js.native
  
  var qInfo: NxInfo = js.native
  
  var qSelectionInfo: Selectionobject = js.native
}
object Layout {
  
  @scala.inline
  def apply(qHyperCube: HyperCube, qInfo: NxInfo, qSelectionInfo: Selectionobject): Layout = {
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHyperCube(value: HyperCube): Self = StObject.set(x, "qHyperCube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: NxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectionInfo(value: Selectionobject): Self = StObject.set(x, "qSelectionInfo", value.asInstanceOf[js.Any])
  }
}
