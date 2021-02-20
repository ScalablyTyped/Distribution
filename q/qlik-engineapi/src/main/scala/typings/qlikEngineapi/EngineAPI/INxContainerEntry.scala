package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxContainerEntry...
  */
@js.native
trait INxContainerEntry[T] extends StObject {
  
  /**
    * Set of data
    */
  var qData: T = js.native
  
  /**
    * Information about the object
    */
  var qInfo: INxInfo = js.native
  
  /**
    * Information on publishing and permissions
    */
  var qMeta: INxMeta = js.native
}
object INxContainerEntry {
  
  @scala.inline
  def apply[T](qData: T, qInfo: INxInfo, qMeta: INxMeta): INxContainerEntry[T] = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContainerEntry[T]]
  }
  
  @scala.inline
  implicit class INxContainerEntryMutableBuilder[Self <: INxContainerEntry[_], T] (val x: Self with INxContainerEntry[T]) extends AnyVal {
    
    @scala.inline
    def setQData(value: T): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
