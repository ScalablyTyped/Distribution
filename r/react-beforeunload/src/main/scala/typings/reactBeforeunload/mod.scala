package typings.reactBeforeunload

import typings.react.mod.FC
import typings.reactBeforeunload.anon.Children
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-beforeunload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  val Beforeunload: FC[Children] = js.native
  
  @scala.inline
  def useBeforeunload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useBeforeunload")().asInstanceOf[Unit]
  @scala.inline
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useBeforeunload")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}
