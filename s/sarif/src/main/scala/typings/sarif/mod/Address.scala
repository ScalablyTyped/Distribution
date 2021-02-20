package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends StObject {
  
  /**
    * The address expressed as a byte offset from the start of the addressable region.
    */
  var absoluteAddress: js.UndefOr[Double] = js.native
  
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.native
  
  /**
    * The index within run.addresses of the cached object for this address.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
    * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The number of bytes in this range of addresses.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The byte offset of this address from the absolute or relative address of the parent object.
    */
  var offsetFromParent: js.UndefOr[Double] = js.native
  
  /**
    * The index within run.addresses of the parent object.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The address expressed as a byte offset from the absolute address of the top-most parent object.
    */
  var relativeAddress: js.UndefOr[Double] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteAddress(value: Double): Self = StObject.set(x, "absoluteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteAddressUndefined: Self = StObject.set(x, "absoluteAddress", js.undefined)
    
    @scala.inline
    def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffsetFromParent(value: Double): Self = StObject.set(x, "offsetFromParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetFromParentUndefined: Self = StObject.set(x, "offsetFromParent", js.undefined)
    
    @scala.inline
    def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRelativeAddress(value: Double): Self = StObject.set(x, "relativeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeAddressUndefined: Self = StObject.set(x, "relativeAddress", js.undefined)
  }
}
