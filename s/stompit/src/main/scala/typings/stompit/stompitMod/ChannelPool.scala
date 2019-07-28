package typings.stompit.stompitMod

import typings.stompit.libChannelPoolMod.ChannelPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "ChannelPool")
@js.native
class ChannelPool protected ()
  extends typings.stompit.libChannelPoolMod.^ {
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
}

