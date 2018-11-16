package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeXMLHttpRequestStatic
  extends ScalablyTyped.runtime.Instantiable0[SinonFakeXMLHttpRequest] {
  /**
           * Default false.
           * When set to true, Sinon will check added filters if certain requests should be “unfaked”
           */
  var useFilters: scala.Boolean = js.native
  /**
           * Add a filter that will decide whether or not to fake a request.
           * The filter will be called when xhr.open is called, with the exact same arguments (method, url, async, username, password).
           * If the filter returns true, the request will not be faked.
           * @param filter
           */
  def addFilter(
    filter: js.Function5[
      /* method */ java.lang.String, 
      /* url */ java.lang.String, 
      /* async */ scala.Boolean, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  /**
           * By assigning a function to the onCreate property of the returned object from useFakeXMLHttpRequest()
           * you can subscribe to newly created FakeXMLHttpRequest objects. See below for the fake xhr object API.
           * Using this observer means you can still reach objects created by e.g. jQuery.ajax (or other abstractions/frameworks).
           * @param xhr
           */
  def onCreate(xhr: SinonFakeXMLHttpRequest): scala.Unit = js.native
  /**
           * Restore original function(s).
           */
  def restore(): scala.Unit = js.native
}

