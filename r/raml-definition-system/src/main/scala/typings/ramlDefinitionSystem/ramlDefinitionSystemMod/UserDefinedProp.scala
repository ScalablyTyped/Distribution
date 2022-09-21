package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-definition-system", "UserDefinedProp")
@js.native
open class UserDefinedProp protected () extends Property {
  def this(name: String, source: IParseResult) = this()
  
  var _displayName: String = js.native
  
  /* private */ var _node: Any = js.native
  
  def getDisplayName(): String = js.native
  
  def node(): Any = js.native
  
  def setSourceProvider(sourceProvider: SourceProvider): Unit = js.native
  
  /* private */ var sourceProvider: Any = js.native
  
  def withDisplayName(name: String): Unit = js.native
}
/* static members */
object UserDefinedProp {
  
  @JSImport("raml-definition-system", "UserDefinedProp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system", "UserDefinedProp.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.UserDefinedProp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.UserDefinedProp */ Boolean]
}
