package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "EnumType")
@js.native
open class EnumType () extends ValueType {
  
  def getClassIdentifier(): Array = js.native
  
  var values: Array = js.native
}
/* static members */
object EnumType {
  
  @JSImport("raml-definition-system", "EnumType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "EnumType.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.EnumType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.EnumType */ Boolean]
}
