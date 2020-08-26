package typings.stampit.mod.stampit

import typings.stampit.mod.MethodMap
import typings.stampit.mod.PropertyMap
import typings.stampit.mod.StampSignature
import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Stamp`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
@js.native
trait Descriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** An array of functions that will run in sequence while creating a new `Stamp` from a list of `Composable`s. The resulting `Stamp` and the `Composable`s get passed to composers. */
  var composers: js.UndefOr[js.Array[Composer[S̤t̤a̤m̤p̤]]] = js.native
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
  var configuration: js.UndefOr[PropertyMap] = js.native
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
  var deepConfiguration: js.UndefOr[PropertyMap] = js.native
  /** A set of properties that will be added to new object instances by deep property merge. */
  var deepProperties: js.UndefOr[PropertyMap] = js.native
  /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
  var initializers: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.native
  /** A set of methods that will be added to the object's delegate prototype. */
  var methods: js.UndefOr[MethodMap[Obj]] = js.native
  /** A set of properties that will be added to new object instances by assignment. */
  var properties: js.UndefOr[PropertyMap] = js.native
  /** A set of object property descriptors (`PropertyDescriptor`) used for fine-grained control over object property behaviors. */
  var propertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.native
  /** A set of static properties that will be added to the `Stamp` by deep property merge. */
  var staticDeepProperties: js.UndefOr[PropertyMap] = js.native
  /** A set of static properties that will be copied by assignment to the `Stamp`. */
  var staticProperties: js.UndefOr[PropertyMap] = js.native
  /** A set of object property descriptors (`PropertyDescriptor`) to apply to the `Stamp`. */
  var staticPropertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.native
}

object Descriptor {
  @scala.inline
  def apply[Obj, /* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤](): Descriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor[Obj, S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class DescriptorOps[Self <: Descriptor[_, _], Obj, /* <: typings.stampit.mod.StampSignature */ S̤t̤a̤m̤p̤] (val x: Self with (Descriptor[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComposersVarargs(value: Composer[S̤t̤a̤m̤p̤]*): Self = this.set("composers", js.Array(value :_*))
    @scala.inline
    def setComposers(value: js.Array[Composer[S̤t̤a̤m̤p̤]]): Self = this.set("composers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposers: Self = this.set("composers", js.undefined)
    @scala.inline
    def setConfiguration(value: PropertyMap): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setDeepConfiguration(value: PropertyMap): Self = this.set("deepConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepConfiguration: Self = this.set("deepConfiguration", js.undefined)
    @scala.inline
    def setDeepProperties(value: PropertyMap): Self = this.set("deepProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepProperties: Self = this.set("deepProperties", js.undefined)
    @scala.inline
    def setInitializersVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = this.set("initializers", js.Array(value :_*))
    @scala.inline
    def setInitializers(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = this.set("initializers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializers: Self = this.set("initializers", js.undefined)
    @scala.inline
    def setMethods(value: MethodMap[Obj]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setProperties(value: PropertyMap): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setPropertyDescriptors(value: PropertyDescriptorMap): Self = this.set("propertyDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyDescriptors: Self = this.set("propertyDescriptors", js.undefined)
    @scala.inline
    def setStaticDeepProperties(value: PropertyMap): Self = this.set("staticDeepProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticDeepProperties: Self = this.set("staticDeepProperties", js.undefined)
    @scala.inline
    def setStaticProperties(value: PropertyMap): Self = this.set("staticProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticProperties: Self = this.set("staticProperties", js.undefined)
    @scala.inline
    def setStaticPropertyDescriptors(value: PropertyDescriptorMap): Self = this.set("staticPropertyDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticPropertyDescriptors: Self = this.set("staticPropertyDescriptors", js.undefined)
  }
  
}

