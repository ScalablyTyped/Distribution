package typings.snykDockerPlugin.distTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageType extends js.Object

@JSImport("snyk-docker-plugin/dist/types", "ImageType")
@js.native
object ImageType extends js.Object {
  @js.native
  sealed trait DockerArchive extends ImageType
  
  @js.native
  sealed trait Identifier extends ImageType
  
  @JSBracketAccess
  def apply(value: Double | String): js.UndefOr[ImageType with (Double | String)] = js.native
  /* "docker-archive" */ @js.native
  object DockerArchive extends TopLevel[DockerArchive with (Double | String)]
  
  /* 0 */ @js.native
  object Identifier extends TopLevel[Identifier with (Double | String)]
  
}

