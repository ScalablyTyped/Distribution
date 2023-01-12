package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var qHyperCube: HyperCube
  
  var qInfo: NxInfo
  
  var qSelectionInfo: Selectionobject
}
object Layout {
  
  inline def apply(qHyperCube: HyperCube, qInfo: NxInfo, qSelectionInfo: Selectionobject): Layout = {
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    inline def setQHyperCube(value: HyperCube): Self = StObject.set(x, "qHyperCube", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: NxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQSelectionInfo(value: Selectionobject): Self = StObject.set(x, "qSelectionInfo", value.asInstanceOf[js.Any])
  }
}
