package typings.reactRelay.anon

import typings.reactRelay.relayHooksEntryPointContainerDotreactMod.GetComponentFromPreloadedEntryPoint
import typings.reactRelay.relayHooksEntryPointContainerDotreactMod.GetRuntimePropsFromComponent
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPointReference[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */] extends StObject {
  
  var entryPointReference: TPreloadedEntryPoint
  
  var props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
}
object EntryPointReference {
  
  inline def apply[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](
    entryPointReference: TPreloadedEntryPoint,
    props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
  ): EntryPointReference[TPreloadedEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointReference[TPreloadedEntryPoint]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryPointReference[?], TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */] (val x: Self & EntryPointReference[TPreloadedEntryPoint]) extends AnyVal {
    
    inline def setEntryPointReference(value: TPreloadedEntryPoint): Self = StObject.set(x, "entryPointReference", value.asInstanceOf[js.Any])
    
    inline def setProps(value: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
