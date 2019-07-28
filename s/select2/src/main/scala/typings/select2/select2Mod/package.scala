package typings.select2

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryAjaxSettings
import typings.select2.select2Numbers.`false`
import typings.select2.select2Strings.url
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object select2Mod {
  type JQueryAjaxSettingsBase = Pick[JQueryAjaxSettings, Sub[String, url]]
  type JQueryEventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, Unit | `false`]
  type PlainObject[T] = StringDictionary[T]
  type Sub[O /* <: String */, D /* <: String */] = /* import warning: ImportType.apply Failed type conversion: {[ K in O ]: std.Record<D, never> & std.Record<string, K>[K]}[O] */ js.Any
}
