package typings.ravenDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ravenDashJsMod {
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | Unit
  ]
  type RavenPlugin = js.Function2[/* raven */ RavenStatic, /* repeated */ js.Any, RavenStatic]
}
