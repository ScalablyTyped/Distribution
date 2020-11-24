package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationLoader extends js.Object {
  
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | Null] = js.native
  
  /**
    * Asynchronously load an operation.
    */
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]] = js.native
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
  
  @scala.inline
  implicit class OperationLoaderOps[Self <: OperationLoader] (val x: Self) extends AnyVal {
    
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
    def setGet(value: js.Any => js.UndefOr[NormalizationSplitOperation | Null]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad(value: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]): Self = this.set("load", js.Any.fromFunction1(value))
  }
}
