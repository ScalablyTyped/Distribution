package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends js.Object {
  
  /**
    * Any text that comes after the software name/version.
    */
  var comments: String = js.native
  
  /**
    * (Client-only) An optional greeting message presented by the server.
    */
  var greeting: js.UndefOr[String] = js.native
  
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: String = js.native
  
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions = js.native
}
object Header {
  
  @scala.inline
  def apply(comments: String, identRaw: String, versions: Versions): Header = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], identRaw = identRaw.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    
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
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentRaw(value: String): Self = this.set("identRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: Versions): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreeting(value: String): Self = this.set("greeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreeting: Self = this.set("greeting", js.undefined)
  }
}
