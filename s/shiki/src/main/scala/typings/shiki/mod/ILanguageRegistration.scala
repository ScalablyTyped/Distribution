package typings.shiki.mod

import typings.vscodeTextmate.mod.IGrammar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageRegistration extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var balancedBracketSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of languages the current language embeds.
    * If manually specifying languages to load, make sure to load the embedded
    * languages for each parent language.
    */
  var embeddedLangs: js.UndefOr[js.Array[Lang]] = js.undefined
  
  var grammar: js.UndefOr[IGrammar] = js.undefined
  
  var id: String
  
  var path: String
  
  var samplePath: js.UndefOr[String] = js.undefined
  
  var scopeName: String
  
  var unbalancedBracketSelectors: js.UndefOr[js.Array[String]] = js.undefined
}
object ILanguageRegistration {
  
  inline def apply(id: String, path: String, scopeName: String): ILanguageRegistration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILanguageRegistration] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setBalancedBracketSelectors(value: js.Array[String]): Self = StObject.set(x, "balancedBracketSelectors", value.asInstanceOf[js.Any])
    
    inline def setBalancedBracketSelectorsUndefined: Self = StObject.set(x, "balancedBracketSelectors", js.undefined)
    
    inline def setBalancedBracketSelectorsVarargs(value: String*): Self = StObject.set(x, "balancedBracketSelectors", js.Array(value*))
    
    inline def setEmbeddedLangs(value: js.Array[Lang]): Self = StObject.set(x, "embeddedLangs", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedLangsUndefined: Self = StObject.set(x, "embeddedLangs", js.undefined)
    
    inline def setEmbeddedLangsVarargs(value: Lang*): Self = StObject.set(x, "embeddedLangs", js.Array(value*))
    
    inline def setGrammar(value: IGrammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSamplePath(value: String): Self = StObject.set(x, "samplePath", value.asInstanceOf[js.Any])
    
    inline def setSamplePathUndefined: Self = StObject.set(x, "samplePath", js.undefined)
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setUnbalancedBracketSelectors(value: js.Array[String]): Self = StObject.set(x, "unbalancedBracketSelectors", value.asInstanceOf[js.Any])
    
    inline def setUnbalancedBracketSelectorsUndefined: Self = StObject.set(x, "unbalancedBracketSelectors", js.undefined)
    
    inline def setUnbalancedBracketSelectorsVarargs(value: String*): Self = StObject.set(x, "unbalancedBracketSelectors", js.Array(value*))
  }
}
