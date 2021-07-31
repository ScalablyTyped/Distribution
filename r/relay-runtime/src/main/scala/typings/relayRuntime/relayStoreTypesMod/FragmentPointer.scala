package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentPointer extends StObject {
  
  var __fragmentOwner: RequestDescriptor
  
  var __fragments: StringDictionary[Variables]
  
  var __id: DataID
}
object FragmentPointer {
  
  @scala.inline
  def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner.asInstanceOf[js.Any], __fragments = __fragments.asInstanceOf[js.Any], __id = __id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentPointer]
  }
  
  @scala.inline
  implicit class FragmentPointerMutableBuilder[Self <: FragmentPointer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__fragmentOwner(value: RequestDescriptor): Self = StObject.set(x, "__fragmentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__fragments(value: StringDictionary[Variables]): Self = StObject.set(x, "__fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__id(value: DataID): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
  }
}
