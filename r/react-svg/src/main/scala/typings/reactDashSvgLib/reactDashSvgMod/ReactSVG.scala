package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG
  extends reactLib.reactMod.Component[
      Props with (reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLSpanElement | reactLib.HTMLDivElement], 
        reactLib.HTMLSpanElement | reactLib.HTMLDivElement
      ]), 
      State, 
      js.Any
    ] {
  var _isMounted: scala.Boolean = js.native
  var container: js.UndefOr[reactLib.HTMLSpanElement | reactLib.HTMLDivElement | scala.Null] = js.native
  var initialState: reactDashSvgLib.Anon_IsLoading = js.native
  var refCallback: reactLib.reactMod.ReactNs.Ref[reactLib.HTMLSpanElement | reactLib.HTMLDivElement] = js.native
  @JSName("state")
  var state_ReactSVG: reactDashSvgLib.Anon_IsLoading = js.native
  var svgWrapper: js.UndefOr[reactLib.HTMLSpanElement | reactLib.HTMLDivElement | scala.Null] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactSVG(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactSVG(prevProps: Props): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactSVG(): scala.Unit = js.native
  def removeSVG(): scala.Unit = js.native
  def renderSVG(): scala.Unit = js.native
}

