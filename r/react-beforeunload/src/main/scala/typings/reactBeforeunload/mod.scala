package typings.reactBeforeunload

import typings.react.mod.FC
import typings.reactBeforeunload.anon.Children
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  val Beforeunload: FC[Children] = js.native
  
  @JSImport("react-beforeunload", "useBeforeunload")
  @js.native
  def useBeforeunload(): Unit = js.native
  @JSImport("react-beforeunload", "useBeforeunload")
  @js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}
