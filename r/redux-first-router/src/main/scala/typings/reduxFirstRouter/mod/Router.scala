package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router[TState] extends js.Object {
  def getActionForPathAndParams(path: String): Nullable[js.Object] = js.native
  def getPathAndParamsForState(state: TState): typings.reduxFirstRouter.anon.Params = js.native
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState] = js.native
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState] = js.native
}

object Router {
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: String => Nullable[js.Object],
    getPathAndParamsForState: TState => typings.reduxFirstRouter.anon.Params,
    getStateForAction: (js.Object, Nullable[TState]) => Nullable[TState],
    getStateForActionOriginal: (js.Object, Nullable[TState]) => Nullable[TState]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal(getActionForPathAndParams = js.Any.fromFunction1(getActionForPathAndParams), getPathAndParamsForState = js.Any.fromFunction1(getPathAndParamsForState), getStateForAction = js.Any.fromFunction2(getStateForAction), getStateForActionOriginal = js.Any.fromFunction2(getStateForActionOriginal))
    __obj.asInstanceOf[Router[TState]]
  }
  @scala.inline
  implicit class RouterOps[Self <: Router[_], TState] (val x: Self with Router[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetActionForPathAndParams(value: String => Nullable[js.Object]): Self = this.set("getActionForPathAndParams", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPathAndParamsForState(value: TState => typings.reduxFirstRouter.anon.Params): Self = this.set("getPathAndParamsForState", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStateForAction(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self = this.set("getStateForAction", js.Any.fromFunction2(value))
    @scala.inline
    def setGetStateForActionOriginal(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self = this.set("getStateForActionOriginal", js.Any.fromFunction2(value))
  }
  
}

