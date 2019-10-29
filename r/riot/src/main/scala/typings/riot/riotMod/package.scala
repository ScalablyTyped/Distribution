package typings.riot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object riotMod {
  import typings.std.Map
  import typings.std.Set

  type ComponentEnhancer = js.Function1[/* component */ RiotComponent[js.Any, js.Any], RiotComponent[js.Any, js.Any]]
  type InstalledPluginsSet = Set[ComponentEnhancer]
  type RegisteredComponentsMap = Map[String, js.Function0[RiotComponent[js.Object, js.Object]]]
}
