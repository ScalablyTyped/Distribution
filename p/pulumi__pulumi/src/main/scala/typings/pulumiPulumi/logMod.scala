package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  
  def debug(msg: String): js.Promise[Unit] = js.native
  def debug(
    msg: String,
    resource: js.UndefOr[scala.Nothing],
    streamId: js.UndefOr[scala.Nothing],
    ephemeral: Boolean
  ): js.Promise[Unit] = js.native
  def debug(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
  def debug(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource, streamId: js.UndefOr[scala.Nothing], ephemeral: Boolean): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def debug(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  
  def error(msg: String): js.Promise[Unit] = js.native
  def error(
    msg: String,
    resource: js.UndefOr[scala.Nothing],
    streamId: js.UndefOr[scala.Nothing],
    ephemeral: Boolean
  ): js.Promise[Unit] = js.native
  def error(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
  def error(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource, streamId: js.UndefOr[scala.Nothing], ephemeral: Boolean): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def error(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  
  def hasErrors(): Boolean = js.native
  
  def info(msg: String): js.Promise[Unit] = js.native
  def info(
    msg: String,
    resource: js.UndefOr[scala.Nothing],
    streamId: js.UndefOr[scala.Nothing],
    ephemeral: Boolean
  ): js.Promise[Unit] = js.native
  def info(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
  def info(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource, streamId: js.UndefOr[scala.Nothing], ephemeral: Boolean): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def info(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  
  def warn(msg: String): js.Promise[Unit] = js.native
  def warn(
    msg: String,
    resource: js.UndefOr[scala.Nothing],
    streamId: js.UndefOr[scala.Nothing],
    ephemeral: Boolean
  ): js.Promise[Unit] = js.native
  def warn(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double): js.Promise[Unit] = js.native
  def warn(msg: String, resource: js.UndefOr[scala.Nothing], streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource, streamId: js.UndefOr[scala.Nothing], ephemeral: Boolean): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = js.native
  def warn(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = js.native
}
