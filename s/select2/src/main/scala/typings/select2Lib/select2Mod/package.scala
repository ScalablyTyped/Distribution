package typings
package select2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object select2Mod {
  type JQueryAjaxSettingsBase = stdLib.Pick[
    jqueryLib.JQueryAjaxSettings, 
    Sub[java.lang.String, select2Lib.select2LibStrings.url]
  ]
  type JQueryEventHandlerBase[TContext, T] = js.ThisFunction2[
    /* this */ TContext, 
    /* t */ T, 
    /* repeated */ js.Any, 
    scala.Unit | select2Lib.select2LibNumbers.`false`
  ]
  type Sub[O /* <: java.lang.String */, D /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: {typemapped}[O] */ js.Any
}
