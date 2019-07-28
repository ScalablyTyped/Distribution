package typings.reactDashJoyride.reactDashJoyrideMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joyride
  extends Component[Props, State, js.Any] {
  def addTooltip(data: Step): Unit = js.native
  def back(): Unit = js.native
  def getProgress(): Progress = js.native
  def next(): Unit = js.native
  def reset(): Unit = js.native
  def reset(restart: Boolean): Unit = js.native
  /**
    * Please don't use the `start` and `stop` methods anymore. Instead use a combination of the props `run` and `autoStart`.
    */
  /* private */ def start(): Unit = js.native
  /* private */ def start(autorun: Boolean): Unit = js.native
  /**
    * Please don't use the `start` and `stop` methods anymore. Instead use a combination of the props `run` and `autoStart`.
    */
  /* private */ def stop(): Unit = js.native
}

