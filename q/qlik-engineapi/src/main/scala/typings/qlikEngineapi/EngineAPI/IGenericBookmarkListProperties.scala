package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkListProperties width extend GenericProperties
  */
@js.native
trait IGenericBookmarkListProperties extends IGenericProperties {
  
  var qBookmarkListDef: IBookmarkListDef = js.native
  
  @JSName("qInfo")
  var qInfo_IGenericBookmarkListProperties: IGenericBookmarkListNxInfo = js.native
}
object IGenericBookmarkListProperties {
  
  @scala.inline
  def apply(qBookmarkListDef: IBookmarkListDef, qInfo: IGenericBookmarkListNxInfo): IGenericBookmarkListProperties = {
    val __obj = js.Dynamic.literal(qBookmarkListDef = qBookmarkListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListProperties]
  }
  
  @scala.inline
  implicit class IGenericBookmarkListPropertiesMutableBuilder[Self <: IGenericBookmarkListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBookmarkListDef(value: IBookmarkListDef): Self = StObject.set(x, "qBookmarkListDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: IGenericBookmarkListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
