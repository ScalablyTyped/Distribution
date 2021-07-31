package typings.reactRelay.anon

import typings.reactRelay.entryPointContainerReactMod.GetComponentFromPreloadedEntryPoint
import typings.reactRelay.entryPointContainerReactMod.GetRuntimePropsFromComponent
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPointReference[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */] extends StObject {
  
  var entryPointReference: TPreloadedEntryPoint
  
  var props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
}
object EntryPointReference {
  
  @scala.inline
  def apply[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */](
    entryPointReference: TPreloadedEntryPoint,
    props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
  ): EntryPointReference[TPreloadedEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointReference[TPreloadedEntryPoint]]
  }
  
  @scala.inline
  implicit class EntryPointReferenceMutableBuilder[Self <: EntryPointReference[?], TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */] (val x: Self & EntryPointReference[TPreloadedEntryPoint]) extends AnyVal {
    
    @scala.inline
    def setEntryPointReference(value: TPreloadedEntryPoint): Self = StObject.set(x, "entryPointReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
