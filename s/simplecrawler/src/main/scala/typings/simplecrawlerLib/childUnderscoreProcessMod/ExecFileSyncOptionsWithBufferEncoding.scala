package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileSyncOptionsWithBufferEncoding extends ExecFileSyncOptions {
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithBufferEncoding: java.lang.String
}

object ExecFileSyncOptionsWithBufferEncoding {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    cwd: java.lang.String = null,
    env: js.Any = null,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | simplecrawlerLib.Buffer = null,
    killSignal: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    stdio: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): ExecFileSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptionsWithBufferEncoding]
  }
}

