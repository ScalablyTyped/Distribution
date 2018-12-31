package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atProtobufjsCodegenLib {
  /**
    * Appends code to the function's body.
    * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
    * @param [formatParams] Format parameters
    * @returns Itself or the generated function if finished
    * @throws {Error} If format parameter counts do not match
    */
  type Codegen = js.Function2[
    /* formatStringOrScope */ js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* repeated */ js.Any, 
    js.Object | js.Function
  ]
}
