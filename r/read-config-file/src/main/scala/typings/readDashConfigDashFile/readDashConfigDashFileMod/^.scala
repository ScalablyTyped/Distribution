package typings.readDashConfigDashFile.readDashConfigDashFileMod

import typings.dotenv.dotenvMod.DotenvParseOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def findAndReadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  def getConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  def getConfig[T](request: ReadConfigRequest, configPath: String): js.Promise[ReadConfigResult[T] | Null] = js.native
  def loadConfig[T](request: ReadConfigRequest): js.Promise[ReadConfigResult[T] | Null] = js.native
  def loadEnv(envFile: String): js.Promise[DotenvParseOutput | Null] = js.native
  def loadParentConfig[T](request: ReadConfigRequest, spec: String): js.Promise[ReadConfigResult[T]] = js.native
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = js.native
}

