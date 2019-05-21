package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var evalScripts: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var fallback: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object]
  var loading: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object]
  var onInjected: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var renumerateIRIElements: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var src: propDashTypesLib.propDashTypesMod.Validator[java.lang.String]
  var svgClassName: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var svgStyle: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var wrapper: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_Args {
  @scala.inline
  def apply(
    evalScripts: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    fallback: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object],
    loading: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object],
    onInjected: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    renumerateIRIElements: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    src: propDashTypesLib.propDashTypesMod.Validator[java.lang.String],
    svgClassName: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    svgStyle: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    wrapper: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(evalScripts = evalScripts, fallback = fallback, loading = loading, onInjected = onInjected, renumerateIRIElements = renumerateIRIElements, src = src, svgClassName = svgClassName, svgStyle = svgStyle, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

