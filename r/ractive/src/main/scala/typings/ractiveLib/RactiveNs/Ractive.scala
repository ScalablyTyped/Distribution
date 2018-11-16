package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ractive extends js.Object {
  // Properties
  // Since 0.7.1
  var container: Ractive = js.native
   // TODO: Ractive?
  var nodes: js.Object = js.native
  // Since 0.7.1
  var parent: Ractive = js.native
  var partials: js.Object = js.native
   // TODO: Ractive?
  // Since 0.7.1
  var root: Ractive = js.native
   // TODO: Ractive?
  var transitions: js.Object = js.native
  def add(keypath: java.lang.String): Promise = js.native
  def add(keypath: java.lang.String, number: scala.Double): Promise = js.native
  def animate(keypath: java.lang.String, value: js.Any): AnimationPromise = js.native
  def animate(keypath: java.lang.String, value: js.Any, options: AnimateOptions): AnimationPromise = js.native
  def animate(map: js.Object): AnimationPromise = js.native
  def animate(map: js.Object, options: AnimateOptions): AnimationPromise = js.native
  def detach(): stdLib.DocumentFragment = js.native
  def find(selector: java.lang.String): stdLib.HTMLElement = js.native
  // live default false
  def findAll(selector: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  // live default false
  def findAll(selector: java.lang.String, options: ractiveLib.Anon_Live): js.Array[stdLib.HTMLElement] = js.native
  // live default false
  def findAllComponents(name: java.lang.String): js.Array[Ractive] = js.native
  // live default false
  def findAllComponents(name: java.lang.String, options: ractiveLib.Anon_Live): js.Array[Ractive] = js.native
  // TODO: maybe exist, in that case it is undocumented
  // findAllComponents(): Ractive[]
  def findComponent(): Ractive = js.native
  // TODO: maybe exist, in that case it is undocumented
  // findAllComponents(): Ractive[]
  def findComponent(name: java.lang.String): Ractive = js.native
  // Since 0.7.1
  def findContainer(name: java.lang.String): Ractive = js.native
   // TODO: Ractive?
  // Since 0.7.1
  def findParent(name: java.lang.String): Ractive = js.native
   // TODO: Ractive?
  def fire(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def get(): js.Object = js.native
   // TODO: void?
  def get(keypath: java.lang.String): js.Any = js.native
   // TODO: Object?
  // target - Node or String or jQuery (see Valid selectors)
  // anchor - Node or String or jQuery
  def insert(target: js.Any): scala.Unit = js.native
   // TODO: Object?
  // target - Node or String or jQuery (see Valid selectors)
  // anchor - Node or String or jQuery
  def insert(target: js.Any, anchor: js.Any): scala.Unit = js.native
   // TODO: void?
  def merge(keypath: java.lang.String, value: js.Array[_]): Promise = js.native
   // TODO: void?
  def merge(keypath: java.lang.String, value: js.Array[_], options: ractiveLib.Anon_Compare): Promise = js.native
  // callback context Ractive
  def observe(
    keypath: java.lang.String,
    callback: js.Function3[
      /* newValue */ js.Any, 
      /* oldValue */ js.Any, 
      /* keypath */ java.lang.String, 
      scala.Unit
    ]
  ): Observe = js.native
  // callback context Ractive
  def observe(
    keypath: java.lang.String,
    callback: js.Function3[
      /* newValue */ js.Any, 
      /* oldValue */ js.Any, 
      /* keypath */ java.lang.String, 
      scala.Unit
    ],
    options: ObserveOptions
  ): Observe = js.native
  def observe(map: js.Object): Observe = js.native
  def observe(map: js.Object, options: ObserveOptions): Observe = js.native
  // Since 0.7.1
  def observeOnce(
    keypath: java.lang.String,
    callback: js.Function3[
      /* newValue */ js.Any, 
      /* oldValue */ js.Any, 
      /* keypath */ java.lang.String, 
      scala.Unit
    ]
  ): Observe = js.native
  // Since 0.7.1
  def observeOnce(
    keypath: java.lang.String,
    callback: js.Function3[
      /* newValue */ js.Any, 
      /* oldValue */ js.Any, 
      /* keypath */ java.lang.String, 
      scala.Unit
    ],
    options: ObserveOnceOptions
  ): Observe = js.native
  // handler context Ractive
  def off(): Ractive = js.native
  // handler context Ractive
  def off(eventName: java.lang.String): Ractive = js.native
  // handler context Ractive
  def off(
    eventName: java.lang.String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */js.Any, _]
  ): Ractive = js.native
  def on(
    eventName: java.lang.String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */js.Any, _]
  ): Observe = js.native
  def on(
    map: ScalablyTyped.runtime.StringDictionary[js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */js.Any, _]]
  ): Observe = js.native
  // Since 0.7.1
  def once(
    eventName: java.lang.String,
    handler: js.Function2[/* event */ js.UndefOr[Event | js.Any], /* repeated */js.Any, _]
  ): Observe = js.native
  // Since 0.5.5
  def pop(keypath: java.lang.String): Promise = js.native
  // Since 0.5.5
  def push(keypath: java.lang.String, value: js.Any): Promise = js.native
  // target - Node or String or jQuery (see Valid selectors)
  def render(target: js.Any): scala.Unit = js.native
   // TODO: void?
  // Default {}
  def reset(): Promise = js.native
   // TODO: void?
  // Default {}
  def reset(data: js.Object): Promise = js.native
  // Since 0.7.1
  def resetPartial(name: java.lang.String, partial: js.Any): Promise = js.native
  // Since 0.5.5
  // TODO: undocumented, mentioned in ractive change log
  // https://github.com/ractivejs/docs.ractivejs.org/issues/188
  def resetTemplate(): scala.Unit = js.native
   // TODO: void?
  def set(keypath: java.lang.String, value: js.Any): Promise = js.native
  def set(map: js.Object): Promise = js.native
  // Since 0.5.5
  def shift(keypath: java.lang.String): Promise = js.native
  // Since 0.5.5
  def splice(keypath: java.lang.String, index: scala.Double, removeCount: scala.Double, add: js.Any*): Promise = js.native
  def subtract(keypath: java.lang.String): Promise = js.native
  def subtract(keypath: java.lang.String, number: scala.Double): Promise = js.native
  def teardown(): Promise = js.native
  def toHTML(): java.lang.String = js.native
  def toggle(keypath: java.lang.String): Promise = js.native
  // Since 0.6.0
  def unrender(): scala.Unit = js.native
   // TODO: void?
  // Since 0.5.5
  def unshift(keypath: java.lang.String, value: js.Any): Promise = js.native
  def update(): Promise = js.native
  def update(keypath: java.lang.String): Promise = js.native
  /**
  	     * Update out of sync two-way bindings
  	     * @param keypath A string
  	     * @param cascade A boolean with default false
  	     */
  def updateModel(): Promise = js.native
  /**
  	     * Update out of sync two-way bindings
  	     * @param keypath A string
  	     * @param cascade A boolean with default false
  	     */
  def updateModel(keypath: java.lang.String): Promise = js.native
  /**
  	     * Update out of sync two-way bindings
  	     * @param keypath A string
  	     * @param cascade A boolean with default false
  	     */
  def updateModel(keypath: java.lang.String, cascade: scala.Boolean): Promise = js.native
}

