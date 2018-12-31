package typings
package recorderDashJsLib.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recorder extends js.Object {
  def init(stream: stdLib.MediaStream): js.Promise[scala.Unit]
  def start(): js.Promise[js.UndefOr[stdLib.MediaStream]]
  def stop(): js.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult]
}

