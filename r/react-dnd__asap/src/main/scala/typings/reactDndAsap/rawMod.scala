package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  object rawAsap {
    
    @JSImport("@react-dnd/asap/lib/node/raw", "rawAsap")
    @js.native
    def apply(task: Task): Unit = js.native
    @JSImport("@react-dnd/asap/lib/node/raw", "rawAsap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-dnd/asap/lib/node/raw", "rawAsap.requestFlush")
    @js.native
    def requestFlush: js.Function0[Unit] = js.native
    @scala.inline
    def requestFlush_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestFlush")(x.asInstanceOf[js.Any])
  }
}
