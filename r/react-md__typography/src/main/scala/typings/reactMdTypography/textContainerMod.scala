package typings.reactMdTypography

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdTypography.anon.ClassName
import typings.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textContainerMod {
  
  @JSImport("@react-md/typography/types/TextContainer", "TextContainer")
  @js.native
  val TextContainer: ForwardRefExoticComponent[TextContainerProps & (RefAttributes[HTMLDivElement | ElementType[Any]])] = js.native
  
  trait TextContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Either a child render function or a react node. If this is not the child
      * render function, a different wrapper component can be provided using the
      * `component` prop.
      */
    @JSName("children")
    var children_TextContainerProps: js.UndefOr[ReactNode | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction] = js.undefined
    
    /**
      * Boolean if the `className` should be cloned into the `children` for this
      * component.
      *
      * Note: This will only work if the child component passed the `className`
      * down to to the DOM element.
      */
    @JSName("clone")
    var clone_FTextContainerProps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The component to render as. By default this will just be a div, but
      * anything can be provided.
      */
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * The size for the text container. This can usually just be left at the
      * default of `"auto"` since it will automatically transition between
      * `"mobile"` and `"desktop"` based on media queries.  However, you can also
      * manually specify `"mobile"` or `"desktop"` if needed.
      */
    var size: js.UndefOr[TextContainerSize] = js.undefined
  }
  object TextContainerProps {
    
    inline def apply(): TextContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextContainerProps]
    }
    
    extension [Self <: TextContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ClassName => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setSize(value: TextContainerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type TextContainerRenderFunction = js.Function1[/* props */ ClassName, ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.auto
    - typings.reactMdTypography.reactMdTypographyStrings.mobile
    - typings.reactMdTypography.reactMdTypographyStrings.desktop
  */
  trait TextContainerSize extends StObject
  object TextContainerSize {
    
    inline def auto: typings.reactMdTypography.reactMdTypographyStrings.auto = "auto".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.auto]
    
    inline def desktop: typings.reactMdTypography.reactMdTypographyStrings.desktop = "desktop".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.desktop]
    
    inline def mobile: typings.reactMdTypography.reactMdTypographyStrings.mobile = "mobile".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.mobile]
  }
}
