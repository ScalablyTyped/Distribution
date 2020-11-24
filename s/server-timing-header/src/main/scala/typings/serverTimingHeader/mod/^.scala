package typings.serverTimingHeader.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("server-timing-header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Express middleware add serverTiming to request and
    * make sure that we will send this headers before express finish request
    * @example <caption>How to add middleware</caption>
    * import express = require('express');
    * import serverTimingMiddleware = require('server-timing-header');
    * const port = 3000;
    * const app = express();
    * app.use(serverTimingMiddleware());
    * app.get('/', function (req, res, next) {
    *   req.serverTiming.from('db');
    *   // fetching data from database
    *   req.serverTiming.to('db');
    * });
    * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
