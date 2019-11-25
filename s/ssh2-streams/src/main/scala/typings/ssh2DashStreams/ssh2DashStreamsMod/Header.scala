package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Any text that comes after the software name/version.
    */
  var comments: String
  /**
    * (Client-only) An optional greeting message presented by the server.
    */
  var greeting: js.UndefOr[String] = js.undefined
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: String
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions
}

object Header {
  @scala.inline
  def apply(comments: String, identRaw: String, versions: Versions, greeting: String = null): Header = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], identRaw = identRaw.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (greeting != null) __obj.updateDynamic("greeting")(greeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

