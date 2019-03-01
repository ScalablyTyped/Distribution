package typings
package pusherDashJsLib.pusherDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pusherNs {
  type Authorizer = js.Function2[/* channel */ Channel, /* options */ Config, pusherDashJsLib.Anon_AuthInfo]
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, scala.Unit]
}
