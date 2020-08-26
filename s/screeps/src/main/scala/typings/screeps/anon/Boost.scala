package typings.screeps.anon

import typings.screeps.BodyPartConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boost[T /* <: BodyPartConstant */] extends js.Object {
  /**
    * One of the `RESOURCE_*` constants.
    *
    * If the body part is boosted, this property specifies the mineral type which is used for boosting.
    */
  var boost: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
  ] = js.native
  /**
    * The remaining amount of hit points of this body part.
    */
  var hits: Double = js.native
  /**
    * One of the body part types constants.
    */
  var `type`: T = js.native
}

object Boost {
  @scala.inline
  def apply[/* <: typings.screeps.BodyPartConstant */ T](hits: Double, `type`: T): Boost[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boost[T]]
  }
  @scala.inline
  implicit class BoostOps[Self <: Boost[_], /* <: typings.screeps.BodyPartConstant */ T] (val x: Self with Boost[T]) extends AnyVal {
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
    def setHits(value: Double): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoost(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
    ): Self = this.set("boost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoost: Self = this.set("boost", js.undefined)
  }
  
}

