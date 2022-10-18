package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Container
import typings.reactScroll.modulesComponentsLinkMod.ReactScrollLinkProps
import typings.reactScroll.modulesMixinsScrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollLinkMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentType[P]): ComponentClass[ScrollLinkProps[P], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[ScrollLinkProps[P], ComponentState]]
  inline def default[P](component: ComponentType[P], customScroller: Scroller): ComponentClass[ScrollLinkProps[P], ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[ScrollLinkProps[P], ComponentState]]
  
  type ScrollLinkProps[P] = ReactScrollLinkProps & P & Container
}
