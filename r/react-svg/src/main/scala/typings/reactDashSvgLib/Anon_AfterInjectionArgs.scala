package typings
package reactDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterInjectionArgs extends js.Object {
  var afterInjection: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var beforeInjection: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var evalScripts: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var fallback: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object]
  var loading: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object]
  var renumerateIRIElements: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var src: propDashTypesLib.propDashTypesMod.Validator[java.lang.String]
  var wrapper: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
}

object Anon_AfterInjectionArgs {
  @scala.inline
  def apply(
    afterInjection: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    beforeInjection: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    evalScripts: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    fallback: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object],
    loading: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | js.Object],
    renumerateIRIElements: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    src: propDashTypesLib.propDashTypesMod.Validator[java.lang.String],
    wrapper: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  ): Anon_AfterInjectionArgs = {
    val __obj = js.Dynamic.literal(afterInjection = afterInjection, beforeInjection = beforeInjection, evalScripts = evalScripts, fallback = fallback, loading = loading, renumerateIRIElements = renumerateIRIElements, src = src, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_AfterInjectionArgs]
  }
}

