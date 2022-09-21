package typings.scrivito.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetTagProps
  extends StObject
     with HTMLAttributes[Any]
     with /* key */ StringDictionary[Any] {
  
  var tag: js.UndefOr[String] = js.undefined
}
object WidgetTagProps {
  
  inline def apply(): WidgetTagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetTagProps]
  }
  
  extension [Self <: WidgetTagProps](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
