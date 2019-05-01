package typings
package stampitLib.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends StampitComposable {
  /** Callback functions to execute each time a composition occurs */
  var composers: js.UndefOr[js.Array[Composer]] = js.undefined
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
  var init: js.UndefOr[Init | js.Array[Init]] = js.undefined
  /**
    * Initialization function(s) which will be called per each newly created
    * instance.
    */
  var initializers: js.UndefOr[Init | js.Array[Init]] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    composers: js.Array[Composer] = null,
    conf: js.Object = null,
    configuration: js.Object = null,
    deepConf: js.Object = null,
    deepConfiguration: js.Object = null,
    deepProperties: js.Object = null,
    deepProps: js.Object = null,
    deepStatics: js.Object = null,
    init: Init | js.Array[Init] = null,
    initializers: Init | js.Array[Init] = null,
    methods: js.Object = null,
    properties: js.Object = null,
    propertyDescriptors: js.Object = null,
    props: js.Object = null,
    refs: js.Object = null,
    staticDeepProperties: js.Object = null,
    staticProperties: js.Object = null,
    staticPropertyDescriptors: js.Object = null,
    statics: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (composers != null) __obj.updateDynamic("composers")(composers)
    if (conf != null) __obj.updateDynamic("conf")(conf)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (deepConf != null) __obj.updateDynamic("deepConf")(deepConf)
    if (deepConfiguration != null) __obj.updateDynamic("deepConfiguration")(deepConfiguration)
    if (deepProperties != null) __obj.updateDynamic("deepProperties")(deepProperties)
    if (deepProps != null) __obj.updateDynamic("deepProps")(deepProps)
    if (deepStatics != null) __obj.updateDynamic("deepStatics")(deepStatics)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (initializers != null) __obj.updateDynamic("initializers")(initializers.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (propertyDescriptors != null) __obj.updateDynamic("propertyDescriptors")(propertyDescriptors)
    if (props != null) __obj.updateDynamic("props")(props)
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (staticDeepProperties != null) __obj.updateDynamic("staticDeepProperties")(staticDeepProperties)
    if (staticProperties != null) __obj.updateDynamic("staticProperties")(staticProperties)
    if (staticPropertyDescriptors != null) __obj.updateDynamic("staticPropertyDescriptors")(staticPropertyDescriptors)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    __obj.asInstanceOf[Options]
  }
}

