package typings.atStorybookApi.distStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var upstreamGetState: GetState = js.native
  var upstreamSetState: SetState = js.native
  def getInitialState(base: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ js.Any): js.Any = js.native
  def getState(): js.Any = js.native
  def setState(inputPatch: InputPatch): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ _
  ] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ _
  ] = js.native
  def setState(inputPatch: InputPatch, callback: CallBack, options: Options): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ _
  ] = js.native
  def setState(inputPatch: InputPatch, options: Options): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify State */ _
  ] = js.native
}

