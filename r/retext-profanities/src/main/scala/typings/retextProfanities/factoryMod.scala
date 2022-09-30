package typings.retextProfanities

import typings.retextProfanities.anon.Plural
import typings.retextProfanities.retextProfanitiesInts.`0`
import typings.retextProfanities.retextProfanitiesInts.`1`
import typings.retextProfanities.retextProfanitiesInts.`2`
import typings.std.Record
import typings.unified.mod.Processor
import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("retext-profanities/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(config: Config): js.ThisFunction1[
    /* this */ Processor[Unit, typings.nlcst.mod.Root, Unit, Unit], 
    /* options */ js.UndefOr[Options], 
    Unit | (Transformer[typings.nlcst.mod.Root, typings.nlcst.mod.Root])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(config.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[
    /* this */ Processor[Unit, typings.nlcst.mod.Root, Unit, Unit], 
    /* options */ js.UndefOr[Options], 
    Unit | (Transformer[typings.nlcst.mod.Root, typings.nlcst.mod.Root])
  ]]
  
  trait Config extends StObject {
    
    var cuss: Record[String, Double]
    
    var ignorePluralize: js.UndefOr[js.Array[String]] = js.undefined
    
    var lang: String
    
    var pluralize: js.UndefOr[Plural] = js.undefined
    
    var regular: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(cuss: Record[String, Double], lang: String): Config = {
      val __obj = js.Dynamic.literal(cuss = cuss.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCuss(value: Record[String, Double]): Self = StObject.set(x, "cuss", value.asInstanceOf[js.Any])
      
      inline def setIgnorePluralize(value: js.Array[String]): Self = StObject.set(x, "ignorePluralize", value.asInstanceOf[js.Any])
      
      inline def setIgnorePluralizeUndefined: Self = StObject.set(x, "ignorePluralize", js.undefined)
      
      inline def setIgnorePluralizeVarargs(value: String*): Self = StObject.set(x, "ignorePluralize", js.Array(value*))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setPluralize(value: Plural): Self = StObject.set(x, "pluralize", value.asInstanceOf[js.Any])
      
      inline def setPluralizeUndefined: Self = StObject.set(x, "pluralize", js.undefined)
      
      inline def setRegular(value: js.Array[String]): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
      
      inline def setRegularVarargs(value: String*): Self = StObject.set(x, "regular", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Phrases *not* to warn about.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Minimum *sureness* to warn about, see `cuss`.
      */
    var sureness: js.UndefOr[`0` | `1` | `2`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setSureness(value: `0` | `1` | `2`): Self = StObject.set(x, "sureness", value.asInstanceOf[js.Any])
      
      inline def setSurenessUndefined: Self = StObject.set(x, "sureness", js.undefined)
    }
  }
  
  type Root = typings.nlcst.mod.Root
}
