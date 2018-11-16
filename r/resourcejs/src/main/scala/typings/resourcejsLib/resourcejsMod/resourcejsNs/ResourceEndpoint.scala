package typings
package resourcejsLib.resourcejsMod.resourcejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * We manually generated this interface by looking an resource like this:
     * const resource = Resource(app, route, name, model);
     * console.log(resource);
     */
@js.native
trait ResourceEndpoint extends js.Object {
  var __swagger: js.Any = js.native
  @JSName("delete")
  var delete_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("get")
  var get_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("index")
  var index_Original: MethodBuild[HttpMethodOptions] = js.native
  var methods: js.Array[java.lang.String] = js.native
  var model: mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object] = js.native
  var modelName: java.lang.String = js.native
  var name: java.lang.String = js.native
  @JSName("patch")
  var patch_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("post")
  var post_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("put")
  var put_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("respond")
  var respond_Original: HttpHandler = js.native
  @JSName("rest")
  var rest_Original: MethodBuild[RestOptions] = js.native
  var route: java.lang.String = js.native
  @JSName("setResponse")
  var setResponse_Original: HttpHandler = js.native
  @JSName("swagger")
  var swagger_Original: MethodBuild[HttpMethodOptions] = js.native
  @JSName("virtual")
  var virtual_Original: MethodBuild[VirtualOptions] = js.native
  def delete(): ResourceEndpoint = js.native
  def delete(options: HttpMethodOptions): ResourceEndpoint = js.native
  def get(): ResourceEndpoint = js.native
  def get(options: HttpMethodOptions): ResourceEndpoint = js.native
  def getFindQuery(req: Request): js.Object = js.native
  def getMethodOptions(method: java.lang.String, options: js.Object): js.Object = js.native
  def getParamQuery(req: Request, name: java.lang.String): js.Any = js.native
  def index(): ResourceEndpoint = js.native
  def index(options: HttpMethodOptions): ResourceEndpoint = js.native
  def patch(): ResourceEndpoint = js.native
  def patch(options: HttpMethodOptions): ResourceEndpoint = js.native
  def post(): ResourceEndpoint = js.native
  def post(options: HttpMethodOptions): ResourceEndpoint = js.native
  def put(): ResourceEndpoint = js.native
  def put(options: HttpMethodOptions): ResourceEndpoint = js.native
  def register(
    app: expressLib.expressMod.eNs.Application,
    method: java.lang.String,
    path: java.lang.String,
    callback: js.Function1[/* repeated */js.Any, _],
    last: js.Function1[/* repeated */js.Any, _],
    options: js.Object
  ): js.Any = js.native
  def respond(req: Request, res: Response, next: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  def rest(): ResourceEndpoint = js.native
  def rest(options: RestOptions): ResourceEndpoint = js.native
  def setResponse(req: Request, res: Response, next: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  def swagger(): ResourceEndpoint = js.native
  def swagger(options: HttpMethodOptions): ResourceEndpoint = js.native
  def virtual(): ResourceEndpoint = js.native
  def virtual(options: VirtualOptions): ResourceEndpoint = js.native
}

