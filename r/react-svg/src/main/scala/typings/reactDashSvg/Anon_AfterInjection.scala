package typings.reactDashSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterInjection extends js.Object {
  var evalScripts: String
  var fallback: Null
  var loading: Null
  var renumerateIRIElements: Boolean
  var wrapper: String
  def afterInjection(): js.UndefOr[scala.Nothing]
  def beforeInjection(): js.UndefOr[scala.Nothing]
}

object Anon_AfterInjection {
  @scala.inline
  def apply(
    afterInjection: () => js.UndefOr[scala.Nothing],
    beforeInjection: () => js.UndefOr[scala.Nothing],
    evalScripts: String,
    fallback: Null,
    loading: Null,
    renumerateIRIElements: Boolean,
    wrapper: String
  ): Anon_AfterInjection = {
    val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AfterInjection]
  }
}

