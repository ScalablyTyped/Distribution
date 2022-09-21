package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.anon.Instantiable
import typings.ractive.anon.ReadonlyArrayExtendOptsan
import typings.ractive.ractiveBooleans.`false`
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ractive", "Ractive")
@js.native
open class Ractive[T /* <: Ractive[T] */] ()
  extends StObject
     with PropertyOpts[T] {
  def this(opts: InitOpts[T]) = this()
  
  /** When overriding methods, the original method is available using this._super. */
  def _super(args: Any*): Any = js.native
  
  /** Add to the number at the given keypath
  	 * @param keypath a keypath to a number
  	 * @param amount the amount to add to the target number - defaults to 1
  	 */
  def add(keypath: String): js.Promise[Double] = js.native
  def add(keypath: String, amount: Double): js.Promise[Double] = js.native
  
  /**
  	 * Animate the value at the given keypath from its current value to the given value.
  	 * @param keypath a keypath to the value
  	 * @param value the target value
  	 * @param opts
  	 */
  def animate(keypath: String, value: Any): AnimatePromise = js.native
  def animate(keypath: String, value: Any, opts: AnimateOpts): AnimatePromise = js.native
  
  /**
  	 * Attach a child instance (component or not) to this instance. Use anchors (<#anchor/>) like component tags along with the target option to achieve unmanaged components. If an anchor is not used, the child will be responsible for rendering itself, but it will get a parent instance.
  	 * @param child the instance to attach to this instance
  	 * @param opts
  	 */
  def attachChild(child: Ractive[Ractive[Any]]): js.Promise[Unit] = js.native
  def attachChild(child: Ractive[Ractive[Any]], opts: AttachOpts): js.Promise[Unit] = js.native
  
  /** A list of children attached to this instance. */
  var children: Children = js.native
  
  /**
  	 * Create a new computation at the given path. This is the runtime equivalent of adding computed entries during initialization.
  	 * @param keypath the keypath at which the computation will exist. This can include wildcards.
  	 * @param computation the computation descriptor to install at the given keypath
  	 */
  def compute(keypath: String, computation: Computation[T]): js.Promise[Unit] = js.native
  
  /** If this instance is in a yielded template, the instance that is immediately above it. */
  var container: js.UndefOr[Ractive[Ractive[Any]]] = js.native
  
  /**
  	 * Detach this instance from the DOM.
  	 */
  def detach(): DocumentFragment = js.native
  
  /**
  	 * Detach a child instance that was previously attached with attachChild from this instance.
  	 * @param child the instance to detach
  	 */
  def detachChild(child: Ractive[Ractive[Any]]): js.Promise[Unit] = js.native
  
  val event: js.UndefOr[ContextHelper | Event | Any] = js.native
  
  /**
  	 * Find an element in the DOM controlled by this instance.
  	 * @param selector query used to find the first matching element
  	 * @param opts
  	 */
  def find[U /* <: Element */](selector: String): U = js.native
  def find[U /* <: Element */](selector: String, opts: FindOpts): U = js.native
  
  /**
  	 * Find all of the elements in the DOM controlled by this instance that match the given selector.
  	 * @param selector query used to match elements
  	 * @param opts
  	 */
  def findAll[U /* <: Element */](selector: String): js.Array[U] = js.native
  def findAll[U /* <: Element */](selector: String, opts: FindOpts): js.Array[U] = js.native
  
  /**
  	 * Find all of the components belonging to this instance.
  	 * @param opts
  	 */
  def findAllComponents(): js.Array[Ractive[Ractive[Any]]] = js.native
  def findAllComponents(opts: FindOpts): js.Array[Ractive[Ractive[Any]]] = js.native
  /**
  	 * Find all of the components with the given name belonging to this instance.
  	 * @param name
  	 * @param opts
  	 */
  def findAllComponents[U /* <: Ractive[Ractive[Any]] */](name: String): js.Array[U] = js.native
  def findAllComponents[U /* <: Ractive[Ractive[Any]] */](name: String, opts: FindOpts): js.Array[U] = js.native
  
  /**
  	 * Find the first component belonging to this instance.
  	 * @param opts
  	 */
  def findComponent(): Ractive[Ractive[Any]] = js.native
  def findComponent(opts: FindOpts): Ractive[Ractive[Any]] = js.native
  /**
  	 * Find the first component with the given name belonging to this instance.
  	 * @param name
  	 * @param opts
  	 */
  def findComponent[U /* <: Ractive[Ractive[Any]] */](name: String): U = js.native
  def findComponent[U /* <: Ractive[Ractive[Any]] */](name: String, opts: FindOpts): U = js.native
  
  /**
  	 * Find the immediate ancestor instance with the given name.
  	 * @param name
  	 */
  def findContainer(name: String): Ractive[Ractive[Any]] = js.native
  
  /**
  	 * Find the owning ancestor instance with the given name. For yielded instances, this will be the instance that yielded the template containing the component.
  	 * @param name
  	 */
  def findParent(name: String): Ractive[Ractive[Any]] = js.native
  
  def fire(name: String, ctx: js.Object, args: Any*): Boolean = js.native
  def fire(name: String, ctx: Unit, args: Any*): Boolean = js.native
  /**
  	 * Fire a Ractive instance event.
  	 * @param name the name of the event
  	 * @param ctx an optional context or object to be merged with a context
  	 * @param args additional args to pass to the event listeners
  	 */
  def fire(name: String, ctx: ContextHelper, args: Any*): Boolean = js.native
  
  /**
  	 * Retrieve the root object of this instance's data.
  	 * @param opts
  	 */
  def get[U](): U = js.native
  /**
  	 * Retrieve the value at the given keypath in this instance's data.
  	 * @param keypath a keypath to the value
  	 * @param opts
  	 */
  def get[U](keypath: String): U = js.native
  def get[U](keypath: String, opts: GetOpts): U = js.native
  def get[U](opts: GetOpts): U = js.native
  
  /**
  	 * Get a Context object for the given node or node that matches the given query.
  	 * @param query
  	 */
  def getContext(): ContextHelper = js.native
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  
  /**
  	 * Get a Context object for the current plugin's location in the template. This is only available in decorator and custom event plugins.
  	 * @param query
  	 */
  def getLocalContext(): ContextHelper = js.native
  
  /**
  	 * Render this instance into the given target, optionally using the given anchor. If the instance is already attached to the DOM, it will first be detached.
  	 * @param target
  	 * @param anchor
  	 */
  def insert(target: Target): Unit = js.native
  def insert(target: Target, anchor: Target): Unit = js.native
  
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
  	 * @returns an observer handle that controls all of the created observers
  	 */
  def observeOnce(map: StringDictionary[ObserverArrayCallback[T] | ObserverCallback[T]]): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverArrayCallback[T]], opts: ObserverArrayOpts): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverCallback[T]], opts: ObserverOpts): ObserverHandle = js.native
  
  /**
  	 * Stop listening to instance events. If no name is supplied, all events will have their listeners removed. If no handler is supplied, all listeners for the given event will be removed.
  	 * @param event
  	 * @param handler
  	 */
  def off(): Ractive[Ractive[Any]] = js.native
  def off(event: String): Ractive[Ractive[Any]] = js.native
  def off(event: String, handler: ListenerCallback[T]): Ractive[Ractive[Any]] = js.native
  def off(event: Unit, handler: ListenerCallback[T]): Ractive[Ractive[Any]] = js.native
  
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
  var parent: js.UndefOr[Ractive[Ractive[Any]]] = js.native
  
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
  def push(keypath: String, values: Any*): ArrayPushPromise = js.native
  
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
  	 * @param keypath keypath to the target array
  	 */
  def reverse(keypath: String): ArraySplicePromise = js.native
  
  /** If this instance is a component, the instance at the root of the template. */
  var root: Ractive[Ractive[Any]] = js.native
  
  /**
  	 * Set a set of values from the given map. All of the values will be set before any DOM changes are propagated, but the values will still be set in object order in the data, which can cause multiple invalidations on observers, bindings, and template nodes.j
  	 * @param map keypath -> value pairs to be set
  	 */
  def set(map: ValueMap): js.Promise[Unit] = js.native
  def set(map: ValueMap, opts: SetOpts): js.Promise[Unit] = js.native
  /**
  	 * Set a value at the given keypath. If any intermediate levels do not exist in the data, they will be created as appriate - objects for string keys and arrays for numeric keys.
  	 * @param keypath
  	 * @param value the value to set
  	 * @param opts
  	 */
  def set[U](keypath: String, value: U): js.Promise[U] = js.native
  def set[U](keypath: String, value: U, opts: SetOpts): js.Promise[U] = js.native
  
  /**
  	 * Shift a value off of the array at the given keypath.
  	 * @param keypath
  	 */
  def shift(keypath: String): ArrayPopPromise = js.native
  
  /**
  	 * Sort the array at the given keypath.
  	 * @param keypath
  	 * @param compareFunction  A function that defines the sort order.
  	 */
  def sort[Item](keypath: String): ArraySplicePromise = js.native
  def sort[Item](keypath: String, compareFunction: js.Function2[/* a */ Item, /* b */ Item, Double]): ArraySplicePromise = js.native
  
  /**
  	 * Splice the array at the given keypath.
  	 * @param keypath
  	 * @param index index at which to start splicing
  	 * @param drop number of items to drop starting at the given index
  	 * @param add items to add at the given index
  	 */
  def splice(keypath: String, index: Double, drop: Double, add: Any*): ArraySplicePromise = js.native
  
  /**
  	 * Subtract an amount from the number at the given keypath.
  	 * @param keypath
  	 * @param amount the amount to subtrat from the value - defaults to 1
  	 */
  def subtract(keypath: String): js.Promise[Double] = js.native
  def subtract(keypath: String, amount: Double): js.Promise[Double] = js.native
  
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
  def toggle(keypath: String): js.Promise[Boolean] = js.native
  
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
  def unshift(keypath: String, value: Any): ArrayPushPromise = js.native
  
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
  def use(plugins: Plugin*): Ractive[Ractive[Any]] = js.native
}
/* static members */
object Ractive {
  
