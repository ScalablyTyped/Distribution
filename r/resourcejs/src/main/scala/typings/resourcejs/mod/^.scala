package typings.resourcejs.mod

import typings.express.mod.Application_
import typings.mongoose.mod.Document
import typings.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resourcejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(app: Application_, route: String, modelName: String, model: Model_[Document, js.Object]): ResourceEndpoint = js.native
}

