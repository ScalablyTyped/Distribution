package typings.reactNavigationCore.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions[ScreenOptions /* <: js.Object */] extends StObject {
  
  def getParent[T_1](): T_1 = js.native
  def getParent[T_1](id: String): T_1 = js.native
  
  def setOptions(options: Partial[ScreenOptions]): Unit = js.native
  
  def setParams(params: Partial[js.UndefOr[js.Object]]): Unit = js.native
}
