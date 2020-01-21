package typings.stampit.mod.stampit

import typings.stampit.mod.MethodMap
import typings.stampit.mod.PropertyMap
import typings.stampit.mod.StampSignature
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `stampit`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
trait ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends Descriptor[Obj, S̤t̤a̤m̤p̤] {
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
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    composers: js.Array[Composer[S̤t̤a̤m̤p̤]] = null,
    conf: PropertyMap = null,
    configuration: PropertyMap = null,
    deepConf: PropertyMap = null,
    deepConfiguration: PropertyMap = null,
    deepProperties: PropertyMap = null,
    deepProps: PropertyMap = null,
    deepStatics: PropertyMap = null,
    init: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]) = null,
    initializers: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]) = null,
    methods: MethodMap[Obj] = null,
    name: String = null,
    properties: PropertyMap = null,
    propertyDescriptors: PropertyDescriptorMap = null,
    props: PropertyMap = null,
    staticDeepProperties: PropertyMap = null,
    staticProperties: PropertyMap = null,
    staticPropertyDescriptors: PropertyDescriptorMap = null,
    statics: PropertyMap = null
  ): ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    if (composers != null) __obj.updateDynamic("composers")(composers.asInstanceOf[js.Any])
    if (conf != null) __obj.updateDynamic("conf")(conf.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deepConf != null) __obj.updateDynamic("deepConf")(deepConf.asInstanceOf[js.Any])
    if (deepConfiguration != null) __obj.updateDynamic("deepConfiguration")(deepConfiguration.asInstanceOf[js.Any])
    if (deepProperties != null) __obj.updateDynamic("deepProperties")(deepProperties.asInstanceOf[js.Any])
    if (deepProps != null) __obj.updateDynamic("deepProps")(deepProps.asInstanceOf[js.Any])
    if (deepStatics != null) __obj.updateDynamic("deepStatics")(deepStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (initializers != null) __obj.updateDynamic("initializers")(initializers.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (propertyDescriptors != null) __obj.updateDynamic("propertyDescriptors")(propertyDescriptors.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (staticDeepProperties != null) __obj.updateDynamic("staticDeepProperties")(staticDeepProperties.asInstanceOf[js.Any])
    if (staticProperties != null) __obj.updateDynamic("staticProperties")(staticProperties.asInstanceOf[js.Any])
    if (staticPropertyDescriptors != null) __obj.updateDynamic("staticPropertyDescriptors")(staticPropertyDescriptors.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤]]
  }
}

