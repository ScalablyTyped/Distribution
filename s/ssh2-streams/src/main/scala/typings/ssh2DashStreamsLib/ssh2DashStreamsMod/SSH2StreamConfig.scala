package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSH2StreamConfig extends js.Object {
  /**
    * This option allows you to explicitly override the default transport layer algorithms used for the connection. Each value must be an array of valid algorithms for that category. The order of the algorithms in the arrays are important, with the most favorable being first.
    */
  var algorithms: js.UndefOr[Algorithms] = js.undefined
  /**
    * A message that is sent to clients immediately upon connection, before handshaking begins.
    */
  var banner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ java.lang.String, _]] = js.undefined
  /**
    * This is the highWaterMark to use for the parser stream.
    * @default 32 * 1024
    */
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  /**
    * If in server mode, an object keyed on host key format.
    */
  var hostKeys: js.UndefOr[HostKeys] = js.undefined
  /**
    * A custom server software name/version identifier.
    * @default 'ssh2js' + moduleVersion + 'srv'
    */
  var ident: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations.
    * @default 35000
    */
  var maxPacketSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[scala.Boolean] = js.undefined
}

