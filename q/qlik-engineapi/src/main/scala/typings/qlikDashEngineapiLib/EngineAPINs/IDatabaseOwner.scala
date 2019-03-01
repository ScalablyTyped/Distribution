package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DatabaseOwner...
  */
trait IDatabaseOwner extends js.Object {
  /**
    * Name of the owner
    */
  var qName: java.lang.String
}

object IDatabaseOwner {
  @scala.inline
  def apply(qName: java.lang.String): IDatabaseOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[IDatabaseOwner]
  }
}

