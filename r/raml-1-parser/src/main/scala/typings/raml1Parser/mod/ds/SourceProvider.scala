package typings.raml1Parser.mod.ds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser", "ds.SourceProvider")
@js.native
open class SourceProvider ()
  extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.SourceProvider
/* static members */
object SourceProvider {
  
  @JSImport("raml-1-parser", "ds.SourceProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ds.SourceProvider.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: String = js.native
  inline def CLASS_IDENTIFIER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean]
}
