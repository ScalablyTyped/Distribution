package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentPointer extends js.Object {
  
  var __fragmentOwner: RequestDescriptor = js.native
  
  var __fragments: StringDictionary[Variables] = js.native
  
  var __id: DataID = js.native
}
object FragmentPointer {
  
  @scala.inline
  def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner.asInstanceOf[js.Any], __fragments = __fragments.asInstanceOf[js.Any], __id = __id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentPointer]
  }
  
  @scala.inline
  implicit class FragmentPointerOps[Self <: FragmentPointer] (val x: Self) extends AnyVal {
    
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
    def set__fragmentOwner(value: RequestDescriptor): Self = this.set("__fragmentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__fragments(value: StringDictionary[Variables]): Self = this.set("__fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__id(value: DataID): Self = this.set("__id", value.asInstanceOf[js.Any])
  }
}
