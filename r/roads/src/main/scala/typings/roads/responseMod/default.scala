package typings.roads.responseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads/types/core/response", JSImport.Default)
@js.native
class default protected () extends Response {
  /**
    * Creates a new Response object.
    *
    * @param {string} body - Your response body
    * @param {number} [status] - Your response status
    * @param {object} [headers] - Your response headers
    */
  def this(body: String) = this()
  def this(body: String, status: Double) = this()
  def this(body: String, status: Double, headers: js.Object) = this()
  /* CompleteClass */
  override var body: String = js.native
  /* CompleteClass */
  override var headers: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var status: Double = js.native
}

