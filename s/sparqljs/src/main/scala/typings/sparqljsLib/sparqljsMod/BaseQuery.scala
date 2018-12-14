package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseQuery extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: sparqljsLib.sparqljsLibStrings.query
  var values: js.UndefOr[js.Array[ValuePatternRow]] = js.undefined
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

