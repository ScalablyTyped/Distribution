package typings.refDashUnionDashDi.refDashUnionDashDiMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.refDashNapi.refDashNapiMod.Type
import typings.refDashUnionDashDi.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the `constructor` of the Struct type that gets returned.
  *
  * Invoke it with `new` to create a new Buffer instance backing the union.
  * Pass it an existing Buffer instance to use that as the backing buffer.
  * Pass in an Object containing the union fields to auto-populate the
  * union with the data.
  *
  * @constructor
  */
@js.native
trait UnionType
  extends Type
     with Instantiable2[/* arg */ Buffer, /* data */ js.Object, js.Any]
     with Instantiable0[js.Any]
     with /** Pass it an existing Buffer instance to use that as the backing buffer. */
Instantiable1[(/* arg */ Buffer) | (/* data */ js.Object), js.Any] {
  var fields: StringDictionary[Anon_Type] = js.native
  def apply(): js.Any = js.native
  /** Pass it an existing Buffer instance to use that as the backing buffer. */
  def apply(arg: Buffer): js.Any = js.native
  def apply(arg: Buffer, data: js.Object): js.Any = js.native
  def apply(data: js.Object): js.Any = js.native
  /**
    * Adds a new field to the union instance with the given name and type.
    * Note that this function will throw an Error if any instances of the union
    * type have already been created, therefore this function must be called at the
    * beginning, before any instances are created.
    */
  def defineProperty(name: String, `type`: String): Unit = js.native
  /**
    * Adds a new field to the union instance with the given name and type.
    * Note that this function will throw an Error if any instances of the union
    * type have already been created, therefore this function must be called at the
    * beginning, before any instances are created.
    */
  def defineProperty(name: String, `type`: Type): Unit = js.native
}

