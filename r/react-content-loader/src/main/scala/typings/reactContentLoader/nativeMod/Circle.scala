package typings.reactContentLoader.nativeMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNativeSvg.mod.CircleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-content-loader/dist/native", "Circle")
@js.native
class Circle protected ()
  extends typings.reactContentLoader.holderMod.Circle {
  def this(props: CircleProps) = this()
  def this(props: CircleProps, context: js.Any) = this()
}

@JSImport("react-content-loader/dist/native", "Circle")
@js.native
object Circle extends TopLevel[ComponentClass[CircleProps, ComponentState]]

