package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPoint[TEntryPoint, TEntryPointParams] extends js.Object {
  var entryPoint: TEntryPoint
  var entryPointParams: TEntryPointParams
}

object AnonEntryPoint {
  @scala.inline
  def apply[TEntryPoint, TEntryPointParams](entryPoint: TEntryPoint, entryPointParams: TEntryPointParams): AnonEntryPoint[TEntryPoint, TEntryPointParams] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntryPoint[TEntryPoint, TEntryPointParams]]
  }
}

