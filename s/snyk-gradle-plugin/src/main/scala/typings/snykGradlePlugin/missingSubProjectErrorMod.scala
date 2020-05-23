package typings.snykGradlePlugin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist/errors/missing-sub-project-error", JSImport.Namespace)
@js.native
object missingSubProjectErrorMod extends js.Object {
  @js.native
  class MissingSubProjectError protected () extends Error {
    def this(subProject: String, allProjects: js.Array[String]) = this()
    var allProjects: js.Array[String] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var subProject: String = js.native
  }
  
}

