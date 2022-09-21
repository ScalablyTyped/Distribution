package typings.ramlDefinitionSystem

import typings.ramlDefinitionSystem.anon.AbstractSecurityScheme
import typings.ramlDefinitionSystem.anon.Annotable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universeMod {
  
  @JSImport("raml-definition-system/dist/universe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system/dist/universe", "Universe08")
  @js.native
  def Universe08: AbstractSecurityScheme = js.native
  inline def Universe08_=(x: AbstractSecurityScheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Universe08")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-definition-system/dist/universe", "Universe10")
  @js.native
  def Universe10: Annotable = js.native
  inline def Universe10_=(x: Annotable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Universe10")(x.asInstanceOf[js.Any])
}
