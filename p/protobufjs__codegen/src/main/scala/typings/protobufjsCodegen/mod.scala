package typings.protobufjsCodegen

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  inline def apply(): Codegen = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Codegen]
  inline def apply(functionName: String): Codegen = ^.asInstanceOf[js.Dynamic].apply(functionName.asInstanceOf[js.Any]).asInstanceOf[Codegen]
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  inline def apply(functionParams: js.Array[String]): Codegen = ^.asInstanceOf[js.Dynamic].apply(functionParams.asInstanceOf[js.Any]).asInstanceOf[Codegen]
  inline def apply(functionParams: js.Array[String], functionName: String): Codegen = (^.asInstanceOf[js.Dynamic].apply(functionParams.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Codegen]
  
  @JSImport("@protobufjs/codegen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
  @JSImport("@protobufjs/codegen", "verbose")
  @js.native
  def verbose: Boolean = js.native
  inline def verbose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
  
  /**
    * Appends code to the function's body.
    * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
    * @param [formatParams] Format parameters
    * @returns Itself or the generated function if finished
    * @throws {Error} If format parameter counts do not match
    */
  @js.native
  trait Codegen extends StObject {
    
    def apply(formatStringOrScope: String, formatParams: js.Any*): Codegen | js.Function = js.native
    def apply(formatStringOrScope: StringDictionary[js.Any], formatParams: js.Any*): Codegen | js.Function = js.native
    def apply(formatStringOrScope: Unit, formatParams: js.Any*): Codegen | js.Function = js.native
  }
}
