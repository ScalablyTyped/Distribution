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
      
      @scala.inline
      def apply(country: String, name: String): Province = {
        val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Province]
      }
      
      @scala.inline
      implicit class ProvinceMutableBuilder[Self <: Province] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlt(value: js.Array[String]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setAltVarargs(value: String*): Self = StObject.set(x, "alt", js.Array(value :_*))
        
        @scala.inline
        def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        @scala.inline
        def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      }
    }
  }
}
