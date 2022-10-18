package typings.ramlTypesystem

import typings.ramlTypesystem.distSrcSchemaUtilMod.IContentProvider
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typings.ramlTypesystem.distSrcTypesystemMod.Constraint
import typings.ramlTypesystem.distSrcTypesystemMod.Status
import typings.ramlTypesystem.distSrcTypesystemMod.TypeRegistry
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRestrictionsMod {
  
  @JSImport("raml-typesystem/dist/src/restrictions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/restrictions", "AdditionalPropertyIs")
  @js.native
  open class AdditionalPropertyIs protected () extends MatchesProperty {
    def this(`type`: AbstractType) = this()
    def this(`type`: AbstractType, optional: Boolean) = this()
    
    def `match`(n: String): Boolean = js.native
    
    /* private */ var `type`: Any = js.native
  }
  /* static members */
  object AdditionalPropertyIs {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "AdditionalPropertyIs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "AdditionalPropertyIs.CLASS_IDENTIFIER_AdditionalPropertyIs")
    @js.native
    def CLASS_IDENTIFIER_AdditionalPropertyIs: Any = js.native
    inline def CLASS_IDENTIFIER_AdditionalPropertyIs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_AdditionalPropertyIs")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.AdditionalPropertyIs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.AdditionalPropertyIs */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "ComponentShouldBeOfType")
  @js.native
  open class ComponentShouldBeOfType protected () extends FacetRestriction[AbstractType] {
    def this(`type`: AbstractType) = this()
    
    def check(i: Any): Status = js.native
    
    /* private */ var `type`: Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "Enum")
  @js.native
  open class Enum protected ()
    extends FacetRestriction[js.Array[String]] {
    def this(_value: js.Array[String]) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
    
    var checkStatus: Boolean = js.native
  }
  
  /* note: abstract class */ @JSImport("raml-typesystem/dist/src/restrictions", "FacetRestriction")
  @js.native
  open class FacetRestriction[T] () extends Constraint {
    def this(_inheritable: Boolean) = this()
    
    /* private */ var checkOwner: Any = js.native
    
    def checkValue(): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "FileTypes")
  @js.native
  open class FileTypes protected ()
    extends FacetRestriction[js.Array[String]] {
    def this(_value: js.Array[String]) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "Format")
  @js.native
  open class Format protected () extends FacetRestriction[String] {
    def this(_value: String) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "HasProperty")
  @js.native
  open class HasProperty protected () extends Constraint {
    def this(name: String) = this()
    
    def check(i: Any): Status = js.native
    
    /* private */ var name: Any = js.native
  }
  /* static members */
  object HasProperty {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "HasProperty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "HasProperty.CLASS_IDENTIFIER_HasProperty")
    @js.native
    def CLASS_IDENTIFIER_HasProperty: Any = js.native
    inline def CLASS_IDENTIFIER_HasProperty_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_HasProperty")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.HasProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.HasProperty */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "KnownPropertyRestriction")
  @js.native
  open class KnownPropertyRestriction protected () extends Constraint {
    def this(_value: Boolean) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
    
    def patchOwner(t: AbstractType): Unit = js.native
  }
  /* static members */
  object KnownPropertyRestriction {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "KnownPropertyRestriction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "KnownPropertyRestriction.CLASS_IDENTIFIER_KnownPropertyRestriction")
    @js.native
    def CLASS_IDENTIFIER_KnownPropertyRestriction: Any = js.native
    inline def CLASS_IDENTIFIER_KnownPropertyRestriction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_KnownPropertyRestriction")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.KnownPropertyRestriction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.KnownPropertyRestriction */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MapPropertyIs")
  @js.native
  open class MapPropertyIs protected () extends MatchesProperty {
    def this(regexp: String, `type`: AbstractType) = this()
    def this(regexp: String, `type`: AbstractType, optional: Boolean) = this()
    
    def checkValue(): Any = js.native
    
    /* private */ var regexp: Any = js.native
    
    def regexpValue(): String = js.native
    
    /* private */ var `type`: Any = js.native
  }
  /* static members */
  object MapPropertyIs {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "MapPropertyIs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "MapPropertyIs.CLASS_IDENTIFIER_MapPropertyIs")
    @js.native
    def CLASS_IDENTIFIER_MapPropertyIs: Any = js.native
    inline def CLASS_IDENTIFIER_MapPropertyIs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_MapPropertyIs")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.MapPropertyIs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.MapPropertyIs */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MatchToSchema")
  @js.native
  open class MatchToSchema protected () extends Constraint {
    def this(_value: String, provider: IContentProvider) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
    
    /* private */ var provider: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("raml-typesystem/dist/src/restrictions", "MatchesProperty")
  @js.native
  open class MatchesProperty protected () extends Constraint {
    def this(_type: AbstractType) = this()
    def this(_type: AbstractType, optional: Boolean) = this()
    
    /* private */ var _type: Any = js.native
    
    def isOptional(): Boolean = js.native
    
    def matches(s: String): Boolean = js.native
    
    /* protected */ var optional: Boolean = js.native
    
    def patchPath(p: typings.ramlTypesystem.distSrcTypesystemMod.IValidationPath, name: String): IValidationPath = js.native
    
    def path(): String = js.native
    
    def propId(): String = js.native
    
    def range(): AbstractType = js.native
    
    def validateProp(i: Any, n: String, t: AbstractType, q: typings.ramlTypesystem.distSrcTypesystemMod.IValidationPath): Status = js.native
  }
  /* static members */
  object MatchesProperty {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "MatchesProperty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "MatchesProperty.CLASS_IDENTIFIER_MatchesProperty")
    @js.native
    def CLASS_IDENTIFIER_MatchesProperty: Any = js.native
    inline def CLASS_IDENTIFIER_MatchesProperty_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_MatchesProperty")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.MatchesProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.MatchesProperty */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MaxItems")
  @js.native
  open class MaxItems protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MaxLength")
  @js.native
  open class MaxLength protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MaxProperties")
  @js.native
  open class MaxProperties protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "Maximum")
  @js.native
  open class Maximum protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MinItems")
  @js.native
  open class MinItems protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MinLength")
  @js.native
  open class MinLength protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("raml-typesystem/dist/src/restrictions", "MinMaxRestriction")
  @js.native
  open class MinMaxRestriction protected () extends FacetRestriction[Number] {
    def this(
      _facetName: String,
      _value: Double,
      _max: Boolean,
      _opposite: String,
      _requiredType: AbstractType,
      _isInt: Boolean
    ) = this()
    
    /* private */ var _facetName: Any = js.native
    
    /* private */ var _isInt: Any = js.native
    
    /* private */ var _max: Any = js.native
    
    /* private */ var _opposite: Any = js.native
    
    /* private */ var _requiredType: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
    
    def createError(): Status = js.native
    
    def extractValue(i: Any): Double = js.native
    
    def facetPath(): String = js.native
    
    def isIntConstraint(): Boolean = js.native
    
    def isMax(): Boolean = js.native
    
    def minValue(): Double = js.native
    
    def textMessagePart(): String = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MinProperties")
  @js.native
  open class MinProperties protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "Minimum")
  @js.native
  open class Minimum protected () extends MinMaxRestriction {
    def this(`val`: Double) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "MultipleOf")
  @js.native
  open class MultipleOf protected () extends FacetRestriction[Number] {
    def this(_value: Double) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(o: Any): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "Pattern")
  @js.native
  open class Pattern protected () extends FacetRestriction[String] {
    def this(_value: String) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "PropertyIs")
  @js.native
  open class PropertyIs protected () extends MatchesProperty {
    def this(name: String, `type`: AbstractType) = this()
    def this(name: String, `type`: AbstractType, optional: Boolean) = this()
    
    /* private */ var name: Any = js.native
    
    def propertyName(): String = js.native
    
    /* private */ var `type`: Any = js.native
  }
  /* static members */
  object PropertyIs {
    
    @JSImport("raml-typesystem/dist/src/restrictions", "PropertyIs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/restrictions", "PropertyIs.CLASS_IDENTIFIER_PropertyIs")
    @js.native
    def CLASS_IDENTIFIER_PropertyIs: Any = js.native
    inline def CLASS_IDENTIFIER_PropertyIs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_PropertyIs")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/restrictions.PropertyIs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/restrictions.PropertyIs */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/restrictions", "UniqueItems")
  @js.native
  open class UniqueItems protected () extends FacetRestriction[Boolean] {
    def this(_value: Boolean) = this()
    
    /* private */ var _value: Any = js.native
    
    def check(i: Any): Status = js.native
  }
  
  inline def anotherRestrictionComponent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anotherRestrictionComponent")().asInstanceOf[Any]
  
  inline def anotherRestrictionComponentsCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("anotherRestrictionComponentsCount")().asInstanceOf[Double]
  
  inline def optimize(r: js.Array[Constraint]): js.Array[Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(r.asInstanceOf[js.Any]).asInstanceOf[js.Array[Constraint]]
  
  inline def releaseAnotherRestrictionComponent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseAnotherRestrictionComponent")().asInstanceOf[Unit]
  inline def releaseAnotherRestrictionComponent(l: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseAnotherRestrictionComponent")(l.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validatePropertyType(_type: AbstractType, propName: String, registry: TypeRegistry, source: Any): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePropertyType")(_type.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Status]
  inline def validatePropertyType(_type: AbstractType, propName: String, registry: TypeRegistry, source: Any, isFacet: Boolean): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePropertyType")(_type.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], registry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], isFacet.asInstanceOf[js.Any])).asInstanceOf[Status]
  
  type IValidationPath = typings.ramlTypesystem.distSrcTypesystemMod.IValidationPath
}
