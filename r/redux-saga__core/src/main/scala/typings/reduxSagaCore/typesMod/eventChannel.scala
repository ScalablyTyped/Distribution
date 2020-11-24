package typings.reduxSagaCore.typesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@redux-saga/core/types", "eventChannel")
@js.native
object eventChannel extends js.Object {
  
  def apply[T](subscribe: Subscribe[T]): EventChannel_[T] = js.native
  def apply[T](subscribe: Subscribe[T], buffer: Buffer): EventChannel_[T] = js.native
}
