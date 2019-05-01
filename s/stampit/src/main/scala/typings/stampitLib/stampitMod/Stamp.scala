package typings
package stampitLib.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory function that will produce new objects using the
  * prototypes that are passed in or composed.
  */
@js.native
trait Stamp
  extends Composable
     with StampitComposable {
  /**
    * Stamp metadata/composer function
    */
  @JSName("compose")
  var compose_Original: Descriptor = js.native
  /**
    * Invokes the stamp and returns a new object instance.
    * @param state Properties you wish to set on the new objects.
    * @param encloseArgs The remaining arguments are passed to all .enclose() functions.
    * WARNING Avoid using two different .enclose() functions that expect different arguments.
    * .enclose() functions that take arguments should not be considered safe to compose
    * with other .enclose() functions that also take arguments. Taking arguments with
    * an .enclose() function is an anti-pattern that should be avoided, when possible.
    * @return A new object composed of the Stamps and prototypes provided.
    */
  def apply(): js.Any = js.native
  def apply(state: js.Object, encloseArgs: js.Any*): js.Any = js.native
  /** Create a new stamp based on this descriptor */
  /**
    * Stamp metadata/composer function
    */
  def compose(composables: Composable*): Stamp = js.native
  /**
    * Shallowly assign properties of Stamp arbitrary metadata and add them to
    * a new stamp and any future Stamp it composes. Creates and returns a new
    * Stamp. Chainable.
    * @param confs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def conf(confs: js.Object*): Stamp = js.native
  /**
    * Shallowly assign properties of Stamp arbitrary metadata and add them to
    * a new stamp and any future Stamp it composes. Creates and returns a new
    * Stamp. Chainable.
    * @param confs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def configuration(confs: js.Object*): Stamp = js.native
  /**
    * Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance.
    * @param state Properties you wish to set on the new objects.
    * @param encloseArgs The remaining arguments are passed to all .enclose() functions.
    * WARNING Avoid using two different .enclose() functions that expect different arguments.
    * .enclose() functions that take arguments should not be considered safe to compose
    * with other .enclose() functions that also take arguments. Taking arguments with
    * an .enclose() function is an anti-pattern that should be avoided, when possible.
    * @return A new object composed of the Stamps and prototypes provided.
    */
  def create(): js.Any = js.native
  def create(state: js.Object, encloseArgs: js.Any*): js.Any = js.native
  /**
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new
    * Stamp and any future Stamp it composes. Creates and returns a new Stamp.
    * Chainable.
    * @param deepConfs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def deepConf(deepConfs: js.Object*): Stamp = js.native
  /**
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new
    * Stamp and any future Stamp it composes. Creates and returns a new Stamp.
    * Chainable.
    * @param deepConfs The object(s) containing metadata properties
    * @returns A new Stamp
    */
  def deepConfiguration(deepConfs: js.Object*): Stamp = js.native
  /**
    * Take a variable number of objects and deeply merge them to any future
    * created instance of the Stamp. Creates and returns a new Stamp.
    * Chainable.
    * @param deepObjects The object(s) to deeply merge for each new object
    * @returns A new Stamp
    */
  def deepProperties(deepObjects: js.Object*): Stamp = js.native
  /**
    * Take a variable number of objects and deeply merge them to any future
    * created instance of the Stamp. Creates and returns a new Stamp.
    * Chainable.
    * @param deepObjects The object(s) to deeply merge for each new object
    * @returns A new Stamp
    */
  def deepProps(deepObjects: js.Object*): Stamp = js.native
  /**
    * Deeply merge a variable number of objects and add them to a new stamp and
    * any future stamp it composes. Creates and returns a new Stamp. Chainable.
    * @param deepStatics The object(s) containing static properties to be
    * merged
    * @returns A new stamp
    */
  def deepStatics(deepStatics: js.Object*): Stamp = js.native
  /**
    * @deprecated Use .init() instead.
    */
  def enclose(functions: (Init | js.Object)*): Stamp = js.native
  /**
    * Take in a variable number of functions and add them to the enclose
    * prototype as initializers.
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def init(functions: Init*): Stamp = js.native
  /**
    * Take in a variable number of functions and add them to the enclose
    * prototype as initializers.
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def init(functions: js.Array[Init]): Stamp = js.native
  /**
    * Take in a variable number of functions and add them to the enclose
    * prototype as initializers.
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def initializers(functions: Init*): Stamp = js.native
  /**
    * Take in a variable number of functions and add them to the enclose
    * prototype as initializers.
    * @param functions Initializer functions used to create private data and
    * privileged methods
    * @returns A new stamp
    */
  def initializers(functions: js.Array[Init]): Stamp = js.native
  /**
    * Add methods to the methods prototype.  Creates and returns new Stamp. Chainable.
    * @param methods Object(s) containing map of method names and bodies for delegation.
    * @return A new Stamp.
    */
  def methods(methods: js.Object*): Stamp = js.native
  /**
    * Take a variable number of objects and shallow assign them to any future
    * created instance of the Stamp. Creates and returns new Stamp. Chainable.
    * @param objects Object(s) to shallow assign for each new object.
    * @return A new Stamp.
    */
  def properties(objects: js.Object*): Stamp = js.native
  /**
    * Apply ES5 property descriptors to object instances created by the new
    * Stamp returned by the function and any future Stamp it composes. Creates
    * and returns a new stamp. Chainable.
    * @param descriptors
    * @returns A new Stamp
    */
  def propertyDescriptors(descriptors: js.Object*): Stamp = js.native
  /**
    * Take a variable number of objects and shallow assign them to any future
    * created instance of the Stamp. Creates and returns new Stamp. Chainable.
    * @param objects Object(s) to shallow assign for each new object.
    * @return A new Stamp.
    */
  def props(objects: js.Object*): Stamp = js.native
  /**
    * Take n objects and add them to the state prototype. Creates and returns new Stamp. Chainable.
    * @param states Object(s) containing map of property names and values to clone for each new object.
    * @return A new Stamp.
    */
  def refs(states: js.Object*): Stamp = js.native
  /**
    * Deeply merge a variable number of objects and add them to a new stamp and
    * any future stamp it composes. Creates and returns a new Stamp. Chainable.
    * @param deepStatics The object(s) containing static properties to be
    * merged
    * @returns A new stamp
    */
  def staticDeepProperties(deepStatics: js.Object*): Stamp = js.native
  /**
    * Take n objects and add them to a new stamp and any future stamp it composes with.
    * Creates and returns new Stamp. Chainable.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    * @return A new Stamp.
    */
  def staticProperties(statics: js.Object*): Stamp = js.native
  /**
    * Apply ES5 property descriptors to a Stamp and any future Stamp it
    * composes. Creates and returns a new stamp. Chainable.
    * @param descriptors
    * @returns A new Stamp
    */
  def staticPropertyDescriptors(descriptors: js.Object*): Stamp = js.native
  /**
    * Take n objects and add them to a new stamp and any future stamp it composes with.
    * Creates and returns new Stamp. Chainable.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    * @return A new Stamp.
    */
  def statics(statics: js.Object*): Stamp = js.native
}

