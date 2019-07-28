package typings.qiniu.qiniuMod

import typings.qiniu.qiniuMod.confNs.ConfigOptions
import typings.qiniu.qiniuMod.confNs.Zone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "conf")
@js.native
object confNs extends js.Object {
  @js.native
  class Config () extends ConfigOptions {
    def this(options: ConfigOptions) = this()
  }
  
  trait ConfigOptions extends js.Object {
    /**
      * @default true
      */
    var useCdnDomain: js.UndefOr[Boolean] = js.undefined
    /**
      * @default false
      */
    var useHttpsDomain: js.UndefOr[Boolean] = js.undefined
    /**
      * @default null
      */
    var zone: js.UndefOr[Zone] = js.undefined
    /**
      * @default -1
      */
    var zoneExpire: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  class Zone protected () extends js.Object {
    def this(
      srcUpHosts: js.UndefOr[js.Any],
      cdnUpHosts: js.UndefOr[js.Any],
      ioHost: js.UndefOr[String],
      rsHost: js.UndefOr[String],
      rsfHost: js.UndefOr[String],
      apiHost: js.UndefOr[String]
    ) = this()
    var apiHost: String = js.native
    var cdnUpHosts: js.Any = js.native
    var ioHost: String = js.native
    var rsHost: String = js.native
    var rsfHost: String = js.native
    var srcUpHosts: js.Any = js.native
  }
  
  var ACCESS_KEY: String = js.native
  var BLOCK_SIZE: Double = js.native
  var FormMimeJson: String = js.native
  var FormMimeRaw: String = js.native
  var FormMimeUrl: String = js.native
  var RPC_TIMEOUT: Double = js.native
  var RS_HOST: String = js.native
  var SECRET_KEY: String = js.native
  var USER_AGENT: String = js.native
}

