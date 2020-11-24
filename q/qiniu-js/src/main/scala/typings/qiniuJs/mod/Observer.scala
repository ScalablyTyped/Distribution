package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer extends js.Object {
  
  def complete(res: CompletedResult): Unit = js.native
  
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
  
  def next(res: Next): Unit = js.native
}
