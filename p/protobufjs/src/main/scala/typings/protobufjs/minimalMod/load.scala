package typings.protobufjs.minimalMod

import typings.protobufjs.mod.LoadCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "load")
@js.native
object load extends js.Object {
  
  def apply(filename: String): js.Promise[typings.protobufjs.mod.Root] = js.native
  def apply(filename: String, callback: LoadCallback): Unit = js.native
  def apply(filename: String, root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = js.native
  def apply(filename: String, root: typings.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String]): js.Promise[typings.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], callback: LoadCallback): Unit = js.native
  def apply(filename: js.Array[String], root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = js.native
  def apply(filename: js.Array[String], root: typings.protobufjs.mod.Root, callback: LoadCallback): Unit = js.native
}
