package typings.reactPhoneNumberInput

import typings.react.mod.Component
import typings.reactPhoneNumberInput.mod.FlagsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Country extends StObject {
    
    var country: String
    
    var flags: FlagsMap
    
    var flagsPath: String
  }
  object Country {
    
    @scala.inline
    def apply(country: String, flags: FlagsMap, flagsPath: String): Country = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], flagsPath = flagsPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: FlagsMap): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsPath(value: String): Self = StObject.set(x, "flagsPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Icon extends StObject {
    
    var icon: Component[js.Object, js.Object, js.Any]
    
    var label: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Icon {
    
    @scala.inline
    def apply(icon: Component[js.Object, js.Object, js.Any], label: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Component[js.Object, js.Object, js.Any]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
