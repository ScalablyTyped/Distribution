package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvalScripts extends js.Object {
  var evalScripts: java.lang.String
  var fallback: scala.Null
  var loading: scala.Null
  var renumerateIRIElements: scala.Boolean
  var svgClassName: scala.Null
  var wrapper: java.lang.String
  def onInjected(): js.UndefOr[scala.Nothing]
}

object Anon_EvalScripts {
  @scala.inline
  def apply(
    evalScripts: java.lang.String,
    fallback: scala.Null,
    loading: scala.Null,
    onInjected: js.Function0[js.UndefOr[scala.Nothing]],
    renumerateIRIElements: scala.Boolean,
    svgClassName: scala.Null,
    wrapper: java.lang.String
  ): Anon_EvalScripts = {
    val __obj = js.Dynamic.literal(evalScripts = evalScripts, fallback = fallback, loading = loading, onInjected = onInjected, renumerateIRIElements = renumerateIRIElements, svgClassName = svgClassName, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_EvalScripts]
  }
}

