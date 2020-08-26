package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.slimerjs.anon.Architecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemModule extends js.Object {
  var args: js.Array[String] = js.native
  var env: StringDictionary[String] = js.native
  var os: Architecture = js.native
  var pid: Double = js.native
  var platform: String = js.native
  var standarderr: Std = js.native
  var standardin: Std = js.native
  var standardout: Std = js.native
  var stderr: Std = js.native
  var stdin: Std = js.native
  var stdout: Std = js.native
}

object SystemModule {
  @scala.inline
  def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: Architecture,
    pid: Double,
    platform: String,
    standarderr: Std,
    standardin: Std,
    standardout: Std,
    stderr: Std,
    stdin: Std,
    stdout: Std
  ): SystemModule = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], standarderr = standarderr.asInstanceOf[js.Any], standardin = standardin.asInstanceOf[js.Any], standardout = standardout.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemModule]
  }
  @scala.inline
  implicit class SystemModuleOps[Self <: SystemModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: Architecture): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandarderr(value: Std): Self = this.set("standarderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardin(value: Std): Self = this.set("standardin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardout(value: Std): Self = this.set("standardout", value.asInstanceOf[js.Any])
    @scala.inline
    def setStderr(value: Std): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdin(value: Std): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: Std): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

