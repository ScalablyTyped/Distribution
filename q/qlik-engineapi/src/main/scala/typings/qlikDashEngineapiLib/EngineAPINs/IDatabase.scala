package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database...
  */
trait IDatabase extends js.Object {
  /**
    * Is set to true if the database is set by default.
    */
  var qIsDefault: scala.Boolean
  /**
    * Name of the database.
    */
  var qName: java.lang.String
}

object IDatabase {
  @scala.inline
  def apply(qIsDefault: scala.Boolean, qName: java.lang.String): IDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qIsDefault")(qIsDefault)
    __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[IDatabase]
  }
}

