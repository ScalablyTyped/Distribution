package typings.ractive.mod

import typings.ractive.anon.Instantiable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ractive", JSImport.Default)
@js.native
class default[T /* <: Ractive[T] */] () extends Ractive[T] {
  def this(opts: InitOpts[T]) = this()
}
/* static members */
object default {
  
  @JSImport("ractive", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof ContextHelper` */
  @JSImport("ractive", "default.Context")
  @js.native
  class Context ()
    extends typings.ractive.mod.Ractive.Context
  
  /** When true, causes Ractive to emit warnings. Defaults to true. */
  @JSImport("ractive", "default.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.DEBUG_PROMISES")
  @js.native
  def DEBUG_PROMISES: Boolean = js.native
  @scala.inline
  def DEBUG_PROMISES_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_PROMISES")(x.asInstanceOf[js.Any])
  
  /** The parent constructor used to create this constructor. */
  @JSImport("ractive", "default.Parent")
  @js.native
  def Parent: Static[Ractive[Ractive[js.Any]]] = js.native
  @scala.inline
  def Parent_=(x: Static[Ractive[Ractive[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parent")(x.asInstanceOf[js.Any])
  
  /** The Ractive constructor used to create this constructor. */
  @JSImport("ractive", "default.Ractive")
  @js.native
  def Ractive: Instantiable = js.native
  @scala.inline
  def Ractive_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ractive")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ractive", "default.adaptors")
  @js.native
  def adaptors: Registry[Adaptor] = js.native
  @scala.inline
  def adaptors_=(x: Registry[Adaptor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(x.asInstanceOf[js.Any])
  
  /**
  	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
  	 * as opposed scoped CSS installed on a component constructor.
  	 */
  @JSImport("ractive", "default.addCSS")
  @js.native
  def addCSS(id: String, css: String): Unit = js.native
  @JSImport("ractive", "default.addCSS")
  @js.native
  def addCSS(id: String, css: CssFn): Unit = js.native
  
  @JSImport("ractive", "default.components")
  @js.native
  def components: Registry[Component] = js.native
  @scala.inline
  def components_=(x: Registry[Component]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.decorators")
  @js.native
  def decorators: Registry[Decorator[Ractive[Ractive[js.Any]]]] = js.native
  @scala.inline
  def decorators_=(x: Registry[Decorator[Ractive[Ractive[js.Any]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
  
  /** The registries that are inherited by all instance. */
  @JSImport("ractive", "default.defaults")
  @js.native
  def defaults: Registries[Ractive[Ractive[js.Any]]] = js.native
  @scala.inline
  def defaults_=(x: Registries[Ractive[Ractive[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.easings")
  @js.native
  def easings: Registry[Easing] = js.native
  @scala.inline
  def easings_=(x: Registry[Easing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easings")(x.asInstanceOf[js.Any])
  
  /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
  @JSImport("ractive", "default.escapeKey")
  @js.native
  def escapeKey(key: String): String = js.native
  
  @JSImport("ractive", "default.events")
  @js.native
  def events: Registry[EventPlugin[Ractive[Ractive[js.Any]]]] = js.native
  @scala.inline
  def events_=(x: Registry[EventPlugin[Ractive[Ractive[js.Any]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /** Create a new component with this constructor as a starting point. */
  @JSImport("ractive", "default.extend")
  @js.native
  def extend[U](): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  @JSImport("ractive", "default.extend")
  @js.native
  def extend[U](opts: ExtendOpts[Ractive[Ractive[_]] with U]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  
  /** Create a new component with this constuuctor as a starting point using the given constructor. */
  @JSImport("ractive", "default.extendWith")
  @js.native
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  @JSImport("ractive", "default.extendWith")
  @js.native
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
  
  /** Retrieve the CSS string for all loaded components. */
  @JSImport("ractive", "default.getCSS")
  @js.native
  def getCSS(): String = js.native
  
  @JSImport("ractive", "default.getContext")
  @js.native
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  /** Get a Context for the given node or selector. */
  @JSImport("ractive", "default.getContext")
  @js.native
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  
  /** Check to see if CSS with the given id has already been added */
  @JSImport("ractive", "default.hasCSS")
  @js.native
  def hasCSS(id: String): Boolean = js.native
  
  @JSImport("ractive", "default.helpers")
  @js.native
  def helpers: Registry[Helper] = js.native
  @scala.inline
  def helpers_=(x: Registry[Helper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helpers")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.interpolators")
  @js.native
  def interpolators: Registry[Interpolator] = js.native
  @scala.inline
  def interpolators_=(x: Registry[Interpolator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(x.asInstanceOf[js.Any])
  
  /** @returns true if the given object is an instance of this constructor */
  @JSImport("ractive", "default.isInstance")
  @js.native
  def isInstance(obj: js.Any): Boolean = js.native
  
  /** Safely join the given keys into a keypath. */
  @JSImport("ractive", "default.joinKeys")
  @js.native
  def joinKeys(keys: String*): String = js.native
  
  /**
  	 * Parse the given template string into a template.j
  	 */
  @JSImport("ractive", "default.parse")
  @js.native
  def parse(template: String): ParsedTemplate = js.native
  @JSImport("ractive", "default.parse")
  @js.native
  def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
  
  @JSImport("ractive", "default.partials")
  @js.native
  def partials: Registry[Partial] = js.native
  @scala.inline
  def partials_=(x: Registry[Partial]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partials")(x.asInstanceOf[js.Any])
  
  /** Get the value at the given keypath from the Ractive shared store. */
  @JSImport("ractive", "default.sharedGet")
  @js.native
  def sharedGet(keypath: String): js.Any = js.native
  
  /** Set the given keypath in the Ractive shared store to the given value. */
  @JSImport("ractive", "default.sharedSet")
  @js.native
  def sharedSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  /** Set the given map of values in the Ractive shared store. */
  @JSImport("ractive", "default.sharedSet")
  @js.native
  def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
  
  /** Split the given keypath into its constituent keys. */
  @JSImport("ractive", "default.splitKeypath")
  @js.native
  def splitKeypath(keypath: String): js.Array[String] = js.native
  
  /** Get the css data for this constructor at the given keypath. */
  @JSImport("ractive", "default.styleGet")
  @js.native
  def styleGet(keypath: String): js.Any = js.native
  
  /** Set the css data for this constructor at the given keypath to the given value. */
  @JSImport("ractive", "default.styleSet")
  @js.native
  def styleSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  /** Set the given map of values in the css data for this constructor. */
  @JSImport("ractive", "default.styleSet")
  @js.native
  def styleSet(map: ValueMap): js.Promise[Unit] = js.native
  
  /** true if Ractive detects that this environment supports svg. */
  @JSImport("ractive", "default.svg")
  @js.native
  val svg: Boolean = js.native
  
  /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
  @JSImport("ractive", "default.unescapeKey")
  @js.native
  def unescapeKey(key: String): String = js.native
  
  @JSImport("ractive", "default.use")
  @js.native
  def use(args: PluginExtend*): Static[Ractive[Ractive[_]]] = js.native
  
  /**
  	 * Initialize a macro function.
  	 * @param macro
  	 * @param options
  	 */
  @JSImport("ractive", "default.macro")
  @js.native
  def `macro`(`macro`: MacroFn): Macro = js.native
  @JSImport("ractive", "default.macro")
  @js.native
  def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = js.native
}
