package typings.reduxDashPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.reduxDashPersist.Anon_Persist

  type MigrationManifest = StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]]
  type PersistMigrate = js.Function2[/* state */ PersistedState, /* currentVersion */ Double, js.Promise[PersistedState]]
  type PersistedState = js.UndefOr[Anon_Persist]
  type PersistorSubscribeCallback = js.Function0[js.Any]
  type RehydrateErrorType = js.Any
  type StateReconciler[S] = js.Function4[
    /* inboundState */ js.Any, 
    /* state */ S, 
    /* reducedState */ S, 
    /* config */ PersistConfig[S, js.Any, js.Any, js.Any], 
    S
  ]
  /**
    * @desc
    * `SS` means SubState
    * `ESS` means EndSubState
    * `S` means State
    */
  type TransformInbound[SS, ESS, S] = js.Function3[/* subState */ SS, /* key */ String, /* state */ S, ESS]
  /**
    * @desc
    * `SS` means SubState
    * `HSS` means HydratedSubState
    * `RS` means RawState
    */
  type TransformOutbound[SS, HSS, RS] = js.Function3[/* state */ SS, /* key */ String, /* rawState */ RS, HSS]
}
