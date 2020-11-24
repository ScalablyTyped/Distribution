package typings.reactNativeWindowsCli.runWindowsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunWindowsOptions_ extends js.Object {
  
  var arch: BuildArch = js.native
  
  var autolink: Boolean = js.native
  
  var build: Boolean = js.native
  
  var buildLogDirectory: js.UndefOr[String] = js.native
  
  var bundle: Boolean = js.native
  
  var deploy: Boolean = js.native
  
  var device: js.UndefOr[Boolean] = js.native
  
  var directDebugging: js.UndefOr[Double] = js.native
  
  var emulator: js.UndefOr[Boolean] = js.native
  
  var info: Boolean = js.native
  
  var launch: Boolean = js.native
  
  var logging: Boolean = js.native
  
  var msbuildprops: js.UndefOr[String] = js.native
  
  var packager: Boolean = js.native
  
  var proj: js.UndefOr[String] = js.native
  
  var release: js.UndefOr[Boolean] = js.native
  
  var remoteDebugging: js.UndefOr[String] = js.native
  
  var root: String = js.native
  
  var sln: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var telemetry: js.UndefOr[Boolean] = js.native
}
object RunWindowsOptions_ {
  
  @scala.inline
  def apply(
    arch: BuildArch,
    autolink: Boolean,
    build: Boolean,
    bundle: Boolean,
    deploy: Boolean,
    info: Boolean,
    launch: Boolean,
    logging: Boolean,
    packager: Boolean,
    root: String
  ): RunWindowsOptions_ = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], autolink = autolink.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], deploy = deploy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], launch = launch.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunWindowsOptions_]
  }
  
  @scala.inline
  implicit class RunWindowsOptions_Ops[Self <: RunWindowsOptions_] (val x: Self) extends AnyVal {
    
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
    def setArch(value: BuildArch): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutolink(value: Boolean): Self = this.set("autolink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: Boolean): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundle(value: Boolean): Self = this.set("bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploy(value: Boolean): Self = this.set("deploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch(value: Boolean): Self = this.set("launch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackager(value: Boolean): Self = this.set("packager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildLogDirectory(value: String): Self = this.set("buildLogDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildLogDirectory: Self = this.set("buildLogDirectory", js.undefined)
    
    @scala.inline
    def setDevice(value: Boolean): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setDirectDebugging(value: Double): Self = this.set("directDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectDebugging: Self = this.set("directDebugging", js.undefined)
    
    @scala.inline
    def setEmulator(value: Boolean): Self = this.set("emulator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulator: Self = this.set("emulator", js.undefined)
    
    @scala.inline
    def setMsbuildprops(value: String): Self = this.set("msbuildprops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsbuildprops: Self = this.set("msbuildprops", js.undefined)
    
    @scala.inline
    def setProj(value: String): Self = this.set("proj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProj: Self = this.set("proj", js.undefined)
    
    @scala.inline
    def setRelease(value: Boolean): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setRemoteDebugging(value: String): Self = this.set("remoteDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteDebugging: Self = this.set("remoteDebugging", js.undefined)
    
    @scala.inline
    def setSln(value: String): Self = this.set("sln", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSln: Self = this.set("sln", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
  }
}
