package typings.snykDockerPlugin.distTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OsReleaseFilePath extends js.Object

@JSImport("snyk-docker-plugin/dist/types", "OsReleaseFilePath")
@js.native
object OsReleaseFilePath extends js.Object {
  @js.native
  sealed trait Alpine extends OsReleaseFilePath
  
  @js.native
  sealed trait Debian extends OsReleaseFilePath
  
  @js.native
  sealed trait Linux extends OsReleaseFilePath
  
  @js.native
  sealed trait LinuxFallback extends OsReleaseFilePath
  
  @js.native
  sealed trait Lsb extends OsReleaseFilePath
  
  @js.native
  sealed trait Oracle extends OsReleaseFilePath
  
  @js.native
  sealed trait RedHat extends OsReleaseFilePath
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OsReleaseFilePath with String] = js.native
  /* "/etc/alpine-release" */ @js.native
  object Alpine extends TopLevel[Alpine with String]
  
  /* "/etc/debian_version" */ @js.native
  object Debian extends TopLevel[Debian with String]
  
  /* "/etc/os-release" */ @js.native
  object Linux extends TopLevel[Linux with String]
  
  /* "/usr/lib/os-release" */ @js.native
  object LinuxFallback extends TopLevel[LinuxFallback with String]
  
  /* "/etc/lsb-release" */ @js.native
  object Lsb extends TopLevel[Lsb with String]
  
  /* "/etc/oracle-release" */ @js.native
  object Oracle extends TopLevel[Oracle with String]
  
  /* "/etc/redhat-release" */ @js.native
  object RedHat extends TopLevel[RedHat with String]
  
}

