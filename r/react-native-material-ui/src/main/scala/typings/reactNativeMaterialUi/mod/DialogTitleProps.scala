package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.TitleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogTitleProps extends StObject {
  
  var children: Element
  
  var style: js.UndefOr[TitleContainer] = js.undefined
}
object DialogTitleProps {
  
  inline def apply(children: Element): DialogTitleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
  
  extension [Self <: DialogTitleProps](x: Self) {
    
    inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: TitleContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
