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

object PersistConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    storage: WebStorage | AsyncStorage | LocalForageStorage | Storage,
    blacklist: js.Array[java.lang.String] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    getStoredState: js.Function1[/* config */ PersistConfig, js.Promise[PersistedState]] = null,
    keyPrefix: java.lang.String = null,
    migrate: js.Function2[
      /* state */ PersistedState, 
      /* versionKey */ scala.Double, 
      js.Promise[PersistedState]
    ] = null,
    serialize: js.UndefOr[scala.Boolean] = js.undefined,
    stateReconciler: reduxDashPersistLib.reduxDashPersistLibNumbers.`false` | js.Function = null,
    throttle: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    transforms: js.Array[reduxDashPersistLib.esCreateTransformMod.Transform[_, _]] = null,
    version: scala.Int | scala.Double = null,
    whitelist: js.Array[java.lang.String] = null
  ): PersistConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (getStoredState != null) __obj.updateDynamic("getStoredState")(getStoredState)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (migrate != null) __obj.updateDynamic("migrate")(migrate)
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize)
    if (stateReconciler != null) __obj.updateDynamic("stateReconciler")(stateReconciler.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[PersistConfig]
  }
}

