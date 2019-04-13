package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorFunction
  extends /**
  * Creates a new Generator object.
  * @param args A list of arguments the function accepts.
  */
org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Generator] {
  /**
    * The length of the arguments.
    */
  val length: scala.Double = js.native
  /**
    * Returns the name of the function.
    */
  val name: java.lang.String = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  /**
    * Creates a new Generator object.
    * @param args A list of arguments the function accepts.
    */
  def apply(args: js.Any*): Generator = js.native
}

