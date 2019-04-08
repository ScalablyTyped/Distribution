package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideScriptedProcessor extends js.Object {
  /**
    * Redirects to the specified URL.
    *
    * @param url the destination URL
    * @example
    *
    * //Do whatever processing you need and redirect to the homepage
    * g_processor.redirect("/navpage.do")
    */
  def redirect(url: java.lang.String): scala.Unit = js.native
  /**
    * Encodes an object as a JSON string and writes it to the current URL.
    *
    * @param o The object to encode to a JSON string.
    * @example
    *
    * var map = {"key1":"value1","key2":"value2"};
    * g_processor.writeJSON(map);
    */
  def writeJSON(o: js.Object): scala.Unit = js.native
  /**
    * Writes the specified string to the current URL in the specified character-encoding.
    *
    * @param contentType Sets the content type of the response sent to the client, if the response
    * has not been committed, and may include a character-encoding specification.
    * @param s The string to write.
    * @example
    *
    * var name = g_request.getParameter("name");
    * g_processor.writeOutput("text/plain", "Hello " + name);
    */
  def writeOutput(contentType: java.lang.String, s: java.lang.String): scala.Unit = js.native
  /**
    * Writes the specified string to the current URL.
    *
    * @param s The string to write.
    * @example
    *
    * var name = g_request.getParameter("name");
    * g_processor.writeOutput("Hello " + name);
    */
  def writeOutput(s: java.lang.String): scala.Unit = js.native
}

