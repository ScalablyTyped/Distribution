package typings.provinces

import org.scalablytyped.runtime.Shortcut
import typings.provinces.mod.global.Province
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("provinces", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Province] = js.native
  
  type _To = js.Array[Province]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[Province] = ^
  
  object global {
    
    /**
      * @see {@link https://github.com/substack/provinces#data-format}
      */
    trait Province extends StObject {
      
      /**
        * optional array of additional names and abbreviations
        */
      var alt: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * country abbreviation
        */
      var country: String
      
      /**
        * optional English name of a country (for example: "Beijing")
        */
      var english: js.UndefOr[String] = js.undefined
      
      /**
        * full name of the province or state
        */
      var name: String
      
      /**
        * optional region of a country (for example: "Wales")
        */
      var region: js.UndefOr[String] = js.undefined
      
      /**
        * optional 2 or 3 character short name
        */
      var short: js.UndefOr[String] = js.undefined
    }
    object Province {
      
      inline def apply(country: String, name: String): Province = {
        val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Province]
      }
      
      extension [Self <: Province](x: Self) {
        
        inline def setAlt(value: js.Array[String]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAltVarargs(value: String*): Self = StObject.set(x, "alt", js.Array(value*))
        
        inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        inline def setEnglish(value: String): Self = StObject.set(x, "english", value.asInstanceOf[js.Any])
        
        inline def setEnglishUndefined: Self = StObject.set(x, "english", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
        
        inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      }
    }
  }
}
