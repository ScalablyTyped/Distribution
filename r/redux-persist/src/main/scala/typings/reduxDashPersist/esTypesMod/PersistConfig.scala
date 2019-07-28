package typings.reduxDashPersist.esTypesMod

import typings.reduxDashPersist.esCreateTransformMod.Transform
import typings.reduxDashPersist.reduxDashPersistNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistConfig extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Used for migrations.
    */
  var getStoredState: js.UndefOr[js.Function1[/* config */ PersistConfig, js.Promise[PersistedState]]] = js.undefined
  var key: String
  /**
    * **Depricated:** keyPrefix is going to be removed in v6.
    */
  var keyPrefix: js.UndefOr[String] = js.undefined
  var migrate: js.UndefOr[
    js.Function2[/* state */ PersistedState, /* versionKey */ Double, js.Promise[PersistedState]]
  ] = js.undefined
  var serialize: js.UndefOr[Boolean] = js.undefined
  var stateReconciler: js.UndefOr[`false` | js.Function] = js.undefined
  var storage: WebStorage | AsyncStorage | LocalForageStorage | Storage
  var throttle: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform[_, _]]] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object PersistConfig {
  @scala.inline
  def apply(
    key: String,
    storage: WebStorage | AsyncStorage | LocalForageStorage | Storage,
    blacklist: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    getStoredState: /* config */ PersistConfig => js.Promise[PersistedState] = null,
    keyPrefix: String = null,
    migrate: (/* state */ PersistedState, /* versionKey */ Double) => js.Promise[PersistedState] = null,
    serialize: js.UndefOr[Boolean] = js.undefined,
    stateReconciler: `false` | js.Function = null,
    throttle: Int | Double = null,
    timeout: Int | Double = null,
    transforms: js.Array[Transform[_, _]] = null,
    version: Int | Double = null,
    whitelist: js.Array[String] = null
  ): PersistConfig = {
    val __obj = js.Dynamic.literal(key = key, storage = storage.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (getStoredState != null) __obj.updateDynamic("getStoredState")(js.Any.fromFunction1(getStoredState))
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (migrate != null) __obj.updateDynamic("migrate")(js.Any.fromFunction2(migrate))
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

