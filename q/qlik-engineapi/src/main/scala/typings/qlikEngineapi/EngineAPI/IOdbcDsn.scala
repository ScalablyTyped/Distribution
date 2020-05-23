package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OdbcDsn...
  */
trait IOdbcDsn extends js.Object {
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of ODBC is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.undefined
  /**
    * Description of the ODBC connection.
    */
  var qDescription: String
  /**
    * Name of the ODBC connection.
    */
  var qName: String
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the connection is User DSN.
    * The connection works only for a specific user.
    */
  var qUserOnly: js.UndefOr[Boolean] = js.undefined
}

object IOdbcDsn {
  @scala.inline
  def apply(
    qDescription: String,
    qName: String,
    qBit32: js.UndefOr[Boolean] = js.undefined,
    qUserOnly: js.UndefOr[Boolean] = js.undefined
  ): IOdbcDsn = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    if (!js.isUndefined(qBit32)) __obj.updateDynamic("qBit32")(qBit32.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qUserOnly)) __obj.updateDynamic("qUserOnly")(qUserOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOdbcDsn]
  }
}

