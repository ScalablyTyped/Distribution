package typings.rosie

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rosie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rosie", "Factory")
  @js.native
  open class Factory[T] ()
    extends StObject
       with IFactory[T]
  @JSImport("rosie", "Factory")
  @js.native
  def Factory: IFactoryStatic = js.native
  inline def Factory_=(x: IFactoryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Factory")(x.asInstanceOf[js.Any])
  
  @js.native
  trait IFactory[T] extends StObject {
    
    /**
      * Sets a post-processor callback that will receive built objects and the
      * options for the build just before they are returned from the #build
      * function.
      *
      * @param {function(object, ?object)} callback
      * @return {Factory}
      */
    def after(functionArg: js.Function2[/* obj */ T, /* opts */ js.UndefOr[Any], Unit]): IFactory[T] = js.native
    
    /**
      * Define an attribute on this factory. Attributes can optionally define a
      * default value, either as a value (e.g. a string or number) or as a builder
      * function. For example:
      *
      *   // no default value for age
      *   Factory.define('Person').attr('age')
      *
      *   // static default value for age
      *   Factory.define('Person').attr('age', 18)
      *
      *   // dynamic default value for age
      *   Factory.define('Person').attr('age', function() {
      *      return Math.random() * 100;
      *   })
      *
      * Attributes with dynamic default values can depend on options or other
      * attributes:
      *
      *   Factory.define('Person').attr('age', ['name'], function(name) {
      *     return name === 'Brian' ? 30 : 18;
      *   });
      *
      * By default if the consumer of your factory provides a value for an
      * attribute your builder function will not be called. You can override this
      * behavior by declaring that your attribute depends on itself:
      *
      *   Factory.define('Person').attr('spouse', ['spouse'], function(spouse) {
      *     return Factory.build('Person', spouse);
      *   });
      *
      * As in the example above, this can be a useful way to fill in
      * partially-specified child objects.
      *
      * @param {string} attr
      * @param {Array.<string>=} | any dependenciesOrValue
      * @param any
      * @return {Factory}
      */
    def attr[K /* <: /* keyof T */ String */](
      name: K,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Array[String],
      generatorFunction: js.Function1[
          /* repeated */ Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */](
      name: K,
      generatorFunction: js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */, D /* <: /* keyof T */ String */](name: K, dependencies: js.Array[D], generatorFunction: Any): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */, D1 /* <: /* keyof T */ String */, D2 /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Tuple2[D1, D2],
      generatorFunction: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */, D1 /* <: /* keyof T */ String */, D2 /* <: /* keyof T */ String */, D3 /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Tuple3[D1, D2, D3],
      generatorFunction: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */, D1 /* <: /* keyof T */ String */, D2 /* <: /* keyof T */ String */, D3 /* <: /* keyof T */ String */, D4 /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Tuple4[D1, D2, D3, D4],
      generatorFunction: js.Function4[
          /* import warning: importer.ImportType#apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D4] */ /* value4 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    def attr[K /* <: /* keyof T */ String */, D1 /* <: /* keyof T */ String */, D2 /* <: /* keyof T */ String */, D3 /* <: /* keyof T */ String */, D4 /* <: /* keyof T */ String */, D5 /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Tuple5[D1, D2, D3, D4, D5],
      generatorFunction: js.Function5[
          /* import warning: importer.ImportType#apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D4] */ /* value4 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[D5] */ /* value5 */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    @JSName("attr")
    def attr_KD[K /* <: /* keyof T */ String */, D /* <: /* keyof T */ String */](
      name: K,
      dependencies: js.Array[D],
      generatorFunction: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[D] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): IFactory[T] = js.native
    
    /**
      * Builds a plain object containing values for each of the declared
      * attributes. The result of this is the same as the result when using #build
      * when there is no constructor registered.
      *
      * @param {object=} attributes
      * @param {object=} options
      * @return {object}
      */
    def attributes(): T = js.native
    def attributes(
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T]
    ): T = js.native
    def attributes(
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T],
      options: Any
    ): T = js.native
    def attributes(attributes: Unit, options: Any): T = js.native
    
    /**
      * Convenience function for defining a set of attributes on this object as
      * builder functions or static values. If you need to specify dependencies,
      * use #attr instead.
      *
      * For example:
      *
      *   Factory.define('Person').attrs({
      *     name: 'Michael',
      *     age: function() { return Math.random() * 100; }
      *   });
      *
      * @param {object} attributes
      * @return {Factory}
      */
    def attrs[Keys /* <: /* keyof T */ String */](
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Keys ]: T[K] | (opts : any | undefined): T[K]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[Any]
    ): IFactory[T] = js.native
    
    /**
      * Builds objects by getting values for all attributes and optionally passing
      * the result to a constructor function.
      *
      * @param {object=} attributes
      * @param {object=} options
      * @return {*}
      */
    def build(): T = js.native
    def build(
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T]
    ): T = js.native
    def build(
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T],
      options: Any
    ): T = js.native
    def build(attributes: Unit, options: Any): T = js.native
    
    def buildList(size: Double): js.Array[T] = js.native
    def buildList(
      size: Double,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T]
    ): js.Array[T] = js.native
    def buildList(
      size: Double,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactory & TopLevel[T],
      options: Any
    ): js.Array[T] = js.native
    def buildList(size: Double, attributes: Unit, options: Any): js.Array[T] = js.native
    
    /**
      * Extends a given factory by copying over its attributes, options,
      * callbacks, and constructor. This can be useful when you want to make
      * different types which all share certain attributes.
      *
      * @param {string|Factory} name The factory to extend.
      * @return {Factory}
      */
    def extend[K /* <: Partial[T] */](name: String): IFactory[T] = js.native
    def extend[K /* <: Partial[T] */](name: IFactory[K]): IFactory[T] = js.native
    
    /**
      * Sets the constructor for this factory to be another factory. This can be
      * used to create more specific sub-types of factories.
      *
      * @param {Factory} parentFactory
      * @return {Factory}
      */
    def inherits(functionArg: js.Function1[/* parentFactory */ IFactory[T], Unit]): IFactory[T] = js.native
    
    /**
      * Define an option for this factory. Options are values that may inform
      * dynamic attribute behavior but are not included in objects built by the
      * factory. Like attributes, options may have dependencies. Unlike
      * attributes, options may only depend on other options.
      *
      *   Factory.define('Person')
      *     .option('includeRelationships', false)
      *     .attr(
      *       'spouse',
      *       ['spouse', 'includeRelationships'],
      *       function(spouse, includeRelationships) {
      *         return includeRelationships ?
      *           Factory.build('Person', spouse) :
      *           null;
      *       });
      *
      *   Factory.build('Person', null, { includeRelationships: true });
      *
      * Options may have either static or dynamic default values, just like
      * attributes. Options without default values must have a value specified
      * when building.
      *
      * @param {string} opt
      * @param {Array.<string>=} | any dependencies or value
      * @param {*=} value
      * @return {Factory}
      */
    def option(name: String): IFactory[T] = js.native
    def option(name: String, dependenciesOrValue: js.Array[String]): IFactory[T] = js.native
    def option(name: String, dependenciesOrValue: js.Array[String], value: Any): IFactory[T] = js.native
    def option(name: String, dependenciesOrValue: Any): IFactory[T] = js.native
    def option(name: String, dependenciesOrValue: Any, value: Any): IFactory[T] = js.native
    def option(name: String, dependenciesOrValue: Unit, value: Any): IFactory[T] = js.native
    
    /**
      * Generates values for all the registered options using the values given.
      *
      * @private
      * @param {object} options
      * @return {object}
      */
    def options(options: Any): Any = js.native
    
    /**
      * Defines an attribute that, by default, simply has an auto-incrementing
      * numeric value starting at 1. You can provide your own builder function
      * that accepts the number of the sequence and returns whatever value you'd
      * like it to be.
      *
      * Sequence values are inherited such that a factory derived from another
      * with a sequence will share the state of that sequence and they will never
      * conflict.
      *
      *   Factory.define('Person').sequence('id');
      *
      * @param {string} attr
      * @param {Array.<string>=} | Function dependencies or builder
      * @param {function(number): *=} builder
      * @return {Factory}
      */
    def sequence[K /* <: /* keyof T */ String */](name: K): IFactory[T] = js.native
    def sequence[K /* <: /* keyof T */ String */](name: K, builder: js.Function1[/* i */ Double, Any]): IFactory[T] = js.native
    def sequence[K /* <: /* keyof T */ String */, D /* <: /* keyof T */ String */](name: K, dependencies: js.Array[D], builder: js.Function2[/* i */ Double, /* repeated */ Any, Any]): IFactory[T] = js.native
  }
  
  @js.native
  trait IFactoryStatic
    extends StObject
       with Instantiable0[IFactory[js.Object]] {
    
    /**
      * Locates a factory by name and calls #attributes on it.
      *
      * @param {string} name
      * @param {object} attributes
      * @param {object} options
      * @return {object}
      */
    def attributes(name: String, attributes: Any): Any = js.native
    def attributes(name: String, attributes: Any, options: Any): Any = js.native
    
    /**
      * Locates a factory by name and calls #build on it.
      *
      * @param {string} name
      * @param {object=} attributes
      * @param {object=} options
      * @return {*}
      */
    def build[T](name: String): T = js.native
    def build[T](
      name: String,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactoryStatic & TopLevel[T]
    ): T = js.native
    def build[T](
      name: String,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k]}
      */ typings.rosie.rosieStrings.IFactoryStatic & TopLevel[T],
      options: Any
    ): T = js.native
    def build[T](name: String, attributes: Unit, options: Any): T = js.native
    
    /**
      * Builds a collection of objects using the named factory.
      *
      * @param {string} name
      * @param {number} size
      * @param {object=} attributes
      * @param {object=} options
      * @return {Array.<*>}
      */
    def buildList[T](name: String, size: Double): js.Array[T] = js.native
    def buildList[T](
      name: String,
      size: Double,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k] | boolean}
      */ typings.rosie.rosieStrings.IFactoryStatic & TopLevel[T]
    ): js.Array[T] = js.native
    def buildList[T](
      name: String,
      size: Double,
      attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]:? T[k] | boolean}
      */ typings.rosie.rosieStrings.IFactoryStatic & TopLevel[T],
      options: Any
    ): js.Array[T] = js.native
    def buildList[T](name: String, size: Double, attributes: Unit, options: Any): js.Array[T] = js.native
    
    /**
      * Defines a factory by name and constructor function. Call #attr and #option
      * on the result to define the properties of this factory.
      *
      * @param {!string} name
      * @param {function(object): *=} constructor
      * @return {Factory}
      */
    def define[T](name: String): IFactory[T] = js.native
    def define[T](name: String, constructor: js.Function1[/* repeated */ Any, Any]): IFactory[T] = js.native
    def define[T](name: String, constructor: Instantiable1[/* opts (repeated) */ Any, Any]): IFactory[T] = js.native
  }
}
