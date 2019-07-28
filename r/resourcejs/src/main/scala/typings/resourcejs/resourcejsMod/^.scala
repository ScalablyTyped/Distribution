package typings.resourcejs.resourcejsMod

import typings.express.expressMod.Application
import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resourcejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: Application, route: String, modelName: String, model: Model[Document, js.Object]): ResourceEndpoint = js.native
}

