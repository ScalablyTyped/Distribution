package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRoute extends Route {
  /**
    * The `content-type` to serve the file as.  Only valid when localPath points to a file.  If
    * localPath points to a directory, the content types for all files will be inferred.
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default API.static will also serve 'index.html' in response to a request on a directory.
    * To disable this set false or to supply a new index pass an appropriate name.
    */
  var index: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * The local path on disk to create static S3 resources for.  Files will be uploaded into S3
    * objects, and directories will be recursively walked into.
    */
  var localPath: java.lang.String
  var path: java.lang.String
}

object StaticRoute {
  @scala.inline
  def apply(
    localPath: java.lang.String,
    path: java.lang.String,
    contentType: java.lang.String = null,
    index: scala.Boolean | java.lang.String = null
  ): StaticRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localPath")(localPath)
    __obj.updateDynamic("path")(path)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRoute]
  }
}

