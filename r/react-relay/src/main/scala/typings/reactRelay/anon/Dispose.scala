package typings.reactRelay.anon

import typings.reactRelay.entryPointTypesMod.PreloadedQueries
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispose[TEntryPointComponent] extends js.Object {
  
  var dispose: DisposeFn = js.native
  
  var entryPoints: js.Any = js.native
  
  var extraProps: js.Any = js.native
  
  def getComponent(): TEntryPointComponent = js.native
  
  var isDisposed: Boolean = js.native
  
  var queries: PreloadedQueries[_] = js.native
  
  var rootModuleID: String = js.native
}
object Dispose {
  
  @scala.inline
  def apply[TEntryPointComponent](
    dispose: () => Unit,
    entryPoints: js.Any,
    extraProps: js.Any,
    getComponent: () => TEntryPointComponent,
    isDisposed: Boolean,
    queries: PreloadedQueries[_],
    rootModuleID: String
  ): Dispose[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), isDisposed = isDisposed.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose[TEntryPointComponent]]
  }
  
  @scala.inline
  implicit class DisposeOps[Self <: Dispose[_], TEntryPointComponent] (val x: Self with Dispose[TEntryPointComponent]) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntryPoints(value: js.Any): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraProps(value: js.Any): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComponent(value: () => TEntryPointComponent): Self = this.set("getComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueries(value: PreloadedQueries[_]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootModuleID(value: String): Self = this.set("rootModuleID", value.asInstanceOf[js.Any])
  }
}
