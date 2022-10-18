package typings.ramlTypesystem.distSrcTypesystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotatedElement
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotationInstance
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "AnnotatedType")
@js.native
open class AnnotatedType protected ()
  extends StObject
     with IAnnotatedElement {
  def this(_type: AbstractType, reg: ITypeRegistry) = this()
  
  /* private */ var _annotations: Any = js.native
  
  /* private */ var _annotationsMap: Any = js.native
  
  /* private */ var _type: Any = js.native
  
  /**
    * Array view on the annotations applied
    */
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotationInstance] = js.native
  
  /**
    * Map view on the annotations applied
    */
  /* CompleteClass */
  override def annotationsMap(): StringDictionary[IAnnotationInstance] = js.native
  
  /**
    * The element itself
    */
  /* CompleteClass */
  override def entry(): Any = js.native
  
  /**
    * Element kind
    */
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * Element name
    */
  /* CompleteClass */
  override def name(): String = js.native
  
  /* protected */ var reg: ITypeRegistry = js.native
  
  /**
    * JSON representation of the entry
    */
  /* CompleteClass */
  override def value(): Any = js.native
}
