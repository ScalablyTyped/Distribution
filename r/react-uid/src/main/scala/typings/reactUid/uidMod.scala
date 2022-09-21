package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidMod {
  
  @JSImport("react-uid/dist/es5/uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateUID(): js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUID")().asInstanceOf[js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String]]
  
  inline def uid(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def uid(item: Any, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
