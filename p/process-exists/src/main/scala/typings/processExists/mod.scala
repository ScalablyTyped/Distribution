package typings.processExists

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("process-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterExistingProcesses[T /* <: js.Array[Double | String] */](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("filterExistingProcesses")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def processExists(input: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("processExists")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def processExists(input: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("processExists")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def processExistsMultiple[T /* <: Double | String */](input: js.Array[T]): js.Promise[Map[T, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("processExistsMultiple")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[T, Boolean]]]
}
