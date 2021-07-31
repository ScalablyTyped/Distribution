package typings.ssh2.mod

import typings.ssh2.ssh2Strings.`keyboard-interactive`
import typings.ssh2Streams.mod.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The method of authentication. */
  @JSName("method")
  var method_KeyboardAuthContext: `keyboard-interactive` = js.native
  
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
  
  /** A list of preferred authentication "sub-methods" sent by the client. */
  var submethods: js.Array[String] = js.native
}
