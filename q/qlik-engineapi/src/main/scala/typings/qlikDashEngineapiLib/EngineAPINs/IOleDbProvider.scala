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

