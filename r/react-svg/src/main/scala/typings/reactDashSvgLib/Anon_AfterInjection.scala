package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterInjection extends js.Object {
  var evalScripts: java.lang.String
  var fallback: scala.Null
  var loading: scala.Null
  var renumerateIRIElements: scala.Boolean
  var wrapper: java.lang.String
  def afterInjection(): js.UndefOr[scala.Nothing]
  def beforeInjection(): js.UndefOr[scala.Nothing]
}

object Anon_AfterInjection {
  @scala.inline
  def apply(
    afterInjection: () => js.UndefOr[scala.Nothing],
    beforeInjection: () => js.UndefOr[scala.Nothing],
    evalScripts: java.lang.String,
    fallback: scala.Null,
    loading: scala.Null,
    renumerateIRIElements: scala.Boolean,
    wrapper: java.lang.String
  ): Anon_AfterInjection = {
    val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts, fallback = fallback, loading = loading, renumerateIRIElements = renumerateIRIElements, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_AfterInjection]
  }
}

