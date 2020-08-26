package typings.socketIo.mod

import typings.engineIo.mod.AttachOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to our server when creating it
  */
@js.native
trait ServerOptions
  extends typings.engineIo.mod.ServerOptions
     with AttachOptions {
  /**
    * The adapter to use for handling rooms. NOTE: this should be a class,
    * not an object
    * @default typeof Adapter
    */
  var adapter: js.UndefOr[Adapter] = js.native
  /**
    * Accepted origins
    * @default '*:*'
    */
  var origins: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Should we serve the client file?
    * @default true
    */
  var serveClient: js.UndefOr[Boolean] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setAdapter(value: Adapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    @scala.inline
    def setOriginsVarargs(value: String*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: String | js.Array[String]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    @scala.inline
    def setServeClient(value: Boolean): Self = this.set("serveClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServeClient: Self = this.set("serveClient", js.undefined)
  }
  
}

