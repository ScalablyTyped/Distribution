package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheck extends js.Object {
  
  /**
    * A string array representing the command that the container runs to determine if it is
    * healthy. The string array must start with CMD to execute the command arguments directly, or
    * CMD-SHELL to run the command with the container's default shell. For example:
    *
    * [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]
    *
    * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
    * information, see HealthCheck in the Create a container section of the Docker Remote API.
    */
  var command: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The time period in seconds between each health check execution. You may specify between 5 and
    * 300 seconds. The default value is 30 seconds.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * The number of times to retry a failed health check before the container is considered
    * unhealthy. You may specify between 1 and 10 retries. The default value is 3.
    */
  var retries: js.UndefOr[Double] = js.native
  
  /**
    * The optional grace period within which to provide containers time to bootstrap before failed
    * health checks count towards the maximum number of retries. You may specify between 0 and 300
    * seconds. The startPeriod is disabled by default.
    *
    * Note:
    * If a health check succeeds within the startPeriod, then the container is considered healthy
    * and any subsequent failures count toward the maximum number of retries.
    */
  var startPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The time period in seconds to wait for a health check to succeed before it is considered a
    * failure. You may specify between 2 and 60 seconds. The default value is 5.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object HealthCheck {
  
  @scala.inline
  def apply(): HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheck]
  }
  
  @scala.inline
  implicit class HealthCheckOps[Self <: HealthCheck] (val x: Self) extends AnyVal {
    
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
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setStartPeriod(value: Double): Self = this.set("startPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPeriod: Self = this.set("startPeriod", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
