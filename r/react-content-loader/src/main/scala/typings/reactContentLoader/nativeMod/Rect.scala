package typings.reactContentLoader.nativeMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNativeSvg.mod.RectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-content-loader/dist/native", "Rect")
@js.native
class Rect protected ()
  extends typings.reactContentLoader.holderMod.Rect {
  def this(props: RectProps) = this()
  def this(props: RectProps, context: js.Any) = this()
}

@JSImport("react-content-loader/dist/native", "Rect")
@js.native
object Rect extends TopLevel[ComponentClass[RectProps, ComponentState]]

