package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParsedType
  extends StObject
     with IAnnotated
     with IHasExtra {
  
  def ac(i: Any): IParsedType = js.native
  
  def allCustomFacets(): js.Array[ITypeFacet] = js.native
  
  def allDefinedFacets(): js.Array[IPropertyInfo] = js.native
  
  /**
    * returns all meta information and restrictions associated with the type all inheritable facets from super types are included
    */
  def allFacets(): js.Array[ITypeFacet] = js.native
  
  def allOptions(): js.Array[IParsedType] = js.native
  
  /**
    * returns full list of known types which inherit from this type.
    * Note: built-in types does not list their not built in sub types
    */
  def allSubTypes(): js.Array[IParsedType] = js.native
  
  /**
    * returns full list of ancestor types
    */
  def allSuperTypes(): js.Array[IParsedType] = js.native
  
  def canDoAc(i: Any): IStatus = js.native
  
  def cloneWithFilter(x: js.Function2[/* y */ ITypeFacet, /* transformed */ js.UndefOr[this.type], Boolean | ITypeFacet]): IParsedType = js.native
  def cloneWithFilter(
    x: js.Function2[/* y */ ITypeFacet, /* transformed */ js.UndefOr[this.type], Boolean | ITypeFacet],
    f: js.Function1[/* t */ this.type, this.type]
  ): IParsedType = js.native
  
  def componentType(): IParsedType = js.native
  
  /**
    * returns array of custom facets directly declared on this type
    */
  def customFacets(): js.Array[ITypeFacet] = js.native
  
  def declaredAnnotations(): js.Array[IAnnotation] = js.native
  
  /**
    * returns  meta information and restrictions associated with the type only declared facets are included
    */
  def declaredFacets(): js.Array[ITypeFacet] = js.native
  
  def declaredProperties(): js.Array[IPropertyInfo] = js.native
  
  def declaredScalarsAnnotations(): StringDictionary[js.Array[js.Array[IAnnotation]]] = js.native
  
  def definedFacets(): js.Array[IPropertyInfo] = js.native
  
  def exampleObject(): Any = js.native
  
  def examples(): js.Array[IExample] = js.native
  
  /**
    * returns true if this type is anonimous
    */
  def isAnonymous(): Boolean = js.native
  
  /**
    * returns true if this type inherits from array type
    */
  def isArray(): Boolean = js.native
  
  def isAssignableFrom(t: IParsedType): Boolean = js.native
  
  /**
    * returns true if this type inherits from boolean type
    */
  def isBoolean(): Boolean = js.native
  
  /**
    * returns true if this type is builtin
    */
  def isBuiltin(): Boolean = js.native
  
  /**
    * returns true if this type inherits from one of date related types
    */
  def isDateOnly(): Boolean = js.native
  
  /**
    * returns true if this type inherits from one of date related types
    */
  def isDateTime(): Boolean = js.native
  
  /**
    * returns true if this type inherits from one of date related types
    */
  def isDateTimeOnly(): Boolean = js.native
  
  /**
    * returns true if this type is empty
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * returns true if this type inherits external type
    */
  def isExternal(): Boolean = js.native
  
  /**
    * return true if this type inherits from a file type
    */
  def isFile(): Boolean = js.native
  
  /**
    * returns true if this type inherits from integer type
    */
  def isInteger(): Boolean = js.native
  
  /**
    * returns true if this type is an intersection type
    */
  def isIntersection(): Boolean = js.native
  
  /**
    * returns true if this type inherits from number type
    */
  def isNumber(): Boolean = js.native
  
  /**
    * returns true if this type inherits from object type
    */
  def isObject(): Boolean = js.native
  
  /**
    * returns true if this type has recurrent definition;
    */
  def isRecurrent(): Boolean = js.native
  
  /**
    * returns true if this type inherits from scalar type
    */
  def isScalar(): Boolean = js.native
  
  /**
    * returns true if this type inherits from string type
    */
  def isString(): Boolean = js.native
  
  /**
    * returns true if this type inherits from one of date related types
    */
  def isTimeOnly(): Boolean = js.native
  
  /**
    * returns true if this type is a union type
    */
  def isUnion(): Boolean = js.native
  
  /**
    * returns true if this type inhetits from an unknown type
    */
  def isUnknown(): Boolean = js.native
  
  def kind(): String = js.native
  
  /**
    * name of the type
    */
  def name(): String = js.native
  
  /**
    * Straightforward set of components. E.g. for `A|(B|C)` where `A`, `B` and `C`
    * are not union types the result is `[A, B|C]`
    */
  def options(): js.Array[IParsedType] = js.native
  
  def properties(): js.Array[IPropertyInfo] = js.native
  
  def property(name: String): IPropertyInfo = js.native
  
  def registry(): IParsedTypeCollection = js.native
  
  /**
    * returns array of custom facets directly declared on this type
    */
  def restrictions(): js.Array[ITypeFacet] = js.native
  
  def scalarsAnnotations(): StringDictionary[js.Array[js.Array[IAnnotation]]] = js.native
  
  /**
    * returns  list of directly declared sub types of this type
    */
  def subTypes(): js.Array[IParsedType] = js.native
  
  /**
    * returns  list of directly declared super types of this type
    */
  def superTypes(): js.Array[IParsedType] = js.native
  
  /**
    * validates a potential instance of type and returns a status describing the results of validation
    * @param i
    */
  def validate(i: Any): IStatus = js.native
  def validate(i: Any, autoClose: Boolean): IStatus = js.native
  
  def validateType(): IStatus = js.native
  def validateType(reg: ITypeRegistry): IStatus = js.native
}
