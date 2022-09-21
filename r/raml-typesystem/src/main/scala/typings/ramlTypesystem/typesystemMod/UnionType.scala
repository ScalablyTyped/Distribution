package typings.ramlTypesystem.typesystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "UnionType")
@js.native
open class UnionType protected () extends DerivedType {
  def this(name: String, _options: js.Array[AbstractType]) = this()
}
/* static members */
object UnionType {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "UnionType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "UnionType.CLASS_IDENTIFIER_UnionType")
  @js.native
  def CLASS_IDENTIFIER_UnionType: Any = js.native
  inline def CLASS_IDENTIFIER_UnionType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_UnionType")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.UnionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.UnionType */ Boolean]
}
