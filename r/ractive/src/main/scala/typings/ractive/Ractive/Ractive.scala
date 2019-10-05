package typings.ractive.Ractive

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.Anon_Compare
import typings.ractive.Anon_Live
import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ractive extends js.Object {
  // Properties
  // Since 0.7.1
  var container: typings.ractive.Ractive.Ractive = js.native
   // TODO: Ractive?
  var nodes: js.Object = js.native
  // Since 0.7.1
  var parent: typings.ractive.Ractive.Ractive = js.native
  var partials: js.Object = js.native
   // TODO: Ractive?
  // Since 0.7.1
  var root: typings.ractive.Ractive.Ractive = js.native
   // TODO: Ractive?
  var transitions: js.Object = js.native
  def add(keypath: String): Promise = js.native
  def add(keypath: String, number: Double): Promise = js.native
  def animate(keypath: String, value: js.Any): AnimationPromise = js.native
  def animate(keypath: String, value: js.Any, options: AnimateOptions): AnimationPromise = js.native
  def animate(map: js.Object): AnimationPromise = js.native
  def animate(map: js.Object, options: AnimateOptions): AnimationPromise = js.native
  def detach(): DocumentFragment = js.native
  def find(selector: String): HTMLElement = js.native
  // live default false
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def findAll(selector: String, options: Anon_Live): js.Array[HTMLElement] = js.native
  // live default false
  def findAllComponents(name: String): js.Array[typings.ractive.Ractive.Ractive] = js.native
  def findAllComponents(name: String, options: Anon_Live): js.Array[typings.ractive.Ractive.Ractive] = js.native
  // TODO: maybe exist, in that case it is undocumented
  // findAllComponents(): Ractive[]
  def findComponent(): typings.ractive.Ractive.Ractive = js.native
  def findComponent(name: String): typings.ractive.Ractive.Ractive = js.native
  // Since 0.7.1
  def findContainer(name: String): typings.ractive.Ractive.Ractive = js.native
   // TODO: Ractive?
  // Since 0.7.1
  def findParent(name: String): typings.ractive.Ractive.Ractive = js.native
   // TODO: Ractive?
  def fire(eventName: String, args: js.Any*): Unit = js.native
  def get(): js.Object = js.native
   // TODO: void?
  def get(keypath: String): js.Any = js.native
   // TODO: Object?
  // target - Node or String or jQuery (see Valid selectors)
  // anchor - Node or String or jQuery
  def insert(target: js.Any): Unit = js.native
  def insert(target: js.Any, anchor: js.Any): Unit = js.native
   // TODO: void?
  def merge(keypath: String, value: js.Array[_]): Promise = js.native
  def merge(keypath: String, value: js.Array[_], options: Anon_Compare): Promise = js.native
  // callback context Ractive
  def observe(
    keypath: String,
    callback: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* keypath */ String, Unit]
  ): Observe = js.native
  def observe(
    keypath: String,
    callback: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* keypath */ String, Unit],
    options: ObserveOptions
  ): Observe = js.native
  def observe(map: js.Object): Observe = js.native
  def observe(map: js.Object, options: ObserveOptions): Observe = js.native
  // Since 0.7.1
  def observeOnce(
    keypath: String,
    callback: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* keypath */ String, Unit]
  ): Observe = js.native
  def observeOnce(
    keypath: String,
    callback: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* keypath */ String, Unit],
    options: ObserveOnceOptions
  ): Observe = js.native
  // handler context Ractive
  def off(): typings.ractive.Ractive.Ractive = js.native
  def off(eventName: String): typings.ractive.Ractive.Ractive = js.native
  def off(
    eventName: String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */ js.Any, _]
  ): typings.ractive.Ractive.Ractive = js.native
  def on(
    eventName: String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */ js.Any, _]
  ): Observe = js.native
  def on(
    map: StringDictionary[js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */ js.Any, _]]
  ): Observe = js.native
  // Since 0.7.1
  def once(
    eventName: String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */ js.Any, _]
  ): Observe = js.native
  // Since 0.5.5
  def pop(keypath: String): Promise = js.native
  // Since 0.5.5
  def push(keypath: String, value: js.Any): Promise = js.native
  // target - Node or String or jQuery (see Valid selectors)
  def render(target: js.Any): Unit = js.native
   // TODO: void?
  // Default {}
  def reset(): Promise = js.native
  def reset(data: js.Object): Promise = js.native
  // Since 0.7.1
  def resetPartial(name: String, partial: js.Any): Promise = js.native
  // Since 0.5.5
  // TODO: undocumented, mentioned in ractive change log
  // https://github.com/ractivejs/docs.ractivejs.org/issues/188
  def resetTemplate(): Unit = js.native
   // TODO: void?
  def set(keypath: String, value: js.Any): Promise = js.native
  def set(map: js.Object): Promise = js.native
  // Since 0.5.5
  def shift(keypath: String): Promise = js.native
  // Since 0.5.5
  def splice(keypath: String, index: Double, removeCount: Double, add: js.Any*): Promise = js.native
  def subtract(keypath: String): Promise = js.native
  def subtract(keypath: String, number: Double): Promise = js.native
  def teardown(): Promise = js.native
  def toHTML(): String = js.native
  def toggle(keypath: String): Promise = js.native
  // Since 0.6.0
  def unrender(): Unit = js.native
   // TODO: void?
  // Since 0.5.5
  def unshift(keypath: String, value: js.Any): Promise = js.native
  def update(): Promise = js.native
  def update(keypath: String): Promise = js.native
  /**
  	     * Update out of sync two-way bindings
  	     * @param keypath A string
  	     * @param cascade A boolean with default false
  	     */
  def updateModel(): Promise = js.native
  def updateModel(keypath: String): Promise = js.native
  def updateModel(keypath: String, cascade: Boolean): Promise = js.native
}

