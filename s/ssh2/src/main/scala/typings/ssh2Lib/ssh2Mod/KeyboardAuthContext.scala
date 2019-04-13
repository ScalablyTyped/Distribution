package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardAuthContext
  extends AuthContextBase
     with AuthContext {
  /** The method of authentication. */
  @JSName("method")
  var method_KeyboardAuthContext: ssh2Lib.ssh2LibStrings.`keyboard-interactive` = js.native
  /** A list of preferred authentication "sub-methods" sent by the client. */
  var submethods: js.Array[java.lang.String] = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(prompts: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param title The title for the prompt.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(prompts: java.lang.String, title: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Send prompts to the client.
    * @param prompts The prompts to send to the client.
    * @param title The title for the prompt.
    * @param instructions Instructions for the client.
    * @param callback A callback to call with the responses from the client.
    */
  def prompt(
    prompts: java.lang.String,
    title: java.lang.String,
    instructions: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    title: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    title: java.lang.String,
    instructions: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def prompt(prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def prompt(
    prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt,
    title: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def prompt(
    prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt,
    title: java.lang.String,
    instructions: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
}

