package typings.qlikVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppConfig extends js.Object {
  /**
    * Optional Qlik host.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Optional. Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: js.UndefOr[String] = js.native
  /**
    * Optional. Use SSL.
    */
  var isSecure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Open app without loading data. Introduced in version 1.1.
    */
  var openWithoutData: js.UndefOr[Boolean] = js.native
  /**
    * Port number.
    */
  var port: String | Double = js.native
  /**
    * Optional. Qlik virtual proxy. "/" if no proxy.
    */
  var prefix: js.UndefOr[String] = js.native
}

object IAppConfig {
  @scala.inline
  def apply(port: String | Double): IAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppConfig]
  }
  @scala.inline
  implicit class IAppConfigOps[Self <: IAppConfig] (val x: Self) extends AnyVal {
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
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSecure: Self = this.set("isSecure", js.undefined)
    @scala.inline
    def setOpenWithoutData(value: Boolean): Self = this.set("openWithoutData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenWithoutData: Self = this.set("openWithoutData", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

