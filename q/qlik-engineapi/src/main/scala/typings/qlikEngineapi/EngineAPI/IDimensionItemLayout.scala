package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DimensionItemLayout...
  */
trait IDimensionItemLayout extends StObject {
  
  var qData: Null
  
  var qInfo: INxInfo
  
  var qMeta: INxMetaTitleDescriptionTag
}
object IDimensionItemLayout {
  
  inline def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IDimensionItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionItemLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDimensionItemLayout] (val x: Self) extends AnyVal {
    
    inline def setQData(value: Null): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMetaTitleDescriptionTag): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
