package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  object Portal {
    
    @JSImport("@react-md/portal/types/Portal", "Portal")
    @js.native
    def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/portal/types/Portal", "Portal.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/portal/types/Portal", "Portal.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/portal/types/Portal", "Portal.propTypes.into")
      @js.native
      def into: js.Any = js.native
      
      @JSImport("@react-md/portal/types/Portal", "Portal.propTypes.intoId")
      @js.native
      def intoId: js.Any = js.native
      @scala.inline
      def intoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def into_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("into")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PortalProps extends StObject {
    
    /**
      * The children to render within the portal.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Either a function that returns an HTMLElement, an HTMLElement, or a
      * `document.querySelector` string that will return the HTMLElement to render
      * the children into. If both the `into` and `intoId` props are `undefined`,
      * the `document.body` will be chosen instead.
      *
      * If the `querySelector` string does not return a valid HTMLElement, an error
      * will be thrown.
      */
    var into: js.UndefOr[PortalInto] = js.native
    
    /**
      * The id of an element that the portal should be rendered into. If an element
      * with the provided id can not be found on the page at the time of mounting,
      * an error will be thrown.
      */
    var intoId: js.UndefOr[String] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInto(value: PortalInto): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "into", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIntoId(value: String): Self = StObject.set(x, "intoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntoIdUndefined: Self = StObject.set(x, "intoId", js.undefined)
      
      @scala.inline
      def setIntoNull: Self = StObject.set(x, "into", null)
      
      @scala.inline
      def setIntoUndefined: Self = StObject.set(x, "into", js.undefined)
    }
  }
}
