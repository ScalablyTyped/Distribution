package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/replay", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sentryReplay.typesTypesRrwebMod.EventType & Double] = js.native
    
    /* 5 */ val Custom: typings.sentryReplay.typesTypesRrwebMod.EventType.Custom & Double = js.native
    
    /* 0 */ val DomContentLoaded: typings.sentryReplay.typesTypesRrwebMod.EventType.DomContentLoaded & Double = js.native
    
    /* 2 */ val FullSnapshot: typings.sentryReplay.typesTypesRrwebMod.EventType.FullSnapshot & Double = js.native
    
    /* 3 */ val IncrementalSnapshot: typings.sentryReplay.typesTypesRrwebMod.EventType.IncrementalSnapshot & Double = js.native
    
    /* 1 */ val Load: typings.sentryReplay.typesTypesRrwebMod.EventType.Load & Double = js.native
    
    /* 4 */ val Meta: typings.sentryReplay.typesTypesRrwebMod.EventType.Meta & Double = js.native
    
    /* 6 */ val Plugin: typings.sentryReplay.typesTypesRrwebMod.EventType.Plugin & Double = js.native
  }
  
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
