package typings
package routeDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routeDashNodeMod {
  type Callback = js.Function1[/* repeated */js.Any, scala.Unit]
  type QueryParamsMode = routeDashNodeLib.routeDashNodeLibStrings.default | routeDashNodeLib.routeDashNodeLibStrings.strict | routeDashNodeLib.routeDashNodeLibStrings.loose
  type Route = RouteNode | RouteDefinition
  type TrailingSlashMode = routeDashNodeLib.routeDashNodeLibStrings.default | routeDashNodeLib.routeDashNodeLibStrings.never | routeDashNodeLib.routeDashNodeLibStrings.always
}
