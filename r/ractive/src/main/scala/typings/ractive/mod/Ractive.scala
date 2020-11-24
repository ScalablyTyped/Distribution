package typings.ractive.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ractive.anon.Instantiable
import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ractive", "Ractive")
@js.native
class Ractive[T /* <: Ractive[T] */] () extends js.Object {
  def this(opts: InitOpts[T]) = this()
  
  /** When overriding methods, the original method is available using this._super. */
  def _super(args: js.Any*): js.Any = js.native
  
  var adaptors: Registry[Adaptor] = js.native
  
  /** Add to the number at the given keypath
  	 * @param keypath a keypath to a number
  	 * @param amount the amount to add to the target number - defaults to 1
  	 */
  def add(keypath: String): js.Promise[Unit] = js.native
  def add(keypath: String, amount: Double): js.Promise[Unit] = js.native
  
  /**
  	 * Animate the value at the given keypath from its current value to the given value.
  	 * @param keypath a keypath to the value
  	 * @param value the target value
  	 * @param opts
  	 */
  def animate(keypath: String, value: js.Any): AnimatePromise = js.native
  def animate(keypath: String, value: js.Any, opts: AnimateOpts): AnimatePromise = js.native
  
  /**
  	 * Attach a child instance (component or not) to this instance. Use anchors (<#anchor/>) like component tags along with the target option to achieve unmanaged components. If an anchor is not used, the child will be responsible for rendering itself, but it will get a parent instance.
  	 * @param child the instance to attach to this instance
  	 * @param opts
  	 */
  def attachChild(child: Ractive[Ractive[_]]): js.Promise[Unit] = js.native
  def attachChild(child: Ractive[Ractive[_]], opts: AttachOpts): js.Promise[Unit] = js.native
  
  /** A list of children attached to this instance. */
  var children: Children = js.native
  
  var components: Registry[Component] = js.native
  
  /**
  	 * Create a new computation at the given path. This is the runtime equivalent of adding computed entries during initialization.
  	 * @param keypath the keypath at which the computation will exist. This can include wildcards.
  	 * @param computation the computation descriptor to install at the given keypath
  	 */
  def compute(keypath: String, computation: Computation[T]): js.Promise[Unit] = js.native
  
  /** If this instance is in a yielded template, the instance that is immediately above it. */
  var container: js.UndefOr[Ractive[Ractive[_]]] = js.native
  
  var decorators: Registry[Decorator[T]] = js.native
  
  /**
  	 * Detach this instance from the DOM.
  	 */
  def detach(): DocumentFragment = js.native
  
  /**
  	 * Detach a child instance that was previously attached with attachChild from this instance.
  	 * @param child the instance to detach
  	 */
  def detachChild(child: Ractive[Ractive[_]]): js.Promise[Unit] = js.native
  
  var easings: Registry[Easing] = js.native
  
  var events: Registry[EventPlugin[T]] = js.native
  
  /**
  	 * Find an element in the DOM controlled by this instance.
  	 * @param selector query used to find the first matching element
  	 * @param opts
  	 */
  def find(selector: String): HTMLElement = js.native
  def find(selector: String, opts: FindOpts): HTMLElement = js.native
  
  /**
  	 * Find all of the elements in the DOM controlled by this instance that match the given selector.
  	 * @param selector query used to match elements
  	 * @param opts
  	 */
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def findAll(selector: String, opts: FindOpts): js.Array[HTMLElement] = js.native
  
  /**
  	 * Find all of the components belonging to this instance.
  	 * @param opts
  	 */
  def findAllComponents(): js.Array[Ractive[Ractive[_]]] = js.native
  /**
  	 * Find all of the components with the given name belonging to this instance.
  	 * @param name
  	 * @param opts
  	 */
  def findAllComponents(name: String): js.Array[Ractive[Ractive[_]]] = js.native
  def findAllComponents(name: String, opts: FindOpts): js.Array[Ractive[Ractive[_]]] = js.native
  def findAllComponents(opts: FindOpts): js.Array[Ractive[Ractive[_]]] = js.native
  
