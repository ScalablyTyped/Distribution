package typings.raml1Parser

import typings.raml1Parser.apiMod.Api08
import typings.raml1Parser.datamodelMod.ExampleFragment
import typings.raml1Parser.datamodelMod.TypeDeclarationFragment
import typings.raml1Parser.spec10ApiMod.Api10
import typings.raml1Parser.spec10ApiMod.Extension
import typings.raml1Parser.spec10ApiMod.Overlay
import typings.raml1Parser.spec10MethodsMod.TraitFragment
import typings.raml1Parser.spec10ResourcesMod.ResourceTypeFragment
import typings.raml1Parser.spec10SecurityMod.SecuritySchemeFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ramlMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.raml1Parser.spec10CommonMod.RAML10ParseResult
    - typings.raml1Parser.apiMod.RAML08ParseResult
  */
  trait RAMLParseResult extends StObject
  object RAMLParseResult {
    
    inline def RAML08ParseResult(specification: Api08, `type`: String): typings.raml1Parser.apiMod.RAML08ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML08", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.raml1Parser.apiMod.RAML08ParseResult]
    }
    
    inline def RAML10ParseResult(
      specification: Api10 | Overlay | Extension | ResourceTypeFragment | TraitFragment | SecuritySchemeFragment | TypeDeclarationFragment | ExampleFragment,
      `type`: String
    ): typings.raml1Parser.spec10CommonMod.RAML10ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML10", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.raml1Parser.spec10CommonMod.RAML10ParseResult]
    }
  }
}
