package typings
package readlineDashSyncLib.readlineDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline-sync", JSImport.Namespace)
@js.native
object readlineDashSyncModMembers extends js.Object {
  def getRawInput(): java.lang.String = js.native
  def keyIn(): java.lang.String = js.native
  def keyIn(query: js.Any): java.lang.String = js.native
  def keyIn(query: js.Any, options: BasicOptions): java.lang.String = js.native
  def keyInPause(): scala.Unit = js.native
  def keyInPause(query: js.Any): scala.Unit = js.native
  def keyInPause(query: js.Any, options: BasicOptions): scala.Unit = js.native
  def keyInSelect(items: js.Array[java.lang.String]): scala.Double = js.native
  def keyInSelect(items: js.Array[java.lang.String], query: js.Any): scala.Double = js.native
  def keyInSelect(items: js.Array[java.lang.String], query: js.Any, options: BasicOptions): scala.Double = js.native
  def keyInYN(): scala.Boolean | java.lang.String = js.native
  def keyInYN(query: js.Any): scala.Boolean | java.lang.String = js.native
  def keyInYN(query: js.Any, options: BasicOptions): scala.Boolean | java.lang.String = js.native
  def keyInYNStrict(): scala.Boolean = js.native
  def keyInYNStrict(query: js.Any): scala.Boolean = js.native
  def keyInYNStrict(query: js.Any, options: BasicOptions): scala.Boolean = js.native
  def prompt(): java.lang.String = js.native
  def prompt(options: BasicOptions): java.lang.String = js.native
  def promptCL(): js.Array[java.lang.String] = js.native
  def promptCL(
    commandHandler: js.Function2[/* command */ java.lang.String, /* repeated */java.lang.String, scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def promptCL(
    commandHandler: js.Function2[/* command */ java.lang.String, /* repeated */java.lang.String, scala.Unit],
    options: BasicOptions
  ): js.Array[java.lang.String] = js.native
  def promptCL(
    commandHandler: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */java.lang.String, scala.Unit]]
  ): js.Array[java.lang.String] = js.native
  def promptCL(
    commandHandler: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */java.lang.String, scala.Unit]],
    options: BasicOptions
  ): js.Array[java.lang.String] = js.native
  def promptCLLoop(): scala.Unit = js.native
  def promptCLLoop(
    commandHandler: js.Function2[
      /* command */ java.lang.String, 
      /* repeated */java.lang.String, 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def promptCLLoop(
    commandHandler: js.Function2[
      /* command */ java.lang.String, 
      /* repeated */java.lang.String, 
      scala.Boolean | scala.Unit
    ],
    options: BasicOptions
  ): scala.Unit = js.native
  def promptCLLoop(
    commandHandler: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */java.lang.String, scala.Boolean | scala.Unit]]
  ): scala.Unit = js.native
  def promptCLLoop(
    commandHandler: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */java.lang.String, scala.Boolean | scala.Unit]],
    options: BasicOptions
  ): scala.Unit = js.native
  def promptLoop(inputHandler: js.Function1[/* value */ java.lang.String, scala.Boolean]): scala.Unit = js.native
  def promptLoop(inputHandler: js.Function1[/* value */ java.lang.String, scala.Boolean], options: BasicOptions): scala.Unit = js.native
  def promptSimShell(): java.lang.String = js.native
  def promptSimShell(options: BasicOptions): java.lang.String = js.native
  def question(): java.lang.String = js.native
  def question(query: js.Any): java.lang.String = js.native
  def question(query: js.Any, options: BasicOptions): java.lang.String = js.native
  def questionEMail(): java.lang.String = js.native
  def questionEMail(query: js.Any): java.lang.String = js.native
  def questionEMail(query: js.Any, options: BasicOptions): java.lang.String = js.native
  def questionFloat(): scala.Double = js.native
  def questionFloat(query: js.Any): scala.Double = js.native
  def questionFloat(query: js.Any, options: BasicOptions): scala.Double = js.native
  def questionInt(): scala.Double = js.native
  def questionInt(query: js.Any): scala.Double = js.native
  def questionInt(query: js.Any, options: BasicOptions): scala.Double = js.native
  def questionNewPassword(): java.lang.String = js.native
  def questionNewPassword(query: js.Any): java.lang.String = js.native
  def questionNewPassword(query: js.Any, options: BasicOptions): java.lang.String = js.native
  def questionPath(): java.lang.String = js.native
  def questionPath(query: js.Any): java.lang.String = js.native
  def questionPath(query: js.Any, options: BasicOptions): java.lang.String = js.native
  def setBufferSize(value: scala.Double): scala.Unit = js.native
  def setDefaultOptions(): BasicOptions = js.native
  def setDefaultOptions(options: BasicOptions): BasicOptions = js.native
  def setEncoding(value: java.lang.String): scala.Unit = js.native
  def setMask(value: java.lang.String): scala.Unit = js.native
  def setPrint(value: js.Function2[/* display */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setPrompt(value: js.Any): scala.Unit = js.native
}

