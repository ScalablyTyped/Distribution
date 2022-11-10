package typings.stampit

import org.scalablytyped.runtime.StringDictionary
import typings.stampit.mod.stampit.Composable
import typings.stampit.mod.stampit.Composer
import typings.stampit.mod.stampit.Descriptor
import typings.stampit.mod.stampit.Initializer
import typings.stampit.mod.stampit.Stamp
import typings.stampit.stampitBooleans.`false`
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stampit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * A function which creates a new `Stamp`s from a list of `Composable`s.
      * @template Obj The type of the object instance being created by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def apply[Obj](composables: Composable*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].apply(composables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    @JSImport("stampit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** A function which creates a new `Stamp`s from a list of `Composable`s. */
    @JSImport("stampit", "default.compose")
    @js.native
    val compose: ComposeMethod = js.native
    
    /**
      * A shortcut method for stampit().composers()
      *
      * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
      */
    inline def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("composers")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    inline def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("composers")(functions.asInstanceOf[js.Any]).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().conf()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def conf[Obj](confs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("conf")(confs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().configuration()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def configuration[Obj](confs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("configuration")(confs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().deepConf()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepConf")(deepConfs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().deepConfiguration()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepConfiguration")(deepConfs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().deepProperties()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepProperties")(deepObjects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().deepProps()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepProps")(deepObjects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().deepStatics()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepStatics")(deepStatics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().init()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    inline def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[S̤t̤a̤m̤p̤]
    inline def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(functions.asInstanceOf[js.Any]).asInstanceOf[S̤t̤a̤m̤p̤]
    
    /**
      * A shortcut method for stampit().initializers()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    inline def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("initializers")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[S̤t̤a̤m̤p̤]
    inline def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("initializers")(functions.asInstanceOf[js.Any]).asInstanceOf[S̤t̤a̤m̤p̤]
    
    /**
      * A shortcut method for stampit().methods()
      *
      * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @template This The type to use for `this` within methods.
      * @param methods Object(s) containing map of method names and bodies for delegation.
      */
    inline def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().properties()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def properties[Obj](objects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("properties")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().propertyDescriptors()
      *
      * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyDescriptors")(descriptors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().props()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def props[Obj](objects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().staticDeepProperties()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticDeepProperties")(deepStatics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().statics()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticProperties")(statics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().staticPropertyDescriptors()
      *
      * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticPropertyDescriptors")(descriptors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /**
      * A shortcut method for stampit().staticProperties()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    inline def statics[Obj](statics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")(statics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
    
    /** the version of the NPM `stampit` package. */
    @JSImport("stampit", "default.version")
    @js.native
    val version: String = js.native
  }
  
  @JSImport("stampit", "compose")
  @js.native
  val compose: ComposeMethod = js.native
  
  inline def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("composers")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  inline def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("composers")(functions.asInstanceOf[js.Any]).asInstanceOf[StampType[Obj]]
  
  inline def conf[Obj](confs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("conf")(confs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def configuration[Obj](confs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("configuration")(confs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepConf")(deepConfs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepConfiguration")(deepConfs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepProperties")(deepObjects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepProps")(deepObjects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepStatics")(deepStatics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[S̤t̤a̤m̤p̤]
  inline def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(functions.asInstanceOf[js.Any]).asInstanceOf[S̤t̤a̤m̤p̤]
  
  inline def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("initializers")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[S̤t̤a̤m̤p̤]
  inline def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = ^.asInstanceOf[js.Dynamic].applyDynamic("initializers")(functions.asInstanceOf[js.Any]).asInstanceOf[S̤t̤a̤m̤p̤]
  
  inline def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def properties[Obj](objects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("properties")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyDescriptors")(descriptors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def props[Obj](objects: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticDeepProperties")(deepStatics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticProperties")(statics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  inline def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticPropertyDescriptors")(descriptors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StampType[Obj]]
  
  @JSImport("stampit", "version")
  @js.native
  val version: String = js.native
  
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
    */
  @js.native
  trait Chainables[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
    
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
  
  /**
    * A function which creates a new `Stamp`s from a list of `Composable`s.
    * @template Obj The type of the object instance being produced by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
    */
  @js.native
  trait ComposeMethod extends StObject {
    
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
  
  /**
    * A factory function to create plain object instances.
    * @template Obj The object type that the `Stamp` will create.
    */
  type FactoryFunction[Obj] = js.Function2[/* options */ js.UndefOr[PropertyMap], /* repeated */ Any, StampObjectType[Obj]]
  
  type MethodMap[This] = StringDictionary[(js.ThisFunction1[/* this */ This, /* repeated */ Any, Any]) | js.Object]
  
  /** @internal A plain old JavaScript object created by a `Stamp`. */
  type Pojo = js.Object
  
  // { [s: string]: any; }
  /** @internal Base type for all `properties`-like metadata. */
  // TODO: discriminate Array
  type PropertyMap = js.Object
  
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    */
  type StampChainables[Obj] = Chainables[StampObjectType[Obj], StampType[Obj]]
  
  /**
    * @internal The type of the object produced by the `Stamp`.
    * @template Original The type (either a `Stamp` or a `ExtendedDescriptor`) to get the object type from.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Original extends / * disallowed types * / bigint | boolean | number | string | symbol ? never : stampit.stampit.stampit.IsADescriptor<Original> extends true ? Original extends stampit.stampit.stampit.ExtendedDescriptor<infer Obj, any> ? Obj : never : unknown extends Original ? Original : Original extends stampit.stampit.StampSignature ? Original extends stampit.stampit.stampit.Stamp<infer Obj> ? Obj extends stampit.stampit.stampit.Stamp<infer Obj> ? Obj : Obj : any : Original extends stampit.stampit.stampit.ExtendedDescriptor<infer Obj, any> ? Obj : Original extends stampit.stampit.Pojo ? Original : never
    }}}
    */
  type StampObjectType[Original] = Original
  
  // { [s: string]: any; }
  /** @internal Signature common to every `Stamp`s. */
  @js.native
  trait StampSignature extends StObject {
    
    def apply(options: Unit, args: Any*): Any = js.native
    def apply(options: PropertyMap, args: Any*): Any = js.native
    
    var compose: ComposeMethod & (Descriptor[Any, Any]) = js.native
  }
  
  /**
    * @internal Extracts the `Stamp` type.
    * @template Original The type to extract the `Stamp` type from.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Original extends [] | bigint ? never : stampit.stampit.stampit.IsADescriptor<Original> extends true ? Original extends stampit.stampit.stampit.ExtendedDescriptor<infer Obj, infer Stamp> ? Stamp : never : unknown extends Original ? stampit.stampit.stampit.Stamp<Original> : Original extends stampit.stampit.StampSignature ? Original : Original extends stampit.stampit.stampit.ExtendedDescriptor<infer Obj, any> ? stampit.stampit.stampit.Stamp<Obj> : Original extends stampit.stampit.Pojo ? stampit.stampit.stampit.Stamp<Original> : never
    }}}
    */
  type StampType[Original] = Stamp[Original]
  
  object stampit {
    
    /** A composable object (either a `Stamp` or a `ExtendedDescriptor`.) */
    type Composable = StampSignature | (ExtendedDescriptor[Any, Any])
    
    /**
      * A function used as `.composers` argument.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
      */
    type Composer[S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.Function1[/* parameters */ ComposerParameters[S̤t̤a̤m̤p̤], Unit | S̤t̤a̤m̤p̤]
    
    /**
      * The parameters received by the current `.composers` function.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
      */
    trait ComposerParameters[S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
      /** The list of composables the `Stamp` was just composed of. */
      var composables: js.Array[Composable]
      
      /** The result of the `Composable`s composition. */
      var stamp: S̤t̤a̤m̤p̤
    }
    object ComposerParameters {
      
      inline def apply[S̤t̤a̤m̤p̤ /* <: StampSignature */](composables: js.Array[Composable], stamp: S̤t̤a̤m̤p̤): ComposerParameters[S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal(composables = composables.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[ComposerParameters[S̤t̤a̤m̤p̤]]
      }
      
      extension [Self <: ComposerParameters[?], S̤t̤a̤m̤p̤ /* <: StampSignature */](x: Self & ComposerParameters[S̤t̤a̤m̤p̤]) {
        
        inline def setComposables(value: js.Array[Composable]): Self = StObject.set(x, "composables", value.asInstanceOf[js.Any])
        
        inline def setComposablesVarargs(value: Composable*): Self = StObject.set(x, "composables", js.Array(value*))
        
        inline def setStamp(value: S̤t̤a̤m̤p̤): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A `Stamp`'s metadata.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
      */
    trait Descriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
      /** An array of functions that will run in sequence while creating a new `Stamp` from a list of `Composable`s. The resulting `Stamp` and the `Composable`s get passed to composers. */
      var composers: js.UndefOr[js.Array[Composer[S̤t̤a̤m̤p̤]]] = js.undefined
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
      var configuration: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
      var deepConfiguration: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of properties that will be added to new object instances by deep property merge. */
      var deepProperties: js.UndefOr[PropertyMap] = js.undefined
      
      /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
      var initializers: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.undefined
      
      /** A set of methods that will be added to the object's delegate prototype. */
      var methods: js.UndefOr[MethodMap[Obj]] = js.undefined
      
      /** A set of properties that will be added to new object instances by assignment. */
      var properties: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of object property descriptors (`PropertyDescriptor`) used for fine-grained control over object property behaviors. */
      var propertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.undefined
      
      /** A set of static properties that will be added to the `Stamp` by deep property merge. */
      var staticDeepProperties: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of static properties that will be copied by assignment to the `Stamp`. */
      var staticProperties: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of object property descriptors (`PropertyDescriptor`) to apply to the `Stamp`. */
      var staticPropertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.undefined
    }
    object Descriptor {
      
      inline def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](): Descriptor[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Descriptor[Obj, S̤t̤a̤m̤p̤]]
      }
      
      extension [Self <: Descriptor[?, ?], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](x: Self & (Descriptor[Obj, S̤t̤a̤m̤p̤])) {
        
        inline def setComposers(value: js.Array[Composer[S̤t̤a̤m̤p̤]]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
        
        inline def setComposersUndefined: Self = StObject.set(x, "composers", js.undefined)
        
        inline def setComposersVarargs(value: Composer[S̤t̤a̤m̤p̤]*): Self = StObject.set(x, "composers", js.Array(value*))
        
        inline def setConfiguration(value: PropertyMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
        
        inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
        
        inline def setDeepConfiguration(value: PropertyMap): Self = StObject.set(x, "deepConfiguration", value.asInstanceOf[js.Any])
        
        inline def setDeepConfigurationUndefined: Self = StObject.set(x, "deepConfiguration", js.undefined)
        
        inline def setDeepProperties(value: PropertyMap): Self = StObject.set(x, "deepProperties", value.asInstanceOf[js.Any])
        
        inline def setDeepPropertiesUndefined: Self = StObject.set(x, "deepProperties", js.undefined)
        
        inline def setInitializers(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = StObject.set(x, "initializers", value.asInstanceOf[js.Any])
        
        inline def setInitializersUndefined: Self = StObject.set(x, "initializers", js.undefined)
        
        inline def setInitializersVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = StObject.set(x, "initializers", js.Array(value*))
        
        inline def setMethods(value: MethodMap[Obj]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        inline def setProperties(value: PropertyMap): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setPropertyDescriptors(value: PropertyDescriptorMap): Self = StObject.set(x, "propertyDescriptors", value.asInstanceOf[js.Any])
        
        inline def setPropertyDescriptorsUndefined: Self = StObject.set(x, "propertyDescriptors", js.undefined)
        
        inline def setStaticDeepProperties(value: PropertyMap): Self = StObject.set(x, "staticDeepProperties", value.asInstanceOf[js.Any])
        
        inline def setStaticDeepPropertiesUndefined: Self = StObject.set(x, "staticDeepProperties", js.undefined)
        
        inline def setStaticProperties(value: PropertyMap): Self = StObject.set(x, "staticProperties", value.asInstanceOf[js.Any])
        
        inline def setStaticPropertiesUndefined: Self = StObject.set(x, "staticProperties", js.undefined)
        
        inline def setStaticPropertyDescriptors(value: PropertyDescriptorMap): Self = StObject.set(x, "staticPropertyDescriptors", value.asInstanceOf[js.Any])
        
        inline def setStaticPropertyDescriptorsUndefined: Self = StObject.set(x, "staticPropertyDescriptors", js.undefined)
      }
    }
    
    /**
      * A `stampit`'s metadata.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
      */
    trait ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */]
      extends StObject
         with Descriptor[Obj, S̤t̤a̤m̤p̤] {
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
      var conf: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
      var deepConf: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of properties that will be added to new object instances by deep property merge. */
      var deepProps: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of static properties that will be added to the `Stamp` by deep property merge. */
      var deepStatics: js.UndefOr[PropertyMap] = js.undefined
      
      /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
      var init: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.undefined
      
      // TODO: Add description
      var name: js.UndefOr[String] = js.undefined
      
      /** A set of properties that will be added to new object instances by assignment. */
      var props: js.UndefOr[PropertyMap] = js.undefined
      
      /** A set of static properties that will be copied by assignment to the `Stamp`. */
      var statics: js.UndefOr[PropertyMap] = js.undefined
    }
    object ExtendedDescriptor {
      
      inline def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](): ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤]]
      }
      
      extension [Self <: ExtendedDescriptor[?, ?], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](x: Self & (ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤])) {
        
        inline def setConf(value: PropertyMap): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
        
        inline def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
        
        inline def setDeepConf(value: PropertyMap): Self = StObject.set(x, "deepConf", value.asInstanceOf[js.Any])
        
        inline def setDeepConfUndefined: Self = StObject.set(x, "deepConf", js.undefined)
        
        inline def setDeepProps(value: PropertyMap): Self = StObject.set(x, "deepProps", value.asInstanceOf[js.Any])
        
        inline def setDeepPropsUndefined: Self = StObject.set(x, "deepProps", js.undefined)
        
        inline def setDeepStatics(value: PropertyMap): Self = StObject.set(x, "deepStatics", value.asInstanceOf[js.Any])
        
        inline def setDeepStaticsUndefined: Self = StObject.set(x, "deepStatics", js.undefined)
        
        inline def setInit(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
        
        inline def setInitVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = StObject.set(x, "init", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setProps(value: PropertyMap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
        
        inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
        
        inline def setStatics(value: PropertyMap): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
        
        inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      }
    }
    
    /**
      * A function used as `.initializers` argument.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
      */
    type Initializer[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.ThisFunction2[
        /* this */ Obj, 
        /*_propertyMap*/ /* options */ Any, 
        /* context */ InitializerContext[Obj, S̤t̤a̤m̤p̤], 
        Unit | Obj
      ]
    
    /**
      * The `Initializer` function context.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
      */
    trait InitializerContext[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
      /** An array of the arguments passed into the `Stamp`, including the options argument. */
      // ! above description from the specification is obscure
      var args: js.Array[Any]
      
      /** The object instance being produced by the `Stamp`. If the initializer returns a value other than `undefined`, it replaces the instance. */
      var instance: Obj
      
      /** A reference to the `Stamp` producing the instance. */
      var stamp: S̤t̤a̤m̤p̤
    }
    object InitializerContext {
      
      inline def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](args: js.Array[Any], instance: Obj, stamp: S̤t̤a̤m̤p̤): InitializerContext[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[InitializerContext[Obj, S̤t̤a̤m̤p̤]]
      }
      
      extension [Self <: InitializerContext[?, ?], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](x: Self & (InitializerContext[Obj, S̤t̤a̤m̤p̤])) {
        
        inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setInstance(value: Obj): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        inline def setStamp(value: S̤t̤a̤m̤p̤): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @internal Checks that a type is a ExtendedDescriptor (except `any` and `unknown`).
      * @template Type A type to check if a ExtendedDescriptor.
      */
    // TODO: Improve test by checking the type of common keys
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      unknown extends Type ? keyof Type extends never ? false : keyof Type extends infer K ? K extends keyof stampit.stampit.stampit.ExtendedDescriptor<unknown, stampit.stampit.stampit.Stamp<unknown>> ? true : false : false : false
      }}}
      */
    type IsADescriptor[Type] = `false`
    
    /**
      * A factory function to create plain object instances.
      *
      * It also has a `.compose()` method which is a copy of the `ComposeMethod` function and a `.compose` accessor to its `Descriptor`.
      * @template Obj The object type that the `Stamp` will create.
      */
    @js.native
    trait Stamp[Obj]
      extends FactoryFunction[Obj]
         with Chainables[StampObjectType[Obj], StampType[Obj]]
         with StampSignature {
      
      /* InferMemberOverrides */
      override def apply(arg1: /* options */ js.UndefOr[PropertyMap], arg2: /* repeated */ Any): StampObjectType[Obj] = js.native
      
      /**
        * A function which creates a new `Stamp`s from a list of `Composable`s.
        * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
        */
      @JSName("compose")
      var compose_Stamp: ComposeMethod & (Descriptor[StampObjectType[Obj], Stamp[StampObjectType[Obj]]]) = js.native
      
      def create(options: Unit, args: Any*): StampObjectType[Obj] = js.native
      /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
      def create(options: PropertyMap, args: Any*): StampObjectType[Obj] = js.native
      /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
      @JSName("create")
      var create_Original: FactoryFunction[Obj] = js.native
    }
  }
}
