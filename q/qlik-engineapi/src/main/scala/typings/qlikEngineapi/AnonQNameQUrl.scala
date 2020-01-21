package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQNameQUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: String
  /**
    * URL of the Service
    */
  var qUrl: String
}

object AnonQNameQUrl {
  @scala.inline
  def apply(qName: String, qUrl: String): AnonQNameQUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQNameQUrl]
  }
}

