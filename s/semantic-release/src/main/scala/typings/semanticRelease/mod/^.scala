package typings.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-release", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Run semantic-release and returns a Promise that resolves to a Result
    * object.
    */
  def apply(options: Options): js.Promise[Result] = js.native
  def apply(options: Options, environment: Config): js.Promise[Result] = js.native
}

