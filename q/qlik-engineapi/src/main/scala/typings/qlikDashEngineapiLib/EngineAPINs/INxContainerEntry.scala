package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qData")(qData.asInstanceOf[js.Any])
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[INxContainerEntry[T]]
  }
}

