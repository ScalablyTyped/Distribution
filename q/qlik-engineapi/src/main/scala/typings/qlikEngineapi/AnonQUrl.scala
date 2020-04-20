package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: String
  /**
    * URL of the Service
    */
  var qUrl: String
}

object AnonQUrl {
  @scala.inline
  def apply(qName: String, qUrl: String): AnonQUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQUrl]
  }
}

