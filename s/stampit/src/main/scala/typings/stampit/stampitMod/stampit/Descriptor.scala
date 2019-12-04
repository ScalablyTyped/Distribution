package typings.stampit.stampitMod.stampit

import typings.stampit.stampitMod.MethodMap
import typings.stampit.stampitMod.PropertyMap
import typings.stampit.stampitMod.StampSignature
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Stamp`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
trait Descriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
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
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    composers: js.Array[Composer[S̤t̤a̤m̤p̤]] = null,
    configuration: PropertyMap = null,
    deepConfiguration: PropertyMap = null,
    deepProperties: PropertyMap = null,
    initializers: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]) = null,
    methods: MethodMap[Obj] = null,
    properties: PropertyMap = null,
    propertyDescriptors: PropertyDescriptorMap = null,
    staticDeepProperties: PropertyMap = null,
    staticProperties: PropertyMap = null,
    staticPropertyDescriptors: PropertyDescriptorMap = null
  ): Descriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    if (composers != null) __obj.updateDynamic("composers")(composers.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deepConfiguration != null) __obj.updateDynamic("deepConfiguration")(deepConfiguration.asInstanceOf[js.Any])
    if (deepProperties != null) __obj.updateDynamic("deepProperties")(deepProperties.asInstanceOf[js.Any])
    if (initializers != null) __obj.updateDynamic("initializers")(initializers.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (propertyDescriptors != null) __obj.updateDynamic("propertyDescriptors")(propertyDescriptors.asInstanceOf[js.Any])
    if (staticDeepProperties != null) __obj.updateDynamic("staticDeepProperties")(staticDeepProperties.asInstanceOf[js.Any])
    if (staticProperties != null) __obj.updateDynamic("staticProperties")(staticProperties.asInstanceOf[js.Any])
    if (staticPropertyDescriptors != null) __obj.updateDynamic("staticPropertyDescriptors")(staticPropertyDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor[Obj, S̤t̤a̤m̤p̤]]
  }
}

