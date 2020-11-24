package typings.readConfigFile.mod

import typings.dotenv.mod.DotenvParseOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-config-file", "loadEnv")
@js.native
object loadEnv extends js.Object {
  
  def apply(envFile: String): js.Promise[DotenvParseOutput | Null] = js.native
}
