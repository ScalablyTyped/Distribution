package typings.sentryTypes.miscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerLocation extends js.Object {
  
  /** The fragment identifier of the URL of the script executed in the Worker, beginning with a '#'. */
  val hash: String = js.native
  
  /** The host, that is the hostname, a ':', and the port of the URL of the script executed in the Worker. */
  val host: String = js.native
  
  /** The domain of the URL of the script executed in the Worker. */
  val hostname: String = js.native
  
  /** Stringifier that returns the whole URL of the script executed in the Worker. */
  val href: String = js.native
  
  /** The canonical form of the origin of the specific location. */
  val origin: String = js.native
  
  /** The path of the URL of the script executed in the Worker, beginning with a '/'. */
  val pathname: String = js.native
  
  /** The port number of the URL of the script executed in the Worker. */
  val port: String = js.native
  
  /** The protocol scheme of the URL of the script executed in the Worker, including the final ':'. */
  val protocol: String = js.native
  
  /** The parameters (query string) of the URL of the script executed in the Worker, beginning with a '?'. */
  val search: String = js.native
}
object WorkerLocation {
  
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String
  ): WorkerLocation = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerLocation]
  }
  
  @scala.inline
  implicit class WorkerLocationOps[Self <: WorkerLocation] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
  }
}
