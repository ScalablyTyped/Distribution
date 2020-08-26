package typings.requireHacker.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("require-hacker", JSImport.Default)
@js.native
object default extends js.Object {
  var global_hook_resolved_modules: StringDictionary[String] = js.native
  var global_hooks_enabled: Boolean = js.native
  var log: Log = js.native
  var occupied_file_extensions: Set[String] = js.native
  var path_resolvers: js.Array[Resolve] = js.native
  var preceding_path_resolvers: js.Array[Resolve] = js.native
  /**
    * Resolve a requireable path to a real filesystem path to a JavaScript or JSON file.
    * Resolution is performed relative to the passed module.
    */
  @JSName("resolve")
  var resolve_Original: Resolve = js.native
  /**
    * Intercept all `require` calls.
    *
    * @param id Unique ID
    * @param resolve Function to resolve a matching path to a valid path and JavaScript source.
    * @param options Options for setting global hook behaviour.
    * @return Object containing `unmount` method.
    */
  def global_hook(id: String, resolve: GlobalResolve): Unmount = js.native
  def global_hook(id: String, resolve: GlobalResolve, options: GlobalHookOptions): Unmount = js.native
  /**
    * Intercept all `require` calls for paths with this file extension and reroute them to the resolve function.
    *
    * @param extension Require paths to match to `resolve`.
    * @param resolve Function to resolve a matching path to valid JavaScript source.
    * @return Object containing `unmount` method.
    */
  def hook(extension: String, resolve: Resolve): Unmount = js.native
  /**
    * Resolve a requireable path to a real filesystem path to a JavaScript or JSON file.
    * Resolution is performed relative to the passed module.
    */
  def resolve(path: String, module: js.Any): js.UndefOr[String] = js.native
  /**
    * Intercept all `require` calls and tamper with the path, modifying it if needed.
    * Resolver should return a path to a valid JavaScript or JSON file, or return nothing.
    */
  def resolver(resolve: Resolve): Unmount = js.native
  /** Convert anything to valid CommonJS JavaScript module source code. */
  def to_javascript_module_source(anything: js.Any): String = js.native
}

