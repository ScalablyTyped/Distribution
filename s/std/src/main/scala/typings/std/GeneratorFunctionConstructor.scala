package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorFunctionConstructor
  extends /**
  * Creates a new Generator function.
  * @param args A list of arguments the function accepts.
  */
Instantiable1[/* args (repeated) */ java.lang.String, GeneratorFunction] {
  /**
    * The length of the arguments.
    */
  val length: Double = js.native
  /**
    * Returns the name of the function.
    */
  val name: java.lang.String = js.native
  /**
    * Creates a new Generator function.
    * @param args A list of arguments the function accepts.
    */
  def apply(args: java.lang.String*): GeneratorFunction = js.native
}

