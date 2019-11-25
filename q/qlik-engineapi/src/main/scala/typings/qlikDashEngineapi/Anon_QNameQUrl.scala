package typings.qlikDashEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QNameQUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: String
  /**
    * URL of the Service
    */
  var qUrl: String
}

object Anon_QNameQUrl {
  @scala.inline
  def apply(qName: String, qUrl: String): Anon_QNameQUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QNameQUrl]
  }
}

