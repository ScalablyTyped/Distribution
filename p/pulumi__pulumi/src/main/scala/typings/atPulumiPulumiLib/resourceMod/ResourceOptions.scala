package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOptions extends js.Object {
  /**
    * An optional additional explicit dependencies on other resources.
    */
  var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]]] | Input[Resource]] = js.undefined
  /**
    * An optional existing ID to load, rather than create.
    */
  var id: js.UndefOr[Input[ID]] = js.undefined
  /**
    * An optional parent resource to which this resource belongs.
    */
  var parent: js.UndefOr[Resource] = js.undefined
  /**
    * When set to true, protect ensures this resource cannot be deleted.
    */
  var protect: js.UndefOr[scala.Boolean] = js.undefined
}

