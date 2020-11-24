package typings.readlineSync.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("readline-sync", "promptCLLoop")
@js.native
object promptCLLoop extends js.Object {
  
  def apply(): Unit = js.native
  def apply(commandHandler: js.UndefOr[scala.Nothing], options: BasicOptions): Unit = js.native
  def apply(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit]): Unit = js.native
  def apply(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit],
    options: BasicOptions
  ): Unit = js.native
  def apply(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]]): Unit = js.native
  def apply(
    commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]],
    options: BasicOptions
  ): Unit = js.native
}
