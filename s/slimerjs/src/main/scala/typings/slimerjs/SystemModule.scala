package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemModule extends js.Object {
  var args: js.Array[String]
  var env: StringDictionary[String]
  var os: Anon_Architecture
  var pid: Double
  var platform: String
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
    args: js.Array[String],
    env: StringDictionary[String],
    os: Anon_Architecture,
    pid: Double,
    platform: String,
    standarderr: Std,
    standardin: Std,
    standardout: Std,
    stderr: Std,
    stdin: Std,
    stdout: Std
  ): SystemModule = {
    val __obj = js.Dynamic.literal(args = args, env = env, os = os, pid = pid, platform = platform, standarderr = standarderr, standardin = standardin, standardout = standardout, stderr = stderr, stdin = stdin, stdout = stdout)
  
    __obj.asInstanceOf[SystemModule]
  }
}

