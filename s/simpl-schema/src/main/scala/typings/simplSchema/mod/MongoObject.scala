package typings.simplSchema.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoObject extends js.Object {
  def expandKey(`val`: js.Any, key: String, obj: js.Any): Unit
}

@JSImport("simpl-schema", "MongoObject")
@js.native
object MongoObject extends TopLevel[MongoObjectStatic]

