package typings.ramlTypesystem.distSrcTypesystemMod

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IConstraint
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IStatus
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeRegistry
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.MetaInformationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("raml-typesystem/dist/src/typesystem", "Constraint")
@js.native
open class Constraint ()
  extends TypeInformation
     with IConstraint {
  def this(_inheritable: Boolean) = this()
  
  /**
    * Annotations applied to the facet
    */
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotation] = js.native
  
  def check(i: Any, parentPath: typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IValidationPath): Status = js.native
  
  /* CompleteClass */
  override def composeWith(r: IConstraint): IConstraint = js.native
  /**
    * inner implementation of  compute composed restriction from this and parameter restriction
    * @param restriction
    * @return  composed restriction or null;
    */
  def composeWith(r: Constraint): Constraint = js.native
  
  def conflictMessage(otherPath: String, otherValue: Any): String = js.native
  
  /**
    * name of the facet
    */
  /* CompleteClass */
  override def facetName(): String = js.native
  
  /* protected */ def innerOptimize(): Constraint = js.native
  
  /* protected */ def intersect(t0: AbstractType, t1: AbstractType): AbstractType = js.native
  
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
  
  def nothing(c: Constraint): NothingRestrictionWithLocation = js.native
  def nothing(c: Constraint, message: String): NothingRestrictionWithLocation = js.native
  
  /**
    * returns a type to which this facet  belongs
    */
  /* CompleteClass */
  override def owner(): IParsedType = js.native
  
  /**
    * returns optimized restiction or this
    * @returns {Constraint}
    */
  def preoptimize(): Constraint = js.native
  
  /* protected */ def release(t: AbstractType): Unit = js.native
  
  /**
    * broadest type to which this facet can be added
    */
  /* CompleteClass */
  override def requiredType(): IParsedType = js.native
  
  /**
    * performs attempt to compute composed restriction from this and parameter restriction
    * @param restriction
    * @return  composed restriction or null;
    */
  def tryCompose(r: Constraint): Constraint = js.native
  
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
/* static members */
object Constraint {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Constraint.CLASS_IDENTIFIER_Constraint")
  @js.native
  def CLASS_IDENTIFIER_Constraint: Any = js.native
  inline def CLASS_IDENTIFIER_Constraint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Constraint")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Constraint.intersections")
  @js.native
  def intersections: Any = js.native
  inline def intersections_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intersections")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.Constraint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.Constraint */ Boolean]
}
