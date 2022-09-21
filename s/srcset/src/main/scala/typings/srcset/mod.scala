package typings.srcset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("srcset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseSrcset(srcset: String): js.Array[SrcSetDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSrcset")(srcset.asInstanceOf[js.Any]).asInstanceOf[js.Array[SrcSetDefinition]]
  inline def parseSrcset(srcset: String, options: Options): js.Array[SrcSetDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSrcset")(srcset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SrcSetDefinition]]
  
  inline def stringifySrcset(srcSetDefinitions: js.Array[SrcSetDefinition]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySrcset")(srcSetDefinitions.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifySrcset(srcSetDefinitions: js.Array[SrcSetDefinition], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifySrcset")(srcSetDefinitions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	When strict mode is enabled, errors will be thrown on invalid input.
    	When disabled, a best effort will be made to handle invalid input and no errors will be thrown. The output may be invalid.
    	@default false
    	*/
    val strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait SrcSetDefinition extends StObject {
    
    val density: js.UndefOr[Double] = js.undefined
    
    val url: String
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object SrcSetDefinition {
    
    inline def apply(url: String): SrcSetDefinition = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SrcSetDefinition]
    }
    
    extension [Self <: SrcSetDefinition](x: Self) {
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
