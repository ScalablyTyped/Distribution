package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationManifest
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]]

object MigrationManifest {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]] = null
  ): MigrationManifest = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MigrationManifest]
  }
}

