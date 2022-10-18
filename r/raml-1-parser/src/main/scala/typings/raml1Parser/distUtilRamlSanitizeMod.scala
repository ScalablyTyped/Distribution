package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilRamlSanitizeMod {
  
  @JSImport("raml-1-parser/dist/util/raml-sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanitize(): Sanitize_ = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")().asInstanceOf[Sanitize_]
  
  type ParameterValueMap = StringDictionary[Any]
  
  type RuleFunction = js.Function2[/* rule */ Any, /* key */ String, SanitizeFunction]
  
  type RulesObject = StringDictionary[RuleFunction]
  
  type SanitizeFunction = js.Function3[
    /* check */ Any, 
    /* key */ js.UndefOr[String], 
    /* src */ js.UndefOr[ParameterValueMap], 
    Any
  ]
  
  @js.native
  trait Sanitize_ extends StObject {
    
    def apply(
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Raml08Parser.NamedParameterMap */ Any
    ): js.Function1[/* value */ ParameterValueMap, Any] = js.native
    
    var RULES: RulesObject = js.native
    
    var TYPES: TypesObject = js.native
    
    def rule(
      parameter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Raml08Parser.NamedParameter */ Any
    ): Any = js.native
  }
  
  type TypesObject = StringDictionary[SanitizeFunction]
}
