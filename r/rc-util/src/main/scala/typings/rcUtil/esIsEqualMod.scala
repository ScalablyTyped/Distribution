package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIsEqualMod {
  
  @JSImport("rc-util/es/isEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(obj1: Any, obj2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(obj1: Any, obj2: Any, shallow: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
