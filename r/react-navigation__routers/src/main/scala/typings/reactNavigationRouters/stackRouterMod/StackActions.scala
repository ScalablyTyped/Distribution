package typings.reactNavigationRouters.stackRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers/lib/typescript/src/StackRouter", "StackActions")
@js.native
object StackActions extends js.Object {
  
  def pop(): StackActionType = js.native
  def pop(count: Double): StackActionType = js.native
  
  def popToTop(): StackActionType = js.native
  
  def push(name: String): StackActionType = js.native
  def push(name: String, params: js.Object): StackActionType = js.native
  
  def replace(name: String): StackActionType = js.native
  def replace(name: String, params: js.Object): StackActionType = js.native
}
