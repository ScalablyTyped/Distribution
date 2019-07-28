package typings.stripeDashV3.stripeNs

import typings.stripeDashV3.stripeDashV3Strings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List[T] extends js.Object {
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T]
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: Boolean
  /**
    * Value is 'list'
    */
  var `object`: list
  /**
    * The URL for accessing this list.
    */
  var url: String
}

object List {
  @scala.inline
  def apply[T](data: js.Array[T], has_more: Boolean, `object`: list, url: String): List[T] = {
    val __obj = js.Dynamic.literal(data = data, has_more = has_more, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[List[T]]
  }
}

