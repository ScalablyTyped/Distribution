package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joyride
  extends reactLib.reactMod.Component[Props, State, js.Any] {
  def addTooltip(data: Step): scala.Unit = js.native
  def back(): scala.Unit = js.native
  def getProgress(): Progress = js.native
  def next(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def reset(restart: scala.Boolean): scala.Unit = js.native
  /**
       * Please don't use the `start` and `stop` methods anymore. Instead use a combination of the props `run` and `autoStart`.
       */
  /* private */ def start(): scala.Unit = js.native
  /**
       * Please don't use the `start` and `stop` methods anymore. Instead use a combination of the props `run` and `autoStart`.
       */
  /* private */ def start(autorun: scala.Boolean): scala.Unit = js.native
  /**
       * Please don't use the `start` and `stop` methods anymore. Instead use a combination of the props `run` and `autoStart`.
       */
  /* private */ def stop(): scala.Unit = js.native
}

