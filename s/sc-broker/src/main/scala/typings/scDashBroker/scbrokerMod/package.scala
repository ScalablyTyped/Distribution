package typings.scDashBroker

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.socketclusterDashServer.socketclusterDashServerMod.SCServerSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scbrokerMod {
  type Subscriptions = NumberDictionary[StringDictionary[SCServerSocket]]
}
