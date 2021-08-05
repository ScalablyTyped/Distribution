package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The address expressed as a byte offset from the start of the addressable region.
    */
  var absoluteAddress: js.UndefOr[Double] = js.undefined
  
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  
  /**
    * The index within run.addresses of the cached object for this address.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
    * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes in this range of addresses.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The byte offset of this address from the absolute or relative address of the parent object.
    */
  var offsetFromParent: js.UndefOr[Double] = js.undefined
  
  /**
    * The index within run.addresses of the parent object.
    */
  var parentIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The address expressed as a byte offset from the absolute address of the top-most parent object.
    */
  var relativeAddress: js.UndefOr[Double] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAbsoluteAddress(value: Double): Self = StObject.set(x, "absoluteAddress", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteAddressUndefined: Self = StObject.set(x, "absoluteAddress", js.undefined)
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffsetFromParent(value: Double): Self = StObject.set(x, "offsetFromParent", value.asInstanceOf[js.Any])
    
    inline def setOffsetFromParentUndefined: Self = StObject.set(x, "offsetFromParent", js.undefined)
    
    inline def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    inline def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRelativeAddress(value: Double): Self = StObject.set(x, "relativeAddress", value.asInstanceOf[js.Any])
    
    inline def setRelativeAddressUndefined: Self = StObject.set(x, "relativeAddress", js.undefined)
  }
}
