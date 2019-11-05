package typings.ractive.ractiveMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ractive", "ContextHelper")
@js.native
class ContextHelper () extends js.Object {
  /** The source component for a bubbled event Context, if any. */
  var component: js.UndefOr[Ractive[Ractive[_]]] = js.native
  /** A map of currently attached decorator handles, by name, that are associated with the element, if any, that this Context is associated with. */
  var decorators: Registry[DecoratorHandle] = js.native
  /** The event associated with this Context, if any. */
  var event: js.UndefOr[Event] = js.native
  /** The element associated with this Context, if any. */
  var node: js.UndefOr[HTMLElement] = js.native
  /** The event associated with this Context, if any. */
  var original: js.UndefOr[Event] = js.native
  /** The Ractive instance associated with this Context. */
  var ractive: Ractive[Ractive[_]] = js.native
  /** Add to the number at the given keypath
  	 * @param keypath a Context-relative keypath to a number
  	 * @param amount the amount to add to the target number - defaults to 1
  	 */
  def add(keypath: String): js.Promise[Unit] = js.native
  def add(keypath: String, amount: Double): js.Promise[Unit] = js.native
  /**
  	 * Animate the value at the given keypath from its current value to the given value.
  	 * @param keypath a Context-relative keypath to the value
  	 * @param value the target value
  	 * @param opts
  	 */
  def animate(keypath: String, value: js.Any): AnimatePromise = js.native
  def animate(keypath: String, value: js.Any, opts: AnimateOpts): AnimatePromise = js.native
  /**
  	 * Retrieve the value associated with the current Context.
  	 * @param opts
  	 */
  def get(): js.Any = js.native
  /**
  	 * Retrieve the value at the given keypath.
  	 * @param keypath a Context-relative keypath to the value
  	 * @param opts
  	 */
  def get(keypath: String): js.Any = js.native
  def get(keypath: String, opts: GetOpts): js.Any = js.native
  def get(opts: GetOpts): js.Any = js.native
  /**
  	 * Retrieve the value associated with the twoway binding of the element e.g. .value in <input value="{{.value}}" />.
  	 */
  def getBinding(): js.Any = js.native
  /**
  	 * Resolve the keypath associated with the twoway binding of the element e.g. '.value' in <input value="{{.value}}" />.
  	 * @param ractive the instance against which to resolve the path
  	 */
  def getBindingPath(): String = js.native
  def getBindingPath(ractive: Ractive[Ractive[_]]): String = js.native
  /**
  	 * Retrieve the Context that is the parent of this one e.g. for {{#with foo}} from the <div> in {{#with foo}}{{#with bar}}<div />{{/with}}{{/with}}.
  	 * @param crossComponentBoundary whether or not to cross a component boundary when getting the parent context
  	 */
  def getParent(): ContextHelper = js.native
  def getParent(crossComponentBoundary: Boolean): ContextHelper = js.native
  /**
  	 * Determine whether or not the element associated with the Context as a Ractive listener (on-event) for the given event.
  	 * @param event the event for which to check
  	 * @param bubble whether or not check parent elements for a listener if the current element does not have one - defaults to false
  	 */
  def hasListener(event: String): Boolean = js.native
  def hasListener(event: String, bubble: Boolean): Boolean = js.native
  /**
  	 * Determine whether or not there is a twoway binding associated with the element associated with this Context.
  	 */
  def isBound(): Boolean = js.native
  /**
  	 * Create a link to the given source keypath at the given target keypath, similar to a symlink in filesystems. This allows safely referencing the same data at two places in the same instance or across instances if given a target instance. Cross-instance links are also known as mappings.
  	 * @param source the Context-relative keypath to the source of the link
  	 * @param dest the Context-relative keypath for the destination
  	 * @param opts
  	 */
  def link(source: String, dest: String): js.Promise[Unit] = js.native
  def link(source: String, dest: String, opts: LinkOpts): js.Promise[Unit] = js.native
  /**
  	 * Attach a delegation-aware DOM event listener to the element associated with this Context.
  	 * @param event the name of DOM event for which to listen
  	 * @param callback the callback to call when the given event is fired
  	 */
  def listen(event: String, callback: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Unit]): ListenerHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called when the value at that Context-relative keypath mutates.
  	 * @param keypath the keypath(s) to observe - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observe(keypath: String, callback: ObserverArrayCallback[Ractive[Ractive[_]]]): ObserverHandle = js.native
  def observe(keypath: String, callback: ObserverArrayCallback[Ractive[Ractive[_]]], opts: ObserverArrayOpts): ObserverHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called when the value at that Context-relative keypath mutates.
  	 * @param keypath the keypath(s) to observe - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observe(keypath: String, callback: ObserverCallback[Ractive[Ractive[_]]]): ObserverHandle = js.native
  def observe(keypath: String, callback: ObserverCallback[Ractive[Ractive[_]]], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Create a set of observers from the given map.
  	 * @param map Context-relative keypath -> callback pairs to observe
  	 * @returns an observer handle that controls all of the created observers
  	 */
  def observe(
    map: StringDictionary[
      ObserverArrayCallback[Ractive[Ractive[_]]] | ObserverCallback[Ractive[Ractive[_]]]
    ]
  ): ObserverHandle = js.native
  def observe(map: StringDictionary[ObserverArrayCallback[Ractive[Ractive[_]]]], opts: ObserverArrayOpts): ObserverHandle = js.native
  def observe(map: StringDictionary[ObserverCallback[Ractive[Ractive[_]]]], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called the first time the value at that Context-relative keypath mutates. After that call, the observer will be automatically cancelled.
  	 * @param keypath the keypath(s) to observer - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observeOnce(keypath: String, callback: ObserverArrayCallback[Ractive[Ractive[_]]]): ObserverHandle = js.native
  def observeOnce(keypath: String, callback: ObserverArrayCallback[Ractive[Ractive[_]]], opts: ObserverArrayOpts): ObserverHandle = js.native
  /**
  	 * Create an observer at the given keypath that will be called the first time the value at that Context-relative keypath mutates. After that call, the observer will be automatically cancelled.
  	 * @param keypath the keypath(s) to observer - multiple keypaths can be separated by a space
  	 * @param callback
  	 * @param opts
  	 */
  def observeOnce(keypath: String, callback: ObserverCallback[Ractive[Ractive[_]]]): ObserverHandle = js.native
  def observeOnce(keypath: String, callback: ObserverCallback[Ractive[Ractive[_]]], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Create a set of observers from the given map. After the first observed value from any of the set mutates, all of the observers will be cancelled.
  	 * @param map Context-relative keypath -> callback pairs to observe
  	 * @returns an observer handle that controls all of the created observersj
  	 */
  def observeOnce(
    map: StringDictionary[
      ObserverArrayCallback[Ractive[Ractive[_]]] | ObserverCallback[Ractive[Ractive[_]]]
    ]
  ): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverArrayCallback[Ractive[Ractive[_]]]], opts: ObserverArrayOpts): ObserverHandle = js.native
  def observeOnce(map: StringDictionary[ObserverCallback[Ractive[Ractive[_]]]], opts: ObserverOpts): ObserverHandle = js.native
  /**
  	 * Pop a value off the array at the given Context-relative keypath.
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
  	 * Manually call a Ractive event handler on the element associated with this Context e.g. to trigger the 'event' handler <div on-event="..." />, use context.raise('event');
  	 * @param event the name of the event to trigger
  	 * @param context the optional context to supply to the event handler
  	 * @param args any additional args to supply to the event handler
  	 */
  def raise(event: String): Unit = js.native
  def raise(event: String, context: js.Object, args: js.Any*): Unit = js.native
  def raise(event: String, context: ContextHelper, args: js.Any*): Unit = js.native
  /**
  	 * Get the source keypath for the given Context-relative keypath if it is a link.
  	 * @param keypath
  	 * @param opts
  	 */
  def readLink(keypath: String): ReadLinkResult = js.native
  def readLink(keypath: String, opts: ReadLinkOpts): ReadLinkResult = js.native
  /**
  	 * Resolve the given Context-relative keypath to a root keypath, optionally in the given instance. Note that some keypaths cannot be resolved to root keypaths.
  	 * @param keypath @default '.' relative keypath
  	 * @param ractive target instance in which to resolve the keypath
  	 */
  def resolve(): String = js.native
  def resolve(keypath: String): String = js.native
  def resolve(keypath: String, ractive: Ractive[Ractive[_]]): String = js.native
  /**
  	 * Reverse the array at the given Context-relative keypath.
  	 * @param keypath keypath to the targret array
  	 */
  def reverse(keypath: String): ArraySplicePromise = js.native
  /**
  	 * Set a value at the given Context-relative keypath. If any intermediate levels do not exist in the data, they will be created as appriate - objects for string keys and arrays for numeric keys.
  	 * @param keypath
  	 * @param value the value to set
  	 * @param opts
  	 */
  def set(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  def set(keypath: String, value: js.Any, opts: SetOpts): js.Promise[Unit] = js.native
  /**
  	 * Set a set of values from the given map. All of the values will be set before any DOM changes are propagated, but the values will still be set in object order in the data, which can cause multiple invalidations on observers, bindings, and template nodes.j
  	 * @param map Context-relative keypath -> value pairs to be set
  	 */
  def set(map: ValueMap): js.Promise[Unit] = js.native
  def set(map: ValueMap, opts: SetOpts): js.Promise[Unit] = js.native
  /**
  	 * Set the value associated with any twoway binding associated with this Context e.g. .value in <input value="{{.value}}" />.
  	 * @param value the target value
  	 */
  def setBinding(value: js.Any): js.Promise[Unit] = js.native
  /**
  	 * Shift a value off of the array at the given Context-relative keypath.
  	 * @param keypath
  	 */
  def shift(keypath: String): ArrayPopPromise = js.native
  /**
  	 * Sort the array at the given Context-relative keypath.
  	 * @param keypath
  	 */
  def sort(keypath: String): ArraySplicePromise = js.native
  /**
  	 * Splice the array at the given Context-relative keypath.
  	 * @param keypath
  	 * @param index index at which to start splicing
  	 * @param drop number of items to drop starting at the given index
  	 * @param add items to add at the given index
  	 */
  def splice(keypath: String, index: Double, drop: Double, add: js.Any*): ArraySplicePromise = js.native
  /**
  	 * Subtract an amount from the number at the given Context-relative keypath.
  	 * @param keypath
  	 * @param amount the amount to subtrat from the value - defaults to 1
  	 */
  def subtract(keypath: String): js.Promise[Unit] = js.native
  def subtract(keypath: String, amount: Double): js.Promise[Unit] = js.native
  /**
  	 * Toggle the value at the given Context-relative keypath. If it is truthy, set it to false, otherwise, set it to true.
  	 * @param keypath
  	 */
  def toggle(keypath: String): js.Promise[Unit] = js.native
  /**
  	 * Remove the link at the given Context-relative keypath.
  	 * @param keypath
  	 */
  def unlink(keypath: String): js.Promise[Unit] = js.native
  /**
  	 * Remove a DOM listener in a delegation-aware way.
  	 * @param event name of the event for which to stop listening
  	 * @param callback the callback listener to remove
  	 */
  def unlisten(event: String, callback: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Unit]): Unit = js.native
  /**
  	 * Unshift the given value onto the array at the given Context-relative keypath. If there is nothing at the given keypath (undefined), then an array will ne created.
  	 * @param keypath
  	 * @param value
  	 */
  def unshift(keypath: String, value: js.Any): ArrayPushPromise = js.native
  /**
  	 * Invalidate the model associated with the current Context. This will cause Ractive to check for any changes that may have happened directly to the data without going through a set or array method.
  	 * @param opts
  	 */
  def update(): js.Promise[Unit] = js.native
  /**
  	 * Invalidate the model at the given Context-relative keypath. This will cause Ractive to check for any changes that may have happened directly to the data without going through a set or array method.
  	 * @param keypath
  	 * @param opts
  	 */
  def update(keypath: String): js.Promise[Unit] = js.native
  def update(keypath: String, opts: UpdateOpts): js.Promise[Unit] = js.native
  def update(opts: UpdateOpts): js.Promise[Unit] = js.native
  /**
  	 * Cause any bindings associated with this Context to apply the value in the view to the model. Use this to pull changes made directly to view elements into the data.
  	 * @param cascade whether or not to cause downstream models to also update
  	 */
  def updateModel(): js.Promise[Unit] = js.native
  def updateModel(cascade: Boolean): js.Promise[Unit] = js.native
  /**
  	 * Cause any bindings associated with the given Context-relative keypath to apply the value in the view to the model. Use this to pull changes made directly to view elements into the data.
  	 * @param keypath
  	 * @param cascade whether or not to cause downstream models to also update
  	 */
  def updateModel(keypath: String): js.Promise[Unit] = js.native
  def updateModel(keypath: String, cascade: Boolean): js.Promise[Unit] = js.native
}

