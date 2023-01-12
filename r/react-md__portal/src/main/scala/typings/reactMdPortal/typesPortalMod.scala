package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdPortal.typesGetContainerMod.PortalInto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPortalMod {
  
  @JSImport("@react-md/portal/types/Portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Portal(param0: PortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait PortalProps extends StObject {
    
    /**
      * The children to render within the portal.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Either a function that returns an HTMLElement, an HTMLElement, or a
      * `document.querySelector` string that will return the HTMLElement to render
      * the children into. If both the `into` and `intoId` props are `undefined`,
      * the `document.body` will be chosen instead.
      *
      * If the `querySelector` string does not return a valid HTMLElement, an error
      * will be thrown.
      */
    var into: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * The id of an element that the portal should be rendered into. If an element
      * with the provided id can not be found on the page at the time of mounting,
      * an error will be thrown.
      */
    var intoId: js.UndefOr[String] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInto(value: PortalInto): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
      
      inline def setIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "into", js.Any.fromFunction0(value))
      
      inline def setIntoId(value: String): Self = StObject.set(x, "intoId", value.asInstanceOf[js.Any])
      
      inline def setIntoIdUndefined: Self = StObject.set(x, "intoId", js.undefined)
      
      inline def setIntoNull: Self = StObject.set(x, "into", null)
      
      inline def setIntoUndefined: Self = StObject.set(x, "into", js.undefined)
    }
  }
}
