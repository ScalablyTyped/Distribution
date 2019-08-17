package typings.scDashBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scbrokerMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import typings.socketclusterDashServer.socketclusterDashServerMod.SCServerSocket

  type Subscriptions = NumberDictionary[StringDictionary[SCServerSocket]]
}
