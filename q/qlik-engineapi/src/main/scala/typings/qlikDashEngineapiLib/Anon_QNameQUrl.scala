package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QNameQUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: java.lang.String
  /**
    * URL of the Service
    */
  var qUrl: java.lang.String
}

object Anon_QNameQUrl {
  @scala.inline
  def apply(qName: java.lang.String, qUrl: java.lang.String): Anon_QNameQUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qUrl")(qUrl)
    __obj.asInstanceOf[Anon_QNameQUrl]
  }
}

