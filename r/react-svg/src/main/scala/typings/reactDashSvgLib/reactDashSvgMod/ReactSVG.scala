package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG
  extends reactLib.reactMod.Component[
      Props with (reactLib.reactMod.ReactNs.DetailedHTMLProps[
        reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement], 
        reactLib.HTMLDivElement
      ]), 
      js.Object, 
      js.Any
    ] {
  var container: js.UndefOr[reactLib.HTMLDivElement | scala.Null] = js.native
  var refCallback: reactLib.reactMod.ReactNs.Ref[reactLib.HTMLDivElement] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactSVG(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactSVG(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactSVG(): scala.Unit = js.native
  def removeSVG(): scala.Unit = js.native
  def renderSVG(): scala.Unit = js.native
}

