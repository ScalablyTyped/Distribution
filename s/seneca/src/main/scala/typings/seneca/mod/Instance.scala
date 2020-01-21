package typings.seneca.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var version: String = js.native
  def act[PatternWithArgs](pattern: PatternWithArgs, msg: js.Any, respond: ActCallback): Unit = js.native
  def act[PatternWithArgs](pattern: PatternWithArgs, respond: ActCallback): Unit = js.native
  def add[PatternType, CallBackParams](pattern: PatternType, action: AddCallback[PatternType with CallBackParams]): this.type = js.native
  def add[PatternType, CallbackParams](pattern: PatternType, paramspec: js.Any, action: AddCallback[PatternType with CallbackParams]): this.type = js.native
  def client(): this.type = js.native
  def client(options: ClientOptions): this.type = js.native
  def close(callback: CloseCallback): Unit = js.native
  def error(handler: GlobalErrorHandler): Unit = js.native
  // @param name reference to plugin provided object
  def export(name: String): PluginModule = js.native
  def listen(): this.type = js.native
  def listen(options: ListenOptions): this.type = js.native
  def make(base: String, entity_canon: String): Entity = js.native
  def make(base: String, entity_canon: String, properties: js.Any): Entity = js.native
  def make(entity_canon: String): Entity = js.native
  def make(entity_canon: String, properties: js.Any): Entity = js.native
  def make(zone: String, base: String, entity_canon: String): Entity = js.native
  def make(zone: String, base: String, entity_canon: String, properties: js.Any): Entity = js.native
  def on(eventName: String, callback: js.Function1[/* error */ Error, Unit]): js.Any = js.native
  def options(options: Options): Unit = js.native
  def pin(pattern: Pattern): Unit = js.native
  def ready(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def use(module: PluginModule): this.type = js.native
  def use(module: PluginModule, options: PluginOptions): this.type = js.native
  def use(name: String): this.type = js.native
  def use(name: String, options: PluginOptions): this.type = js.native
}

