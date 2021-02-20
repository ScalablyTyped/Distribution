package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLinkedObjectInfo...
  */
@js.native
trait INxLinkedObjectInfo extends StObject {
  
  /**
    * Information about the linked object.
    */
  var qInfo: INxInfo = js.native
  
  /**
    * Identifier of the root object.
    * If the linked object is a child, the root identifier is the identifier of the parent.
    * If the linked object is an app object, the root identifier is the same than the
    * identifier of the linked object since the linked object is a root object.
    */
  var qRootId: String = js.native
}
object INxLinkedObjectInfo {
  
  @scala.inline
  def apply(qInfo: INxInfo, qRootId: String): INxLinkedObjectInfo = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qRootId = qRootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLinkedObjectInfo]
  }
  
  @scala.inline
  implicit class INxLinkedObjectInfoMutableBuilder[Self <: INxLinkedObjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRootId(value: String): Self = StObject.set(x, "qRootId", value.asInstanceOf[js.Any])
  }
}
