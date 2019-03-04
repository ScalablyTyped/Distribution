package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OleDbProvider...
  */
trait IOleDbProvider extends js.Object {
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of the OLEDB provider is 32-bit.
    */
  var qBit32: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Description of the OLEDB provider.
    */
  var qDescription: java.lang.String
  /**
    * Name of the OLEDB provider.
    */
  var qName: java.lang.String
}

object IOleDbProvider {
  @scala.inline
  def apply(
    qDescription: java.lang.String,
    qName: java.lang.String,
    qBit32: js.UndefOr[scala.Boolean] = js.undefined
  ): IOleDbProvider = {
    val __obj = js.Dynamic.literal(qDescription = qDescription, qName = qName)
    if (!js.isUndefined(qBit32)) __obj.updateDynamic("qBit32")(qBit32)
    __obj.asInstanceOf[IOleDbProvider]
  }
}

