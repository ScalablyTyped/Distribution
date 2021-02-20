package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.excl
import typings.sdpTransform.sdpTransformStrings.incl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressTypes extends StObject {
  
  var addressTypes: String = js.native
  
  var destAddress: String = js.native
  
  var filterMode: excl | incl = js.native
  
  var netType: String = js.native
  
  var srcList: String = js.native
}
object AddressTypes {
  
  @scala.inline
  def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): AddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes.asInstanceOf[js.Any], destAddress = destAddress.asInstanceOf[js.Any], filterMode = filterMode.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], srcList = srcList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressTypes]
  }
  
  @scala.inline
  implicit class AddressTypesMutableBuilder[Self <: AddressTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressTypes(value: String): Self = StObject.set(x, "addressTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestAddress(value: String): Self = StObject.set(x, "destAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMode(value: excl | incl): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcList(value: String): Self = StObject.set(x, "srcList", value.asInstanceOf[js.Any])
  }
}
