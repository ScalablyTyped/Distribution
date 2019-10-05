package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactType[_]): ReactElement = js.native
  def apply[P](`type`: ReactType[_], props: P, children: ReactNode*): ReactElement = js.native
}

