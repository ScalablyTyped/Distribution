package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig[TPayload, TNode, TOperation] extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig] = js.undefined
  var onCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* payload */ TPayload, scala.Unit]] = js.undefined
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.COperationSelector[TNode, TOperation]
}

object Anon_CacheConfig {
  @scala.inline
  def apply[TPayload, TNode, TOperation](
    operation: relayDashRuntimeLib.relayDashRuntimeMod.COperationSelector[TNode, TOperation],
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig = null,
    onCompleted: () => scala.Unit = null,
    onError: /* error */ stdLib.Error => scala.Unit = null,
    onNext: /* payload */ TPayload => scala.Unit = null
  ): Anon_CacheConfig[TPayload, TNode, TOperation] = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[Anon_CacheConfig[TPayload, TNode, TOperation]]
  }
}

