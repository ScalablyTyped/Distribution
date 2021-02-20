package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionsListProperties width extend GenericBaseLayout
  */
@js.native
trait IMeassureListItemLayout extends IGenericBaseLayout {
  
  var qData: Null = js.native
  
  @JSName("qMeta")
  var qMeta_IMeassureListItemLayout: INxMetaTitleDescriptionTag = js.native
}
object IMeassureListItemLayout {
  
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IMeassureListItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeassureListItemLayout]
  }
  
  @scala.inline
  implicit class IMeassureListItemLayoutMutableBuilder[Self <: IMeassureListItemLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: Null): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMetaTitleDescriptionTag): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
