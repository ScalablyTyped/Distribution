package typings.reactSvg

import typings.react.mod.Component
import typings.reactSvg.anon.AfterInjection
import typings.reactSvg.anon.BeforeInjection
import typings.reactSvg.anon.HasError
import typings.reactSvg.distTypesMod.Props
import typings.reactSvg.distTypesMod.State
import typings.reactSvg.distTypesMod.WrapperType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactSVGMod {
  
  @JSImport("react-svg/dist/ReactSVG", "ReactSVG")
  @js.native
  open class ReactSVG protected () extends Component[Props, State, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    var _isMounted: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactSVG(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactSVG(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactSVG(): Unit = js.native
    
    var initialState: HasError = js.native
    
    var nonReactWrapper: js.UndefOr[WrapperType | Null] = js.native
    
    var reactWrapper: js.UndefOr[WrapperType | Null] = js.native
    
    def refCallback(): Unit = js.native
    def refCallback(reactWrapper: WrapperType): Unit = js.native
    
    def removeSVG(): Unit = js.native
    
    def renderSVG(): Unit = js.native
    
    @JSName("state")
    var state_ReactSVG: HasError = js.native
  }
  /* static members */
  object ReactSVG {
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG.defaultProps")
    @js.native
    def defaultProps: AfterInjection = js.native
    inline def defaultProps_=(x: AfterInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-svg/dist/ReactSVG", "ReactSVG.propTypes")
    @js.native
    def propTypes: BeforeInjection = js.native
    inline def propTypes_=(x: BeforeInjection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
