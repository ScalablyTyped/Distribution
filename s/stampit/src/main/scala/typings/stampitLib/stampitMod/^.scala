package typings
package stampitLib.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Return a factory (aka Stamp) function that will produce new objects using the
    * prototypes that are passed in or composed.
    * @param options Stampit options object containing refs, methods,
    * init, props, statics, configurations, and property descriptors.
    */
  def apply(composables: StampitComposable*): Stamp = js.native
  /**
    * Take two or more Composables and combine them to produce a new Stamp.
    * Combining overrides properties with last-in priority.
    * @param composables Composable objects used to create the stamp.
    * @return A new Stamp made of all the given composables.
    */
  def compose(composables: Composable*): Stamp = js.native
  /**
    * A shortcut method for stampit().conf()
    * @param confs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def conf(confs: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().configuration()
    * @param confs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def configuration(confs: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().deepConf()
    * @param deepConfs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def deepConf(deepConfs: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().deepConfiguration()
    * @param deepConfs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def deepConfiguration(deepConfs: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().deepProperties()
    * @param deepObjects The object(s) to deeply merge for each new object
    * @returns A new Stamp
    */
  def deepProperties(deepObjects: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().deepProps()
    * @param deepObjects The object(s) to deeply merge for each new object
    * @returns A new Stamp
    */
  def deepProps(deepObjects: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().deepStatics()
    * @param deepStatics The object(s) containing static properties to be
    * merged
    * @returns A new stamp
    */
  def deepStatics(deepStatics: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().init()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def init(functions: Init*): Stamp = js.native
  /**
    * A shortcut method for stampit().init()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def init(functions: js.Array[Init]): Stamp = js.native
  /**
    * A shortcut method for stampit().initializers()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def initializers(functions: Init*): Stamp = js.native
  /**
    * A shortcut method for stampit().initializers()
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def initializers(functions: js.Array[Init]): Stamp = js.native
  /**
    * A shortcut methods for stampit().methods()
    * @param methods Object(s) containing map of method names and bodies for delegation.
    * @return A new Stamp.
    */
  def methods(methods: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().properties()
    * @param objects Object(s) to shallow assign for each new object.
    * @return A new Stamp.
    */
  def properties(objects: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().propertyDescriptors()
    * @param descriptors
    * @returns A new Stamp
    */
  def propertyDescriptors(descriptors: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().props()
    * @param objects Object(s) to shallow assign for each new object.
    * @return A new Stamp.
    */
  def props(objects: js.Object*): Stamp = js.native
  /**
    * A shortcut methods for stampit().refs()
    * @param states Object(s) containing map of property names and values to clone for each new object.
    * @return A new Stamp.
    */
  def refs(states: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().staticDeepProperties()
    * @param deepStatics The object(s) containing static properties to be
    * merged
    * @returns A new stamp
    */
  def staticDeepProperties(deepStatics: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().staticProperties()
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    * @return A new Stamp.
    */
  def staticProperties(statics: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().staticPropertyDescriptors()
    * @param descriptors
    * @returns A new Stamp
    */
  def staticPropertyDescriptors(descriptors: js.Object*): Stamp = js.native
  /**
    * A shortcut method for stampit().statics()
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    * @return A new Stamp.
    */
  def statics(statics: js.Object*): Stamp = js.native
}

