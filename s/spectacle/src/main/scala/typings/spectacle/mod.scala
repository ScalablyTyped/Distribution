package typings.spectacle

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.spectacle.anon.AnimationsWhenGoingBack
import typings.spectacle.anon.AutoFillHeight
import typings.spectacle.anon.BackgroundColor
import typings.spectacle.anon.Children
import typings.spectacle.anon.ChildrenReactNode
import typings.spectacle.anon.Color
import typings.spectacle.anon.ContainsSlides
import typings.spectacle.anon.CurrentSlide
import typings.spectacle.anon.DefaultValue
import typings.spectacle.anon.Size
import typings.spectacle.anon.childrenReactNodeLayoutPr
import typings.spectacle.spectacleStrings.colors
import typings.spectacle.spectacleStrings.space
import typings.std.Record
import typings.styledSystem.mod.BorderProps
import typings.styledSystem.mod.ColorProps
import typings.styledSystem.mod.FlexProps
import typings.styledSystem.mod.LayoutProps
import typings.styledSystem.mod.PositionProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.ThemeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spectacle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("spectacle", "Appear")
  @js.native
  val Appear: FC[Children] = js.native
  
  @JSImport("spectacle", "Box")
  @js.native
  val Box: FC[BoxProps] = js.native
  
  @JSImport("spectacle", "CodePane")
  @js.native
  val CodePane: FC[AutoFillHeight] = js.native
  
  @JSImport("spectacle", "CodeSpan")
  @js.native
  val CodeSpan: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Deck")
  @js.native
  val Deck: FC[AnimationsWhenGoingBack] = js.native
  
  @JSImport("spectacle", "FlexBox")
  @js.native
  val FlexBox: FC[
    BoxProps & (FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any
    ])
  ] = js.native
  
  @JSImport("spectacle", "FullScreen")
  @js.native
  val FullScreen: FC[Color] = js.native
  
  @JSImport("spectacle", "FullSizeImage")
  @js.native
  val FullSizeImage: FC[
    ImgHTMLAttributes[js.Object] & LayoutProps[RequiredTheme] & PositionProps[RequiredTheme]
  ] = js.native
  
  @JSImport("spectacle", "Grid")
  @js.native
  val Grid: FC[childrenReactNodeLayoutPr] = js.native
  
  @JSImport("spectacle", "Heading")
  @js.native
  val Heading: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Image")
  @js.native
  val Image: FC[
    ImgHTMLAttributes[js.Object] & LayoutProps[RequiredTheme] & PositionProps[RequiredTheme]
  ] = js.native
  
  @JSImport("spectacle", "Link")
  @js.native
  val Link: FC[TypographyProps & AnchorHTMLAttributes[js.Object]] = js.native
  
  @JSImport("spectacle", "ListItem")
  @js.native
  val ListItem: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Markdown")
  @js.native
  val Markdown: FC[ContainsSlides] = js.native
  
  @JSImport("spectacle", "Notes")
  @js.native
  val Notes: FC[ChildrenReactNode] = js.native
  
  @JSImport("spectacle", "OrderedList")
  @js.native
  val OrderedList: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Progress")
  @js.native
  val Progress: FC[Color] = js.native
  
  @JSImport("spectacle", "Quote")
  @js.native
  val Quote: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Slide")
  @js.native
  val Slide: FC[BackgroundColor] = js.native
  
  @JSImport("spectacle", "SpectacleLogo")
  @js.native
  val SpectacleLogo: FC[Size] = js.native
  
  @JSImport("spectacle", "Stepper")
  @js.native
  val Stepper: FC[DefaultValue] = js.native
  
  @JSImport("spectacle", "Text")
  @js.native
  val Text: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "UnorderedList")
  @js.native
  val UnorderedList: FC[TypographyProps] = js.native
  
  @scala.inline
  def isolateNotes(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isolateNotes")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("spectacle", "mdxComponentMap")
  @js.native
  val mdxComponentMap: Record[String, Element] = js.native
  
  @scala.inline
  def remoteNotes(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteNotes")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BoxProps
    extends StObject
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
       with LayoutProps[RequiredTheme]
       with PositionProps[RequiredTheme]
       with BorderProps[
          RequiredTheme, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ js.Any
        ] {
    
    var children: ReactNode
  }
  object BoxProps {
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type TemplateFn = js.Function1[/* options */ CurrentSlide, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.spectacle.anon.Config
    - typings.spectacle.spectacleStrings.fade
    - typings.spectacle.spectacleStrings.slide
    - typings.spectacle.spectacleStrings.none
  */
  trait TransitionEffect extends StObject
  
  trait TypographyProps
    extends StObject
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
       with typings.styledSystem.mod.TypographyProps[RequiredTheme]
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]] {
    
    var children: ReactNode
  }
  object TypographyProps {
    
    @scala.inline
    def apply(): TypographyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyProps]
    }
    
    @scala.inline
    implicit class TypographyPropsMutableBuilder[Self <: TypographyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
