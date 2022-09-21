package typings.reactPose

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickAssignMod {
  
  @JSImport("react-pose/lib/utils/pick-assign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pickAssign(shouldPick: TestString, sources: js.Array[Props]): Props = (^.asInstanceOf[js.Dynamic].applyDynamic("pickAssign")(shouldPick.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[Props]
  
  type Props = StringDictionary[Any]
  
  type TestString = js.Function1[/* key */ String, Boolean]
}
