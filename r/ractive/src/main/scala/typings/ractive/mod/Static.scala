package typings.ractive.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ractive.anon.Instantiable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static[T /* <: Ractive[T] */]
  extends StObject
     with Instantiable0[T]
     with Instantiable1[/* opts */ InitOpts[T], T] {
  
  /** The parent constructor used to create this constructor. */
  var Parent: Static[Ractive[Ractive[Any]]] = js.native
  
  /** The Ractive constructor used to create this constructor. */
  var Ractive: Instantiable = js.native
  
  var adaptors: Registry[Adaptor] = js.native
  
  var components: Registry[Component] = js.native
  
  var css: js.UndefOr[String | CssFn] = js.native
  
  var decorators: Registry[Decorator[T]] = js.native
  
  /** The registries that are inherited by all instance. */
  var defaults: Registries[T] & ValueMap = js.native
  
  var easings: Registry[Easing] = js.native
  
  var events: Registry[EventPlugin[T]] = js.native
  
  /** Create a new component with this constructor as a starting point. */
  def extend(): Static[T] = js.native
  def extend[A /* <: ExtendOpts[T] & ValueMap */, U /* <: js.Array[ExtendOpts[T] & ValueMap] */](
    opts: A,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param more because its type U is not an array type */ more: U
  ): Static[T & (Merge[A, U, ExtendOpts[Ractive[Ractive[Any]]]])] = js.native
  
  /** Create a new component with this constructor as a starting point using the given constructor. */
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[U] & U] = js.native
  def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[U] & U] = js.native
  
  def getContext(nodeOrQuery: String): ContextHelper = js.native
  /** Get a Context for the given node or selector. */
  def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
  
  var helpers: Registry[Helper] = js.native
  
  var interpolators: Registry[Interpolator] = js.native
  
  /** @returns true if the given object is an instance of this constructor */
  def isInstance(obj: Any): Boolean = js.native
  
  var partials: Registry[Partial] = js.native
  
  /** Get the value at the given keypath from the Ractive shared store. */
  def sharedGet[U](keypath: String): U = js.native
  def sharedGet[U](keypath: String, opts: GetOpts): U = js.native
  
  /** Set the given map of values in the Ractive shared store. */
  def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
  def sharedSet(map: ValueMap, opts: SetOpts): js.Promise[Unit] = js.native
  /** Set the given keypath in the Ractive shared store to the given value. */
  def sharedSet[U](keypath: String, value: U): js.Promise[U] = js.native
  def sharedSet[U](keypath: String, value: U, opts: SetOpts): js.Promise[U] = js.native
  
  /** Get the css data for this constructor at the given keypath. */
  def styleGet[U](keypath: String): U = js.native
  def styleGet[U](keypath: String, opts: GetOpts): U = js.native
  
  /** Set the given map of values in the css data for this constructor. */
  def styleSet(map: ValueMap): js.Promise[Unit] = js.native
  def styleSet(map: ValueMap, opts: StyleSetOpts): js.Promise[Unit] = js.native
  /** Set the css data for this constructor at the given keypath to the given value. */
  def styleSet[U](keypath: String, value: U): js.Promise[U] = js.native
  def styleSet[U](keypath: String, value: U, opts: StyleSetOpts): js.Promise[U] = js.native
  
  var transitions: Registry[Transition] = js.native
  
  /** Install one or more plugins on the component.  */
  def use(plugins: Plugin*): Static[Ractive[Ractive[Any]]] = js.native
}
