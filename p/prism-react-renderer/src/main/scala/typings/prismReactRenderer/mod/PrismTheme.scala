package typings.prismReactRenderer.mod

import typings.prismReactRenderer.anon.Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismTheme extends StObject {
  
  var plain: PrismThemeEntry
  
  var styles: js.Array[Languages]
}
object PrismTheme {
  
  inline def apply(plain: PrismThemeEntry, styles: js.Array[Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismTheme]
  }
  
  extension [Self <: PrismTheme](x: Self) {
    
    inline def setPlain(value: PrismThemeEntry): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[Languages]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: Languages*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
