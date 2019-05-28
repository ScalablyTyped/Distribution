package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofOrderedMap extends js.Object {
  /**
    * True if the provided value is an OrderedMap.
    */
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.immutable.OrderedMap<any, any> */ scala.Boolean
}

object TypeofOrderedMap {
  @scala.inline
  def apply(isOrderedMap: js.Any => /* is immutable.immutable.OrderedMap<any, any> */ scala.Boolean): TypeofOrderedMap = {
    val __obj = js.Dynamic.literal(isOrderedMap = js.Any.fromFunction1(isOrderedMap))
  
    __obj.asInstanceOf[TypeofOrderedMap]
  }
}

