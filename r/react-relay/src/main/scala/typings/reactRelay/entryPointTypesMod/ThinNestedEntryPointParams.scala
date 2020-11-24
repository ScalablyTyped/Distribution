package typings.reactRelay.entryPointTypesMod

import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  entryPoint :TEntryPoint,   entryPointParams :react-relay.react-relay/lib/relay-experimental/helpers.GetEntryPointParamsFromEntryPoint<TEntryPoint>}> */
@js.native
trait ThinNestedEntryPointParams[TEntryPoint] extends js.Object {
  
  val entryPoint: TEntryPoint = js.native
  
  val entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint] = js.native
}
object ThinNestedEntryPointParams {
  
  @scala.inline
  def apply[TEntryPoint](entryPoint: TEntryPoint, entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]): ThinNestedEntryPointParams[TEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPoint]]
  }
  
  @scala.inline
  implicit class ThinNestedEntryPointParamsOps[Self <: ThinNestedEntryPointParams[_], TEntryPoint] (val x: Self with ThinNestedEntryPointParams[TEntryPoint]) extends AnyVal {
    
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
    def setEntryPoint(value: TEntryPoint): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointParams(value: GetEntryPointParamsFromEntryPoint[TEntryPoint]): Self = this.set("entryPointParams", value.asInstanceOf[js.Any])
  }
}
