package typings.stringPixelWidth

import typings.stringPixelWidth.stringPixelWidthStrings.`andale mono`
import typings.stringPixelWidth.stringPixelWidthStrings.`avenir next`
import typings.stringPixelWidth.stringPixelWidthStrings.`comic sans ms`
import typings.stringPixelWidth.stringPixelWidthStrings.`courier new`
import typings.stringPixelWidth.stringPixelWidthStrings.`open sans`
import typings.stringPixelWidth.stringPixelWidthStrings.`times new roman`
import typings.stringPixelWidth.stringPixelWidthStrings.`trebuchet ms`
import typings.stringPixelWidth.stringPixelWidthStrings.arial
import typings.stringPixelWidth.stringPixelWidthStrings.avenir
import typings.stringPixelWidth.stringPixelWidthStrings.georgia
import typings.stringPixelWidth.stringPixelWidthStrings.helvetica
import typings.stringPixelWidth.stringPixelWidthStrings.impact
import typings.stringPixelWidth.stringPixelWidthStrings.quantify
import typings.stringPixelWidth.stringPixelWidthStrings.tahoma
import typings.stringPixelWidth.stringPixelWidthStrings.verdana
import typings.stringPixelWidth.stringPixelWidthStrings.webdings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(string: String, settings: Settings): Double = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("string-pixel-width", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Settings extends StObject {
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var font: js.UndefOr[
        (`andale mono`) | arial | avenir | (`avenir next`) | (`comic sans ms`) | (`courier new`) | georgia | helvetica | impact | (`open sans`) | quantify | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
      ] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setFont(
        value: (`andale mono`) | arial | avenir | (`avenir next`) | (`comic sans ms`) | (`courier new`) | georgia | helvetica | impact | (`open sans`) | quantify | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
