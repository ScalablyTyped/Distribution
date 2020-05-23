package typings.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Authorizer = js.Function2[
    /* channel */ typings.pusherJs.mod.Channel, 
    /* options */ typings.pusherJs.mod.Config, 
    typings.pusherJs.anon.Authorize
  ]
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, scala.Unit]
}
