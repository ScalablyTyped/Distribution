package typings.reactMdLink

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdLink.anon.PickLinkWithComponentProp
import typings.reactMdLink.linkMod.LinkProps
import typings.reactMdLink.skipToMainContentMod.SkipToMainContentProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/link", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[
    (LinkProps & (RefAttributes[HTMLAnchorElement | ElementType[Any]])) | PickLinkWithComponentProp
  ] = js.native
  
  @JSImport("@react-md/link", "SkipToMainContent")
  @js.native
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps & RefAttributes[HTMLAnchorElement]] = js.native
}
