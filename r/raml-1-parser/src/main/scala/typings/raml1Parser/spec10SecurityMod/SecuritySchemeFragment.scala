package typings.raml1Parser.spec10SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.raml1Parser.spec10SecurityMod.OAuth10SecuritySchemeFragment
  - typings.raml1Parser.spec10SecurityMod.OAuth20SecuritySchemeFragment
  - typings.raml1Parser.spec10SecurityMod.PassThroughSchemeFragment
  - typings.raml1Parser.spec10SecurityMod.BasicSecuritySchemeFragment
  - typings.raml1Parser.spec10SecurityMod.DigestSecuritySchemeFragment
  - typings.raml1Parser.spec10SecurityMod.CustomSecuritySchemeFragment
*/
trait SecuritySchemeFragment extends StObject
object SecuritySchemeFragment {
  
  inline def BasicSecuritySchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.BasicSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.BasicSecuritySchemeFragment]
  }
  
  inline def CustomSecuritySchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.CustomSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.CustomSecuritySchemeFragment]
  }
  
  inline def DigestSecuritySchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.DigestSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.DigestSecuritySchemeFragment]
  }
  
  inline def OAuth10SecuritySchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.OAuth10SecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.OAuth10SecuritySchemeFragment]
  }
  
  inline def OAuth20SecuritySchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.OAuth20SecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.OAuth20SecuritySchemeFragment]
  }
  
  inline def PassThroughSchemeFragment(name: String, `type`: String): typings.raml1Parser.spec10SecurityMod.PassThroughSchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raml1Parser.spec10SecurityMod.PassThroughSchemeFragment]
  }
}
