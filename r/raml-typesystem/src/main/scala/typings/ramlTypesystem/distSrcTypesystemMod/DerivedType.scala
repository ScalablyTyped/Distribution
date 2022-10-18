package typings.ramlTypesystem.distSrcTypesystemMod

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IDerivedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("raml-typesystem/dist/src/typesystem", "DerivedType")
@js.native
open class DerivedType protected ()
  extends AbstractType
     with IDerivedType {
  def this(name: String, _options: js.Array[AbstractType]) = this()
  
  /* private */ var _options: Any = js.native
  
  /* CompleteClass */
  override def annotation(name: String): Any = js.native
  
  /* CompleteClass */
  override def annotations(): js.Array[IAnnotation] = js.native
  
  /* CompleteClass */
  override def getExtra(name: String): Any = js.native
  
  /* CompleteClass */
  override def putExtra(name: String, value: Any): Unit = js.native
}
/* static members */
object DerivedType {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "DerivedType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "DerivedType.CLASS_IDENTIFIER_DerivedType")
  @js.native
  def CLASS_IDENTIFIER_DerivedType: Any = js.native
  inline def CLASS_IDENTIFIER_DerivedType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_DerivedType")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.DerivedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.DerivedType */ Boolean]
}
