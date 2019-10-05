package typings.readDashConfigDashFile.readDashConfigDashFileMod

import typings.dotenv.dotenvMod.DotenvParseOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", "loadEnv")
@js.native
object loadEnv extends js.Object {
  def apply(envFile: String): js.Promise[DotenvParseOutput | Null] = js.native
}

