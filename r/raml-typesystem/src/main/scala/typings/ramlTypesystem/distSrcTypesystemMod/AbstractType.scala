package typings.ramlTypesystem.distSrcTypesystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.anon.InstantiableT
import typings.ramlTypesystem.anon.`0`
import typings.ramlTypesystem.distSrcRestrictionsMod.MatchesProperty
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ElementSourceInfo
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.HasSource
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedTypeCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("raml-typesystem/dist/src/typesystem", "AbstractType")
@js.native
open class AbstractType protected ()
  extends StObject
     with IParsedType
     with HasSource {
  def this(_name: String) = this()
  
  /* protected */ var _collection: IParsedTypeCollection = js.native
  
  /* protected */ var _locked: Boolean = js.native
  
  /* protected */ var _name: String = js.native
  
  var _subTypes: js.Array[AbstractType] = js.native
  
  def addMeta(info: TypeInformation): Unit = js.native
  
  def addSupertypeAnnotation(arr: js.Array[IAnnotation], ind: Double): Unit = js.native
  
  /* CompleteClass */
  override def annotation(name: String): Any = js.native
  
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotation] = js.native
  
  def canDoAc(): Status = js.native
  
  def checkConfluent(): Status = js.native
  
  def checkDiscriminator(t1: AbstractType, t2: AbstractType): Status = js.native
  
  /**
    * make this type closed type (no unknown properties any more)
    */
  def closeUnknownProperties(): Unit = js.native
  
  def collection(): IParsedTypeCollection = js.native
  
  /* protected */ var computeConfluent: Boolean = js.native
  
  /**
    * declares a pattern property on this type,
    * note if type is not inherited from an object type this will move
    * type to inconsistent state
    * @param name - regexp
    * @param type - type of the property
    * @return
    */
  def declareMapProperty(name: String, `type`: AbstractType): AbstractType = js.native
  
  /**
    * adds new property declaration to this type, note if type is not inherited from an object type this will move
    * type to inconsistent state
    * @param name - name of the property
    * @param type - type of the property
    * @param optional true if property is optinal
    * @return the type with property (this)
    */
  def declareProperty(name: String, t: AbstractType, optional: Boolean): AbstractType = js.native
  
  def declaredMeta(): js.Array[TypeInformation] = js.native
  
  /* protected */ var definedFacetInfos: js.Array[PropertyInfo] = js.native
  
  /* protected */ var definedFacetInfosMap: StringDictionary[PropertyInfo] = js.native
  
  def descValue(): Any = js.native
  
  /* private */ var discriminate: Any = js.native
  
  /* private */ var emptyIntersectionOrDiscriminator: Any = js.native
  
  /* protected */ var extras: StringDictionary[Any] = js.native
  
  /* private */ var familyWithArray: Any = js.native
  
  /* private */ var fillSubTypes: Any = js.native
  
  /* private */ var fillSuperTypes: Any = js.native
  
  def getClassIdentifier(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getExtra(name: String): Any = js.native
  
  def hasPropertiesFacet(): Boolean = js.native
  
  def id(): Double = js.native
  
  def inherit(name: String): InheritedType = js.native
  
  /* protected */ var innerid: Double = js.native
  
  def isAbstractOrInternal(): Boolean = js.native
  
  def isLocked(): Boolean = js.native
  
  /**
    *
    * @return true if type is an polymorphic type
    */
  def isPolymorphic(): Boolean = js.native
  
  def isSubTypeOf(t: AbstractType): Boolean = js.native
  
  def isSuperTypeOf(t: AbstractType): Boolean = js.native
  
  def knownProperties(): js.Array[MatchesProperty] = js.native
  
  def label(): String = js.native
  
  def lock(): Unit = js.native
  
  /**
    * return all type information associated with type
    */
  def meta(): js.Array[TypeInformation] = js.native
  
  /* protected */ var metaInfo: js.Array[TypeInformation] = js.native
  
  /**
    * return all instances of meta information of particular class
    * @param clazz
    * @returns {any}
    */
  def metaOfType[T](clazz: `0`[T]): js.Array[T] = js.native
  
  var nullable: Boolean = js.native
  
  /**
    * return instance of type information of particular class
    * @param clazz
    * @returns {any}
    */
  def oneMeta[T](clazz: InstantiableT[T]): T = js.native
  
  def patchName(name: String): Unit = js.native
  
  /* protected */ var propertiesMap: StringDictionary[PropertyInfo] = js.native
  
  /* protected */ var propertyInfos: js.Array[PropertyInfo] = js.native
  
  def propertySet(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def putExtra(name: String, value: Any): Unit = js.native
  
  def restrictions(forValidation: Boolean): js.Array[Constraint] = js.native
  
  /* private */ var sAnnotations: Any = js.native
  
  /* CompleteClass */
  override def sourceMap(): ElementSourceInfo = js.native
  
  /* protected */ var supertypeAnnotations: js.Array[StringDictionary[IAnnotation]] = js.native
  
  def typeFamily(): js.Array[AbstractType] = js.native
  
  def validate(i: Any, autoClose: Boolean, nullAllowed: Boolean): Status = js.native
  def validate(i: Any, autoClose: Unit, nullAllowed: Boolean): Status = js.native
  
  /**
    * validates object against this type without performing AC
    */
  def validateDirect(i: Any): Status = js.native
  def validateDirect(i: Any, autoClose: Boolean): Status = js.native
  def validateDirect(i: Any, autoClose: Boolean, nullAllowed: Boolean): Status = js.native
  def validateDirect(
    i: Any,
    autoClose: Boolean,
    nullAllowed: Boolean,
    path: typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IValidationPath
  ): Status = js.native
  def validateDirect(
    i: Any,
    autoClose: Boolean,
    nullAllowed: Unit,
    path: typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IValidationPath
  ): Status = js.native
  def validateDirect(i: Any, autoClose: Unit, nullAllowed: Boolean): Status = js.native
  def validateDirect(
    i: Any,
    autoClose: Unit,
    nullAllowed: Boolean,
    path: typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IValidationPath
  ): Status = js.native
  def validateDirect(
    i: Any,
    autoClose: Unit,
    nullAllowed: Unit,
    path: typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IValidationPath
  ): Status = js.native
  
  /* private */ var validateFacets: Any = js.native
  
  def validateHierarchy(rs: Status): Unit = js.native
  
  def validateMeta(tr: TypeRegistry): Status = js.native
  
  def validateType(tr: TypeRegistry): Status = js.native
}
/* static members */
object AbstractType {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "AbstractType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "AbstractType.CLASS_IDENTIFIER_AbstractType")
  @js.native
  def CLASS_IDENTIFIER_AbstractType: Any = js.native
  inline def CLASS_IDENTIFIER_AbstractType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_AbstractType")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.AbstractType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.AbstractType */ Boolean]
}
