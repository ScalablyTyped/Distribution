package typings.qlikDashEngineapi.EngineAPI

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
  var qBit32: js.UndefOr[Boolean] = js.undefined
  /**
    * Description of the OLEDB provider.
    */
  var qDescription: String
  /**
    * Name of the OLEDB provider.
    */
  var qName: String
}

object IOleDbProvider {
  @scala.inline
  def apply(qDescription: String, qName: String, qBit32: js.UndefOr[Boolean] = js.undefined): IOleDbProvider = {
    val __obj = js.Dynamic.literal(qDescription = qDescription, qName = qName)
    if (!js.isUndefined(qBit32)) __obj.updateDynamic("qBit32")(qBit32)
    __obj.asInstanceOf[IOleDbProvider]
  }
}

