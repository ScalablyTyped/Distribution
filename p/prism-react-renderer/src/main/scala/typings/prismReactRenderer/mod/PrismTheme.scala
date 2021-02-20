package typings.prismReactRenderer.mod

import typings.prismReactRenderer.anon.Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrismTheme extends StObject {
  
  var plain: PrismThemeEntry = js.native
  
  var styles: js.Array[Languages] = js.native
}
object PrismTheme {
  
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismTheme]
  }
  
  @scala.inline
  implicit class PrismThemeMutableBuilder[Self <: PrismTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlain(value: PrismThemeEntry): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[Languages]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: Languages*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
