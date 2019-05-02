package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileOptionsWithBufferEncoding extends ExecFileOptions {
  var encoding: java.lang.String
}

object ExecFileOptionsWithBufferEncoding {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    cwd: java.lang.String = null,
    env: js.Any = null,
    gid: scala.Int | scala.Double = null,
    killSignal: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
  }
}

