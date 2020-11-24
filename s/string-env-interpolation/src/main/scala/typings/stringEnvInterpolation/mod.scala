package typings.stringEnvInterpolation

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string-env-interpolation", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def env(content: String): String = js.native
  def env(content: String, variables: Dict[String]): String = js.native
  
  type Dict[T] = StringDictionary[js.UndefOr[T]]
}
