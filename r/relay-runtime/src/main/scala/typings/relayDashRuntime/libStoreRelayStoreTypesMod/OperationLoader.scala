package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationLoader extends js.Object {
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: js.Any): NormalizationSplitOperation
  /**
    * Asynchronously load an operation.
    */
  def load(reference: js.Any): js.Promise[NormalizationSplitOperation]
}

object OperationLoader {
  @scala.inline
  def apply(
    get: js.Any => NormalizationSplitOperation,
    load: js.Any => js.Promise[NormalizationSplitOperation]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
  
    __obj.asInstanceOf[OperationLoader]
  }
}

