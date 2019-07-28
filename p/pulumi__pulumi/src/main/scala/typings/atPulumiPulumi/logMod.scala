package typings.atPulumiPulumi

import typings.atPulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  def debug(msg: String): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def error(msg: String): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def hasErrors(): Boolean = js.native
  def info(msg: String): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def warn(msg: String): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
}

