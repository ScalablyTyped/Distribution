package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatArray[T]
  extends StObject
     with /* standard es5 */
/* n */ NumberDictionary[T] {
  
  /* standard es5 */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  
  /* standard es5 */
  val length: Double = js.native
  
  /* standard es5 */
  def slice(): js.Array[T] = js.native
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
  def slice(start: Unit, end: Double): js.Array[T] = js.native
}
