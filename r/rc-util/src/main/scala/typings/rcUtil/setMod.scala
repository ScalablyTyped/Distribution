package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("rc-util/lib/utils/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Entity, Output, Value](entity: Entity, paths: js.Array[String | Double], value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
}
