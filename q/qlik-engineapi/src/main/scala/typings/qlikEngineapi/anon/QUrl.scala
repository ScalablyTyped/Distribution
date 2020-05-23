package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: String
  /**
    * URL of the Service
    */
  var qUrl: String
}

object QUrl {
  @scala.inline
  def apply(qName: String, qUrl: String): QUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QUrl]
  }
}

