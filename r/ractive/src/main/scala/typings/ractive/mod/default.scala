package typings.ractive.mod

import org.scalablytyped.runtime.Instantiable0
import typings.ractive.AnonAdaptors
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ractive", JSImport.Default)
@js.native
class default[T /* <: Ractive[T] */] () extends Ractive[T] {
  def this(opts: InitOpts[T]) = this()
}

/* static members */
@JSImport("ractive", JSImport.Default)
@js.native
object default extends js.Object {
  /** The prototype for Context objects. You can use this to add methods and properties to Contexts. */
  val Context: Instantiable0[ContextHelper] = js.native
  /** When true, causes Ractive to emit warnings. Defaults to true. */
  var DEBUG: Boolean = js.native
  var DEBUG_PROMISES: Boolean = js.native
  /** The parent constructor used to create this constructor. */
  var Parent: Static[Ractive[Ractive[_]]] = js.native
  /** The Ractive constructor used to create this constructor. */
  var Ractive: AnonAdaptors = js.native
  val VERSION: String = js.native
  var adaptors: Registry[Adaptor] = js.native
  var components: Registry[Component] = js.native
  var decorators: Registry[Decorator[Ractive[Ractive[_]]]] = js.native
  /** The registries that are inherited by all instance. */
  var defaults: Registries[Ractive[Ractive[_]]] = js.native
  var easings: Registry[Easing] = js.native
  var events: Registry[EventPlugin[Ractive[Ractive[_]]]] = js.native
  var helpers: Registry[Helper] = js.native
  var interpolators: Registry[Interpolator] = js.native
  var partials: Registry[Partial] = js.native
  /** true if Ractive detects that this environment supports svg. */
  val svg: Boolean = js.native
  /**
  	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
  	 * as opposed scoped CSS installed on a component constructor.
  	 */
  def addCSS(id: String, css: String): Unit = js.native
  def addCSS(id: String, css: CssFn): Unit = js.native
  /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
  def escapeKey(key: String): String = js.native
  /** Create a new component with this constructor as a starting point. */
  def extend[U](): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  def extend[U](opts: ExtendOpts[Ractive[Ractive[_]] with U]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  /** Create a new component with this constuuctor as a starting point using the given constructor. */
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  /** Retrieve the CSS string for all loaded components. */
  def getCSS(): String = js.native
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  /** Get a Context for the given node or selector. */
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  /** Check to see if CSS with the given id has already been added */
  def hasCSS(id: String): Boolean = js.native
  /** @returns true if the given object is an instance of this constructor */
  def isInstance(obj: js.Any): Boolean = js.native
  /** Safely join the given keys into a keypath. */
  def joinKeys(keys: String*): String = js.native
  /**
  	 * Initialize a macro function.
  	 * @param macro
  	 * @param options
  	 */
  def `macro`(`macro`: MacroFn): Macro = js.native
  def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = js.native
  /**
  	 * Parse the given template string into a template.j
  	 */
  def parse(template: String): ParsedTemplate = js.native
  def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
  /** Get the value at the given keypath from the Ractive shared store. */
  def sharedGet(keypath: String): js.Any = js.native
  /** Set the given keypath in the Ractive shared store to the given value. */
  def sharedSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  /** Set the given map of values in the Ractive shared store. */
  def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
  /** Split the given keypath into its constituent keys. */
  def splitKeypath(keypath: String): js.Array[String] = js.native
  /** Get the css data for this constructor at the given keypath. */
  def styleGet(keypath: String): js.Any = js.native
  /** Set the css data for this constructor at the given keypath to the given value. */
  def styleSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  /** Set the given map of values in the css data for this constructor. */
  def styleSet(map: ValueMap): js.Promise[Unit] = js.native
  /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
  def unescapeKey(key: String): String = js.native
  def use(args: PluginExtend*): Static[Ractive[Ractive[_]]] = js.native
}

