package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsPageProps extends StObject {
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: String
}
object DocsPageProps {
  
  inline def apply(title: String): DocsPageProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsPageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocsPageProps] (val x: Self) extends AnyVal {
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
