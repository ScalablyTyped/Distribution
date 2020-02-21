package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftEffect extends js.Object {
  var displacedBy: DisplacedBy
  var effected: DraggableIdMap
  var inVirtualList: Boolean
}

object LiftEffect {
  @scala.inline
  def apply(displacedBy: DisplacedBy, effected: DraggableIdMap, inVirtualList: Boolean): LiftEffect = {
    val __obj = js.Dynamic.literal(displacedBy = displacedBy.asInstanceOf[js.Any], effected = effected.asInstanceOf[js.Any], inVirtualList = inVirtualList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiftEffect]
  }
}

