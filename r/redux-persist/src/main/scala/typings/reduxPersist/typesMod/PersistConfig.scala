package typings.reduxPersist.typesMod

import typings.reduxPersist.reduxPersistBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @desc
  * `HSS` means HydratedSubState
  * `ESS` means EndSubState
  * `S` means State
  * `RS` means RawState
  */
@js.native
trait PersistConfig[S, RS, HSS, ESS] extends js.Object {
  
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * @desc Used for migrations.
    */
  var getStoredState: js.UndefOr[
    js.Function1[/* config */ PersistConfig[S, RS, HSS, ESS], js.Promise[PersistedState]]
  ] = js.native
  
  var key: String = js.native
  
  /**
    * @deprecated keyPrefix is going to be removed in v6.
    */
  var keyPrefix: js.UndefOr[String] = js.native
  
  var migrate: js.UndefOr[PersistMigrate] = js.native
  
  var serialize: js.UndefOr[Boolean] = js.native
  
  var stateReconciler: js.UndefOr[`false` | StateReconciler[S]] = js.native
  
  var storage: Storage = js.native
  
  var throttle: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transforms: js.UndefOr[js.Array[Transform[HSS, ESS, S, RS]]] = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var whitelist: js.UndefOr[js.Array[String]] = js.native
  
  var writeFailHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
}
object PersistConfig {
  
  @scala.inline
  def apply[S, RS, HSS, ESS](key: String, storage: Storage): PersistConfig[S, RS, HSS, ESS] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistConfig[S, RS, HSS, ESS]]
  }
  
  @scala.inline
  implicit class PersistConfigOps[Self <: PersistConfig[_, _, _, _], S, RS, HSS, ESS] (val x: Self with (PersistConfig[S, RS, HSS, ESS])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setGetStoredState(value: /* config */ PersistConfig[S, RS, HSS, ESS] => js.Promise[PersistedState]): Self = this.set("getStoredState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetStoredState: Self = this.set("getStoredState", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    
    @scala.inline
    def setMigrate(value: (/* state */ PersistedState, /* currentVersion */ Double) => js.Promise[PersistedState]): Self = this.set("migrate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMigrate: Self = this.set("migrate", js.undefined)
    
    @scala.inline
    def setSerialize(value: Boolean): Self = this.set("serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setStateReconcilerFunction4(
      value: (/* inboundState */ js.Any, S, S, /* config */ PersistConfig[S, js.Any, js.Any, js.Any]) => S
    ): Self = this.set("stateReconciler", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStateReconciler(value: `false` | StateReconciler[S]): Self = this.set("stateReconciler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReconciler: Self = this.set("stateReconciler", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: (Transform[HSS, ESS, S, RS])*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: js.Array[Transform[HSS, ESS, S, RS]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
    
    @scala.inline
    def setWriteFailHandler(value: /* err */ Error => Unit): Self = this.set("writeFailHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWriteFailHandler: Self = this.set("writeFailHandler", js.undefined)
  }
}
