package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Represents a font and text size._
  *
  * Refer to [iosfonts.com](http://iosfonts.com) for a list of the fonts that are available in iOS and iPadOS.
  * @see https://docs.scriptable.app/font/#-new-font
  */
trait Font extends StObject {
  
  /**
    * _This is only here for TypeScript_
    *
    * TypeScript can't distinguish an instance of this class from an empty object if it doesn't have at least one property or function
    */
  /* private */ var font: Boolean
}
object Font {
  
  inline def apply(font: Boolean): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Boolean): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
