package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * NxMeta...
  */
trait INxMeta extends js.Object {
  /**
    * Name.
    * >> This property is optional.
    */
  var qName: js.UndefOr[String] = js.undefined
}

object INxMeta {
  @scala.inline
  def apply(qName: String = null): INxMeta = {
    val __obj = js.Dynamic.literal()
    if (qName != null) __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxMeta]
  }
}

