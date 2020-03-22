package typings.reactSvg

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeforeInjection extends js.Object {
  var afterInjection: Requireable[js.Function1[/* repeated */ _, _]]
  var beforeInjection: Requireable[js.Function1[/* repeated */ _, _]]
  var evalScripts: Requireable[String]
  var fallback: Requireable[String | js.Object]
  var loading: Requireable[String | js.Object]
  var renumerateIRIElements: Requireable[Boolean]
  var src: Validator[String]
  var wrapper: Requireable[String]
}

object AnonBeforeInjection {
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
  ): AnonBeforeInjection = {
    val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBeforeInjection]
  }
}

