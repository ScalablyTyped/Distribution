package typings.sentryReplay

import typings.sentryReplay.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplayMod {
  
  @JSImport("@sentry/replay/types/replay", "ReplayContainer")
  @js.native
  open class ReplayContainer protected ()
    extends StObject
       with typings.sentryReplay.typesTypesReplayMod.ReplayContainer {
    def this(param0: Options) = this()
    
    /**
      * Adds listeners to record events for the replay
      */
    /* private */ var _addListeners: Any = js.native
    
    /**
      * Observed performance events are added to `this.performanceEvents`. These
      * are included in the replay event before it is finished and sent to Sentry.
      */
    /* private */ var _addPerformanceEntries: Any = js.native
    
    /**
      * Clear _context
      */
    /* private */ var _clearContext: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /**
      * Helper to create (and buffer) a replay breadcrumb from a core SDK breadcrumb
      */
    /* private */ var _createCustomBreadcrumb: Any = js.native
    
    /* private */ var _debouncedFlush: Any = js.native
    
    /**
      * Tasks to run when we consider a page to be hidden (via blurring and/or visibility)
      */
    /* private */ var _doChangeToBackgroundTasks: Any = js.native
    
    /**
      * Tasks to run when we consider a page to be visible (via focus and/or visibility)
      */
    /* private */ var _doChangeToForegroundTasks: Any = js.native
    
    /**
      * Flush recording data to Sentry. Creates a lock so that only a single flush
      * can be active at a time. Do not call this directly.
      */
    /* private */ var _flush: Any = js.native
    
    /* private */ var _flushLock: Any = js.native
    
    /** A wrapper to conditionally capture exceptions. */
    /* private */ var _handleException: Any = js.native
    
    /** Ensure page remains active when a key is pressed. */
    /* private */ var _handleKeyboardEvent: Any = js.native
    
    /**
      * Handle when visibility of the page content changes. Opening a new tab will
      * cause the state to change to hidden because of content of current page will
      * be hidden. Likewise, moving a different window to cover the contents of the
      * page will also trigger a change to a hidden state.
      */
    /* private */ var _handleVisibilityChange: Any = js.native
    
    /**
      * Handle when page is blurred
      */
    /* private */ var _handleWindowBlur: Any = js.native
    
    /**
      * Handle when page is focused
      */
    /* private */ var _handleWindowFocus: Any = js.native
    
    /**
      * Have we attached listeners to the core SDK?
      * Note we have to track this as there is no way to remove instrumentation handlers.
      */
    /* private */ var _hasInitializedCoreListeners: Any = js.native
    
    /**
      * Initialize and start all listeners to varying events (DOM,
      * Performance Observer, Recording, Sentry SDK, etc)
      */
    /* private */ var _initializeRecording: Any = js.native
    
    /**
      * Is the integration currently active?
      */
    /* private */ var _isEnabled: Any = js.native
    
    /**
      * Paused is a state where:
      * - DOM Recording is not listening at all
      * - Nothing will be added to event buffer (e.g. core SDK events)
      */
    /* private */ var _isPaused: Any = js.native
    
    /**
      * Timestamp of the last user activity. This lives across sessions.
      */
    /* private */ var _lastActivity: Any = js.native
    
    /**
      * Loads (or refreshes) the current session.
      * Returns false if session is not recorded.
      */
    /* private */ var _loadAndCheckSession: Any = js.native
    
    /** Save the session, if it is sticky */
    /* private */ var _maybeSaveSession: Any = js.native
    
    /** Handler for rrweb.record.onMutation */
    /* private */ var _onMutationHandler: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ var _performanceObserver: Any = js.native
    
    /**
      * Return and clear _context
      */
    /* private */ var _popEventContext: Any = js.native
    
    /**
      * Options to pass to `rrweb.record()`
      */
    /* private */ val _recordingOptions: Any = js.native
    
    /**
      * Cleans up listeners that were created in `_addListeners`
      */
    /* private */ var _removeListeners: Any = js.native
    
    /**
      * Flushes replay event buffer to Sentry.
      *
      * Performance events are only added right before flushing - this is
      * due to the buffered performance observer events.
      *
      * Should never be called directly, only by `flush`
      */
    /* private */ var _runFlush: Any = js.native
    
    /**
      * Function to stop recording
      */
    /* private */ var _stopRecording: Any = js.native
    
    /* private */ var _throttledAddEvent: Any = js.native
    
    /**
      * Trigger rrweb to take a full snapshot which will cause this plugin to
      * create a new Replay event.
      */
    /* private */ var _triggerFullSnapshot: Any = js.native
    
    /** Update the initial timestamp based on the buffer content. */
    /* private */ var _updateInitialTimestampFromEventBuffer: Any = js.native
    
    /**
      * Updates the session's last activity timestamp
      */
    /* private */ var _updateSessionActivity: Any = js.native
    
    /**
      * Update user activity (across session lifespans)
      */
    /* private */ var _updateUserActivity: Any = js.native
    
    /**
      * Start replay buffering. Buffers until `flush()` is called or, if
      * `replaysOnErrorSampleRate` > 0, an error occurs.
      */
    def startBuffering(): Unit = js.native
  }
}
