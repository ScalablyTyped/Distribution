package typings
package stampitLib.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** Callback functions to execute each time a composition occurs */
  var composers: js.UndefOr[js.Array[stampitLib.Composer]] = js.undefined
  /** A configuration object to be shallowly assigned to Stamps */
  var conf: js.UndefOr[js.Object] = js.undefined
  /** A configuration object to be shallowly assigned to Stamps */
  var configuration: js.UndefOr[js.Object] = js.undefined
  /** A configuration object to be deeply merged to Stamps */
  var deepConf: js.UndefOr[js.Object] = js.undefined
  /** A configuration object to be deeply merged to Stamps */
  var deepConfiguration: js.UndefOr[js.Object] = js.undefined
  /** Deeply merged properties of object instances */
  var deepProperties: js.UndefOr[js.Object] = js.undefined
  /** Deeply merged properties of object instances */
  var deepProps: js.UndefOr[js.Object] = js.undefined
  /** Deeply merged properties of Stamps */
  var deepStatics: js.UndefOr[js.Object] = js.undefined
  /**
       * Initialization function(s) which will be called per each newly created
       * instance.
       */
  var init: js.UndefOr[stampitLib.Init | js.Array[stampitLib.Init]] = js.undefined
  /**
       * Initialization function(s) which will be called per each newly created
       * instance.
       */
  var initializers: js.UndefOr[stampitLib.Init | js.Array[stampitLib.Init]] = js.undefined
  /**
       * A hash containing methods (functions) of any future created instance.
       */
  var methods: js.UndefOr[js.Object] = js.undefined
  /**
       * Properties which will shallowly copied into any future created instance.
       */
  var properties: js.UndefOr[js.Object] = js.undefined
  /** ES5 Property Descriptors applied to object instances */
  var propertyDescriptors: js.UndefOr[js.Object] = js.undefined
  /**
       * Properties which will shallowly copied into any future created instance.
       */
  var props: js.UndefOr[js.Object] = js.undefined
  /**
       * A hash containing references to the object. This hash will be shallow mixed into any future created instance.
       */
  var refs: js.UndefOr[js.Object] = js.undefined
  /** Deeply merged properties of Stamps */
  var staticDeepProperties: js.UndefOr[js.Object] = js.undefined
  /**
       * Properties which will be mixed to the new and any other stamp which this
       * stamp will be composed with.
       */
  var staticProperties: js.UndefOr[js.Object] = js.undefined
  /** ES5 Property Descriptors applied to Stamps */
  var staticPropertyDescriptors: js.UndefOr[js.Object] = js.undefined
  /**
       * Properties which will be mixed to the new and any other stamp which this
       * stamp will be composed with.
       */
  var statics: js.UndefOr[js.Object] = js.undefined
}

