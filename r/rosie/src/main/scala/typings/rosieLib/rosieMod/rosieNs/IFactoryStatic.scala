package typings
package rosieLib.rosieMod.rosieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactoryStatic
  extends ScalablyTyped.runtime.Instantiable0[IFactory[js.Object]] {
  /**
       * Locates a factory by name and calls #attributes on it.
       *
       * @param {string} name
       * @param {object} attributes
       * @param {object} options
       * @return {object}
       */
  def attributes(name: java.lang.String, attributes: js.Any): js.Any = js.native
  /**
       * Locates a factory by name and calls #attributes on it.
       *
       * @param {string} name
       * @param {object} attributes
       * @param {object} options
       * @return {object}
       */
  def attributes(name: java.lang.String, attributes: js.Any, options: js.Any): js.Any = js.native
  /**
       * Locates a factory by name and calls #build on it.
       *
       * @param {string} name
       * @param {object=} attributes
       * @param {object=} options
       * @return {*}
       */
  def build[T](name: java.lang.String): T = js.native
  /**
       * Locates a factory by name and calls #build on it.
       *
       * @param {string} name
       * @param {object=} attributes
       * @param {object=} options
       * @return {*}
       */
  def build[T](name: java.lang.String, attributes: rosieLib.rosieLibStrings.IFactoryStatic with T): T = js.native
  /**
       * Locates a factory by name and calls #build on it.
       *
       * @param {string} name
       * @param {object=} attributes
       * @param {object=} options
       * @return {*}
       */
  def build[T](
    name: java.lang.String,
    attributes: rosieLib.rosieLibStrings.IFactoryStatic with T,
    options: js.Any
  ): T = js.native
  /**
       * Builds a collection of objects using the named factory.
       *
       * @param {string} name
       * @param {number} size
       * @param {object=} attributes
       * @param {object=} options
       * @return {Array.<*>}
       */
  def buildList(name: java.lang.String, size: scala.Double): js.Array[_] = js.native
  /**
       * Builds a collection of objects using the named factory.
       *
       * @param {string} name
       * @param {number} size
       * @param {object=} attributes
       * @param {object=} options
       * @return {Array.<*>}
       */
  def buildList(name: java.lang.String, size: scala.Double, attributes: js.Any): js.Array[_] = js.native
  /**
       * Builds a collection of objects using the named factory.
       *
       * @param {string} name
       * @param {number} size
       * @param {object=} attributes
       * @param {object=} options
       * @return {Array.<*>}
       */
  def buildList(name: java.lang.String, size: scala.Double, attributes: js.Any, options: js.Any): js.Array[_] = js.native
  /**
       * Defines a factory by name and constructor function. Call #attr and #option
       * on the result to define the properties of this factory.
       *
       * @param {!string} name
       * @param {function(object): *=} constructor
       * @return {Factory}
       */
  def define[T](name: java.lang.String): IFactory[T] = js.native
  /**
       * Defines a factory by name and constructor function. Call #attr and #option
       * on the result to define the properties of this factory.
       *
       * @param {!string} name
       * @param {function(object): *=} constructor
       * @return {Factory}
       */
  def define[T](
    name: java.lang.String,
    constructor: ScalablyTyped.runtime.Instantiable1[/* opts (repeated) */ js.Any, js.Any]
  ): IFactory[T] = js.native
  /**
       * Defines a factory by name and constructor function. Call #attr and #option
       * on the result to define the properties of this factory.
       *
       * @param {!string} name
       * @param {function(object): *=} constructor
       * @return {Factory}
       */
  def define[T](name: java.lang.String, constructor: js.Function1[/* repeated */js.Any, _]): IFactory[T] = js.native
}

