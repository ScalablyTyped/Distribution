package typings.atProtobufjsCodegen

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atProtobufjsCodegenMod {
  /**
    * Appends code to the function's body.
    * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
    * @param [formatParams] Format parameters
    * @returns Itself or the generated function if finished
    * @throws {Error} If format parameter counts do not match
    */
  type Codegen = js.Function2[
    /* formatStringOrScope */ js.UndefOr[String | StringDictionary[js.Any]], 
    /* repeated */ js.Any, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @protobufjs/codegen.@protobufjs/codegen.Codegen */ js.Object) | js.Function
  ]
}
