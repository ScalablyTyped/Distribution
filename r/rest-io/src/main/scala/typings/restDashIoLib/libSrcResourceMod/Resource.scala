package typings
package restDashIoLib.libSrcResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  @JSName("app")
  var app_Original: expressLib.expressMod.Application = js.native
  var baseUrl: java.lang.String = js.native
  var db: mongooseLib.mongooseMod.Mongoose = js.native
  var model: mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object] = js.native
  var paramId: java.lang.String = js.native
  var parameterizedUrl: java.lang.String = js.native
  var parentRef: java.lang.String = js.native
  var parentResource: Resource = js.native
  var populate: java.lang.String = js.native
  var resDef: IResource = js.native
  var router: expressLib.expressMod.Router = js.native
  var url: java.lang.String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def buildParentSearch(req: expressLib.expressMod.Request, query: js.Any): js.Any = js.native
  def buildPopulateQuery(req: expressLib.expressMod.Request): js.Any = js.native
  def buildSearchQuery(req: expressLib.expressMod.Request): js.Object = js.native
  def create(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def createModel(resDef: IResource): mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object] = js.native
  def createQuery(query: java.lang.String): js.Any = js.native
  def createRegex(query: java.lang.String): stdLib.RegExp = js.native
  def del(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def errorHandler(err: stdLib.Error, res: expressLib.expressMod.Response): scala.Unit = js.native
  def getAll(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def getById(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def setupRecursiveRoutes(): scala.Unit = js.native
  def setupRoutes(): scala.Unit = js.native
  def toClassName(name: java.lang.String): java.lang.String = js.native
  def update(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
}

/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  var BASE_URL: java.lang.String = js.native
}

