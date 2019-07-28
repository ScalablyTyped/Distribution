package typings.season.seasonMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("season", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isObjectPath(objectPath: String): Boolean = js.native
  def readFile(objectPath: String, callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]): Unit = js.native
  def readFile(
    objectPath: String,
    options: ParseOptions,
    callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]
  ): Unit = js.native
  def readFileSync(objectPath: String): js.Any = js.native
  def readFileSync(objectPath: String, options: ParseOptions): js.Any = js.native
  def resolve(objectPath: String): String | Null = js.native
  def setCacheDir(cacheDirectory: String): Unit = js.native
  def stringify(`object`: js.Any): String = js.native
  def writeFile(objectPath: String, `object`: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def writeFileSync(objectPath: String, `object`: js.Any): Unit = js.native
}

