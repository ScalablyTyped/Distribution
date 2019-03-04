package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * Any text that comes after the software name/version.
    */
  var comments: java.lang.String
  /**
    * (Client-only) An optional greeting message presented by the server.
    */
  var greeting: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: java.lang.String
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions
}

object Header {
  @scala.inline
  def apply(
    comments: java.lang.String,
    identRaw: java.lang.String,
    versions: Versions,
    greeting: java.lang.String = null
  ): Header = {
    val __obj = js.Dynamic.literal(comments = comments, identRaw = identRaw, versions = versions)
    if (greeting != null) __obj.updateDynamic("greeting")(greeting)
    __obj.asInstanceOf[Header]
  }
}

