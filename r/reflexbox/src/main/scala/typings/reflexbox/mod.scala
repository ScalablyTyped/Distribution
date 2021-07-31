package typings.reflexbox

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.reflexbox.reflexboxStrings.colors
import typings.reflexbox.reflexboxStrings.key
import typings.reflexbox.reflexboxStrings.ref
import typings.reflexbox.reflexboxStrings.space
import typings.std.HTMLDivElement
import typings.std.Omit
import typings.styledSystem.mod.ColorProps
import typings.styledSystem.mod.FlexboxProps
import typings.styledSystem.mod.LayoutProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.ThemeValue
import typings.styledSystem.mod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reflexbox", "Box")
  @js.native
  val Box: BoxType = js.native
  
  @JSImport("reflexbox", "Flex")
  @js.native
  val Flex: BoxType = js.native
  
  trait BoxProps
    extends StObject
       with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
       with LayoutProps[RequiredTheme]
       with TypographyProps[RequiredTheme]
       with ColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
       with FlexboxProps[RequiredTheme] {
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
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
      def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  type BoxType = StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Omit[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) & BoxProps, 
      /* keyof react.react.ClassAttributes<any> */ ref | key
    ], 
    js.Object
  ]
}
