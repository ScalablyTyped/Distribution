package typings.reactSvg.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeInjection extends js.Object {
  var afterInjection: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var beforeInjection: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var evalScripts: Requireable[String] = js.native
  var fallback: Requireable[String | js.Object] = js.native
  var loading: Requireable[String | js.Object] = js.native
  var renumerateIRIElements: Requireable[Boolean] = js.native
  var src: Validator[String] = js.native
  var wrapper: Requireable[String] = js.native
}

object BeforeInjection {
  @scala.inline
  def apply(
    afterInjection: Requireable[js.Function1[/* repeated */ _, _]],
    beforeInjection: Requireable[js.Function1[/* repeated */ _, _]],
    evalScripts: Requireable[String],
    fallback: Requireable[String | js.Object],
    loading: Requireable[String | js.Object],
    renumerateIRIElements: Requireable[Boolean],
    src: Validator[String],
    wrapper: Requireable[String]
  ): BeforeInjection = {
    val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeInjection]
  }
  @scala.inline
  implicit class BeforeInjectionOps[Self <: BeforeInjection] (val x: Self) extends AnyVal {
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
    def setAfterInjection(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("afterInjection", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeInjection(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("beforeInjection", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvalScripts(value: Requireable[String]): Self = this.set("evalScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallback(value: Requireable[String | js.Object]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Requireable[String | js.Object]): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenumerateIRIElements(value: Requireable[Boolean]): Self = this.set("renumerateIRIElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: Validator[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: Requireable[String]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

