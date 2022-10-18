package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  var Body: BulmaComponent[js.Object, div]
  
  var Footer: BulmaComponent[js.Object, div]
  
  var Header: BulmaComponent[js.Object, div]
}
object Footer {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Footer: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Header: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement
  ): Footer = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Footer = js.Any.fromFunction1(Footer), Header = js.Any.fromFunction1(Header))
    __obj.asInstanceOf[Footer]
  }
  
  extension [Self <: Footer](x: Self) {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setFooter(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Footer", js.Any.fromFunction1(value))
    
    inline def setHeader(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
  }
}
