package typings.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametricOptions[S, P, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.native
  var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.native
  var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.native
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
}

object ParametricOptions {
  @scala.inline
  def apply[S, P, C, D](): ParametricOptions[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
  }
  @scala.inline
  implicit class ParametricOptionsOps[Self <: ParametricOptions[_, _, _, _], S, P, C, D] (val x: Self with (ParametricOptions[S, P, C, D])) extends AnyVal {
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
    def setCacheObject(value: ICacheObject): Self = this.set("cacheObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheObject: Self = this.set("cacheObject", js.undefined)
    @scala.inline
    def setKeySelector(value: (S, P, /* repeated */ js.Any) => js.Any): Self = this.set("keySelector", js.Any.fromFunction3(value))
    @scala.inline
    def deleteKeySelector: Self = this.set("keySelector", js.undefined)
    @scala.inline
    def setKeySelectorCreator(
      value: /* selectorInputs */ typings.reReselect.anon.KeySelector[D, C, S, P] => ParametricKeySelector[S, P]
    ): Self = this.set("keySelectorCreator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeySelectorCreator: Self = this.set("keySelectorCreator", js.undefined)
    @scala.inline
    def setSelectorCreator(value: CreateSelectorInstance): Self = this.set("selectorCreator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectorCreator: Self = this.set("selectorCreator", js.undefined)
  }
  
}

