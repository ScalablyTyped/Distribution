package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: js.UndefOr[java.lang.String] = js.undefined
}

object INxMeta {
  @scala.inline
  def apply(qName: java.lang.String = null): INxMeta = {
    val __obj = js.Dynamic.literal()
    if (qName != null) __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxMeta]
  }
}

