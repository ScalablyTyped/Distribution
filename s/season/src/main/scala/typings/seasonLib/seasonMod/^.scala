package typings
package seasonLib.seasonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("season", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isObjectPath(objectPath: java.lang.String): scala.Boolean = js.native
  def readFile(
    objectPath: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    objectPath: java.lang.String,
    options: seasonLib.seasonMod.ParseOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* object */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def readFileSync(objectPath: java.lang.String): js.Any = js.native
  def readFileSync(objectPath: java.lang.String, options: seasonLib.seasonMod.ParseOptions): js.Any = js.native
  def resolve(objectPath: java.lang.String): java.lang.String | scala.Null = js.native
  def setCacheDir(cacheDirectory: java.lang.String): scala.Unit = js.native
  def stringify(`object`: js.Any): java.lang.String = js.native
  def writeFile(
    objectPath: java.lang.String,
    `object`: js.Any,
    callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def writeFileSync(objectPath: java.lang.String, `object`: js.Any): scala.Unit = js.native
}

