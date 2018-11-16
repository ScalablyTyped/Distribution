package typings
package qiniuLib.qiniuMod

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
    var useCdnDomain: js.UndefOr[scala.Boolean] = js.undefined
    /**
             * @default false
             */
    var useHttpsDomain: js.UndefOr[scala.Boolean] = js.undefined
    /**
             * @default null
             */
    var zone: js.UndefOr[Zone] = js.undefined
    /**
             * @default -1
             */
    var zoneExpire: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class Zone protected () extends js.Object {
    def this(srcUpHosts: js.UndefOr[js.Any], cdnUpHosts: js.UndefOr[js.Any], ioHost: js.UndefOr[java.lang.String], rsHost: js.UndefOr[java.lang.String], rsfHost: js.UndefOr[java.lang.String], apiHost: js.UndefOr[java.lang.String]) = this()
    var apiHost: java.lang.String = js.native
    var cdnUpHosts: js.Any = js.native
    var ioHost: java.lang.String = js.native
    var rsHost: java.lang.String = js.native
    var rsfHost: java.lang.String = js.native
    var srcUpHosts: js.Any = js.native
  }
  
  var ACCESS_KEY: java.lang.String = js.native
  var BLOCK_SIZE: scala.Double = js.native
  var FormMimeJson: java.lang.String = js.native
  var FormMimeRaw: java.lang.String = js.native
  var FormMimeUrl: java.lang.String = js.native
  var RPC_TIMEOUT: scala.Double = js.native
  var RS_HOST: java.lang.String = js.native
  var SECRET_KEY: java.lang.String = js.native
  var USER_AGENT: java.lang.String = js.native
}

