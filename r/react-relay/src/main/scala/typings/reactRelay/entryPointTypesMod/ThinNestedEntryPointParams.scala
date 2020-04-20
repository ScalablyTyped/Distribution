package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoint  :TEntryPoint,   entryPointParams  :TEntryPointParams}> */
trait ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] extends js.Object {
  val entryPoint: TEntryPoint
  val entryPointParams: TEntryPointParams
}

object ThinNestedEntryPointParams {
  @scala.inline
  def apply[TEntryPointParams, TEntryPoint](entryPoint: TEntryPoint, entryPointParams: TEntryPointParams): ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint]]
  }
}

