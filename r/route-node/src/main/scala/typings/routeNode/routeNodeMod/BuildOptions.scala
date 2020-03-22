package typings.routeNode.routeNodeMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions extends js.Object {
  var queryParams: js.UndefOr[IOptions] = js.undefined
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    queryParams: IOptions = null,
    queryParamsMode: QueryParamsMode = null,
    trailingSlashMode: TrailingSlashMode = null,
    urlParamsEncoding: URLParamsEncodingType = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (queryParamsMode != null) __obj.updateDynamic("queryParamsMode")(queryParamsMode.asInstanceOf[js.Any])
    if (trailingSlashMode != null) __obj.updateDynamic("trailingSlashMode")(trailingSlashMode.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
}

