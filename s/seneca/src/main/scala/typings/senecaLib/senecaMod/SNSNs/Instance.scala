package typings
package senecaLib.senecaMod.SNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var version: java.lang.String = js.native
  def act[PatternWithArgs](pattern: PatternWithArgs, msg: js.Any, respond: ActCallback): scala.Unit = js.native
  def act[PatternWithArgs](pattern: PatternWithArgs, respond: ActCallback): scala.Unit = js.native
  def add[PatternType, CallBackParams](pattern: PatternType, action: AddCallback[PatternType with CallBackParams]): this.type = js.native
  def add[PatternType, CallbackParams](pattern: PatternType, paramspec: js.Any, action: AddCallback[PatternType with CallbackParams]): this.type = js.native
  def client(): this.type = js.native
  def client(options: ClientOptions): this.type = js.native
  def close(callback: CloseCallback): scala.Unit = js.native
  def error(handler: GlobalErrorHandler): scala.Unit = js.native
  // @param name reference to plugin provided object
  def export(name: java.lang.String): PluginModule = js.native
  def listen(): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def make(base: java.lang.String, entity_canon: java.lang.String): Entity = js.native
  def make(base: java.lang.String, entity_canon: java.lang.String, properties: js.Any): Entity = js.native
  def make(entity_canon: java.lang.String): Entity = js.native
  def make(entity_canon: java.lang.String, properties: js.Any): Entity = js.native
  def make(zone: java.lang.String, base: java.lang.String, entity_canon: java.lang.String): Entity = js.native
  def make(zone: java.lang.String, base: java.lang.String, entity_canon: java.lang.String, properties: js.Any): Entity = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Any = js.native
  def options(options: Options): scala.Unit = js.native
  def pin(pattern: Pattern): scala.Unit = js.native
  def ready(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def use(module: PluginModule): this.type = js.native
  def use(module: PluginModule, options: PluginOptions): this.type = js.native
  def use(name: java.lang.String): this.type = js.native
  def use(name: java.lang.String, options: PluginOptions): this.type = js.native
}

