package typings.safeDashJsonDashStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object safeDashJsonDashStringifyMod {
  // see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter
  type ReplacerFn = js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]
}
