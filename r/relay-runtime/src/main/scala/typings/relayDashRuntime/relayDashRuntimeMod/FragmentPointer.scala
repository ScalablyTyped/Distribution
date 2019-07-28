package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentPointer extends js.Object {
  var __fragmentOwner: OperationDescriptor | Null
  var __fragments: StringDictionary[Variables]
  var __id: DataID
}

object FragmentPointer {
  @scala.inline
  def apply(
    __fragments: StringDictionary[Variables],
    __id: DataID,
    __fragmentOwner: OperationDescriptor = null
  ): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragments = __fragments, __id = __id)
    if (__fragmentOwner != null) __obj.updateDynamic("__fragmentOwner")(__fragmentOwner)
    __obj.asInstanceOf[FragmentPointer]
  }
}

