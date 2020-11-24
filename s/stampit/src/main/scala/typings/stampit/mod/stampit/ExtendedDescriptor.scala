package typings.stampit.mod.stampit

import typings.stampit.mod.PropertyMap
import typings.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `stampit`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
@js.native
trait ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends Descriptor[Obj, S̤t̤a̤m̤p̤] {
  
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
  var conf: js.UndefOr[PropertyMap] = js.native
  
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
  var deepConf: js.UndefOr[PropertyMap] = js.native
  
  /** A set of properties that will be added to new object instances by deep property merge. */
  var deepProps: js.UndefOr[PropertyMap] = js.native
  
  /** A set of static properties that will be added to the `Stamp` by deep property merge. */
  var deepStatics: js.UndefOr[PropertyMap] = js.native
  
  /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
  var init: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.native
  
  // TODO: Add description
  var name: js.UndefOr[String] = js.native
  
  /** A set of properties that will be added to new object instances by assignment. */
  var props: js.UndefOr[PropertyMap] = js.native
  
  /** A set of static properties that will be copied by assignment to the `Stamp`. */
  var statics: js.UndefOr[PropertyMap] = js.native
}
object ExtendedDescriptor {
  
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](): ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤]]
  }
  
  @scala.inline
  implicit class ExtendedDescriptorOps[Self <: ExtendedDescriptor[_, _], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with (ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
    
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
    def setConf(value: PropertyMap): Self = this.set("conf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConf: Self = this.set("conf", js.undefined)
    
    @scala.inline
    def setDeepConf(value: PropertyMap): Self = this.set("deepConf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepConf: Self = this.set("deepConf", js.undefined)
    
    @scala.inline
    def setDeepProps(value: PropertyMap): Self = this.set("deepProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepProps: Self = this.set("deepProps", js.undefined)
    
    @scala.inline
    def setDeepStatics(value: PropertyMap): Self = this.set("deepStatics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepStatics: Self = this.set("deepStatics", js.undefined)
    
    @scala.inline
    def setInitVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = this.set("init", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProps(value: PropertyMap): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setStatics(value: PropertyMap): Self = this.set("statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatics: Self = this.set("statics", js.undefined)
  }
}
