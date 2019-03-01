package typings
package ravenDashJsLib.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RavenNs {
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | scala.Unit
  ]
  type RavenPlugin = js.Function2[/* raven */ RavenStatic, /* repeated */ js.Any, RavenStatic]
}
