package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-native-community/cli", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var config: Config = js.native
  var dependencyConfig: DependencyConfig = js.native
  def init(projectDir: String, argsOrName: String): js.Promise[Unit] = js.native
  def init(projectDir: String, argsOrName: js.Array[String]): js.Promise[Unit] = js.native
  def loadConfig(projectRoot: String): Config = js.native
  def run(): js.Promise[Unit] = js.native
}

