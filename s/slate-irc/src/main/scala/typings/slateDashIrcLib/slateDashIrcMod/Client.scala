package typings
package slateDashIrcLib.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-irc", "Client")
@js.native
class Client () extends js.Object {
  var me: java.lang.String = js.native
  def action(target: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def away(message: java.lang.String): scala.Unit = js.native
  def ctcp(target: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def invite(name: java.lang.String, channel: java.lang.String): scala.Unit = js.native
  def join(channel: java.lang.String): scala.Unit = js.native
  def join(channel: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def kick(channels: java.lang.String, nicks: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def kick(channels: java.lang.String, nicks: js.Array[java.lang.String], msg: java.lang.String): scala.Unit = js.native
  def kick(channels: js.Array[java.lang.String], nicks: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def kick(channels: js.Array[java.lang.String], nicks: js.Array[java.lang.String], msg: java.lang.String): scala.Unit = js.native
  def mode(target: java.lang.String, flags: java.lang.String, params: java.lang.String): scala.Unit = js.native
  def names(
    channel: java.lang.String,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* names */ js.Array[slateDashIrcLib.Anon_Mode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def nick(nick: java.lang.String): scala.Unit = js.native
  def notice(target: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_away(
    event: slateDashIrcLib.slateDashIrcLibStrings.away,
    callback: js.Function1[/* event */ AwayEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_data(
    event: slateDashIrcLib.slateDashIrcLibStrings.data,
    callback: js.Function1[/* event */ DataEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_join(
    event: slateDashIrcLib.slateDashIrcLibStrings.join,
    callback: js.Function1[/* event */ JoinEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_message(
    event: slateDashIrcLib.slateDashIrcLibStrings.message,
    callback: js.Function1[/* event */ MessageEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_mode(
    event: slateDashIrcLib.slateDashIrcLibStrings.mode,
    callback: js.Function1[/* event */ ModeEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_motd(
    event: slateDashIrcLib.slateDashIrcLibStrings.motd,
    callback: js.Function1[/* event */ MOTDEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_nick(
    event: slateDashIrcLib.slateDashIrcLibStrings.nick,
    callback: js.Function1[/* event */ NickEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_notice(
    event: slateDashIrcLib.slateDashIrcLibStrings.notice,
    callback: js.Function1[/* event */ MessageEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_part(
    event: slateDashIrcLib.slateDashIrcLibStrings.part,
    callback: js.Function1[/* event */ PartEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_quit(
    event: slateDashIrcLib.slateDashIrcLibStrings.quit,
    callback: js.Function1[/* event */ QuitEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_topic(
    event: slateDashIrcLib.slateDashIrcLibStrings.topic,
    callback: js.Function1[/* event */ TopicEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_welcome(
    event: slateDashIrcLib.slateDashIrcLibStrings.welcome,
    callback: js.Function1[/* name */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def oper(name: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def part(channel: java.lang.String): scala.Unit = js.native
  def part(channel: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def pass(pass: java.lang.String): scala.Unit = js.native
  def quit(msg: java.lang.String): scala.Unit = js.native
  def send(target: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def topic(channel: java.lang.String, topic: java.lang.String): scala.Unit = js.native
  def user(username: java.lang.String, realname: java.lang.String): scala.Unit = js.native
  def whois(target: java.lang.String, mask: java.lang.String, callback: js.Function): scala.Unit = js.native
  def write(str: java.lang.String): scala.Unit = js.native
}

