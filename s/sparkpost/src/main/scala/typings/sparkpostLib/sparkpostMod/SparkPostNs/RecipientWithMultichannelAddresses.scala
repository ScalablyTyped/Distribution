package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RecipientWithMultichannelAddresses extends js.Object {
  /**
           * Address information for a recipient. At a minimum, address or multichannel_addresses is required.
           * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
           *
           */
  var address: js.UndefOr[Address | java.lang.String] = js.undefined
  /**
           * Array of Multichannel Address objects for a recipient. At a minimum, address or multichannel_addresses is required.
           * If both address and multichannel_addresses are specified only multichannel_addresses will be used.
           *
           */
  var multichannel_addresses: js.Array[MultichannelAddress]
}

