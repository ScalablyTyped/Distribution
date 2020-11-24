package typings.stampit.mod.stampit

import typings.stampit.mod.StampSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Initializer` function context.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
  */
@js.native
trait InitializerContext[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  
  /** An array of the arguments passed into the `Stamp`, including the options argument. */
  // ! above description from the specification is obscure
  var args: js.Array[_] = js.native
  
  /** The object instance being produced by the `Stamp`. If the initializer returns a value other than `undefined`, it replaces the instance. */
  var instance: Obj = js.native
  
  /** A reference to the `Stamp` producing the instance. */
  var stamp: S̤t̤a̤m̤p̤ = js.native
}
object InitializerContext {
  
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](args: js.Array[_], instance: Obj, stamp: S̤t̤a̤m̤p̤): InitializerContext[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializerContext[Obj, S̤t̤a̤m̤p̤]]
  }
  
  @scala.inline
  implicit class InitializerContextOps[Self <: InitializerContext[_, _], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with (InitializerContext[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
    
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: Obj): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStamp(value: S̤t̤a̤m̤p̤): Self = this.set("stamp", value.asInstanceOf[js.Any])
  }
}
