package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentPointer extends js.Object {
  var __fragmentOwner: RequestDescriptor
  var __fragments: StringDictionary[Variables]
  var __id: DataID
}

object FragmentPointer {
  @scala.inline
  def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner, __fragments = __fragments, __id = __id)
  
    __obj.asInstanceOf[FragmentPointer]
  }
}

