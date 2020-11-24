package typings.primus.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.primus.anon.Close
import typings.primus.anon.Name
import typings.primus.anon.Reconnect
import typings.primus.mod.emits.fn
import typings.primus.mod.emits.parser
import typings.primus.primusStrings.connection
import typings.primus.primusStrings.disconnection
import typings.primus.primusStrings.incoming
import typings.primus.primusStrings.outgoing
import typings.primus.primusStrings.plugin
import typings.primus.primusStrings.plugout
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Primus extends EventEmitter {
  
  var Socket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primus.Socket */ js.Any = js.native
  
  def authorize(fn: AuthorizationHandler): this.type = js.native
  
  def destroy(options: Close, fn: js.Function0[Unit]): this.type = js.native
  
  def disable(name: String): this.type = js.native
  
  def emits(event: String, arg1: js.Any, parser: parser): fn = js.native
  def emits(event: String, args: js.Any*): fn = js.native
  def emits(event: String, parser: parser): fn = js.native
  @JSName("emits")
  var emits_Original: typings.primus.mod.emits.emits = js.native
  
  def enable(name: String): this.type = js.native
  
  def end(): Unit = js.native
  def end(data: js.UndefOr[scala.Nothing], options: Reconnect): Unit = js.native
  def end(data: js.Any): Unit = js.native
  def end(data: js.Any, options: Reconnect): Unit = js.native
  
  def forEach(cb: js.Function1[/* spark */ Spark, Boolean]): this.type = js.native
  def forEach(
    cb: js.Function2[
      /* spark */ Spark, 
      /* next */ js.Function2[/* err */ Error | Null, /* forward */ Boolean, Unit], 
      Unit
    ],
    done: js.Function1[/* err */ Error | Null, Unit]
  ): this.type = js.native
  
  def library(): String = js.native
  
  @JSName("on")
  def on_connection(event: connection, cb: js.Function1[/* spark */ Spark, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnection(event: disconnection, cb: js.Function1[/* spark */ Spark, Unit]): this.type = js.native
  @JSName("on")
  def on_plugin(event: plugin, cb: js.Function2[/* name */ String, /* energon */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_plugout(event: plugout, cb: js.Function2[/* name */ String, /* energon */ js.Any, Unit]): this.type = js.native
  
  def plugin(): js.Any = js.native
  def plugin(energon: Name): this.type = js.native
  def plugin(name: String): js.Any = js.native
  def plugin(name: String, energon: String): this.type = js.native
  def plugin(name: String, energon: Name): this.type = js.native
  // This has a lot of variations and can be improved
  @JSName("plugin")
  def plugin_StringDictionary(): StringDictionary[js.Any] = js.native
  
  def plugout(name: String): this.type = js.native
  
  def remove(name: String): this.type = js.native
  
  def reserved(name: String): Boolean = js.native
  
  // This is marked as private in the source code, but documented in the readme
  def spark(id: String): Spark = js.native
  
  @JSName("transform")
  def transform_incoming(`type`: incoming, fn: js.Function1[/* packet */ PrimusPacket, Unit]): this.type = js.native
  @JSName("transform")
  def transform_outgoing(`type`: outgoing, fn: js.Function1[/* packet */ PrimusPacket, Unit]): this.type = js.native
  
  def use(fn: js.Function0[Middleware]): this.type = js.native
  def use(fn: js.Function0[Middleware], options: js.UndefOr[scala.Nothing], level: Double): this.type = js.native
  def use(fn: js.Function0[Middleware], options: js.Object): this.type = js.native
  def use(fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
  def use(name: String, fn: js.Function0[Middleware]): this.type = js.native
  def use(name: String, fn: js.Function0[Middleware], options: js.UndefOr[scala.Nothing], level: Double): this.type = js.native
  def use(name: String, fn: js.Function0[Middleware], options: js.Object): this.type = js.native
  def use(name: String, fn: js.Function0[Middleware], options: js.Object, level: Double): this.type = js.native
  
  def write(data: js.Any): Unit = js.native
}
