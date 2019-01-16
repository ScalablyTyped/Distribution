package typings
package readDashConfigDashFileLib.readDashConfigDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def findAndReadConfig[T](request: readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigRequest): js.Promise[
    readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigResult[T] | scala.Null
  ] = js.native
  def getConfig[T](request: readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigRequest): js.Promise[
    readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigResult[T] | scala.Null
  ] = js.native
  def getConfig[T](
    request: readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigRequest,
    configPath: java.lang.String
  ): js.Promise[
    readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigResult[T] | scala.Null
  ] = js.native
  def loadConfig[T](request: readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigRequest): js.Promise[
    readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigResult[T] | scala.Null
  ] = js.native
  def loadEnv(envFile: java.lang.String): js.Promise[dotenvLib.dotenvMod.DotenvParseOutput | scala.Null] = js.native
  def loadParentConfig[T](
    request: readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigRequest,
    spec: java.lang.String
  ): js.Promise[readDashConfigDashFileLib.readDashConfigDashFileMod.ReadConfigResult[T]] = js.native
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | scala.Null] = js.native
  def validateConfig(
    config: js.Any,
    scheme: lazyDashValLib.lazyDashValMod.Lazy[_],
    errorMessage: js.Function2[
      /* error */ java.lang.String, 
      /* errors */ js.Array[ajvLib.ajvMod.ajvNs.ErrorObject], 
      java.lang.String
    ]
  ): js.Promise[scala.Unit] = js.native
}

