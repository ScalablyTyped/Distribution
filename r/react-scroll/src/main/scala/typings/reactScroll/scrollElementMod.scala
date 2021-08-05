package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollElementMod {
  
  @JSImport("react-scroll/modules/mixins/scroll-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](component: ComponentType[P]): ComponentClass[ScrollElementProps[P], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[ScrollElementProps[P], ComponentState]]
  
  type ScrollElementProps[P] = P & Id
}
