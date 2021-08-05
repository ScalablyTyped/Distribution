package typings.slateIrc

import typings.node.netMod.Socket
import typings.slateIrc.anon.Mode
import typings.slateIrc.slateIrcStrings.away
import typings.slateIrc.slateIrcStrings.data
import typings.slateIrc.slateIrcStrings.join
import typings.slateIrc.slateIrcStrings.message
import typings.slateIrc.slateIrcStrings.mode
import typings.slateIrc.slateIrcStrings.motd
import typings.slateIrc.slateIrcStrings.nick
import typings.slateIrc.slateIrcStrings.notice
import typings.slateIrc.slateIrcStrings.part
import typings.slateIrc.slateIrcStrings.quit
import typings.slateIrc.slateIrcStrings.topic
import typings.slateIrc.slateIrcStrings.welcome
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(socket: Socket): Client = ^.asInstanceOf[js.Dynamic].apply(socket.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  @JSImport("slate-irc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-irc", "Client")
  @js.native
  class Client () extends StObject {
    
    def action(target: String, msg: String): Unit = js.native
    
    def away(message: String): Unit = js.native
    
    def ctcp(target: String, msg: String): Unit = js.native
    
    def invite(name: String, channel: String): Unit = js.native
    
    def join(channel: String): Unit = js.native
    def join(channel: String, key: String): Unit = js.native
    
    def kick(channels: String, nicks: String, msg: String): Unit = js.native
    def kick(channels: String, nicks: js.Array[String], msg: String): Unit = js.native
    def kick(channels: js.Array[String], nicks: String, msg: String): Unit = js.native
    def kick(channels: js.Array[String], nicks: js.Array[String], msg: String): Unit = js.native
    
    var me: String = js.native
    
    def mode(target: String, flags: String, params: String): Unit = js.native
    
    def names(channel: String, callback: js.Function2[/* error */ Error, /* names */ js.Array[Mode], Unit]): Unit = js.native
    
    def nick(nick: String): Unit = js.native
    
    def notice(target: String, msg: String): Unit = js.native
    
    def on(event: String, callback: js.Function): Unit = js.native
    @JSName("on")
    def on_away(event: away, callback: js.Function1[/* event */ AwayEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_data(event: data, callback: js.Function1[/* event */ DataEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_join(event: join, callback: js.Function1[/* event */ JoinEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_message(event: message, callback: js.Function1[/* event */ MessageEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_mode(event: mode, callback: js.Function1[/* event */ ModeEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_motd(event: motd, callback: js.Function1[/* event */ MOTDEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_nick(event: nick, callback: js.Function1[/* event */ NickEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_notice(event: notice, callback: js.Function1[/* event */ MessageEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_part(event: part, callback: js.Function1[/* event */ PartEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_quit(event: quit, callback: js.Function1[/* event */ QuitEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_topic(event: topic, callback: js.Function1[/* event */ TopicEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_welcome(event: welcome, callback: js.Function1[/* name */ String, Unit]): Unit = js.native
    
    def oper(name: String, password: String): Unit = js.native
    
    def part(channel: String): Unit = js.native
    def part(channel: String, msg: String): Unit = js.native
    
    def pass(pass: String): Unit = js.native
    
    def quit(msg: String): Unit = js.native
    
    def send(target: String, msg: String): Unit = js.native
    
    def topic(channel: String, topic: String): Unit = js.native
    
    def user(username: String, realname: String): Unit = js.native
    
    def whois(target: String, mask: String, callback: js.Function): Unit = js.native
    
    def write(str: String): Unit = js.native
  }
  
  trait AwayEvent extends StObject {
    
    var message: String
    
    var nick: String
  }
  object AwayEvent {
    
    inline def apply(message: String, nick: String): AwayEvent = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwayEvent]
    }
    
    extension [Self <: AwayEvent](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataEvent extends StObject {
    
    var command: String
    
    var params: String
    
    var prefix: String
    
    var string: String
    
    var trailing: String
  }
  object DataEvent {
    
    inline def apply(command: String, params: String, prefix: String, string: String, trailing: String): DataEvent = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEvent]
    }
    
    extension [Self <: DataEvent](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setTrailing(value: String): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    }
  }
  
  trait JoinEvent extends StObject {
    
    var channel: String
    
    var hostmask: String
    
    var nick: String
  }
  object JoinEvent {
    
    inline def apply(channel: String, hostmask: String, nick: String): JoinEvent = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinEvent]
    }
    
    extension [Self <: JoinEvent](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    }
  }
  
  trait MOTDEvent extends StObject {
    
    var motd: js.Array[String]
  }
  object MOTDEvent {
    
    inline def apply(motd: js.Array[String]): MOTDEvent = {
      val __obj = js.Dynamic.literal(motd = motd.asInstanceOf[js.Any])
      __obj.asInstanceOf[MOTDEvent]
    }
    
    extension [Self <: MOTDEvent](x: Self) {
      
      inline def setMotd(value: js.Array[String]): Self = StObject.set(x, "motd", value.asInstanceOf[js.Any])
      
      inline def setMotdVarargs(value: String*): Self = StObject.set(x, "motd", js.Array(value :_*))
    }
  }
  
  trait MessageEvent extends StObject {
    
    var from: String
    
    var hostmask: String
    
    var message: String
    
    var to: String
  }
  object MessageEvent {
    
    inline def apply(from: String, hostmask: String, message: String, to: String): MessageEvent = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    extension [Self <: MessageEvent](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModeEvent extends StObject {
    
    var client: String
    
    var mode: String
    
    var nick: String
    
    var target: String
  }
  object ModeEvent {
    
    inline def apply(client: String, mode: String, nick: String, target: String): ModeEvent = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModeEvent]
    }
    
    extension [Self <: ModeEvent](x: Self) {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait NickEvent extends StObject {
    
    var hostmask: String
    
    var `new`: String
    
    var nick: String
  }
  object NickEvent {
    
    inline def apply(hostmask: String, `new`: String, nick: String): NickEvent = {
      val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NickEvent]
    }
    
    extension [Self <: NickEvent](x: Self) {
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    }
  }
  
  trait PartEvent extends StObject {
    
    var channels: js.Array[String]
    
    var hostmask: String
    
    var nick: String
  }
  object PartEvent {
    
    inline def apply(channels: js.Array[String], hostmask: String, nick: String): PartEvent = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartEvent]
    }
    
    extension [Self <: PartEvent](x: Self) {
      
      inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuitEvent extends StObject {
    
    var hostmask: String
    
    var message: String
    
    var nick: String
  }
  object QuitEvent {
    
    inline def apply(hostmask: String, message: String, nick: String): QuitEvent = {
      val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuitEvent]
    }
    
    extension [Self <: QuitEvent](x: Self) {
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicEvent extends StObject {
    
    var channel: String
    
    var hostmask: String
    
    var nick: String
    
    var topic: String
  }
  object TopicEvent {
    
    inline def apply(channel: String, hostmask: String, nick: String, topic: String): TopicEvent = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicEvent]
    }
    
    extension [Self <: TopicEvent](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setHostmask(value: String): Self = StObject.set(x, "hostmask", value.asInstanceOf[js.Any])
      
      inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
