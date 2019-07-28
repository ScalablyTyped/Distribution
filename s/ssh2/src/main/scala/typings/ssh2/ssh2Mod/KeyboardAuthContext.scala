package typings.ssh2.ssh2Mod

import typings.ssh2.ssh2Strings.`keyboard-interactive`
import typings.ssh2DashStreams.ssh2DashStreamsMod.Prompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardAuthContext
  extends AuthContextBase
     with AuthContext {
  /** The method of authentication. */
  @JSName("method")
  var method_KeyboardAuthContext: `keyboard-interactive` = js.native
  /** A list of preferred authentication "sub-methods" sent by the client. */
  var submethods: js.Array[String] = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(prompts: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param title The title for the prompt.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(prompts: String, title: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param title The title for the prompt.
    * @param instructions Instructions for the client.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(prompts: String, title: String, instructions: String, callback: js.Function0[Unit]): Unit = js.native
  def prompt(prompts: js.Array[String | Prompt], callback: js.Function0[Unit]): Unit = js.native
  def prompt(prompts: js.Array[String | Prompt], title: String, callback: js.Function0[Unit]): Unit = js.native
  def prompt(
    prompts: js.Array[String | Prompt],
    title: String,
    instructions: String,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def prompt(prompts: Prompt, callback: js.Function0[Unit]): Unit = js.native
  def prompt(prompts: Prompt, title: String, callback: js.Function0[Unit]): Unit = js.native
  def prompt(prompts: Prompt, title: String, instructions: String, callback: js.Function0[Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
}

