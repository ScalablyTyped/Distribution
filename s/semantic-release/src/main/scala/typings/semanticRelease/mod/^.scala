package typings.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-release", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Run semantic-release and returns a Promise that resolves to a Result
    * object.
    * @async
    */
  def apply(options: Options): js.Promise[Result] = js.native
  def apply(options: Options, environment: Config): js.Promise[Result] = js.native
}
