package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxContainerEntry...
  */
trait INxContainerEntry[T] extends StObject {
  
  /**
    * Set of data
    */
  var qData: T
  
  /**
    * Information about the object
    */
  var qInfo: INxInfo
  
  /**
    * Information on publishing and permissions
    */
  var qMeta: INxMeta
}
object INxContainerEntry {
  
  inline def apply[T](qData: T, qInfo: INxInfo, qMeta: INxMeta): INxContainerEntry[T] = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContainerEntry[T]]
  }
  
  extension [Self <: INxContainerEntry[?], T](x: Self & INxContainerEntry[T]) {
    
    inline def setQData(value: T): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
