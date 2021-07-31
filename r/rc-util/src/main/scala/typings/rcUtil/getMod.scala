package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("rc-util/lib/utils/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](entity: js.Any, path: js.Array[String | Double]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
