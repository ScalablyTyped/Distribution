package typings.stringEnvInterpolation

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-env-interpolation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def env(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("env")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def env(content: String, variables: Dict[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("env")(content.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Dict[T] = StringDictionary[js.UndefOr[T]]
}
