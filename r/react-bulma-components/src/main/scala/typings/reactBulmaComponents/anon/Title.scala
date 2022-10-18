package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.footer
import typings.reactBulmaComponents.reactBulmaComponentsStrings.header
import typings.reactBulmaComponents.reactBulmaComponentsStrings.p
import typings.reactBulmaComponents.reactBulmaComponentsStrings.section
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsModalMod.ModalCardHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var Body: BulmaComponent[js.Object, section]
  
  var Footer: BulmaComponent[js.Object, footer]
  
  var Header: BulmaComponent[ModalCardHeaderProps, header]
  
  var Title: BulmaComponent[js.Object, p]
}
object Title {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, section]) => ReactElement,
    Footer: /* props */ js.Object & (ElementProps[js.Object, footer]) => ReactElement,
    Header: /* props */ ModalCardHeaderProps & (ElementProps[ModalCardHeaderProps, header]) => ReactElement,
    Title: /* props */ js.Object & (ElementProps[js.Object, p]) => ReactElement
  ): Title = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Footer = js.Any.fromFunction1(Footer), Header = js.Any.fromFunction1(Header), Title = js.Any.fromFunction1(Title))
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, section]) => ReactElement): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setFooter(value: /* props */ js.Object & (ElementProps[js.Object, footer]) => ReactElement): Self = StObject.set(x, "Footer", js.Any.fromFunction1(value))
    
    inline def setHeader(
      value: /* props */ ModalCardHeaderProps & (ElementProps[ModalCardHeaderProps, header]) => ReactElement
    ): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
    
    inline def setTitle(value: /* props */ js.Object & (ElementProps[js.Object, p]) => ReactElement): Self = StObject.set(x, "Title", js.Any.fromFunction1(value))
  }
}
