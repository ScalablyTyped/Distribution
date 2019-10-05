package typings.atProtobufjsCodegen

import org.scalablytyped.runtime.StringDictionary
import typings.atProtobufjsCodegen.atProtobufjsCodegenMod.Codegen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/codegen", JSImport.Namespace)
@js.native
object atProtobufjsCodegenMod extends js.Object {
  /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
  var verbose: Boolean = js.native
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(): Codegen = js.native
  def apply(functionName: String): Codegen = js.native
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(functionParams: js.Array[String]): Codegen = js.native
  def apply(functionParams: js.Array[String], functionName: String): Codegen = js.native
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

