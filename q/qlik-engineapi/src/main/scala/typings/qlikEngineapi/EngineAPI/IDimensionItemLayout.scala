package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DimensionItemLayout...
  */
@js.native
trait IDimensionItemLayout extends StObject {
  
  var qData: Null = js.native
  
  var qInfo: INxInfo = js.native
  
  var qMeta: INxMetaTitleDescriptionTag = js.native
}
object IDimensionItemLayout {
  
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IDimensionItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionItemLayout]
  }
  
  @scala.inline
  implicit class IDimensionItemLayoutMutableBuilder[Self <: IDimensionItemLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: Null): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMetaTitleDescriptionTag): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
