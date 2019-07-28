package typings.reactDashPose.libPosedMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Posed extends /* key */ StringDictionary[ComponentFactory[HTMLProps[_]]] {
  def apply[T](component: ComponentType[T]): ComponentFactory[T] = js.native
}

