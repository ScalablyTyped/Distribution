package typings.screeps.anon

import typings.screeps.BodyPartConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boost[T /* <: BodyPartConstant */] extends js.Object {
  /**
    * One of the `RESOURCE_*` constants.
    *
    * If the body part is boosted, this property specifies the mineral type which is used for boosting.
    */
  var boost: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
  ] = js.undefined
  /**
    * The remaining amount of hit points of this body part.
    */
  var hits: Double
  /**
    * One of the body part types constants.
    */
  var `type`: T
}

object Boost {
  @scala.inline
  def apply[T](
    hits: Double,
    `type`: T,
    boost: /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any = null
  ): Boost[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boost[T]]
  }
}

