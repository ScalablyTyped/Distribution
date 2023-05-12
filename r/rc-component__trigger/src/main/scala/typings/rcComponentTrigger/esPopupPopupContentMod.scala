package typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupPopupContentMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/Popup/PopupContent", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* param0 */ PopupContentProps, ReactElement]] = js.native
  
  trait PopupContentProps extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object PopupContentProps {
    
    inline def apply(): PopupContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupContentProps] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* param0 */ PopupContentProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPopupPopupContentMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* param0 */ PopupContentProps, ReactElement]] = default
}
