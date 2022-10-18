package typings.ramlTypesystem.distSrcTypesystemMod

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotationInstance
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "AnnotationInstance")
@js.native
open class AnnotationInstance protected ()
  extends StObject
     with IAnnotationInstance {
  def this(actual: IAnnotation, reg: ITypeRegistry) = this()
  
  /* protected */ var actual: IAnnotation = js.native
  
  /**
    * Actual annotation model
    */
  def annotation(): IAnnotation = js.native
  
  /**
    * Annotation definition type
    */
  /* CompleteClass */
  override def definition(): IParsedType = js.native
  
  /**
    * Annotation name
    */
  /* CompleteClass */
  override def name(): String = js.native
  
  /**
    * Annotation value
    */
  /* CompleteClass */
  override def value(): Any = js.native
}
