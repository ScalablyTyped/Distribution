package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistConfig extends js.Object {
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used for migrations.
    */
  var getStoredState: js.UndefOr[js.Function1[/* config */ PersistConfig, js.Promise[PersistedState]]] = js.undefined
  var key: java.lang.String
  /**
    * **Depricated:** keyPrefix is going to be removed in v6.
    */
  var keyPrefix: js.UndefOr[java.lang.String] = js.undefined
  var migrate: js.UndefOr[
    js.Function2[
      /* state */ PersistedState, 
      /* versionKey */ scala.Double, 
      js.Promise[PersistedState]
    ]
  ] = js.undefined
  var serialize: js.UndefOr[scala.Boolean] = js.undefined
  var stateReconciler: js.UndefOr[reduxDashPersistLib.reduxDashPersistLibNumbers.`false` | js.Function] = js.undefined
  var storage: WebStorage | AsyncStorage | LocalForageStorage | Storage
  var throttle: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transforms: js.UndefOr[js.Array[reduxDashPersistLib.esCreateTransformMod.Transform[_, _]]] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

