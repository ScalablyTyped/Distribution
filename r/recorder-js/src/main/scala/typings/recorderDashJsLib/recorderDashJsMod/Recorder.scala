package typings
package recorderDashJsLib.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Recorder extends js.Object {
  def init(stream: stdLib.MediaStream): stdLib.Promise[scala.Unit]
  def start(): stdLib.Promise[js.UndefOr[stdLib.MediaStream]]
  def stop(): stdLib.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult]
}

