package typings.storybookApi.storeMod

import typings.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var upstreamGetState: GetState = js.native
  var upstreamSetState: SetState = js.native
  def getInitialState(base: State): js.Any = js.native
  def getState(): State = js.native
  def setState(inputPatch: InputPatch): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack, options: Options): js.Promise[State] = js.native
  def setState(inputPatch: InputPatch, options: Options): js.Promise[State] = js.native
}

