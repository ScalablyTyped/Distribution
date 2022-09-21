package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.typesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.typesystemInterfacesMod.IAnnotationInstance
import typings.ramlTypesystem.typesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.typesystemInterfacesMod.ITypeRegistry
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
