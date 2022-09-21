package typings.rcMenu

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMenuListMod extends Shortcut {
  
  @JSImport("rc-menu/es/SubMenu/SubMenuList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]] = js.native
  
  trait SubMenuListProps
    extends StObject
       with HTMLAttributes[HTMLUListElement]
  object SubMenuListProps {
    
    inline def apply(): SubMenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuListProps]
    }
  }
  
  type _To = ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]]
  
  /* This means you don't have to write `default`, but can instead just say `subMenuListMod.foo` */
  override def _to: ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]] = default
}
