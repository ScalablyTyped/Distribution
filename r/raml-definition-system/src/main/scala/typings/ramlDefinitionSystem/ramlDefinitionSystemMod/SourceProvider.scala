package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "SourceProvider")
@js.native
open class SourceProvider () extends StObject {
  
  def getClassIdentifier(): Array = js.native
  
  def getSource(): Any = js.native
}
/* static members */
object SourceProvider {
  
  @JSImport("raml-definition-system", "SourceProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "SourceProvider.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: String = js.native
  inline def CLASS_IDENTIFIER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean]
}
