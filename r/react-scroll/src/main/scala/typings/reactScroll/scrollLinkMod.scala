package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Container
import typings.reactScroll.linkMod.ReactScrollLinkProps
import typings.reactScroll.scrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollLinkMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Default)
  @js.native
  def default[P](component: ComponentType[P]): ComponentClass[ScrollLinkProps[P], ComponentState] = js.native
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Default)
  @js.native
  def default[P](component: ComponentType[P], customScroller: Scroller): ComponentClass[ScrollLinkProps[P], ComponentState] = js.native
  
  type ScrollLinkProps[P] = ReactScrollLinkProps with P with Container
}
