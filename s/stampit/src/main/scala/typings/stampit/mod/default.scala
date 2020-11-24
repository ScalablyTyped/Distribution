package typings.stampit.mod

import typings.stampit.mod.stampit.Composable
import typings.stampit.mod.stampit.Composer
import typings.stampit.mod.stampit.Initializer
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stampit", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * A function which creates a new `Stamp`s from a list of `Composable`s.
    * @template Obj The type of the object instance being created by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[Obj](composables: Composable*): StampType[Obj] = js.native
  
  /** A function which creates a new `Stamp`s from a list of `Composable`s. */
  val compose: ComposeMethod = js.native
  
  /**
    * A shortcut method for stampit().composers()
    *
    * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
    */
  def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
  def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().conf()
    *
    * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param confs The object(s) containing metadata properties
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def conf[Obj](confs: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().configuration()
    *
    * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param confs The object(s) containing metadata properties
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def configuration[Obj](confs: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().deepConf()
    *
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepConfs The object(s) containing metadata properties
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().deepConfiguration()
    *
    * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepConfs The object(s) containing metadata properties
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().deepProperties()
    *
    * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepObjects The object(s) to deeply merge for each new object
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().deepProps()
    *
    * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepObjects The object(s) to deeply merge for each new object
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().deepStatics()
    *
    * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepStatics The object(s) containing static properties to be merged
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().init()
    *
    * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param functions Initializer functions used to create private data and privileged methods
    */
  def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = js.native
  def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = js.native
  
  /**
    * A shortcut method for stampit().initializers()
    *
    * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param functions Initializer functions used to create private data and privileged methods
    */
  def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = js.native
  def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = js.native
  
  /**
    * A shortcut method for stampit().methods()
    *
    * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @template This The type to use for `this` within methods.
    * @param methods Object(s) containing map of method names and bodies for delegation.
    */
  def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().properties()
    *
    * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param objects Object(s) to shallow assign for each new object.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def properties[Obj](objects: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().propertyDescriptors()
    *
    * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param descriptors
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().props()
    *
    * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param objects Object(s) to shallow assign for each new object.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def props[Obj](objects: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().staticDeepProperties()
    *
    * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param deepStatics The object(s) containing static properties to be merged
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().statics()
    *
    * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().staticPropertyDescriptors()
    *
    * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param descriptors
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
  
  /**
    * A shortcut method for stampit().staticProperties()
    *
    * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def statics[Obj](statics: PropertyMap*): StampType[Obj] = js.native
  
  /** the version of the NPM `stampit` package. */
  val version: String = js.native
}
