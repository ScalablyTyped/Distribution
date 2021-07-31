package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidMod {
  
  @JSImport("react-uid/dist/es5/uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUID")().asInstanceOf[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]]
  
  @scala.inline
  def uid(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def uid(item: js.Any, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
