package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPoint[TEntryPoint, TEntryPointParams] extends js.Object {
  var entryPoint: TEntryPoint
  var entryPointParams: TEntryPointParams
}

object Anon_EntryPoint {
  @scala.inline
  def apply[TEntryPoint, TEntryPointParams](entryPoint: TEntryPoint, entryPointParams: TEntryPointParams): Anon_EntryPoint[TEntryPoint, TEntryPointParams] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EntryPoint[TEntryPoint, TEntryPointParams]]
  }
}

