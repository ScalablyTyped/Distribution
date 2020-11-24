package typings.ractive.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ractive.anon.Instantiable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static[T /* <: Ractive[T] */]
  extends Instantiable0[T]
     with Instantiable1[/* opts */ InitOpts[T], T] {
  
  /** The parent constructor used to create this constructor. */
  var Parent: Static[Ractive[Ractive[_]]] = js.native
  
  /** The Ractive constructor used to create this constructor. */
  var Ractive: Instantiable = js.native
  
  var adaptors: Registry[Adaptor] = js.native
  
  var components: Registry[Component] = js.native
  
  var css: String | CssFn = js.native
  
  var decorators: Registry[Decorator[T]] = js.native
  
  /** The registries that are inherited by all instance. */
  var defaults: Registries[T] = js.native
  
  var easings: Registry[Easing] = js.native
  
  var events: Registry[EventPlugin[T]] = js.native
  
  /** Create a new component with this constructor as a starting point. */
  def extend[U, V /* <: ExtendOpts[T] */](): Static[Ractive[T with U]] = js.native
  def extend[U, V /* <: ExtendOpts[T] */](opts: V): Static[Ractive[T with U]] = js.native
  
  /** Create a new component with this constuuctor as a starting point using the given constructor. */
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[T with U]] = js.native
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[T with U]] = js.native
  
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  /** Get a Context for the given node or selector. */
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  
  var helpers: Registry[Helper] = js.native
  
  var interpolators: Registry[Interpolator] = js.native
  
  /** @returns true if the given object is an instance of this constructor */
  def isInstance(obj: js.Any): Boolean = js.native
  
  var partials: Registry[Partial] = js.native
  
  /** Get the value at the given keypath from the Ractive shared store. */
  def sharedGet(keypath: String): js.Any = js.native
  def sharedGet(keypath: String, opts: GetOpts): js.Any = js.native
  
  /** Set the given keypath in the Ractive shared store to the given value. */
  def sharedSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  def sharedSet(keypath: String, value: js.Any, opts: SetOpts): js.Promise[Unit] = js.native
  /** Set the given map of values in the Ractive shared store. */
  def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
  def sharedSet(map: ValueMap, opts: SetOpts): js.Promise[Unit] = js.native
  
  /** Get the css data for this constructor at the given keypath. */
  def styleGet(keypath: String): js.Any = js.native
  def styleGet(keypath: String, opts: GetOpts): js.Any = js.native
  
  /** Set the css data for this constructor at the given keypath to the given value. */
  def styleSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  def styleSet(keypath: String, value: js.Any, opts: StyleSetOpts): js.Promise[Unit] = js.native
  /** Set the given map of values in the css data for this constructor. */
  def styleSet(map: ValueMap): js.Promise[Unit] = js.native
  def styleSet(map: ValueMap, opts: StyleSetOpts): js.Promise[Unit] = js.native
  
  /** Install one or more plugins on the component.  */
  def use(plugins: PluginExtend*): Static[Ractive[Ractive[_]]] = js.native
}
