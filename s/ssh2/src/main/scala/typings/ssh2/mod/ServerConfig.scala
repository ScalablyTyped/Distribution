package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2Streams.mod.Algorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfig extends js.Object {
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.native
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.native
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.native
  /** An array of host private keys. */
  var hostKeys: js.Array[Buffer | String | EncryptedPrivateKey] = js.native
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.native
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[Double] = js.native
}

object ServerConfig {
  @scala.inline
  def apply(hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  @scala.inline
  implicit class ServerConfigOps[Self <: ServerConfig] (val x: Self) extends AnyVal {
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
    def setHostKeysVarargs(value: (Buffer | String | EncryptedPrivateKey)*): Self = this.set("hostKeys", js.Array(value :_*))
    @scala.inline
    def setHostKeys(value: js.Array[Buffer | String | EncryptedPrivateKey]): Self = this.set("hostKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgorithms(value: Algorithms): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    @scala.inline
    def setBanner(value: String): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setGreeting(value: String): Self = this.set("greeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreeting: Self = this.set("greeting", js.undefined)
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setIdent(value: String): Self = this.set("ident", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdent: Self = this.set("ident", js.undefined)
    @scala.inline
    def setMaxPacketSize(value: Double): Self = this.set("maxPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPacketSize: Self = this.set("maxPacketSize", js.undefined)
  }
  
}

