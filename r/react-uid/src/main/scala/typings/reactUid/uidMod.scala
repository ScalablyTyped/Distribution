package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidMod {
  
  @JSImport("react-uid/dist/es5/uid", "generateUID")
  @js.native
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = js.native
  
  @JSImport("react-uid/dist/es5/uid", "uid")
  @js.native
  def uid(item: js.Any): String = js.native
  @JSImport("react-uid/dist/es5/uid", "uid")
  @js.native
  def uid(item: js.Any, index: Double): String = js.native
}
