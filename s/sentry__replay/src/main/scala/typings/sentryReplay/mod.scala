package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/replay", "Replay")
  @js.native
  open class Replay ()
    extends typings.sentryReplay.typesIntegrationMod.Replay {
    def this(param0: ReplayConfiguration) = this()
  }
  /* static members */
  object Replay {
    
    @JSImport("@sentry/replay", "Replay")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/replay", "Replay.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
