package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.restrictionsMod.MatchesProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "InheritedType")
@js.native
open class InheritedType protected () extends AbstractType {
  def this(_name: String) = this()
  
  /* protected */ var _contextMeta: MatchesProperty = js.native
  
  /* protected */ var _superTypes: js.Array[AbstractType] = js.native
  
  def addSuper(t: AbstractType): Unit = js.native
  
  def contextMeta(): MatchesProperty = js.native
  
  def patch(another: InheritedType): Unit = js.native
  
  def setContextMeta(contextMeta: MatchesProperty): Unit = js.native
}
/* static members */
object InheritedType {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "InheritedType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "InheritedType.CLASS_IDENTIFIER_InheritedType")
  @js.native
  def CLASS_IDENTIFIER_InheritedType: Any = js.native
  inline def CLASS_IDENTIFIER_InheritedType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_InheritedType")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.InheritedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.InheritedType */ Boolean]
}
