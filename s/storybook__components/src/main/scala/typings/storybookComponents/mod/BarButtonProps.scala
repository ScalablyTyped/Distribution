package typings.storybookComponents.mod

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarButtonProps
  extends StObject
     with ClassAttributes[HTMLButtonElement]
     with ButtonHTMLAttributes[HTMLButtonElement] {
  
  var href: js.UndefOr[Unit] = js.undefined
}
object BarButtonProps {
  
  inline def apply(): BarButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarButtonProps]
  }
  
  extension [Self <: BarButtonProps](x: Self) {
    
    inline def setHref(value: Unit): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
