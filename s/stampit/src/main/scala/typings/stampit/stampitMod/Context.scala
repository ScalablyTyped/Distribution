package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The .init() function argument.
  */
@js.native
trait Context extends js.Object {
  /**
    * The arguments list passed to the stamp.
    */
  var args: js.Array[_] = js.native
  /**
    * The object which has been just instantiated.
    */
  var instance: js.Any = js.native
  /**
    * The stamp the object has been instantiated with.
    */
  @JSName("stamp")
  var stamp_Original: Stamp = js.native
  /**
    * Invokes the stamp and returns a new object instance.
    * @param state Properties you wish to set on the new objects.
    * @param encloseArgs The remaining arguments are passed to all .enclose() functions.
    * WARNING Avoid using two different .enclose() functions that expect different arguments.
    * .enclose() functions that take arguments should not be considered safe to compose
    * with other .enclose() functions that also take arguments. Taking arguments with
    * an .enclose() function is an anti-pattern that should be avoided, when possible.
    * @return A new object composed of the Stamps and prototypes provided.
    */
  /**
    * The stamp the object has been instantiated with.
    */
  def stamp(): js.Any = js.native
  def stamp(state: js.Object, encloseArgs: js.Any*): js.Any = js.native
}

