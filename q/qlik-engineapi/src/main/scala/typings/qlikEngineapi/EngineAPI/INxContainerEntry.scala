package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContainerEntry...
  */
@js.native
trait INxContainerEntry[T] extends js.Object {
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
  implicit class INxContainerEntryOps[Self <: INxContainerEntry[_], T] (val x: Self with INxContainerEntry[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQData(value: T): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInfo(value: INxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeta(value: INxMeta): Self = this.set("qMeta", value.asInstanceOf[js.Any])
  }
  
}

