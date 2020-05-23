package typings.reactSvg

import typings.react.mod.Component
import typings.reactSvg.anon.AfterInjection
import typings.reactSvg.anon.BeforeInjection
import typings.reactSvg.anon.HasError
import typings.reactSvg.typesMod.Props
import typings.reactSvg.typesMod.State
import typings.reactSvg.typesMod.WrapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg/dist/ReactSVG", JSImport.Namespace)
@js.native
object reactSVGMod extends js.Object {
  @js.native
  class ReactSVG ()
    extends Component[Props, State, js.Any] {
    var _isMounted: Boolean = js.native
    var container: js.UndefOr[WrapperType | Null] = js.native
    var initialState: HasError = js.native
    @JSName("state")
    var state_ReactSVG: HasError = js.native
    var svgWrapper: js.UndefOr[WrapperType | Null] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MReactSVG(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactSVG(prevProps: Props): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactSVG(): Unit = js.native
    def refCallback(): Unit = js.native
    def refCallback(container: WrapperType): Unit = js.native
    def removeSVG(): Unit = js.native
    def renderSVG(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ReactSVG extends js.Object {
    var defaultProps: AfterInjection = js.native
    var propTypes: BeforeInjection = js.native
  }
  
}

