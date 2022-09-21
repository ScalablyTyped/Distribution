package typings.reachSkipNav

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  /**
    * SkipNavContent
    *
    * Renders a div as the target for the link.
    *
    * @see Docs https://reach.tech/skip-nav#skipnavcontent
    */
  @JSImport("@reach/skip-nav/dist/declarations/src", "SkipNavContent")
  @js.native
  val SkipNavContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', SkipNavContentProps> */ Any = js.native
  
  /**
    * SkipNavLink
    *
    * Renders a link that remains hidden until focused to skip to the main content.
    *
    * @see Docs https://reach.tech/skip-nav#skipnavlink
    */
  @JSImport("@reach/skip-nav/dist/declarations/src", "SkipNavLink")
  @js.native
  val SkipNavLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'a', SkipNavLinkProps> */ Any = js.native
  
  /**
    * @see Docs https://reach.tech/skip-nav#skipnavcontent-props
    */
  trait SkipNavContentProps extends StObject {
    
    /**
      * You can place the `SkipNavContent` element as a sibling to your main
      * content or as a wrapper.
      *
      * Keep in mind it renders a `div`, so it may mess with your CSS depending on
      * where it’s placed.
      *
      * @example
      *   <SkipNavContent />
      *   <YourMainContent />
      *   // vs.
      *   <SkipNavContent>
      *     <YourMainContent/>
      *   </SkipNavContent>
      *
      * @see Docs https://reach.tech/skip-nav#skipnavcontent-children
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An alternative ID. If used, the same value must be provided to the
      * `contentId` prop in `SkipNavLink`.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavcontent-id
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object SkipNavContentProps {
    
    inline def apply(): SkipNavContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipNavContentProps]
    }
    
    extension [Self <: SkipNavContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/skip-nav#skipnavlink-props
    */
  trait SkipNavLinkProps extends StObject {
    
    /**
      * Allows you to change the text for your preferred phrase or localization.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavlink-children
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An alternative ID for `SkipNavContent`. If used, the same value must be
      * provided to the `id` prop in `SkipNavContent`.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavlink-contentid
      */
    var contentId: js.UndefOr[String] = js.undefined
  }
  object SkipNavLinkProps {
    
    inline def apply(): SkipNavLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipNavLinkProps]
    }
    
    extension [Self <: SkipNavLinkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    }
  }
}
