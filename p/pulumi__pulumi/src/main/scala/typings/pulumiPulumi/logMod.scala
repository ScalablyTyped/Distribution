package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("@pulumi/pulumi/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debug(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def debug(msg: String, resource: Resource, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def error(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def error(msg: String, resource: Resource, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def hasErrors(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasErrors")().asInstanceOf[Boolean]
  
  @scala.inline
  def info(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def info(msg: String, resource: Resource, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def warn(msg: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Unit, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Unit, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Unit, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Resource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Resource, streamId: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Resource, streamId: Double, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def warn(msg: String, resource: Resource, streamId: Unit, ephemeral: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], streamId.asInstanceOf[js.Any], ephemeral.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
