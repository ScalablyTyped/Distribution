package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OrderbookRecord extends Record {
  var asks: js.Array[stellarDashSdkLib.Anon_Price]
  var bids: js.Array[stellarDashSdkLib.Anon_Price]
  var buying: Asset
  var selling: Asset
}

