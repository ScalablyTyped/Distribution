package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.SFC
import typings.std.HTMLAnchorElement
import typings.std.HTMLImageElement
import typings.storybookComponents.storybookLogoMod.StorybookLogoProps
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsAnch
import typings.storybookUi.anon.PickDetailedHTMLPropsImgH
import typings.storybookUi.anon.PickPropsWithChildrenStor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "Brand")
  @js.native
  val Brand: SFC[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_helper.AddOptionalTo<any, 'theme'> */ js.Any
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "Img")
  @js.native
  val Img: StyledComponent[
    DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
    PickDetailedHTMLPropsImgH, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "LogoLink")
  @js.native
  val LogoLink: StyledComponent[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    PickDetailedHTMLPropsAnch, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Brand", "StorybookLogoStyled")
  @js.native
  val StorybookLogoStyled: StyledComponent[PropsWithChildren[StorybookLogoProps], PickPropsWithChildrenStor, Theme] = js.native
}