  @JSImport("ractive", "Ractive")
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof ContextHelper` */
  @JSImport("ractive", "Ractive.Context")
  @js.native
  open class Context () extends ContextHelper
  
  /** When true, causes Ractive to emit warnings. Defaults to true. */
  @JSImport("ractive", "Ractive.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "Ractive.DEBUG_PROMISES")
  @js.native
  def DEBUG_PROMISES: Boolean = js.native
  inline def DEBUG_PROMISES_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_PROMISES")(x.asInstanceOf[js.Any])
  
  /** The parent constructor used to create this constructor. */
  @JSImport("ractive", "Ractive.Parent")
  @js.native
  def Parent: Static[Ractive[Ractive[Any]]] = js.native
  inline def Parent_=(x: Static[Ractive[Ractive[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parent")(x.asInstanceOf[js.Any])
  
  /** The Ractive constructor used to create this constructor. */
  @JSImport("ractive", "Ractive.Ractive")
  @js.native
  def Ractive: Instantiable = js.native
  inline def Ractive_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ractive")(x.asInstanceOf[js.Any])
  
  /** The build version of Ractive. */
  @JSImport("ractive", "Ractive.VERSION")
  @js.native
  val VERSION: String = js.native
  
  /** Setting this to false will prevent Ractive from printing a welcome console message when the first instance is created. */
  @JSImport("ractive", "Ractive.WELCOME_MESSAGE")
  @js.native
  def WELCOME_MESSAGE: js.UndefOr[`false`] = js.native
  inline def WELCOME_MESSAGE_=(x: js.UndefOr[`false`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WELCOME_MESSAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "Ractive.adaptors")
  @js.native
  def adaptors: Registry[Adaptor] = js.native
  inline def adaptors_=(x: Registry[Adaptor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(x.asInstanceOf[js.Any])
  
  /**
  	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
  	 * as opposed scoped CSS installed on a component constructor.
  	 */
  inline def addCSS(id: String, css: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCSS(id: String, css: CssFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ractive", "Ractive.components")
  @js.native
  def components: Registry[Component] = js.native
  inline def components_=(x: Registry[Component]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "Ractive.decorators")
  @js.native
  def decorators: Registry[Decorator[Ractive[Ractive[Any]]]] = js.native
  inline def decorators_=(x: Registry[Decorator[Ractive[Ractive[Any]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
  
  /** The registries that are inherited by all instance. */
  @JSImport("ractive", "Ractive.defaults")
  @js.native
  def defaults: Registries[Ractive[Ractive[Any]]] = js.native
  inline def defaults_=(x: Registries[Ractive[Ractive[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "Ractive.easings")
  @js.native
  def easings: Registry[Easing] = js.native
  inline def easings_=(x: Registry[Easing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easings")(x.asInstanceOf[js.Any])
  
  /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
  inline def escapeKey(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ractive", "Ractive.events")
  @js.native
  def events: Registry[EventPlugin[Ractive[Ractive[Any]]]] = js.native
  inline def events_=(x: Registry[EventPlugin[Ractive[Ractive[Any]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /** Create a new component with this constructor as a starting point. */
  inline def extend(): Static[Ractive[Ractive[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Static[Ractive[Ractive[Any]]]]
  inline def extend[T /* <: ExtendOpts[Any] & ValueMap */, U /* <: ReadonlyArrayExtendOptsan */](
    opts: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param more because its type U is not an array type */ more: U
  ): Static[Ractive[Ractive[Any]] & (Merge[T, U, ExtendOpts[Ractive[Ractive[Any]]]])] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(opts.asInstanceOf[js.Any], more.asInstanceOf[js.Any])).asInstanceOf[Static[Ractive[Ractive[Any]] & (Merge[T, U, ExtendOpts[Ractive[Ractive[Any]]]])]]
  
  /** Create a new component with this constructor as a starting point using the given constructor. */
  inline def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[U] & U] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendWith")(c.asInstanceOf[js.Any]).asInstanceOf[Static[Ractive[U] & U]]
  inline def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[U] & U] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendWith")(c.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Static[Ractive[U] & U]]
  
  /** Retrieve the CSS string for all loaded components. */
  inline def getCSS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")().asInstanceOf[String]
  
  inline def getContext(nodeOrQuery: String): ContextHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(nodeOrQuery.asInstanceOf[js.Any]).asInstanceOf[ContextHelper]
  /** Get a Context for the given node or selector. */
  inline def getContext(nodeOrQuery: HTMLElement): ContextHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(nodeOrQuery.asInstanceOf[js.Any]).asInstanceOf[ContextHelper]
  
  /** Check to see if CSS with the given id has already been added */
  inline def hasCSS(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSS")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ractive", "Ractive.helpers")
  @js.native
  def helpers: Registry[Helper] = js.native
  inline def helpers_=(x: Registry[Helper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helpers")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "Ractive.interpolators")
  @js.native
  def interpolators: Registry[Interpolator] = js.native
  inline def interpolators_=(x: Registry[Interpolator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(x.asInstanceOf[js.Any])
  
  /** @returns true if the given object is an instance of this constructor */
  inline def isInstance(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Safely join the given keys into a keypath. */
  inline def joinKeys(keys: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinKeys")(keys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  /**
  	 * Initialize a macro function.
  	 * @param macro
  	 * @param options
  	 */
  inline def `macro`(`macro`: MacroFn): Macro = ^.asInstanceOf[js.Dynamic].applyDynamic("macro")(`macro`.asInstanceOf[js.Any]).asInstanceOf[Macro]
  inline def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = (^.asInstanceOf[js.Dynamic].applyDynamic("macro")(`macro`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Macro]
  
  /**
  	 * Parse the given template string into a template.j
  	 */
  inline def parse(template: String): ParsedTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any]).asInstanceOf[ParsedTemplate]
  inline def parse(template: String, opts: ParseOpts): ParsedTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplate]
  
  @JSImport("ractive", "Ractive.partials")
  @js.native
  def partials: Registry[Partial] = js.native
  inline def partials_=(x: Registry[Partial]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partials")(x.asInstanceOf[js.Any])
  
  /** Render component styles in their own style tags rather than in a single shared tag - defaults to false */
  @JSImport("ractive", "Ractive.perComponentStyleElements")
  @js.native
  def perComponentStyleElements: Boolean = js.native
  inline def perComponentStyleElements_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perComponentStyleElements")(x.asInstanceOf[js.Any])
  
  /** Get the value at the given keypath from the Ractive shared store. */
  inline def sharedGet[U](keypath: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedGet")(keypath.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /** Set the given map of values in the Ractive shared store. */
  inline def sharedSet(map: ValueMap): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedSet")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /** Set the given keypath in the Ractive shared store to the given value. */
  inline def sharedSet[U](keypath: String, value: U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("sharedSet")(keypath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  /** Split the given keypath into its constituent keys. */
  inline def splitKeypath(keypath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitKeypath")(keypath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /** Get the css data for this constructor at the given keypath. */
  inline def styleGet[U](keypath: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("styleGet")(keypath.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /** Set the given map of values in the css data for this constructor. */
  inline def styleSet(map: ValueMap): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleSet")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /** Set the css data for this constructor at the given keypath to the given value. */
  inline def styleSet[U](keypath: String, value: U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleSet")(keypath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  /** true if Ractive detects that this environment supports svg. */
  @JSImport("ractive", "Ractive.svg")
  @js.native
  val svg: Boolean = js.native
  
  /**
  	 * The current operation promise is available to things like observers and decorators using Ractive.tick,
  	 * which will return undefined if there is not currently an operation in progress.
  	 */
  @JSImport("ractive", "Ractive.tick")
  @js.native
  val tick: js.UndefOr[js.Promise[Unit]] = js.native
  
  @JSImport("ractive", "Ractive.transitions")
  @js.native
  def transitions: Registry[Transition] = js.native
  inline def transitions_=(x: Registry[Transition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitions")(x.asInstanceOf[js.Any])
  
  /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
  inline def unescapeKey(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def use(args: Plugin*): Static[Ractive[Ractive[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Static[Ractive[Ractive[Any]]]]
}
