package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayConfiguration
import typings.sentryReplay.typesTypesReplayMod.SendBufferedReplayOptions
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationMod {
  
  @JSImport("@sentry/replay/types/integration", "Replay")
  @js.native
  open class Replay ()
    extends StObject
       with Integration {
    def this(param0: ReplayConfiguration) = this()
    
    /**
      * Initial options passed to the replay integration, merged with default values.
      * Note: `sessionSampleRate` and `errorSampleRate` are not required here, as they
      * can only be finally set when setupOnce() is called.
      *
      * @private
      */
    /* private */ val _initialOptions: Any = js.native
    
    /**
      * Initializes replay.
      */
    /* protected */ def _initialize(): Unit = js.native
    
    /** If replay has already been initialized */
    /* protected */ def _isInitialized: Boolean = js.native
    /** Update _isInitialized */
    /* protected */ def _isInitialized_=(value: Boolean): Unit = js.native
    
    /**
      * Options to pass to `rrweb.record()`
      */
    /* private */ val _recordingOptions: Any = js.native
    
    /* private */ var _replay: Any = js.native
    
    /** Setup the integration. */
    /* private */ var _setup: Any = js.native
    
    /**
      * If not in "session" recording mode, flush event buffer which will create a new replay.
      * Unless `continueRecording` is false, the replay will continue to record and
      * behave as a "session"-based replay.
      *
      * Otherwise, queue up a flush.
      */
    def flush(): js.Promise[Unit] = js.native
    def flush(options: SendBufferedReplayOptions): js.Promise[Unit] = js.native
    
    /**
      * Get the current session ID.
      */
    def getReplayId(): js.UndefOr[String] = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Setup and initialize replay container
      */
    def setupOnce(): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
    
    /**
      * Start a replay regardless of sampling rate. Calling this will always
      * create a new session. Will throw an error if replay is already in progress.
      *
      * Creates or loads a session, attaches listeners to varying events (DOM,
      * PerformanceObserver, Recording, Sentry SDK, etc)
      */
    def start(): Unit = js.native
    
    /**
      * Start replay buffering. Buffers until `flush()` is called or, if
      * `replaysOnErrorSampleRate` > 0, until an error occurs.
      */
    def startBuffering(): Unit = js.native
    
    /**
      * Currently, this needs to be manually called (e.g. for tests). Sentry SDK
      * does not support a teardown
      */
    def stop(): js.Promise[Unit] = js.native
  }
  /* static members */
  object Replay {
    
    @JSImport("@sentry/replay/types/integration", "Replay")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/replay/types/integration", "Replay.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
