package typings.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOpts extends js.Object {
  
  var basePath: js.UndefOr[String] = js.native
  
  var cb: js.UndefOr[js.Function2[/* error */ Error, /* child */ ChildProcess, Unit]] = js.native
  
  var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.native
  
  var javaArgs: js.UndefOr[js.Array[String]] = js.native
  
  var javaPath: js.UndefOr[String] = js.native
  
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
  
  var seleniumArgs: js.UndefOr[js.Array[String]] = js.native
  
  var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.native
  
  var spawnOptions: js.UndefOr[SpawnOptions] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object StartOpts {
  
  @scala.inline
  def apply(): StartOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOpts]
  }
  
  @scala.inline
  implicit class StartOptsOps[Self <: StartOpts] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setCb(value: (/* error */ Error, /* child */ ChildProcess) => Unit): Self = this.set("cb", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
    
    @scala.inline
    def setDrivers(value: StringDictionary[DriverOptions]): Self = this.set("drivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrivers: Self = this.set("drivers", js.undefined)
    
    @scala.inline
    def setJavaArgsVarargs(value: String*): Self = this.set("javaArgs", js.Array(value :_*))
    
    @scala.inline
    def setJavaArgs(value: js.Array[String]): Self = this.set("javaArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavaArgs: Self = this.set("javaArgs", js.undefined)
    
    @scala.inline
    def setJavaPath(value: String): Self = this.set("javaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavaPath: Self = this.set("javaPath", js.undefined)
    
    @scala.inline
    def setRequestOpts(value: RequestOptions | String | URL_): Self = this.set("requestOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOpts: Self = this.set("requestOpts", js.undefined)
    
    @scala.inline
    def setSeleniumArgsVarargs(value: String*): Self = this.set("seleniumArgs", js.Array(value :_*))
    
    @scala.inline
    def setSeleniumArgs(value: js.Array[String]): Self = this.set("seleniumArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeleniumArgs: Self = this.set("seleniumArgs", js.undefined)
    
    @scala.inline
    def setSpawnCb(value: /* selenium */ js.UndefOr[ChildProcess] => Unit): Self = this.set("spawnCb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSpawnCb: Self = this.set("spawnCb", js.undefined)
    
    @scala.inline
    def setSpawnOptions(value: SpawnOptions): Self = this.set("spawnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpawnOptions: Self = this.set("spawnOptions", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
