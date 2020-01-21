package typings.stampit.mod

import typings.stampit.mod.stampit.Composer
import typings.stampit.mod.stampit.Initializer
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal Chainables `Stamp` additionnal methods
  * @template Obj The object type that the `Stamp` will create.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
@js.native
trait Chainables[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /**
    * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
    * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
    */
  def composers(functions: Composer[S̤t̤a̤m̤p̤]*): S̤t̤a̤m̤p̤ = js.native
  def composers(functions: js.Array[Composer[S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
  /**
    * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param confs The object(s) containing metadata properties.
    */
  def conf(confs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param confs The object(s) containing metadata properties.
    */
  def configuration(confs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param deepConfs The object(s) containing metadata properties.
    */
  def deepConf(deepConfs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param deepConfs The object(s) containing metadata properties.
    */
  def deepConfiguration(deepConfs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp. **Chainable**.
    * @param deepObjects The object(s) to deeply merge for each new object.
    */
  def deepProperties(deepObjects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp. **Chainable**.
    * @param deepObjects The object(s) to deeply merge for each new object.
    */
  def deepProps(deepObjects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param deepStatics The object(s) containing static properties to be merged.
    */
  def deepStatics(deepStatics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
    * @param functions Initializer functions used to create private data and privileged methods.
    */
  def init(functions: (Initializer[Obj, S̤t̤a̤m̤p̤])*): S̤t̤a̤m̤p̤ = js.native
  def init(functions: js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
    * @param functions Initializer functions used to create private data and privileged methods.
    */
  def initializers(functions: (Initializer[Obj, S̤t̤a̤m̤p̤])*): S̤t̤a̤m̤p̤ = js.native
  def initializers(functions: js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
  /**
    * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
    * @template This The type to use for `this` within methods.
    * @param methods Object(s) containing map of method names and bodies for delegation.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def methods[This](methods: MethodMap[This]*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
    * @param objects Object(s) to shallow assign for each new object.
    */
  def properties(objects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
    * @param descriptors
    */
  def propertyDescriptors(descriptors: PropertyDescriptorMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
    * @param objects Object(s) to shallow assign for each new object.
    */
  def props(objects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @param deepStatics The object(s) containing static properties to be merged.
    */
  def staticDeepProperties(deepStatics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    */
  def staticProperties(statics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
    * @param descriptors
    */
  def staticPropertyDescriptors(descriptors: PropertyDescriptorMap*): S̤t̤a̤m̤p̤ = js.native
  /**
    * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    */
  def statics(statics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
}

