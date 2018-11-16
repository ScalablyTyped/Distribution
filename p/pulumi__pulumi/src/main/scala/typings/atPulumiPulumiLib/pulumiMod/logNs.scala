package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "log")
@js.native
object logNs extends js.Object {
  def debug(msg: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def debug(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): stdLib.Promise[scala.Unit] = js.native
  def debug(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def debug(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): stdLib.Promise[scala.Unit] = js.native
  def error(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def error(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
  def hasErrors(): scala.Boolean = js.native
  def info(msg: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def info(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): stdLib.Promise[scala.Unit] = js.native
  def info(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def info(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource): stdLib.Promise[scala.Unit] = js.native
  def warn(msg: java.lang.String, resource: atPulumiPulumiLib.resourceMod.Resource, streamId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def warn(
    msg: java.lang.String,
    resource: atPulumiPulumiLib.resourceMod.Resource,
    streamId: scala.Double,
    ephemeral: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
}

