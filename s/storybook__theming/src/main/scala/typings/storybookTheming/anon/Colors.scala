package typings.storybookTheming.anon

import typings.storybookTheming.syntaxMod.ColorsHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: ColorsHash
  
  var mono: String
}
object Colors {
  
  @scala.inline
  def apply(colors: ColorsHash, mono: String): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: ColorsHash): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMono(value: String): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
  }
}
