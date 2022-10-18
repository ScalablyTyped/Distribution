package typings.ramlTypesystem

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IStatus
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeFacet
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeRegistry
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.MetaInformationKind
import typings.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typings.ramlTypesystem.distSrcTypesystemMod.Constraint
import typings.ramlTypesystem.distSrcTypesystemMod.Status
import typings.ramlTypesystem.distSrcTypesystemMod.TypeInformation
import typings.ramlTypesystem.distSrcTypesystemMod.TypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetainfoMod {
  
  @JSImport("raml-typesystem/dist/src/metainfo", "AcceptAllScalarsAsStrings")
  @js.native
  open class AcceptAllScalarsAsStrings () extends MetaInfo
  
  @JSImport("raml-typesystem/dist/src/metainfo", "AllowedTargets")
  @js.native
  open class AllowedTargets protected () extends MetaInfo {
    def this(value: Any) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Annotation")
  @js.native
  open class Annotation protected ()
    extends MetaInfo
       with IAnnotation {
    def this(name: String, value: Any, path: String) = this()
    def this(name: String, value: Any, path: String, ofExample: Boolean) = this()
    def this(name: String, value: Any, path: String, ofExample: Boolean, _index: Double) = this()
    def this(name: String, value: Any, path: String, ofExample: Unit, _index: Double) = this()
    
    /* private */ var _index: Any = js.native
    
    /* private */ var _ownerFacet: Any = js.native
    
    /**
      * Annotations applied to the facet
      */
    /* CompleteClass */
    override def annotations(): js.Array[IAnnotation] = js.native
    
    /**
      * Annotation definition type
      */
    /* CompleteClass */
    override def definition(): IParsedType = js.native
    
    /**
      * name of the facet
      */
    /* CompleteClass */
    override def facetName(): String = js.native
    
    def getPath(): String = js.native
    
    /* CompleteClass */
    override def isConstraint(): Boolean = js.native
    
    /**
      * return true if this facet is inheritable
      */
    /* CompleteClass */
    override def isInheritable(): Boolean = js.native
    
    /**
      * Returns kind of meta-information this instance represents.
      */
    /* CompleteClass */
    override def kind(): MetaInformationKind = js.native
    
    /**
      * Annotation name
      */
    /* CompleteClass */
    override def name(): String = js.native
    
    /* protected */ var ofExample: Boolean = js.native
    
    /**
      * returns a type to which this facet  belongs
      */
    /* CompleteClass */
    override def owner(): IParsedType = js.native
    
    /**
      * Returns owner facet for annotations applied to facets
      */
    /* CompleteClass */
    override def ownerFacet(): ITypeFacet = js.native
    
    /* protected */ var path: String = js.native
    
    /**
      * broadest type to which this facet can be added
      */
    /* CompleteClass */
    override def requiredType(): IParsedType = js.native
    
    def setOwnerFacet(ownerFacet: ITypeFacet): Unit = js.native
    
    /**
      * validates if the facet is configured properly
      * @param registry
      */
    /* CompleteClass */
    override def validateSelf(registry: ITypeRegistry): IStatus = js.native
    
    /**
      * returns value associated with the facet
      */
    /* CompleteClass */
    override def value(): Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "CustomFacet")
  @js.native
  open class CustomFacet protected () extends MetaInfo {
    def this(name: String, value: Any) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Default")
  @js.native
  open class Default protected () extends MetaInfo {
    def this(value: Any) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Description")
  @js.native
  open class Description protected () extends MetaInfo {
    def this(value: String) = this()
  }
  /* static members */
  object Description {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "Description")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "Description.CLASS_IDENTIFIER_Description")
    @js.native
    def CLASS_IDENTIFIER_Description: Any = js.native
    inline def CLASS_IDENTIFIER_Description_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Description")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.Description */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.Description */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Discriminator")
  @js.native
  open class Discriminator protected () extends TypeInformation {
    def this(property: String) = this()
    
    var property: String = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "DiscriminatorValue")
  @js.native
  open class DiscriminatorValue protected () extends Constraint {
    def this(_value: Any) = this()
    def this(_value: Any, strict: Boolean) = this()
    
    var _value: Any = js.native
    
    def isStrict(): Boolean = js.native
    
    /* protected */ var strict: Boolean = js.native
  }
  /* static members */
  object DiscriminatorValue {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "DiscriminatorValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "DiscriminatorValue.CLASS_IDENTIFIER_DiscriminatorValue")
    @js.native
    def CLASS_IDENTIFIER_DiscriminatorValue: Any = js.native
    inline def CLASS_IDENTIFIER_DiscriminatorValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_DiscriminatorValue")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.DiscriminatorValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.DiscriminatorValue */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "DisplayName")
  @js.native
  open class DisplayName protected () extends MetaInfo {
    def this(value: String) = this()
  }
  /* static members */
  object DisplayName {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "DisplayName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "DisplayName.CLASS_IDENTIFIER_DisplayName")
    @js.native
    def CLASS_IDENTIFIER_DisplayName: Any = js.native
    inline def CLASS_IDENTIFIER_DisplayName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_DisplayName")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.DisplayName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.DisplayName */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Example")
  @js.native
  open class Example protected () extends MetaInfo {
    def this(value: Any) = this()
    
    def asXMLString(): String = js.native
    
    def example(): Any = js.native
    
    def validateAnnotations(registry: TypeRegistry): Status = js.native
    
    def validateValue(registry: TypeRegistry): Status = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Examples")
  @js.native
  open class Examples protected () extends MetaInfo {
    def this(value: Any) = this()
    
    def asXMLStrings(): js.Array[String] = js.native
    
    def examples(): js.Array[Any] = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "FacetDeclaration")
  @js.native
  open class FacetDeclaration protected () extends MetaInfo {
    def this(name: String, _type: AbstractType, optional: Boolean) = this()
    def this(name: String, _type: AbstractType, optional: Boolean, builtIn: Boolean) = this()
    
    /* private */ var _type: Any = js.native
    
    def actualName(): String = js.native
    
    /* private */ var builtIn: Any = js.native
    
    def isBuiltIn(): Boolean = js.native
    
    def isOptional(): Boolean = js.native
    
    /* private */ var name: Any = js.native
    
    /* private */ var optional: Any = js.native
    
    def `type`(): AbstractType = js.native
  }
  /* static members */
  object FacetDeclaration {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "FacetDeclaration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "FacetDeclaration.CLASS_IDENTIFIER_FacetDeclaration")
    @js.native
    def CLASS_IDENTIFIER_FacetDeclaration: Any = js.native
    inline def CLASS_IDENTIFIER_FacetDeclaration_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_FacetDeclaration")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.FacetDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.FacetDeclaration */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "HasPropertiesFacet")
  @js.native
  open class HasPropertiesFacet () extends MetaInfo
  /* static members */
  object HasPropertiesFacet {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "HasPropertiesFacet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "HasPropertiesFacet.CLASS_IDENTIFIER_HasPropertiesFacet")
    @js.native
    def CLASS_IDENTIFIER_HasPropertiesFacet: Any = js.native
    inline def CLASS_IDENTIFIER_HasPropertiesFacet_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_HasPropertiesFacet")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.HasPropertiesFacet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.HasPropertiesFacet */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "ImportedByChain")
  @js.native
  open class ImportedByChain protected () extends MetaInfo {
    def this(_typeName: String) = this()
    
    /* private */ var _typeName: Any = js.native
  }
  /* static members */
  object ImportedByChain {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "ImportedByChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "ImportedByChain.CLASS_IDENTIFIER_ImportedByChain")
    @js.native
    def CLASS_IDENTIFIER_ImportedByChain: Any = js.native
    inline def CLASS_IDENTIFIER_ImportedByChain_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_ImportedByChain")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.ImportedByChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.ImportedByChain */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "MetaInfo")
  @js.native
  open class MetaInfo protected () extends TypeInformation {
    def this(_name: String, _value: Any) = this()
    def this(_name: String, _value: Any, inhertitable: Boolean) = this()
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _value: Any = js.native
  }
  /* static members */
  object MetaInfo {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "MetaInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "MetaInfo.CLASS_IDENTIFIER_MetaInfo")
    @js.native
    def CLASS_IDENTIFIER_MetaInfo: Any = js.native
    inline def CLASS_IDENTIFIER_MetaInfo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_MetaInfo")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.MetaInfo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.MetaInfo */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "NotScalar")
  @js.native
  open class NotScalar () extends MetaInfo
  /* static members */
  object NotScalar {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "NotScalar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "NotScalar.CLASS_IDENTIFIER_NotScalar")
    @js.native
    def CLASS_IDENTIFIER_NotScalar: Any = js.native
    inline def CLASS_IDENTIFIER_NotScalar_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_NotScalar")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.NotScalar */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.NotScalar */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "ParserMetadata")
  @js.native
  open class ParserMetadata protected () extends MetaInfo {
    def this(value: js.Object) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Required")
  @js.native
  open class Required protected () extends MetaInfo {
    def this(value: Any) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "SchemaPath")
  @js.native
  open class SchemaPath protected () extends MetaInfo {
    def this(path: String) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "SkipValidation")
  @js.native
  open class SkipValidation () extends MetaInfo
  
  @JSImport("raml-typesystem/dist/src/metainfo", "SourceMap")
  @js.native
  open class SourceMap protected () extends MetaInfo {
    def this(value: js.Object) = this()
  }
  /* static members */
  object SourceMap {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "SourceMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "SourceMap.CLASS_IDENTIFIER_SourceMap")
    @js.native
    def CLASS_IDENTIFIER_SourceMap: Any = js.native
    inline def CLASS_IDENTIFIER_SourceMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_SourceMap")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.SourceMap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.SourceMap */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "TypeAttributeValue")
  @js.native
  open class TypeAttributeValue protected () extends MetaInfo {
    def this(value: Any) = this()
  }
  /* static members */
  object TypeAttributeValue {
    
    @JSImport("raml-typesystem/dist/src/metainfo", "TypeAttributeValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/metainfo", "TypeAttributeValue.CLASS_IDENTIFIER_TypeAttributeValue")
    @js.native
    def CLASS_IDENTIFIER_TypeAttributeValue: Any = js.native
    inline def CLASS_IDENTIFIER_TypeAttributeValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_TypeAttributeValue")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/metainfo.TypeAttributeValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/metainfo.TypeAttributeValue */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "Usage")
  @js.native
  open class Usage protected () extends MetaInfo {
    def this(value: String) = this()
  }
  
  @JSImport("raml-typesystem/dist/src/metainfo", "XMLInfo")
  @js.native
  open class XMLInfo protected () extends MetaInfo {
    def this(o: Any) = this()
  }
  
  trait ChainingData extends StObject {
    
    var kind: String
    
    var value: String
  }
  object ChainingData {
    
    inline def apply(kind: String, value: String): ChainingData = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChainingData]
    }
    
    extension [Self <: ChainingData](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
