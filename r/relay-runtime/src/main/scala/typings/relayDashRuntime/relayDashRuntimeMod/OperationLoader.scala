package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationLoader extends js.Object {
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | Null]
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
}

object OperationLoader {
  @scala.inline
  def apply(
    get: js.Any => js.UndefOr[NormalizationSplitOperation | Null],
    load: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
  
    __obj.asInstanceOf[OperationLoader]
  }
}

