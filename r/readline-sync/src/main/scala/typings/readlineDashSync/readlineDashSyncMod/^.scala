package typings.readlineDashSync.readlineDashSyncMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline-sync", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getRawInput(): String = js.native
  def keyIn(): String = js.native
  def keyIn(query: js.Any): String = js.native
  def keyIn(query: js.Any, options: BasicOptions): String = js.native
  def keyInPause(): Unit = js.native
  def keyInPause(query: js.Any): Unit = js.native
  def keyInPause(query: js.Any, options: BasicOptions): Unit = js.native
  def keyInSelect(items: js.Array[String]): Double = js.native
  def keyInSelect(items: js.Array[String], query: js.Any): Double = js.native
  def keyInSelect(items: js.Array[String], query: js.Any, options: BasicOptions): Double = js.native
  def keyInYN(): Boolean | String = js.native
  def keyInYN(query: js.Any): Boolean | String = js.native
  def keyInYN(query: js.Any, options: BasicOptions): Boolean | String = js.native
  def keyInYNStrict(): Boolean = js.native
  def keyInYNStrict(query: js.Any): Boolean = js.native
  def keyInYNStrict(query: js.Any, options: BasicOptions): Boolean = js.native
  def prompt(): String = js.native
  def prompt(options: BasicOptions): String = js.native
  def promptCL(): js.Array[String] = js.native
  def promptCL(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit]): js.Array[String] = js.native
  def promptCL(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit],
    options: BasicOptions
  ): js.Array[String] = js.native
  def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]]): js.Array[String] = js.native
  def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]], options: BasicOptions): js.Array[String] = js.native
  def promptCLLoop(): Unit = js.native
  def promptCLLoop(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit]): Unit = js.native
  def promptCLLoop(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit],
    options: BasicOptions
  ): Unit = js.native
  def promptCLLoop(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]]): Unit = js.native
  def promptCLLoop(
    commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]],
    options: BasicOptions
  ): Unit = js.native
  def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean]): Unit = js.native
  def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean], options: BasicOptions): Unit = js.native
  def promptSimShell(): String = js.native
  def promptSimShell(options: BasicOptions): String = js.native
  def question(): String = js.native
  def question(query: js.Any): String = js.native
  def question(query: js.Any, options: BasicOptions): String = js.native
  def questionEMail(): String = js.native
  def questionEMail(query: js.Any): String = js.native
  def questionEMail(query: js.Any, options: BasicOptions): String = js.native
  def questionFloat(): Double = js.native
  def questionFloat(query: js.Any): Double = js.native
  def questionFloat(query: js.Any, options: BasicOptions): Double = js.native
  def questionInt(): Double = js.native
  def questionInt(query: js.Any): Double = js.native
  def questionInt(query: js.Any, options: BasicOptions): Double = js.native
  def questionNewPassword(): String = js.native
  def questionNewPassword(query: js.Any): String = js.native
  def questionNewPassword(query: js.Any, options: BasicOptions): String = js.native
  def questionPath(): String = js.native
  def questionPath(query: js.Any): String = js.native
  def questionPath(query: js.Any, options: BasicOptions): String = js.native
  def setBufferSize(value: Double): Unit = js.native
  def setDefaultOptions(): BasicOptions = js.native
  def setDefaultOptions(options: BasicOptions): BasicOptions = js.native
  def setEncoding(value: String): Unit = js.native
  def setMask(value: String): Unit = js.native
  def setPrint(value: js.Function2[/* display */ String, /* encoding */ String, Unit]): Unit = js.native
  def setPrompt(value: js.Any): Unit = js.native
}

