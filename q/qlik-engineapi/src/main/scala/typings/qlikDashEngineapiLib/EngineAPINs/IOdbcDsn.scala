package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qBit32: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Description of the ODBC connection.
    */
  var qDescription: java.lang.String
  /**
    * Name of the ODBC connection.
    */
  var qName: java.lang.String
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the connection is User DSN.
    * The connection works only for a specific user.
    */
  var qUserOnly: js.UndefOr[scala.Boolean] = js.undefined
}

