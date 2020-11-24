package typings.seleniumWebdriver.remoteMod.SeleniumServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Selenium server
  */
@js.native
trait Options extends js.Object {
  
  /** The arguments to pass to the service. If a promise is provided, the
    service will wait for it to resolve before starting. */
  var args: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.native
  
  /** The environment variables that should be visible to the server process.
    Defaults to inheriting the current process's environment.*/
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  /** The arguments to pass to the JVM. If a promise is provided, the service
    will wait for it to resolve before starting. */
  var jvmArgs: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.native
  
  /** Whether the server should only be accessed on this host's loopback address.*/
  var loopback: js.UndefOr[Boolean] = js.native
  
  /** The port to start the server on (must be > 0). If the port is provided
    as a promise, the service will wait for the promise to resolve before starting. */
  var port: js.UndefOr[Double | js.Promise[Double]] = js.native
  
  /** IO configuration for the spawned server process. For more information,
    refer to the documentation of `child_process.spawn`*/
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.native
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setJvmArgsVarargs(value: String*): Self = this.set("jvmArgs", js.Array(value :_*))
    
    @scala.inline
    def setJvmArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = this.set("jvmArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJvmArgs: Self = this.set("jvmArgs", js.undefined)
    
    @scala.inline
    def setLoopback(value: Boolean): Self = this.set("loopback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoopback: Self = this.set("loopback", js.undefined)
    
    @scala.inline
    def setPort(value: Double | js.Promise[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (String | Double)*): Self = this.set("stdio", js.Array(value :_*))
    
    @scala.inline
    def setStdio(value: String | (js.Array[String | Double])): Self = this.set("stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
}
