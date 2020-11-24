package typings.reactRelay.anon

import typings.reactRelay.entryPointContainerReactMod.GetComponentFromPreloadedEntryPoint
import typings.reactRelay.entryPointContainerReactMod.GetRuntimePropsFromComponent
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryPointReference[TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */] extends js.Object {
  
  var entryPointReference: TPreloadedEntryPoint = js.native
  
  var props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]] = js.native
}
object EntryPointReference {
  
  @scala.inline
  def apply[TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */](
    entryPointReference: TPreloadedEntryPoint,
    props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
  ): EntryPointReference[TPreloadedEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointReference[TPreloadedEntryPoint]]
  }
  
  @scala.inline
  implicit class EntryPointReferenceOps[Self <: EntryPointReference[_], TPreloadedEntryPoint /* <: PreloadedEntryPoint[_] */] (val x: Self with EntryPointReference[TPreloadedEntryPoint]) extends AnyVal {
    
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
    def setEntryPointReference(value: TPreloadedEntryPoint): Self = this.set("entryPointReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
