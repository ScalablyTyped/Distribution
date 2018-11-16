package typings
package redisDashScriptoLib.redisDashScriptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-scripto", JSImport.Namespace)
@js.native
class namespaced protected () extends Scripto {
  def this(redisClient: redisLib.redisMod.RedisClient) = this()
  /* CompleteClass */
  override def eval(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def evalSha(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def load(scripts: redisDashScriptoLib.redisDashScriptoMod.ScriptoNs.Scripts): scala.Unit = js.native
  /* CompleteClass */
  override def loadFromDir(scriptsDir: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def loadFromFile(name: java.lang.String, filepath: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def run(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

