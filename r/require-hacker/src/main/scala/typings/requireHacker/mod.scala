package typings.requireHacker

import typings.requireHacker.anon.Path
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("require-hacker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Intercept all `require` calls.
      *
      * @param id Unique ID
      * @param resolve Function to resolve a matching path to a valid path and JavaScript source.
      * @param options Options for setting global hook behaviour.
      * @return Object containing `unmount` method.
      */
    @JSImport("require-hacker", "default.global_hook")
    @js.native
    def globalHook(id: String, resolve: GlobalResolve): Unmount = js.native
    @JSImport("require-hacker", "default.global_hook")
    @js.native
    def globalHook(id: String, resolve: GlobalResolve, options: GlobalHookOptions): Unmount = js.native
    
    @JSImport("require-hacker", "default.global_hooks_enabled")
    @js.native
    def globalHooksEnabled: Boolean = js.native
    
    @scala.inline
    def globalHooksEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global_hooks_enabled")(x.asInstanceOf[js.Any])
    
    /**
      * Intercept all `require` calls for paths with this file extension and reroute them to the resolve function.
      *
      * @param extension Require paths to match to `resolve`.
      * @param resolve Function to resolve a matching path to valid JavaScript source.
      * @return Object containing `unmount` method.
      */
    @JSImport("require-hacker", "default.hook")
    @js.native
    def hook(extension: String, resolve: Resolve): Unmount = js.native
    
    @JSImport("require-hacker", "default.log")
    @js.native
    def log: Log = js.native
    @scala.inline
    def log_=(x: Log): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
    
    @JSImport("require-hacker", "default.occupied_file_extensions")
    @js.native
    def occupiedFileExtensions: Set[String] = js.native
    
    @scala.inline
    def occupiedFileExtensions_=(x: Set[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("occupied_file_extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("require-hacker", "default.path_resolvers")
    @js.native
    def pathResolvers: js.Array[Resolve] = js.native
    
    @scala.inline
    def pathResolvers_=(x: js.Array[Resolve]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path_resolvers")(x.asInstanceOf[js.Any])
    
    @JSImport("require-hacker", "default.preceding_path_resolvers")
    @js.native
    def precedingPathResolvers: js.Array[Resolve] = js.native
    
    @scala.inline
    def precedingPathResolvers_=(x: js.Array[Resolve]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preceding_path_resolvers")(x.asInstanceOf[js.Any])
    
    /**
      * Resolve a requireable path to a real filesystem path to a JavaScript or JSON file.
      * Resolution is performed relative to the passed module.
      */
    @JSImport("require-hacker", "default.resolve")
    @js.native
    def resolve: Resolve = js.native
    /**
      * Resolve a requireable path to a real filesystem path to a JavaScript or JSON file.
      * Resolution is performed relative to the passed module.
      */
    @JSImport("require-hacker", "default.resolve")
    @js.native
    def resolve(path: String, module: js.Any): js.UndefOr[String] = js.native
    @scala.inline
    def resolve_=(x: Resolve): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolve")(x.asInstanceOf[js.Any])
    
    /**
      * Intercept all `require` calls and tamper with the path, modifying it if needed.
      * Resolver should return a path to a valid JavaScript or JSON file, or return nothing.
      */
    @JSImport("require-hacker", "default.resolver")
    @js.native
    def resolver(resolve: Resolve): Unmount = js.native
    
    /** Convert anything to valid CommonJS JavaScript module source code. */
    @JSImport("require-hacker", "default.to_javascript_module_source")
    @js.native
    def toJavascriptModuleSource(anything: js.Any): String = js.native
  }
  
  @js.native
  trait GlobalHookOptions extends StObject {
    
    /**
      * Set the `require` interception behavior:
      * - `true` Intercept all `require` calls before they are passed to the Node.js `require` loader.
      * - `false` Intercept only those `require` calls which failed to be resolved by the Node.js `require`
      * loader.
      */
    var precede_node_loader: js.UndefOr[Boolean] = js.native
  }
  object GlobalHookOptions {
    
    @scala.inline
    def apply(): GlobalHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalHookOptions]
    }
    
    @scala.inline
    implicit class GlobalHookOptionsMutableBuilder[Self <: GlobalHookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrecede_node_loader(value: Boolean): Self = StObject.set(x, "precede_node_loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecede_node_loaderUndefined: Self = StObject.set(x, "precede_node_loader", js.undefined)
    }
  }
  
  type GlobalResolve = js.Function2[/* path */ String, /* module */ js.Any, js.UndefOr[Path]]
  
  @js.native
  trait Log extends StObject {
    
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    var options: LogOptions = js.native
    
    def trace(args: js.Any*): Unit = js.native
    
    def warning(args: js.Any*): Unit = js.native
  }
  object Log {
    
    @scala.inline
    def apply(
      debug: /* repeated */ js.Any => Unit,
      error: /* repeated */ js.Any => Unit,
      options: LogOptions,
      trace: /* repeated */ js.Any => Unit,
      warning: /* repeated */ js.Any => Unit
    ): Log = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), options = options.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: LogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarning(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LogOptions extends StObject {
    
    /* Log debug messages to the console. */
    var debug: js.UndefOr[Boolean] = js.native
  }
  object LogOptions {
    
    @scala.inline
    def apply(): LogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit class LogOptionsMutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type Resolve = js.Function2[/* path */ String, /* module */ js.Any, js.UndefOr[String]]
  
  @js.native
  trait Unmount extends StObject {
    
    /** Unmount this `require` hook from the system. */
    def unmount(): Unit = js.native
  }
  object Unmount {
    
    @scala.inline
    def apply(unmount: () => Unit): Unmount = {
      val __obj = js.Dynamic.literal(unmount = js.Any.fromFunction0(unmount))
      __obj.asInstanceOf[Unmount]
    }
    
    @scala.inline
    implicit class UnmountMutableBuilder[Self <: Unmount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    }
  }
}
