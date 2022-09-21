package typings.raml1Parser.ramlServicesMod

import typings.ramlDefinitionSystem.ramlDefinitionSystemMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/definition-system/ramlServices", "UserDefinedClass")
@js.native
open class UserDefinedClass protected ()
  extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.UserDefinedClass {
  def this(
    name: String,
    universe: typings.ramlDefinitionSystem.ramlDefinitionSystemMod.Universe,
    hl: IHighLevelNode,
    path: String,
    description: String
  ) = this()
}
/* static members */
object UserDefinedClass {
  
  @JSImport("raml-1-parser/dist/parser/definition-system/ramlServices", "UserDefinedClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/definition-system/ramlServices", "UserDefinedClass.CLASS_IDENTIFIER_UserDefinedClass")
  @js.native
  def CLASS_IDENTIFIER_UserDefinedClass: Any = js.native
  inline def CLASS_IDENTIFIER_UserDefinedClass_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_UserDefinedClass")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean]
}
