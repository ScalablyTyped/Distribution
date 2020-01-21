package typings.readlineSync.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline-sync", "promptCL")
@js.native
object promptCL extends js.Object {
  def apply(): js.Array[String] = js.native
  def apply(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit]): js.Array[String] = js.native
  def apply(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit],
    options: BasicOptions
  ): js.Array[String] = js.native
  def apply(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]]): js.Array[String] = js.native
  def apply(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]], options: BasicOptions): js.Array[String] = js.native
}

