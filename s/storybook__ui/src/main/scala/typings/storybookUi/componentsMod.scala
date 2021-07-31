package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.storybookRouter.routerMod.QueryLinkProps
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Offset
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.anon.PickDetailedHTMLPropsHTMLAbout
import typings.storybookUi.anon.PickQueryLinkPropschildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "DesktopOnly")
  @js.native
  val DesktopOnly: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "FrameWrap")
  @js.native
  val FrameWrap: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], Offset, Theme] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "IframeWrapper")
  @js.native
  val IframeWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "LoaderWrapper")
  @js.native
  val LoaderWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/preview/utils/components", "UnstyledLink")
  @js.native
  val UnstyledLink: StyledComponent[QueryLinkProps, PickQueryLinkPropschildre, Theme] = js.native
}
