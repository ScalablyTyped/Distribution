package typings.ramlTypesystem.distSrcTypesystemMod

import typings.ramlTypesystem.distSrcParseMod.ParseNode
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IStatus
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeFacet
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeRegistry
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.MetaInformationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("raml-typesystem/dist/src/typesystem", "TypeInformation")
@js.native
open class TypeInformation protected ()
  extends StObject
     with ITypeFacet {
  def this(_inheritable: Boolean) = this()
  
  var _annotations: js.Array[IAnnotation] = js.native
  
  /* private */ var _inheritable: Any = js.native
  
  var _node: ParseNode = js.native
  
  var _owner: AbstractType = js.native
  
  def addAnnotation(a: IAnnotation): Unit = js.native
  
  /**
    * Annotations applied to the facet
    */
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotation] = js.native
  
  /**
    * name of the facet
    */
  /* CompleteClass */
  override def facetName(): String = js.native
  
  def getClassIdentifier(): js.Array[String] = js.native
  
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
  
  def node(): ParseNode = js.native
  
  /**
    * returns a type to which this facet  belongs
    */
  /* CompleteClass */
  override def owner(): IParsedType = js.native
  
  /**
    * broadest type to which this facet can be added
    */
  /* CompleteClass */
  override def requiredType(): IParsedType = js.native
  
  /**
    * Extension of requiredType() method for the case when there are more than a single type
    * hierarchy roots to cover.
    * requiredType() should return the common superclass for the list.
    *
    * @returns {Array} of types or empty list of there is only a single type set by requiredType() method
    */
  def requiredTypes(): js.Array[AbstractType] = js.native
  
  def setNode(node: ParseNode): Unit = js.native
  
  /**
    * validates if the facet is configured properly
    * @param registry
    */
  /* CompleteClass */
  override def validateSelf(registry: ITypeRegistry): IStatus = js.native
  def validateSelf(registry: TypeRegistry): Status = js.native
  
  /* protected */ def validateSelfIndividual(parentStatus: Status, registry: TypeRegistry): Status = js.native
  
  /**
    * returns value associated with the facet
    */
  /* CompleteClass */
  override def value(): Any = js.native
}
/* static members */
object TypeInformation {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "TypeInformation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "TypeInformation.CLASS_IDENTIFIER_TypeInformation")
  @js.native
  def CLASS_IDENTIFIER_TypeInformation: Any = js.native
  inline def CLASS_IDENTIFIER_TypeInformation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_TypeInformation")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.TypeInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.TypeInformation */ Boolean]
}
