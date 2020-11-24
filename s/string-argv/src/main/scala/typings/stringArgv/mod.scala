package typings.stringArgv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string-argv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(value: String): js.Array[String] = js.native
  def default(value: String, env: js.UndefOr[scala.Nothing], file: String): js.Array[String] = js.native
  def default(value: String, env: String): js.Array[String] = js.native
  def default(value: String, env: String, file: String): js.Array[String] = js.native
  
  def parseArgsStringToArgv(value: String): js.Array[String] = js.native
  def parseArgsStringToArgv(value: String, env: js.UndefOr[scala.Nothing], file: String): js.Array[String] = js.native
  def parseArgsStringToArgv(value: String, env: String): js.Array[String] = js.native
  def parseArgsStringToArgv(value: String, env: String, file: String): js.Array[String] = js.native
}
