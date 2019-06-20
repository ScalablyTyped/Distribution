package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationLoader extends js.Object {
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | scala.Null]
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | scala.Null]]
}

object OperationLoader {
  @scala.inline
  def apply(
    get: js.Any => js.UndefOr[NormalizationSplitOperation | scala.Null],
    load: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | scala.Null]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
  
    __obj.asInstanceOf[OperationLoader]
  }
}