  /**
  	 * Find the first component belonging to this instance.
  	 * @param opts
  	 */
  def findComponent(): Ractive[Ractive[_]] = js.native
  /**
  	 * Find the first component with the given name belonging to this instance.
  	 * @param name
  	 * @param opts
  	 */
  def findComponent(name: String): Ractive[Ractive[_]] = js.native
  def findComponent(name: String, opts: FindOpts): Ractive[Ractive[_]] = js.native
  def findComponent(opts: FindOpts): Ractive[Ractive[_]] = js.native
  
  /**
  	 * Find the immediate ancestor instance with the given name.
  	 * @param name
  	 */
  def findContainer(name: String): Ractive[Ractive[_]] = js.native
  
  /**
  	 * Find the owning ancestor instance with the given name. For yielded instances, this will be the instance that yielded the template containing the component.
  	 * @param name
  	 */
  def findParent(name: String): Ractive[Ractive[_]] = js.native
  
  def fire(name: String, ctx: js.UndefOr[scala.Nothing], args: js.Any*): Boolean = js.native
  def fire(name: String, ctx: js.Object, args: js.Any*): Boolean = js.native
  /**
  	 * Fire a Ractive instance event.
  	 * @param name the name of the event
  	 * @param ctx an optional context or object to be merged with a context
  	 * @param args additional args to pass to the event listeners
  	 */
  def fire(name: String, ctx: ContextHelper, args: js.Any*): Boolean = js.native
  
  /**
  	 * Retrieve the root object of this instance's data.
  	 * @param opts
  	 */
  def get(): js.Any = js.native
  /**
  	 * Retrieve the value at the given keypath in this instance's data.
  	 * @param keypath a keypath to the value
  	 * @param opts
  	 */
  def get(keypath: String): js.Any = js.native
  def get(keypath: String, opts: GetOpts): js.Any = js.native
  def get(opts: GetOpts): js.Any = js.native
  
  /**
  	 * Get a Context object for the given node or node that matches the given query.
  	 * @param query
  	 */
  def getContext(): ContextHelper = js.native
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  
  var helpers: Registry[Helper] = js.native
  
  /**
  	 * Render this instance into the given target, optionally using the given anchor. If the instance is already attached to the DOM, it will first be detached.
  	 * @param target
  	 * @param anchor
  	 */
  def insert(target: Target): Unit = js.native
  def insert(target: Target, anchor: Target): Unit = js.native
  
  var interpolators: Registry[Interpolator] = js.native
  
  /**
  	 * Create a link to the given source keypath at the given target keypath, similar to a symlink in filesystems. This allows safely referencing the same data at two places in the same instance or across instances if given a target instance. Cross-instance links are also known as mappings.
  	 * @param source the keypath to the source of the link
  	 * @param dest the keypath for the destination
  	 * @param opts
  	 */
  def link(source: String, dest: String): js.Promise[Unit] = js.native
  def link(source: String, dest: String, opts: LinkOpts): js.Promise[Unit] = js.native
  
  /**
  	 * Create an observer at the given keypath that will be called when the value at that keypath mutates.
  	 * @param keypath the keypath(s) to observe - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observe(keypath: String, callback: ObserverArrayCallback[T]): ObserverHandle = js.native
  def observe(keypath: String, callback: ObserverArrayCallback[T], opts: ObserverArrayOpts): ObserverHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called when the value at that keypath mutates.
  	 * @param keypath the keypath(s) to observe - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observe(keypath: String, callback: ObserverCallback[T]): ObserverHandle = js.native
  def observe(keypath: String, callback: ObserverCallback[T], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Create a set of observers from the given map.
  	 * @param map keypath -> callback pairs to observe
  	 * @returns an observer handle that controls all of the created observers
  	 */
  def observe(map: StringDictionary[ObserverArrayCallback[T] | ObserverCallback[T]]): ObserverHandle = js.native
  def observe(map: StringDictionary[ObserverArrayCallback[T]], opts: ObserverArrayOpts): ObserverHandle = js.native
  def observe(map: StringDictionary[ObserverCallback[T]], opts: ObserverOpts): ObserverHandle = js.native
  
