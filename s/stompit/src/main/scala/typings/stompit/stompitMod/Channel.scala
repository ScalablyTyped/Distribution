package typings.stompit.stompitMod

import typings.stompit.libChannelMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "Channel")
@js.native
class Channel protected ()
  extends typings.stompit.libChannelMod.^ {
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^) = this()
  def this(connectFailover: typings.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
}

