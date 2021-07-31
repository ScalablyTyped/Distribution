package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.scrollScrollMod.ScrollConfig
import typings.reactFns.scrollScrollMod.ScrollProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMod {
  
  @JSImport("react-fns/dist/Scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/Scroll", "Scroll")
  @js.native
  class Scroll protected ()
    extends typings.reactFns.scrollScrollMod.Scroll {
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps], context: js.Any) = this()
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns/dist/Scroll", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/Scroll", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def withScroll[Props](Component: ComponentType[Props & ScrollProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
