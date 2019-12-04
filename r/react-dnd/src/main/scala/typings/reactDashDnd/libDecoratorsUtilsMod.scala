package typings.reactDashDnd

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/utils", JSImport.Namespace)
@js.native
object libDecoratorsUtilsMod extends js.Object {
  def checkDecoratorArguments(functionName: String, signature: String, args: js.Any*): Unit = js.native
  def getDecoratedComponent(instanceRef: RefObject[_]): js.Any = js.native
  def isClassComponent(Component: js.Any): Boolean = js.native
  def isRefForwardingComponent(C: js.Any): Boolean = js.native
  def isRefable(C: js.Any): Boolean = js.native
}

