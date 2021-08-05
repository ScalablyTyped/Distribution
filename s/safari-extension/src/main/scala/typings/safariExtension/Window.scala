package typings.safariExtension

import typings.safariExtension.anon.Typeofsafari
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var safari: Typeofsafari
}
object Window {
  
  inline def apply(safari: Typeofsafari): Window = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setSafari(value: Typeofsafari): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
  }
}
