package typings
package ravenDashJsLib.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RavenNs {
  type BreadcrumbType = ravenDashJsLib.ravenDashJsLibStrings.navigation | ravenDashJsLib.ravenDashJsLibStrings.http
  type LogLevel = ravenDashJsLib.ravenDashJsLibStrings.critical | ravenDashJsLib.ravenDashJsLibStrings.error | ravenDashJsLib.ravenDashJsLibStrings.warning | ravenDashJsLib.ravenDashJsLibStrings.info | ravenDashJsLib.ravenDashJsLibStrings.debug | ravenDashJsLib.ravenDashJsLibStrings.warn | ravenDashJsLib.ravenDashJsLibStrings.log
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | scala.Unit
  ]
  type RavenPlugin = js.Function2[/* raven */ RavenStatic, /* repeated */ js.Any, RavenStatic]
}
