package typings.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallOpts extends js.Object {
  
  var basePath: js.UndefOr[String] = js.native
  
  var baseURL: js.UndefOr[String] = js.native
  
  var cb: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.native
  
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var progressCb: js.UndefOr[
    js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
  ] = js.native
  
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object InstallOpts {
  
  @scala.inline
  def apply(): InstallOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallOpts]
  }
  
  @scala.inline
  implicit class InstallOptsOps[Self <: InstallOpts] (val x: Self) extends AnyVal {
    
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
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setCb(value: /* error */ Error => Unit): Self = this.set("cb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
    
    @scala.inline
    def setDrivers(value: StringDictionary[DriverOptions]): Self = this.set("drivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrivers: Self = this.set("drivers", js.undefined)
    
    @scala.inline
    def setLogger(value: /* message */ String => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setProgressCb(value: (/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double) => Unit): Self = this.set("progressCb", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProgressCb: Self = this.set("progressCb", js.undefined)
    
    @scala.inline
    def setRequestOpts(value: RequestOptions | String | URL_): Self = this.set("requestOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOpts: Self = this.set("requestOpts", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
