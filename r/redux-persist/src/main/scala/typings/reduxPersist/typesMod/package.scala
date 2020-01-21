package typings.reduxPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type MigrationManifest = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* state */ typings.reduxPersist.typesMod.PersistedState, 
      typings.reduxPersist.typesMod.PersistedState
    ]
  ]
  type PersistMigrate = js.Function2[
    /* state */ typings.reduxPersist.typesMod.PersistedState, 
    /* currentVersion */ scala.Double, 
    js.Promise[typings.reduxPersist.typesMod.PersistedState]
  ]
  type PersistedState = js.UndefOr[typings.reduxPersist.AnonPersist]
  type PersistorSubscribeCallback = js.Function0[js.Any]
  type RehydrateErrorType = js.Any
  type StateReconciler[S] = js.Function4[
    /* inboundState */ js.Any, 
    /* state */ S, 
    /* reducedState */ S, 
    /* config */ typings.reduxPersist.typesMod.PersistConfig[S, js.Any, js.Any, js.Any], 
    S
  ]
  /**
    * @desc
    * `SS` means SubState
    * `ESS` means EndSubState
    * `S` means State
    */
  type TransformInbound[SS, ESS, S] = js.Function3[/* subState */ SS, /* key */ java.lang.String, /* state */ S, ESS]
  /**
    * @desc
    * `SS` means SubState
    * `HSS` means HydratedSubState
    * `RS` means RawState
    */
  type TransformOutbound[SS, HSS, RS] = js.Function3[/* state */ SS, /* key */ java.lang.String, /* rawState */ RS, HSS]
}