  /**
  	 * Create an observer at the given keypath that will be called the first time the value at that keypath mutates. After that call, the observer will be automatically cancelled.
  	 * @param keypath the keypath(s) to observer - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observeOnce(keypath: String, callback: ObserverArrayCallback[T]): ObserverHandle = js.native
  def observeOnce(keypath: String, callback: ObserverArrayCallback[T], opts: ObserverArrayOpts): ObserverHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called the first time the value at that keypath mutates. After that call, the observer will be automatically cancelled.
  	 * @param keypath the keypath(s) to observer - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observeOnce(keypath: String, callback: ObserverCallback[T]): ObserverHandle = js.native
  def observeOnce(keypath: String, callback: ObserverCallback[T], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Create a set of observers from the given map. After the first observed value from any of the set mutates, all of the observers will be cancelled.
  	 * @param map keypath -> callback pairs to observe
  	 * @returns an observer handle that controls all of the created observersj
  	 */
  def observeOnce(map: StringDictionary[ObserverArrayCallback[T] | ObserverCallback[T]]): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverArrayCallback[T]], opts: ObserverArrayOpts): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverCallback[T]], opts: ObserverOpts): ObserverHandle = js.native
  
  /**
  	 * Stop listening to instance events. If no name is supplied, all events will have their listeners removed. If no handler is supplied, all listeners for the given event will be removed.
  	 * @param event
  	 * @param handler
  	 */
  def off(): Ractive[Ractive[_]] = js.native
  def off(event: js.UndefOr[scala.Nothing], handler: ListenerCallback[T]): Ractive[Ractive[_]] = js.native
  def off(event: String): Ractive[Ractive[_]] = js.native
  def off(event: String, handler: ListenerCallback[T]): Ractive[Ractive[_]] = js.native
  
  /**
  	 * Listen for an optionally namespaced instance event.
  	 * @param event
  	 * @param handler
  	 * @returns an object that can be used to control the attached listeners
  	 */
  def on(event: String, handler: ListenerCallback[T]): ObserverHandle = js.native
  /**
  	 * Listen for a group of optionally namespaced instance events using the given map.
  	 * @param map event name -> callback pairs to listen
  	 */
  def on(map: StringDictionary[ListenerCallback[T]]): ObserverHandle = js.native
  
  /**
  	 * Listen for an optionally namespaced instance event. After the listener has been triggered once, the listener will be automatically unsubscribed.
  	 * @param event
  	 * @param handler
  	 */
  def once(event: String, handler: ListenerCallback[T]): ObserverHandle = js.native
  /**
  	 * Listen for a group of optionally namespaced instance events using the given map. After a listener has been triggered once, all of the listeners will be automatically unsubscribed.
  	 * @param map event name -> callback pairs to listen
  	 */
  def once(map: StringDictionary[ListenerCallback[T]]): ObserverHandle = js.native
  
  /** If this instance is a component, the instance that controls it. */
  var parent: js.UndefOr[Ractive[Ractive[_]]] = js.native
  
  var partials: Registry[Partial] = js.native
  
  /**
  	 * Pop a value off the array at the given keypath.
  	 * @param keypath keypath to the target array
  	 */
  def pop(keypath: String): ArrayPopPromise = js.native
  
  /**
  	 * Push a value onto the array at the given Context-relative keypath. If there is no value (undefined) at the given keypath, an array will be created for it.
  	 * @param keypath keypath to the target array
  	 * @param values
  	 */
  def push(keypath: String, values: js.Any*): ArrayPushPromise = js.native
  
  /**
  	 * Get the source keypath for the given keypath if it is a link.
  	 * @param keypath
  	 * @param opts
  	 */
  def readLink(keypath: String): ReadLinkResult = js.native
  def readLink(keypath: String, opts: ReadLinkOpts): ReadLinkResult = js.native
  
  /** Render this instance into the given target. This is useful if the instance was not created with a target. */
  def render(target: Target): js.Promise[Unit] = js.native
  
  /**
  	 * Whether or not this instance is currently rendered into the DOM.
  	 */
  var rendered: Boolean = js.native
  
  /**
  	 * Replace this instance's data with the given data.
  	 * @param data defaults to {}
  	 */
  def reset(): js.Promise[Unit] = js.native
  def reset(data: Data): js.Promise[Unit] = js.native
  
  /**
  	 * Replace the instance partial with the given name with a new partial template. Any instances of the partial rendered in the template will be re-rendered with the new template.
  	 * @param name
  	 * @param partial
  	 */
  def resetPartial(name: String, partial: Partial): js.Promise[Unit] = js.native
  
  /**
  	 * Re-render this instance with the given template replacing the current template.
  	 * @param template
  	 */
  def resetTemplate(template: Template): js.Promise[Unit] = js.native
  
  /**
  	 * Reverse the array at the given keypath.
  	 * @param keypath keypath to the targret array
  	 */
  def reverse(keypath: String): ArraySplicePromise = js.native
  
  /** If this instance is a component, the instance at the root of the template. */
  var root: Ractive[Ractive[_]] = js.native
  
  /**
  	 * Set a value at the given keypath. If any intermediate levels do not exist in the data, they will be created as appriate - objects for string keys and arrays for numeric keys.
  	 * @param keypath
  	 * @param value the value to set
  	 * @param opts
  	 */
  def set(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  def set(keypath: String, value: js.Any, opts: SetOpts): js.Promise[Unit] = js.native
  /**
  	 * Set a set of values from the given map. All of the values will be set before any DOM changes are propagated, but the values will still be set in object order in the data, which can cause multiple invalidations on observers, bindings, and template nodes.j
  	 * @param map keypath -> value pairs to be set
  	 */
  def set(map: ValueMap): js.Promise[Unit] = js.native
  def set(map: ValueMap, opts: SetOpts): js.Promise[Unit] = js.native
  
  /**
  	 * Shift a value off of the array at the given keypath.
  	 * @param keypath
  	 */
  def shift(keypath: String): ArrayPopPromise = js.native
  
  /**
  	 * Sort the array at the given keypath.
  	 * @param keypath
  	 */
  def sort(keypath: String): ArraySplicePromise = js.native
  
  /**
  	 * Splice the array at the given keypath.
  	 * @param keypath
  	 * @param index index at which to start splicing
  	 * @param drop number of items to drop starting at the given index
  	 * @param add items to add at the given index
  	 */
  def splice(keypath: String, index: Double, drop: Double, add: js.Any*): ArraySplicePromise = js.native
  
  /**
  	 * Subtract an amount from the number at the given keypath.
  	 * @param keypath
  	 * @param amount the amount to subtrat from the value - defaults to 1
  	 */
  def subtract(keypath: String): js.Promise[Unit] = js.native
  def subtract(keypath: String, amount: Double): js.Promise[Unit] = js.native
  
  /**
  	 * Dispose of this instance, including unrendering the template and dismantling the data. Once this is done, the instance cannot be used again.
  	 */
  def teardown(): js.Promise[Unit] = js.native
  
  /**
  	 * Return any CSS belonging to this instance and any components it has rendered. This only works for instances of components create with extend or extendWith.
  	 */
  def toCSS(): String = js.native
  
  /**
  	 * Return the HTML for this instance as a string.
  	 */
  def toHTML(): String = js.native
  
  /**
  	 * Toggle the value at the given keypath. If it is truthy, set it to false, otherwise, set it to true.
  	 * @param keypath
  	 */
  def toggle(keypath: String): js.Promise[Unit] = js.native
  
  /**
  	 * Trigger a transition on the element associated with the current event. This only works from event handlers.
  	 * @param transition the transition to trigger
  	 * @param opts
  	 */
  def transition(transition: String): js.Promise[Unit] = js.native
  /**
  	 * Trigger a transition on the given element.
  	 * @param transition thi transition to trigger
  	 * @param node the element to transition
  	 * @param opts
  	 */
  def transition(transition: String, node: HTMLElement): js.Promise[Unit] = js.native
  def transition(transition: String, node: HTMLElement, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  def transition(transition: String, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  def transition(transition: Transition): js.Promise[Unit] = js.native
  def transition(transition: Transition, node: HTMLElement): js.Promise[Unit] = js.native
  def transition(transition: Transition, node: HTMLElement, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  def transition(transition: Transition, opts: typings.ractive.anon.TransitionOpts): js.Promise[Unit] = js.native
  
  /**
  	 * Remove the link at the given keypath.
  	 * @param keypath
  	 */
  def unlink(keypath: String): js.Promise[Unit] = js.native
  
  /**
  	 * Unrender the current instance from the DOM.
  	 */
  def unrender(): js.Promise[Unit] = js.native
  
  /**
  	 * Unshift the given value onto the array at the given keypath. If there is nothing at the given keypath (undefined), then an array will ne created.
  	 * @param keypath
  	 * @param value
  	 */
  def unshift(keypath: String, value: js.Any): ArrayPushPromise = js.native
  
  /**
  	 * Invalidate the root model of this instance. This will cause Ractive to check for any changes that may have happened directly to the data without going through a set or array method.
  	 * @param opts
  	 */
  def update(): js.Promise[Unit] = js.native
  /**
  	 * Invalidate the model at the given keypath. This will cause Ractive to check for any changes that may have happened directly to the data without going through a set or array method.
  	 * @param keypath
  	 * @param opts
  	 */
  def update(keypath: String): js.Promise[Unit] = js.native
  def update(keypath: String, opts: UpdateOpts): js.Promise[Unit] = js.native
  def update(opts: UpdateOpts): js.Promise[Unit] = js.native
  
  /**
  	 * Cause any bindings associated with the root model of this instance to apply the value in the view to the model. Use this to pull changes made directly to view elements into the data.
  	 * @param cascade whether or not to cause downstream models to also update
  	 */
  def updateModel(): js.Promise[Unit] = js.native
  def updateModel(cascade: Boolean): js.Promise[Unit] = js.native
  /**
  	 * Cause any bindings associated with the given keypath to apply the value in the view to the model. Use this to pull changes made directly to view elements into the data.
  	 * @param keypath
  	 * @param cascade whether or not to cause downstream models to also update
  	 */
  def updateModel(keypath: String): js.Promise[Unit] = js.native
  def updateModel(keypath: String, cascade: Boolean): js.Promise[Unit] = js.native
  
  /** Install one or more plugins on the instance.  */
  def use(plugins: PluginInstance*): Ractive[Ractive[_]] = js.native
}
/* static members */
@JSImport("ractive", "Ractive")
@js.native
object Ractive extends js.Object {
  
  /** The prototype for Context objects. You can use this to add methods and properties to Contexts. */
  val Context: Instantiable0[ContextHelper] = js.native
  
  /** When true, causes Ractive to emit warnings. Defaults to true. */
  var DEBUG: Boolean = js.native
  
  var DEBUG_PROMISES: Boolean = js.native
  
  /** The parent constructor used to create this constructor. */
  var Parent: Static[Ractive[Ractive[_]]] = js.native
  
  /** The Ractive constructor used to create this constructor. */
  var Ractive: Instantiable = js.native
  
  val VERSION: String = js.native
  
  var adaptors: Registry[Adaptor] = js.native
  
  /**
  	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
  	 * as opposed scoped CSS installed on a component constructor.
  	 */
  def addCSS(id: String, css: String): Unit = js.native
  def addCSS(id: String, css: CssFn): Unit = js.native
  
  var components: Registry[Component] = js.native
  
  var decorators: Registry[Decorator[Ractive[Ractive[_]]]] = js.native
  
  /** The registries that are inherited by all instance. */
  var defaults: Registries[Ractive[Ractive[_]]] = js.native
  
  var easings: Registry[Easing] = js.native
  
  /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
  def escapeKey(key: String): String = js.native
  
  var events: Registry[EventPlugin[Ractive[Ractive[_]]]] = js.native
  
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
  
  var helpers: Registry[Helper] = js.native
  
  var interpolators: Registry[Interpolator] = js.native
  
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
  
  var partials: Registry[Partial] = js.native
  
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
  
  /** true if Ractive detects that this environment supports svg. */
  val svg: Boolean = js.native
  
  /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
  def unescapeKey(key: String): String = js.native
  
  def use(args: PluginExtend*): Static[Ractive[Ractive[_]]] = js.native
}
