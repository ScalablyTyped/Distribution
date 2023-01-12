package typings.reactElemental.mod

import typings.react.mod.ReactNode
import typings.reactElemental.anon.Primary
import typings.reactElemental.anon.PrimaryDark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementalProps extends StObject {
  
  val children: ReactNode
  
  val colorOpts: js.UndefOr[PrimaryDark] = js.undefined
  
  val fontOpts: js.UndefOr[Primary] = js.undefined
}
object ElementalProps {
  
  inline def apply(): ElementalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementalProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColorOpts(value: PrimaryDark): Self = StObject.set(x, "colorOpts", value.asInstanceOf[js.Any])
    
    inline def setColorOptsUndefined: Self = StObject.set(x, "colorOpts", js.undefined)
    
    inline def setFontOpts(value: Primary): Self = StObject.set(x, "fontOpts", value.asInstanceOf[js.Any])
    
    inline def setFontOptsUndefined: Self = StObject.set(x, "fontOpts", js.undefined)
  }
}
