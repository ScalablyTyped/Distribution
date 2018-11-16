package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardAuthContext extends AuthContextBase {
  /** The method of authentication. */
  @JSName("method")
  var method_KeyboardAuthContext: ssh2Lib.ssh2LibStrings.`keyboard-interactive` = js.native
  /** A list of preferred authentication "sub-methods" sent by the client. */
  var submethods: js.Array[java.lang.String] = js.native
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
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param title The title for the prompt.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    title: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param title The title for the prompt.
       * @param instructions Instructions for the client.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(
    prompts: js.Array[java.lang.String | ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt],
    title: java.lang.String,
    instructions: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param title The title for the prompt.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(
    prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt,
    title: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
       * Send prompts to the client.
       * @param prompts The prompts to send to the client.
       * @param title The title for the prompt.
       * @param instructions Instructions for the client.
       * @param callback A callback to call with the responses from the client.
       */
  def prompt(
    prompts: ssh2DashStreamsLib.ssh2DashStreamsMod.Prompt,
    title: java.lang.String,
    instructions: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

