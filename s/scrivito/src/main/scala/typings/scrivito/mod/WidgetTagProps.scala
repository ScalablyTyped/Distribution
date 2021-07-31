package typings.scrivito.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetTagProps
  extends StObject
     with HTMLAttributes[js.Any]
     with /* key */ StringDictionary[js.Any] {
  
  var tag: String
}
object WidgetTagProps {
  
  @scala.inline
  def apply(tag: String): WidgetTagProps = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTagProps]
  }
  
  @scala.inline
  implicit class WidgetTagPropsMutableBuilder[Self <: WidgetTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
