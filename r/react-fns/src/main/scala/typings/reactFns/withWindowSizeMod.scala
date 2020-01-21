package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize/withWindowSize", JSImport.Namespace)
@js.native
object withWindowSizeMod extends js.Object {
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
}

