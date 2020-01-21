package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContainerEntry...
  */
trait INxContainerEntry[T] extends js.Object {
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
  @scala.inline
  def apply[T](qData: T, qInfo: INxInfo, qMeta: INxMeta): INxContainerEntry[T] = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxContainerEntry[T]]
  }
}

