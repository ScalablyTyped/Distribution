package typings.shiki

import typings.shiki.mod.ILanguageRegistration
import typings.shiki.mod.Lang
import typings.vscodeTextmate.releaseTypesMod.IRawGrammar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  path :string,   grammar :vscode-textmate.vscode-textmate.IRawGrammar | undefined} & {  id :string,   scopeName :string,   aliases :std.Array<string> | undefined,   samplePath :string | undefined,   embeddedLangs :std.Array<shiki.shiki.Lang> | undefined} */
  trait pathstringgrammarIRawGram
    extends StObject
       with ILanguageRegistration {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of languages the current language embeds.
      * If manually specifying languages to load, make sure to load the embedded
      * languages for each parent language.
      */
    var embeddedLangs: js.UndefOr[js.Array[Lang]] = js.undefined
    
    var grammar: js.UndefOr[IRawGrammar] = js.undefined
    
    var id: String
    
    var path: String
    
    var samplePath: js.UndefOr[String] = js.undefined
    
    var scopeName: String
  }
  object pathstringgrammarIRawGram {
    
    inline def apply(id: String, path: String, scopeName: String): pathstringgrammarIRawGram = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[pathstringgrammarIRawGram]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pathstringgrammarIRawGram] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setEmbeddedLangs(value: js.Array[Lang]): Self = StObject.set(x, "embeddedLangs", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedLangsUndefined: Self = StObject.set(x, "embeddedLangs", js.undefined)
      
      inline def setEmbeddedLangsVarargs(value: Lang*): Self = StObject.set(x, "embeddedLangs", js.Array(value*))
      
      inline def setGrammar(value: IRawGrammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSamplePath(value: String): Self = StObject.set(x, "samplePath", value.asInstanceOf[js.Any])
      
      inline def setSamplePathUndefined: Self = StObject.set(x, "samplePath", js.undefined)
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  path :string | undefined,   grammar :vscode-textmate.vscode-textmate.IRawGrammar} & {  id :string,   scopeName :string,   aliases :std.Array<string> | undefined,   samplePath :string | undefined,   embeddedLangs :std.Array<shiki.shiki.Lang> | undefined} */
  trait pathstringundefinedgramma
    extends StObject
       with ILanguageRegistration {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of languages the current language embeds.
      * If manually specifying languages to load, make sure to load the embedded
      * languages for each parent language.
      */
    var embeddedLangs: js.UndefOr[js.Array[Lang]] = js.undefined
    
    var grammar: IRawGrammar
    
    var id: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var samplePath: js.UndefOr[String] = js.undefined
    
    var scopeName: String
  }
  object pathstringundefinedgramma {
    
    inline def apply(grammar: IRawGrammar, id: String, scopeName: String): pathstringundefinedgramma = {
      val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[pathstringundefinedgramma]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pathstringundefinedgramma] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setEmbeddedLangs(value: js.Array[Lang]): Self = StObject.set(x, "embeddedLangs", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedLangsUndefined: Self = StObject.set(x, "embeddedLangs", js.undefined)
      
      inline def setEmbeddedLangsVarargs(value: Lang*): Self = StObject.set(x, "embeddedLangs", js.Array(value*))
      
      inline def setGrammar(value: IRawGrammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSamplePath(value: String): Self = StObject.set(x, "samplePath", value.asInstanceOf[js.Any])
      
      inline def setSamplePathUndefined: Self = StObject.set(x, "samplePath", js.undefined)
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
}
