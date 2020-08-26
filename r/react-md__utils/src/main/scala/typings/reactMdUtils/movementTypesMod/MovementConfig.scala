package typings.reactMdUtils.movementTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovementConfig extends js.Object {
  /**
    * The keys that can trigger a move to the previous item. If the `loopable`
    * config is enabled, this will loop to the last item if the first item is
    * currently "focused".
    */
  var decrementKeys: js.Array[IncrementMovementKey] = js.native
  /**
    * The keys that can trigger a move to the next item. If the `loopable` config
    * is enabled, this will loop to the first item if the last item is currently
    * "focused".
    */
  var incrementKeys: js.Array[IncrementMovementKey] = js.native
  /**
    * The keys that can trigger a move to the first item.
    */
  var jumpToFirstKeys: js.Array[JumpMovementKey] = js.native
  /**
    * The keys that can trigger a move to the last item.
    */
  var jumpToLastKeys: js.Array[JumpMovementKey] = js.native
  /**
    * Boolean if the keyboard movement should be able to loop around once it has
    * reached the start or end of all the items.
    */
  var loopable: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the movement should also include printable characters search
    * movement.
    */
  var searchable: js.UndefOr[Boolean] = js.native
}

object MovementConfig {
  @scala.inline
  def apply(
    decrementKeys: js.Array[IncrementMovementKey],
    incrementKeys: js.Array[IncrementMovementKey],
    jumpToFirstKeys: js.Array[JumpMovementKey],
    jumpToLastKeys: js.Array[JumpMovementKey]
  ): MovementConfig = {
    val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovementConfig]
  }
  @scala.inline
  implicit class MovementConfigOps[Self <: MovementConfig] (val x: Self) extends AnyVal {
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
    def setDecrementKeysVarargs(value: IncrementMovementKey*): Self = this.set("decrementKeys", js.Array(value :_*))
    @scala.inline
    def setDecrementKeys(value: js.Array[IncrementMovementKey]): Self = this.set("decrementKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncrementKeysVarargs(value: IncrementMovementKey*): Self = this.set("incrementKeys", js.Array(value :_*))
    @scala.inline
    def setIncrementKeys(value: js.Array[IncrementMovementKey]): Self = this.set("incrementKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpToFirstKeysVarargs(value: JumpMovementKey*): Self = this.set("jumpToFirstKeys", js.Array(value :_*))
    @scala.inline
    def setJumpToFirstKeys(value: js.Array[JumpMovementKey]): Self = this.set("jumpToFirstKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpToLastKeysVarargs(value: JumpMovementKey*): Self = this.set("jumpToLastKeys", js.Array(value :_*))
    @scala.inline
    def setJumpToLastKeys(value: js.Array[JumpMovementKey]): Self = this.set("jumpToLastKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopable(value: Boolean): Self = this.set("loopable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopable: Self = this.set("loopable", js.undefined)
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
  }
  
}

