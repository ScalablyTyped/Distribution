package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer extends StObject {
  
  def complete(res: CompletedResult): Unit = js.native
  
  def error(err: String): Unit = js.native
  def error(err: Error): Unit = js.native
  
  def next(res: Next): Unit = js.native
}
