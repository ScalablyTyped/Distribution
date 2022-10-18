package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threadMod {
  
  /**
    * Represents a set of Dispatch jobs with associated state which can be controlled as a unit.
    */
  /* note: abstract class */ @JSImport("thread", JSImport.Default)
  @js.native
  /**
    * Construct a new `Thread`, optionally specifying options for its Dispatch jobs.
    * @param options Options for the thread's recurring Dispatch jobs.
    */
  open class default ()
    extends StObject
       with Thread {
    def this(options: JobOptions) = this()
    
    /** Whether the thread currently has input focus. */
    /* CompleteClass */
    override val hasFocus: Boolean = js.native
    
    /**
      * Override this to check for input during the Update phase of each frame. Unlike
      * `on_update`, this is called only on frames in which the thread has the focus.
      */
    /* CompleteClass */
    override def on_inputCheck(): Unit = js.native
    
    /**
      * Override this to execute code during the Render phase of each frame.
      */
    /* CompleteClass */
    override def on_render(): Unit = js.native
    
    /**
      * Override this method to execute code when the thread terminates or when the engine exits,
      * whichever comes first.
      */
    /* CompleteClass */
    override def on_shutDown(): Unit = js.native
    
    /**
      * Override this method to execute code when the thread starts up.
      */
    /* CompleteClass */
    override def on_startUp(): Unit = js.native
    
    /**
      * Override this to execute code during the Update phase of each frame.
      */
    /* CompleteClass */
    override def on_update(): Unit = js.native
    
    /**
      * Pause updates for this thread. While paused, the thread will continue to render, but will
      * not update or check for input.
      */
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /**
      * Priority of this thread's Dispatch jobs. Higher priority threads are updated earlier and
      * rendered later in a frame.
      */
    /* CompleteClass */
    override val priority: Double = js.native
    
    /**
      * Resume updates for this thread. If the thread isn't paused, this has no effect.
      */
    /* CompleteClass */
    override def resume(): Unit = js.native
    
    /** Whether the thread is currently running (paused threads count as running). */
    /* CompleteClass */
    override val running: Boolean = js.native
    
    /**
      * Start execution of the thread and resolve a promise when the thread has fully started--which
      * may take several frames if its `on_startUp` handler is `async`.
      */
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /**
      * Shut down the thread, completely cancelling its Dispatch jobs. `on_shutDown` will be
      * called.
      */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /**
      * Attempt to give this thread input focus. If a higher-priority `FocusTarget` or `Thread`
      * currently has the focus, it won't be stolen.
      */
    /* CompleteClass */
    override def takeFocus(): Unit = js.native
    
    /**
      * Give the focus back to whichever `FocusTarget` or `Thread` had it previously. Has no
      * effect if this thread doesn't currently have the focus.
      */
    /* CompleteClass */
    override def yieldFocus(): Unit = js.native
  }
  object default {
    
    @JSImport("thread", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Resolve a promise when one or more threads terminate. Use with `await`.
      * @param threads One or more threads to wait for. The promise resolves only once all
      *                specified threads have finished.
      */
    /* static member */
    inline def join(threads: Thread*): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(threads.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Represents a set of Dispatch jobs with associated state which can be controlled as a unit.
    */
  trait Thread extends StObject {
    
    /** Whether the thread currently has input focus. */
    val hasFocus: Boolean
    
    /**
      * Override this to check for input during the Update phase of each frame. Unlike
      * `on_update`, this is called only on frames in which the thread has the focus.
      */
    def on_inputCheck(): Unit
    
    /**
      * Override this to execute code during the Render phase of each frame.
      */
    def on_render(): Unit
    
    /**
      * Override this method to execute code when the thread terminates or when the engine exits,
      * whichever comes first.
      */
    def on_shutDown(): Unit
    
    /**
      * Override this method to execute code when the thread starts up.
      */
    def on_startUp(): Unit
    
    /**
      * Override this to execute code during the Update phase of each frame.
      */
    def on_update(): Unit
    
    /**
      * Pause updates for this thread. While paused, the thread will continue to render, but will
      * not update or check for input.
      */
    def pause(): Unit
    
    /**
      * Priority of this thread's Dispatch jobs. Higher priority threads are updated earlier and
      * rendered later in a frame.
      */
    val priority: Double
    
    /**
      * Resume updates for this thread. If the thread isn't paused, this has no effect.
      */
    def resume(): Unit
    
    /** Whether the thread is currently running (paused threads count as running). */
    val running: Boolean
    
    /**
      * Start execution of the thread and resolve a promise when the thread has fully started--which
      * may take several frames if its `on_startUp` handler is `async`.
      */
    def start(): js.Promise[Unit]
    
    /**
      * Shut down the thread, completely cancelling its Dispatch jobs. `on_shutDown` will be
      * called.
      */
    def stop(): Unit
    
    /**
      * Attempt to give this thread input focus. If a higher-priority `FocusTarget` or `Thread`
      * currently has the focus, it won't be stolen.
      */
    def takeFocus(): Unit
    
    /**
      * Give the focus back to whichever `FocusTarget` or `Thread` had it previously. Has no
      * effect if this thread doesn't currently have the focus.
      */
    def yieldFocus(): Unit
  }
  object Thread {
    
    inline def apply(
      hasFocus: Boolean,
      on_inputCheck: () => Unit,
      on_render: () => Unit,
      on_shutDown: () => Unit,
      on_startUp: () => Unit,
      on_update: () => Unit,
      pause: () => Unit,
      priority: Double,
      resume: () => Unit,
      running: Boolean,
      start: () => js.Promise[Unit],
      stop: () => Unit,
      takeFocus: () => Unit,
      yieldFocus: () => Unit
    ): Thread = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], on_inputCheck = js.Any.fromFunction0(on_inputCheck), on_render = js.Any.fromFunction0(on_render), on_shutDown = js.Any.fromFunction0(on_shutDown), on_startUp = js.Any.fromFunction0(on_startUp), on_update = js.Any.fromFunction0(on_update), pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), running = running.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), takeFocus = js.Any.fromFunction0(takeFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
      __obj.asInstanceOf[Thread]
    }
    
    extension [Self <: Thread](x: Self) {
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setOn_inputCheck(value: () => Unit): Self = StObject.set(x, "on_inputCheck", js.Any.fromFunction0(value))
      
      inline def setOn_render(value: () => Unit): Self = StObject.set(x, "on_render", js.Any.fromFunction0(value))
      
      inline def setOn_shutDown(value: () => Unit): Self = StObject.set(x, "on_shutDown", js.Any.fromFunction0(value))
      
      inline def setOn_startUp(value: () => Unit): Self = StObject.set(x, "on_startUp", js.Any.fromFunction0(value))
      
      inline def setOn_update(value: () => Unit): Self = StObject.set(x, "on_update", js.Any.fromFunction0(value))
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTakeFocus(value: () => Unit): Self = StObject.set(x, "takeFocus", js.Any.fromFunction0(value))
      
      inline def setYieldFocus(value: () => Unit): Self = StObject.set(x, "yieldFocus", js.Any.fromFunction0(value))
    }
  }
}
