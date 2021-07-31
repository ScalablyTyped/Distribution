package typings.reactRelay.anon

import typings.reactRelay.entryPointTypesMod.PreloadedQueries
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose[TEntryPointComponent] extends StObject {
  
  var dispose: DisposeFn
  
  var entryPoints: js.Any
  
  var extraProps: js.Any
  
  def getComponent(): TEntryPointComponent
  
  var isDisposed: Boolean
  
  var queries: PreloadedQueries[js.Any]
  
  var rootModuleID: String
}
object Dispose {
  
  @scala.inline
  def apply[TEntryPointComponent](
    dispose: () => Unit,
    entryPoints: js.Any,
    extraProps: js.Any,
    getComponent: () => TEntryPointComponent,
    isDisposed: Boolean,
    queries: PreloadedQueries[js.Any],
    rootModuleID: String
  ): Dispose[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), isDisposed = isDisposed.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose[TEntryPointComponent]]
  }
  
  @scala.inline
  implicit class DisposeMutableBuilder[Self <: Dispose[?], TEntryPointComponent] (val x: Self & Dispose[TEntryPointComponent]) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntryPoints(value: js.Any): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraProps(value: js.Any): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComponent(value: () => TEntryPointComponent): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueries(value: PreloadedQueries[js.Any]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootModuleID(value: String): Self = StObject.set(x, "rootModuleID", value.asInstanceOf[js.Any])
  }
}
