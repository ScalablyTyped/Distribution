package typings.restDashIo.libSrcResourceMod

import typings.express.expressMod.Application
import typings.express.expressMod.Router
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.Model
import typings.mongoose.mongooseMod.Mongoose
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  @JSName("app")
  var app_Original: Application = js.native
  var baseUrl: String = js.native
  var db: Mongoose = js.native
  var model: Model[Document, js.Object] = js.native
  var paramId: String = js.native
  var parameterizedUrl: String = js.native
  var parentRef: String = js.native
  var parentResource: Resource = js.native
  var populate: String = js.native
  var resDef: IResource = js.native
  var router: Router = js.native
  var url: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary], res: Response): js.Any = js.native
  def app(req: Request[ParamsDictionary], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def buildParentSearch(req: typings.express.expressMod.Request, query: js.Any): js.Any = js.native
  def buildPopulateQuery(req: typings.express.expressMod.Request): js.Any = js.native
  def buildSearchQuery(req: typings.express.expressMod.Request): js.Object = js.native
  def create(req: typings.express.expressMod.Request, res: typings.express.expressMod.Response): Unit = js.native
  def createModel(resDef: IResource): Model[Document, js.Object] = js.native
  def createQuery(query: String): js.Any = js.native
  def createRegex(query: String): RegExp = js.native
  def del(req: typings.express.expressMod.Request, res: typings.express.expressMod.Response): Unit = js.native
  def errorHandler(err: Error, res: typings.express.expressMod.Response): Unit = js.native
  def getAll(req: typings.express.expressMod.Request, res: typings.express.expressMod.Response): Unit = js.native
  def getById(req: typings.express.expressMod.Request, res: typings.express.expressMod.Response): Unit = js.native
  def setupRecursiveRoutes(): Unit = js.native
  def setupRoutes(): Unit = js.native
  def toClassName(name: String): String = js.native
  def update(req: typings.express.expressMod.Request, res: typings.express.expressMod.Response): Unit = js.native
}

/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  var BASE_URL: String = js.native
}

