package typings
package atPulumiCloudLib.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServeStaticOptions extends js.Object {
  /**
       * The `content-type` to serve the file as.  Only valid when localPath points to a file.  If
       * localPath points to a directory, the content types for all files will be inferred.
       */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
       * By default API.static will also serve 'index.html' in response to a request on a
       * directory. To disable this set false or to supply a new index pass a string.
       */
  var index: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

