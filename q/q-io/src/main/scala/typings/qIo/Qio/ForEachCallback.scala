package typings.qIo.Qio

import typings.node.Buffer
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForEachCallback extends js.Object {
  
  def apply(chunk: String): Promise[_] = js.native
  def apply(chunk: Buffer): Promise[_] = js.native
}
