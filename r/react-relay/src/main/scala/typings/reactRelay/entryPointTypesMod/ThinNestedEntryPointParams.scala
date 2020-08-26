package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoint :TEntryPoint,   entryPointParams :TEntryPointParams}> */
@js.native
trait ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] extends js.Object {
  val entryPoint: TEntryPoint = js.native
  val entryPointParams: TEntryPointParams = js.native
}

object ThinNestedEntryPointParams {
  @scala.inline
  def apply[TEntryPointParams, TEntryPoint](entryPoint: TEntryPoint, entryPointParams: TEntryPointParams): ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint]]
  }
  @scala.inline
  implicit class ThinNestedEntryPointParamsOps[Self <: ThinNestedEntryPointParams[_, _], TEntryPointParams, TEntryPoint] (val x: Self with (ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint])) extends AnyVal {
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
    def setEntryPointParams(value: TEntryPointParams): Self = this.set("entryPointParams", value.asInstanceOf[js.Any])
  }
  
}

