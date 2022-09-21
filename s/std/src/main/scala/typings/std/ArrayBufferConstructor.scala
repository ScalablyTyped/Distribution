package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBufferConstructor
  extends StObject
     with /* standard es5 */
Instantiable1[/* byteLength */ Double, js.typedarray.ArrayBuffer] {
  
  /* standard es5 */
  def isView(arg: Any): /* is std.ArrayBufferView */ scala.Boolean = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.species)
  val species: ArrayBufferConstructor = js.native
}
