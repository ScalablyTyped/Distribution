package typings.stampit.mod.stampit

import typings.stampit.mod.Chainables
import typings.stampit.mod.ComposeMethod
import typings.stampit.mod.FactoryFunction
import typings.stampit.mod.PropertyMap
import typings.stampit.mod.StampObjectType
import typings.stampit.mod.StampSignature
import typings.stampit.mod.StampType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory function to create plain object instances.
  *
  * It also has a `.compose()` method which is a copy of the `ComposeMethod` function and a `.compose` accessor to its `Descriptor`.
  * @template Obj The object type that the `Stamp` will create.
  */
@js.native
trait Stamp[Obj]
  extends FactoryFunction[Obj]
     with Chainables[StampObjectType[Obj], StampType[Obj]]
     with StampSignature {
  /**
    * A function which creates a new `Stamp`s from a list of `Composable`s.
    * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
    */
  @JSName("compose")
  var compose_Stamp: ComposeMethod with (Descriptor[StampObjectType[Obj], Stamp[StampObjectType[Obj]]]) = js.native
  /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
  @JSName("create")
  var create_Original: FactoryFunction[Obj] = js.native
  /* InferMemberOverrides */
  override def apply(): StampObjectType[Obj] with js.Any = js.native
  /* InferMemberOverrides */
  override def apply(options: PropertyMap, args: js.Any*): StampObjectType[Obj] with js.Any = js.native
  /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
  def create(): StampObjectType[Obj] = js.native
  def create(options: PropertyMap, args: js.Any*): StampObjectType[Obj] = js.native
}

