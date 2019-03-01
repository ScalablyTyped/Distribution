package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemModule extends js.Object {
  var args: js.Array[java.lang.String]
  var env: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var os: Anon_Architecture
  var pid: scala.Double
  var platform: java.lang.String
  var standarderr: Std
  var standardin: Std
  var standardout: Std
  var stderr: Std
  var stdin: Std
  var stdout: Std
}

object SystemModule {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    os: Anon_Architecture,
    pid: scala.Double,
    platform: java.lang.String,
    standarderr: Std,
    standardin: Std,
    standardout: Std,
    stderr: Std,
    stdin: Std,
    stdout: Std
  ): SystemModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("env")(env)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("standarderr")(standarderr)
    __obj.updateDynamic("standardin")(standardin)
    __obj.updateDynamic("standardout")(standardout)
    __obj.updateDynamic("stderr")(stderr)
    __obj.updateDynamic("stdin")(stdin)
    __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[SystemModule]
  }
}

