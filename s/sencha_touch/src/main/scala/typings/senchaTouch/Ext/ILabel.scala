package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILabel
  extends StObject
     with IComponent {
  
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[java.lang.String] = js.undefined
}
object ILabel {
  
  inline def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  extension [Self <: ILabel](x: Self) {
    
    inline def setHtml(value: java.lang.String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
