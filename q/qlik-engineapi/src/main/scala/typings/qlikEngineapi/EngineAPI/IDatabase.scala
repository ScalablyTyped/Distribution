package typings.qlikEngineapi.EngineAPI

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
  var qIsDefault: Boolean
  /**
    * Name of the database.
    */
  var qName: String
}

object IDatabase {
  @scala.inline
  def apply(qIsDefault: Boolean, qName: String): IDatabase = {
    val __obj = js.Dynamic.literal(qIsDefault = qIsDefault.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabase]
  }
}

