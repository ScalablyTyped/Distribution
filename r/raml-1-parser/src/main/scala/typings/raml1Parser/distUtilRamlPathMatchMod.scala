package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilRamlPathMatchMod {
  
  @JSImport("raml-1-parser/dist/util/raml-path-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ramlPathMatch(
    path: String,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Raml08Parser.NamedParameterMap */ Any,
    options: OptionsObject
  ): PathMatchFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("ramlPathMatch")(path.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathMatchFunction]
  
  trait MatchResult extends StObject {
    
    var params: StringDictionary[Any]
    
    var path: String
  }
  object MatchResult {
    
    inline def apply(params: StringDictionary[Any], path: String): MatchResult = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchResult] (val x: Self) extends AnyVal {
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsObject extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsObject {
    
    inline def apply(): OptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsObject] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type PathMatchFunction = js.Function1[/* path */ String, PathMatchResult]
  
  type PathMatchResult = MatchResult | Boolean
}
