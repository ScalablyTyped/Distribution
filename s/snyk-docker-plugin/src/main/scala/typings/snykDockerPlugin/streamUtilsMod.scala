package typings.snykDockerPlugin

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/stream-utils", JSImport.Namespace)
@js.native
object streamUtilsMod extends js.Object {
  def streamToBuffer(stream: Readable): js.Promise[Buffer] = js.native
  def streamToHash(stream: Readable): js.Promise[String] = js.native
  def streamToString(stream: Readable): js.Promise[String] = js.native
  def streamToString(stream: Readable, encoding: String): js.Promise[String] = js.native
}

