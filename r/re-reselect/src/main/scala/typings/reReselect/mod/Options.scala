package typings.reReselect.mod

import typings.reReselect.anon.InputSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[S, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.native
  var keySelector: js.UndefOr[KeySelector[S]] = js.native
  var keySelectorCreator: js.UndefOr[KeySelectorCreator[S, C, D]] = js.native
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
}

object Options {
  @scala.inline
  def apply[S, C, D](): Options[S, C, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[S, C, D]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _, _], S, C, D] (val x: Self with (Options[S, C, D])) extends AnyVal {
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
    def setKeySelector(value: (S, /* repeated */ js.Any) => js.Any): Self = this.set("keySelector", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeySelector: Self = this.set("keySelector", js.undefined)
    @scala.inline
    def setKeySelectorCreator(value: /* selectorInputs */ InputSelectors[D, C, S] => KeySelector[S]): Self = this.set("keySelectorCreator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeySelectorCreator: Self = this.set("keySelectorCreator", js.undefined)
    @scala.inline
    def setSelectorCreator(value: CreateSelectorInstance): Self = this.set("selectorCreator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectorCreator: Self = this.set("selectorCreator", js.undefined)
  }
  
}

