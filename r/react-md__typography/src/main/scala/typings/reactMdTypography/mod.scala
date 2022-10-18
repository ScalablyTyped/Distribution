package typings.reactMdTypography

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTypography.typesSrOnlyMod.SrOnlyProps
import typings.reactMdTypography.typesTextContainerMod.TextContainerProps
import typings.reactMdTypography.typesTypographyMod.TypographyHTMLElement
import typings.reactMdTypography.typesTypographyMod.TypographyProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/typography", "SrOnly")
  @js.native
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps & RefAttributes[TypographyHTMLElement]] = js.native
  
  @JSImport("@react-md/typography", "TextContainer")
  @js.native
  val TextContainer: ForwardRefExoticComponent[TextContainerProps & (RefAttributes[HTMLDivElement | ElementType[Any]])] = js.native
  
  @JSImport("@react-md/typography", "Typography")
  @js.native
  val Typography: ForwardRefExoticComponent[TypographyProps & RefAttributes[TypographyHTMLElement]] = js.native
}
