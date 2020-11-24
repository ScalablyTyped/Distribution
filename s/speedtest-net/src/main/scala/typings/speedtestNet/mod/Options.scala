package typings.speedtestNet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Set to `true` to accept the Ookla GDPR terms. This must be done
    * (at least) once on the system. If you have not accepted the Ookla
    * GDPR terms you can read their disclaimer by running the speedtest-net
    * CLI without the --accept-license option.
    */
  var acceptGdpr: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` to accept the Ookla EULA, TOS and Privacy policy. This
    * must be done (at least) once on the system. If you have not accepted
    * the Ookla license terms, you can view the links to their agreements
    * by running the speedtest-net CLI without the --accept-license option.
    */
  var acceptLicense: js.UndefOr[Boolean] = js.native
  
  /** Binary executable path of the Ookla speedtest CLI */
  var binary: js.UndefOr[String] = js.native
  
  /** Default '1.0.0' Binary executable version */
  var binaryVersion: js.UndefOr[String] = js.native
  
  /**
    * A cancellation function created with `speedTest.makeCancel()` to
    * cancel the test.
    */
  var cancel: js.UndefOr[CancelFunction] = js.native
  
  /** Server host to connect to */
  var host: js.UndefOr[String] = js.native
  
  /** Function to handle progress events */
  var progress: js.UndefOr[ProgressFunction] = js.native
  
  /** ID of the server to restrict the tests against. */
  var serverId: js.UndefOr[String] = js.native
  
  /** IP of the network interface to bind */
  var sourceIp: js.UndefOr[String] = js.native
  
  /** Log level for `{ type: log }` progress events */
  var verbosity: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAcceptGdpr(value: Boolean): Self = this.set("acceptGdpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptGdpr: Self = this.set("acceptGdpr", js.undefined)
    
    @scala.inline
    def setAcceptLicense(value: Boolean): Self = this.set("acceptLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLicense: Self = this.set("acceptLicense", js.undefined)
    
    @scala.inline
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setBinaryVersion(value: String): Self = this.set("binaryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryVersion: Self = this.set("binaryVersion", js.undefined)
    
    @scala.inline
    def setCancel(
      value: (/* setCancelHandler */ js.UndefOr[js.Symbol], /* newHandler */ js.UndefOr[js.Function0[Unit]]) => Boolean | Unit
    ): Self = this.set("cancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setProgress(value: /* event */ js.UndefOr[SpeedTestEvent] => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    
    @scala.inline
    def setSourceIp(value: String): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIp: Self = this.set("sourceIp", js.undefined)
    
    @scala.inline
    def setVerbosity(value: Double): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
  }
}
