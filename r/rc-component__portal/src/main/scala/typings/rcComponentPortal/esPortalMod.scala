package typings.rcComponentPortal

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentPortal.rcComponentPortalBooleans.`false`
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPortalMod extends Shortcut {
  
  @JSImport("@rc-component/portal/es/Portal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PortalProps & RefAttributes[Any]] = js.native
  
  type ContainerType = Element | DocumentFragment
  
  type GetContainer = String | ContainerType | js.Function0[ContainerType] | `false`
  
  trait PortalProps extends StObject {
    
    /** Remove `children` when `open` is `false`. Set `false` will not handle remove process */
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    /** Lock screen scroll when open */
    var autoLock: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** @private debug name. Do not use in prod */
    var debug: js.UndefOr[String] = js.undefined
    
    /** Customize container element. Default will create a div in document.body when `open` */
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    /** Show the portal children */
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setAutoLock(value: Boolean): Self = StObject.set(x, "autoLock", value.asInstanceOf[js.Any])
      
      inline def setAutoLockUndefined: Self = StObject.set(x, "autoLock", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => ContainerType): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PortalProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esPortalMod.foo` */
  override def _to: ForwardRefExoticComponent[PortalProps & RefAttributes[Any]] = default
}
