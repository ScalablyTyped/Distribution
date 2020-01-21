package typings.redisScripto.mod

import typings.redis.mod.RedisClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-scripto", JSImport.Namespace)
@js.native
class ^ protected () extends Scripto {
  def this(redisClient: RedisClient) = this()
  /* CompleteClass */
  override def eval(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def evalSha(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def load(scripts: Scripts): Unit = js.native
  /* CompleteClass */
  override def loadFromDir(scriptsDir: String): Unit = js.native
  /* CompleteClass */
  override def loadFromFile(name: String, filepath: String): Unit = js.native
  /* CompleteClass */
  override def run(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}

