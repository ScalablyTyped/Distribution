package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG
  extends reactLib.reactMod.Component[
      Props with (reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.HTMLAttributes[reactDashSvgLib.WrapperType], 
        reactDashSvgLib.WrapperType
      ]), 
      State, 
      js.Any
    ] {
  var _isMounted: scala.Boolean = js.native
  var container: js.UndefOr[reactDashSvgLib.WrapperType | scala.Null] = js.native
  var initialState: reactDashSvgLib.Anon_HasError = js.native
  @JSName("state")
  var state_ReactSVG: reactDashSvgLib.Anon_HasError = js.native
  var svgWrapper: js.UndefOr[reactDashSvgLib.WrapperType | scala.Null] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactSVG(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactSVG(prevProps: Props): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactSVG(): scala.Unit = js.native
  def refCallback(): scala.Unit = js.native
  def refCallback(container: stdLib.HTMLDivElement): scala.Unit = js.native
  def refCallback(container: stdLib.HTMLSpanElement): scala.Unit = js.native
  def removeSVG(): scala.Unit = js.native
  def renderSVG(): scala.Unit = js.native
}

