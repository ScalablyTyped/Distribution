package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "log")
@js.native
object logNs extends js.Object {
  def debug(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def debug(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): js.Promise[scala.Unit] = js.native
  def debug(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): js.Promise[scala.Unit] = js.native
  def debug(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): js.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): js.Promise[scala.Unit] = js.native
  def error(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def hasErrors(): scala.Boolean = js.native
  def info(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def info(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): js.Promise[scala.Unit] = js.native
  def info(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): js.Promise[scala.Unit] = js.native
  def info(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String): js.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): js.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): js.Promise[scala.Unit] = js.native
  def warn(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
}

