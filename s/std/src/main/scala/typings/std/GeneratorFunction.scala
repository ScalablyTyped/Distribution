package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorFunction
  extends StObject
     with /**
  * Creates a new Generator object.
  * @param args A list of arguments the function accepts.
  */
/* standard es2015.generator */
Instantiable1[/* args (repeated) */ Any, Generator[Any, Any, Any]] {
  
  /**
    * Creates a new Generator object.
    * @param args A list of arguments the function accepts.
    */
  /* standard es2015.generator */
  def apply(args: Any*): Generator[Any, Any, Any] = js.native
  
  /**
    * The length of the arguments.
    */
  /* standard es2015.generator */
  val length: Double = js.native
  
  /**
    * Returns the name of the function.
    */
  /* standard es2015.generator */
  val name: java.lang.String = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
