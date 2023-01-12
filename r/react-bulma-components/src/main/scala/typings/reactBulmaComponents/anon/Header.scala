package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var Body: BulmaComponent[js.Object, div]
  
  var Header: BulmaComponent[js.Object, div]
}
object Header {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Header: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement
  ): Header = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Header = js.Any.fromFunction1(Header))
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setHeader(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
  }
}
