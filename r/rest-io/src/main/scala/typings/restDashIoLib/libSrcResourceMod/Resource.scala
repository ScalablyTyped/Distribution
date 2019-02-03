package typings
package restDashIoLib.libSrcResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  var app: expressLib.expressMod.eNs.Application = js.native
  var baseUrl: java.lang.String = js.native
  var db: mongooseLib.mongooseMod.Mongoose = js.native
  var model: mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object] = js.native
  var paramId: java.lang.String = js.native
  var parameterizedUrl: java.lang.String = js.native
  var parentRef: java.lang.String = js.native
  var parentResource: Resource = js.native
  var populate: java.lang.String = js.native
  var resDef: IResource = js.native
  var router: expressLib.expressMod.eNs.Router = js.native
  var url: java.lang.String = js.native
  def buildParentSearch(req: expressLib.expressMod.eNs.Request, query: js.Any): js.Any = js.native
  def buildPopulateQuery(req: expressLib.expressMod.eNs.Request): js.Any = js.native
  def buildSearchQuery(req: expressLib.expressMod.eNs.Request): js.Object = js.native
  def create(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def createModel(resDef: IResource): mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object] = js.native
  def createQuery(query: java.lang.String): js.Any = js.native
  def createRegex(query: java.lang.String): stdLib.RegExp = js.native
  def del(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def errorHandler(err: nodeLib.Error, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def getAll(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def getById(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
  def setupRecursiveRoutes(): scala.Unit = js.native
  def setupRoutes(): scala.Unit = js.native
  def toClassName(name: java.lang.String): java.lang.String = js.native
  def update(req: expressLib.expressMod.eNs.Request, res: expressLib.expressMod.eNs.Response): scala.Unit = js.native
}

/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  var BASE_URL: java.lang.String = js.native
}

