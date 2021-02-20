package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.protobufjs.mod.AnyNestedObject because Already inherited */ @js.native
trait IType extends INamespace {
  
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /** Field descriptors */
  var fields: StringDictionary[IField] = js.native
  
  /** Whether a legacy group or not */
  var group: js.UndefOr[Boolean] = js.native
  
  /** Oneof descriptors */
  var oneofs: js.UndefOr[StringDictionary[IOneOf]] = js.native
  
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}
object IType {
  
  @scala.inline
  def apply(fields: StringDictionary[IField]): IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit class ITypeMutableBuilder[Self <: IType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: StringDictionary[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setOneofs(value: StringDictionary[IOneOf]): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
    
    @scala.inline
    def setReserved(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    @scala.inline
    def setReservedVarargs(value: js.Array[Double]*): Self = StObject.set(x, "reserved", js.Array(value :_*))
  }
}
