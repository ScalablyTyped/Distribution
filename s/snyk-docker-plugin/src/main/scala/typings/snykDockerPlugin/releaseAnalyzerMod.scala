package typings.snykDockerPlugin

import typings.snykDockerPlugin.analyzerTypesMod.OSRelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release/release-analyzer", JSImport.Namespace)
@js.native
object releaseAnalyzerMod extends js.Object {
  def tryAlpineRelease(text: String): js.Promise[OSRelease | Null] = js.native
  def tryDebianVersion(text: String): js.Promise[OSRelease | Null] = js.native
  def tryLsbRelease(text: String): js.Promise[OSRelease | Null] = js.native
  def tryOSRelease(text: String): js.Promise[OSRelease | Null] = js.native
  def tryOracleRelease(text: String): js.Promise[OSRelease | Null] = js.native
  def tryRedHatRelease(text: String): js.Promise[OSRelease | Null] = js.native
}

